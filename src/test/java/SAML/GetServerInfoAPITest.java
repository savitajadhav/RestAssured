package SAML;

import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.adweb.qa.base.Login;
import com.adweb.qa.base.TestBase;
import com.adweb.qa.client.RestClient;
import com.adweb.qa.resources.Constant;

public class GetServerInfoAPITest {
	
	
	// Test Case1: Verify that API returns basic information about GO instance.
	@Test(priority=1)
	public void getServerInfoAPITest() throws ClientProtocolException, IOException {
		
		TestBase.getInstance().generateURL("ServerInfoAPI");
		System.out.println("Test Case1: Verify that API returns basic information about GO instance.");
		TestBase.getInstance().logger.info("Get Server info request execution started");
				
		TestBase.getInstance().closebaleHttpResponse = RestClient.get(TestBase.getInstance().finalUrl, Login.getInstance().headerMap);
		final String responseString = EntityUtils.toString(TestBase.getInstance().closebaleHttpResponse.getEntity(), "UTF-8");
		TestBase.getInstance().logger.info("Get Server Info API Response===>" + responseString);

		TestBase.getInstance().logger.info("Get Server info request execution ended");
	}
	
	@Test(priority=2)
	public void verifyStatusCodeForGetServerInfoAPI() {
		TestBase.getInstance().logger.info("Test Case2: Verify that API returns the correct status code for 'Login/OAuth' request");
		TestBase.getInstance().logger.info("Status Code is===>" + TestBase.getInstance().closebaleHttpResponse.getStatusLine().getStatusCode());
		Assert.assertEquals(TestBase.getInstance().closebaleHttpResponse.getStatusLine().getStatusCode(), Constant.RESPONSE_STATUS_CODE_200);
	}

}
