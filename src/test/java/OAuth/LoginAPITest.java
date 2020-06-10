package OAuth;

import java.io.IOException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.adweb.qa.base.Login;
import com.adweb.qa.base.TestBase;
import com.adweb.qa.resources.Constant;

public class LoginAPITest {

	private JSONObject responseJson;

	// Test Case1: Verify that API returns the access token,frontEndActorID,
	@Test(priority = 1, dataProvider = "LoginData")
	public void loginTest(String strusername, String strpassword) throws IOException {
		Login.username = strusername;
		Login.password = strpassword;
		TestBase.getInstance().logger.info("Test Case1: Verify that API returns correct response for Login request");
		Login.getInstance().getLogin();
		TestBase.getInstance().logger.info("Login Response===>" + Login.getInstance().responseString);
		responseJson = new JSONObject(Login.getInstance().responseString);

	}

	// Test Case2: Verify that API returns the correct status code.
	@Test(priority = 2)
	public void verifyStatusCodeForLogin() {
		TestBase.getInstance().logger
				.info("Test Case2: Verify that API returns the correct status code for 'Login/OAuth' request");
		TestBase.getInstance().logger.info(
				"Status Code is===>" + TestBase.getInstance().closebaleHttpResponse.getStatusLine().getStatusCode());
		Assert.assertEquals(TestBase.getInstance().closebaleHttpResponse.getStatusLine().getStatusCode(),
				Constant.RESPONSE_STATUS_CODE_200);
	}

	// Test Case3: Verify that API returns the correct GO Version

	@Test(priority = 3)
	public void verifyGOVersionForLogin() {
		TestBase.getInstance().logger.info("Test Case3: Verify that API returns the correct GO Version");
		TestBase.getInstance().logger.info("Go version is ===>" + responseJson.getString("GOVersion"));
		Assert.assertEquals(responseJson.getString("GOVersion"), Constant.GOVERSION);

	}

	// Using DataProvider passing multiple values to login
	@DataProvider(name = "LoginData")
	public Object[][] getData() {
		return new Object[][] { { "Test", "Test" }, { "guest1", "guest1" } };
	}

}
