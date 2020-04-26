package ActivityFeed;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.adweb.qa.base.TestBase;
import com.adweb.qa.data.Payload;
import com.adweb.qa.data.ReuseableMethods;

import OAuth.LoginAPITest;
import io.restassured.response.Response;

public class RenderOwnActivityFeedAPITest extends TestBase {

	String baseUrl;
	String apiUrl;
	String url;
	Response response;
	int statusCode;

	public RenderOwnActivityFeedAPITest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {

		baseUrl = prop.getProperty("URL");
		apiUrl = prop.getProperty("ApiURL");
		url = baseUrl + apiUrl;

	}

	// Test Case1: Verify that API returns the activity feed of a particular user.
	@Test
	public void renderActivityFeedTest() throws IOException {
	//	LoginAPITest login = new LoginAPITest();
	//	login.loginTest("iphone", "iphone@123");
		Login.getLoginResponse();
		System.out.println();
		System.out.println("Test Case1: Verify that API returns the activity feed of a particular user.");
		log.info("Get Activity Feed Request execution starated");
		response = given().
				header("Content-Type", "application/json").
				header("User-Agent", "Greenorbit").
				header("Authorization", Login.accessToken).
				body(Payload.renderActivityFeed()).
				when().
				post(url).
				then().extract().response();
		System.out.println(response.asString());
		log.info("Get Activity Feed Request execution ended");
		System.out.println();
		System.out.println();
	}

	// Test Case2: Verify that API returns the correct status code.
	@Test
	public void verifyStatusCodeForRenderActivityFeed() {
		log.info("Test Case 2: Verify that API returns correct status code for 'Get Activity Feed' Request");
		statusCode = response.getStatusCode();
		ReuseableMethods.assertEquals(statusCode, RESPONSE_STATUS_CODE_200);
	}

}
