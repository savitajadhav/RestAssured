package OAuth;

import java.io.IOException;

import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.adweb.qa.base.Login;
import com.adweb.qa.base.TestBase;
import com.adweb.qa.client.RestClient;
import com.adweb.qa.resources.Constant;
import com.adweb.qa.resources.RequestPayload;

public class RefreshTokenAPITest {
	private LoginAPITest loginAPITest = new LoginAPITest();

	// Test Case1: Verify that API refresh the access token if the existing one is
	// expired.
	@Test(priority=1)
	public void refreshTokenTest() throws IOException {
		// Use below uncommented code only for single test case execution
		//loginAPITest.loginTest("guest1", "guest1");
		//Login.getInstance().getLogin();
		TestBase.getInstance().generateURL("RefreshTokenUrl");
		System.out.println("Test Case1: Verify that API refresh the access token if the existing one is expired.");
		TestBase.getInstance().closebaleHttpResponse = RestClient.post(TestBase.getInstance().finalUrl,
				RequestPayload.refreshTokenPayload(Login.getInstance().accesstoken, Login.getInstance().refreshtoken),
				Login.getInstance().headerMap);
		final String responseString = EntityUtils.toString(TestBase.getInstance().closebaleHttpResponse.getEntity(),
				"UTF-8");
		TestBase.getInstance().logger.info("Refresh Token API Response===>" + responseString);
	}

	// Test Case2: Verify that API returns the correct status code.
	@Test(priority=2)
	public void verifyStatusCodeForRefreshToken() {
		TestBase.getInstance().logger
				.info("Test Case2: Verify that API returns the correct status code for 'Refresh Token' request");
		TestBase.getInstance().logger.info(
				"Status Code is===> " + TestBase.getInstance().closebaleHttpResponse.getStatusLine().getStatusCode());
		Assert.assertEquals(TestBase.getInstance().closebaleHttpResponse.getStatusLine().getStatusCode(),
				Constant.RESPONSE_STATUS_CODE_200);

	}

}
