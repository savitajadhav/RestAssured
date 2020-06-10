package ActivityFeed;

import java.io.IOException;

import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.adweb.qa.base.Login;
import com.adweb.qa.base.TestBase;
import com.adweb.qa.client.RestClient;
import com.adweb.qa.resources.Constant;
import com.adweb.qa.resources.RequestPayload;
import OAuth.LoginAPITest;

public class RenderOwnActivityFeedAPITest {

	private LoginAPITest loginAPITest = new LoginAPITest();

	// Test Case1: Verify that API returns the activity feed of a particular user.
	@Test(priority = 1)
	public void getActivityFeedTest() throws IOException {
		// Use below uncommented code only for single test case execution
		//loginAPITest.loginTest("guest1", "guest1");
		//Login.getInstance().getLogin();
		TestBase.getInstance().generateURL("DataloaderUrl");
		System.out.println("Test Case1: Verify that API returns the activity feed of a particular user.");
		int start = 0;
		TestBase.getInstance().closebaleHttpResponse = RestClient.post(TestBase.getInstance().finalUrl,
				RequestPayload.renderActivityFeedPayload(Login.getInstance().actorid, start),
				Login.getInstance().headerMapWithToken);
		final String responseString = EntityUtils.toString(TestBase.getInstance().closebaleHttpResponse.getEntity(),
				"UTF-8");
		TestBase.getInstance().logger.info("Get User's Activity Feed API Response===>" + responseString);

	}

	// Test Case2: Verify that API returns the correct status code.
	@Test(priority = 2)
	public void verifyStatusCodeForRenderActivityFeed() {
		TestBase.getInstance().logger
				.info("Test Case 2: Verify that API returns correct status code for 'Get Activity Feed' Request");
		TestBase.getInstance().logger.info(
				"Status Code is===> " + TestBase.getInstance().closebaleHttpResponse.getStatusLine().getStatusCode());
		Assert.assertEquals(TestBase.getInstance().closebaleHttpResponse.getStatusLine().getStatusCode(),
				Constant.RESPONSE_STATUS_CODE_200);
	}

}
