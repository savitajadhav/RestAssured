package OAuth;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.adweb.qa.base.TestBase;
import com.adweb.qa.data.ReuseableMethods;

public class LoginAPITest extends TestBase {

	public LoginAPITest() throws IOException {
		super();

	}

	// Test Case1: Verify that API returns the access token,frontEndActorID,
	// securityCookie and susbiteID on successful login.
	@Test(dataProvider = "LoginData")
	public void loginTest(String strUserName, String strPassword) throws IOException {
		// System.out.println("Username:"+strUserName+ "and Password:" +strPassword);
		Login.username = strUserName;
		Login.password = strPassword;
		System.out.println();
		System.out.println(
				"Test Case1: Verify that API returns the access token,frontEndActorID, securityCookie and susbiteID on successful login");
		log.info("Login request execution started");
		Login.getLoginResponse();
		System.out.println(Login.response.asString());
		log.info("Login request execution ended");
		System.out.println();
	}

	// Test Case2: Verify that API returns the correct status code.
	@Test
	public void verifyStatusCodeForLogin() {
		System.out.println();

		log.info("Test Case2: Verify that API returns the correct status code for 'Login/OAuth' request");
		ReuseableMethods.assertEquals(Login.statusCode, RESPONSE_STATUS_CODE_200);
	}

	// Test Case3: Verify that API returns the correct GO Version
	@Test
	public void verifyGOVersionForLogin() {
		log.info("Test Case3: Verify that API returns the correct GO Version");
		ReuseableMethods.assertEquals(Login.version, GOVERSION);

	}

	// Using dataprovider passing multiple values to login
	@DataProvider(name = "LoginData")
	public Object[][] getData() {
		return new Object[][] { { "test", "test" }, { "iphone", "iphone@123" } };
	}

}
