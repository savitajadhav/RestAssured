package OAuth;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.adweb.qa.base.TestBase;
import com.adweb.qa.data.Payload;
import com.adweb.qa.data.ReuseableMethods;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class RefreshTokenAPITest extends TestBase {

	Logger log = Logger.getLogger(RefreshTokenAPITest.class);
	String baseUrl;
	String apiUrl;
	String url;
	Response response;

	public RefreshTokenAPITest() throws IOException {
		super();

	}

	@BeforeMethod
	public void setUp() throws IOException {

		baseUrl = prop.getProperty("URL");
		apiUrl = prop.getProperty("RefreshTokenURL");
		url = baseUrl + apiUrl;

	}

	// Test Case1: Verify that API refresh the access token if the existing one is
	// expired.
	@Test
	public void refreshTokenTest() throws IOException {
	//	LoginAPITest login = new LoginAPITest();
	//	login.loginTest("iphone", "iphone@123");
		System.out.println();
		System.out.println("Test Case1: Verify that API refresh the access token if the existing one is expired.");
		log.info("Refresh Token Request execution starated");
		response = given().header("Content-Type", "application/json").header("User-Agent", "Greenorbit")
				.body(Payload.refreshTokenrequest()).when().post(url).then().extract().response();

		System.out.println(response.asString());
		log.info("Refresh Token Request execution ended");
		System.out.println();
		System.out.println();
	}

	// Test Case2: Verify that API returns the correct status code.
	@Test
	public void verifyStatusCodeForRefreshToken() {

		log.info("Test Case2: Verify that API returns the correct status code for 'Refresh Token' request");
		int statusCode = response.getStatusCode();
		ReuseableMethods.assertEquals(statusCode, RESPONSE_STATUS_CODE_200);
	}

}
