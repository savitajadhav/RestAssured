package Channels;

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

public class RenderAllChannelFeedAPITest {

	private LoginAPITest loginAPITest = new LoginAPITest();

	// Test Case1: Verify that API returns All Channel's Post."
	@Test(priority = 1)
	public void getAllChannelsFeedTest() throws IOException {
		// Use below uncommented code only for single test case execution
		//loginAPITest.loginTest("guest1", "guest1");
		//Login.getInstance().getLogin();
		TestBase.getInstance().generateURL("DataloaderUrl");
		System.out.println("Test Case1: Verify that API returns All channels Feed.");
		int start = 0;
		TestBase.getInstance().closebaleHttpResponse = RestClient.post(TestBase.getInstance().finalUrl,RequestPayload.renderAllChannelsFeedpayload(Login.getInstance().actorid, start),Login.getInstance().headerMapWithToken);
		final String responseString = EntityUtils.toString(TestBase.getInstance().closebaleHttpResponse.getEntity(),"UTF-8");
		TestBase.getInstance().logger.info("Get All Channel's Feed API Response===>" + responseString);
	}

	// Test Case2: Verify that API returns the correct status code
	@Test(priority = 2)
	public void verifyStatusCodeForRenderChannelFeed() throws IOException {
		TestBase.getInstance().logger
				.info("Test Case 2: Verify that API returns correct status code for 'Get All Channel Post' Request");
		TestBase.getInstance().logger.info(
				"Status code is===>" + TestBase.getInstance().closebaleHttpResponse.getStatusLine().getStatusCode());
		Assert.assertEquals(TestBase.getInstance().closebaleHttpResponse.getStatusLine().getStatusCode(),Constant.RESPONSE_STATUS_CODE_200);
	}

}
