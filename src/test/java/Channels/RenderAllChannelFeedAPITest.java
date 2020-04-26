package Channels;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.adweb.qa.base.TestBase;
import com.adweb.qa.data.Payload;
import com.adweb.qa.data.ReuseableMethods;

import OAuth.LoginAPITest;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class RenderAllChannelFeedAPITest extends TestBase {

	Response response;
	String baseUrl;
	String apiUrl;
	String url;
	int statusCode;
	String channelID;

	public RenderAllChannelFeedAPITest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {

		baseUrl = prop.getProperty("URL");
		apiUrl = prop.getProperty("ApiURL");
		url = baseUrl + apiUrl;
	}

	// Test Case1: Verify that API returns All Channel Post.
	@Test
	public void renderAllChannelFeedTest() throws IOException {
	//	LoginAPITest login = new LoginAPITest();
	//	login.loginTest("iphone", "iphone@123");
		Login.getLoginResponse();
		System.out.println("Test Case1: Verify that API returns All Channel's Post.");
		log.info("Render All Channels feed request execution started");
		response = given().
				header("Content-Type", "application/json").
				header("User-Agent", "Greenorbit").
				header("Authorization", Login.accessToken).
				body(Payload.renderAllChannelFeed()).
				when().
				post(url).
				then().extract().response();

		System.out.println(response.asString());
		log.info("Render All channels feed request execution ended");
		System.out.println();

	}

	/// Test Case2: Verify that API returns the correct status code
	@Test
	public void verifyStatusCodeForRenderChannelFeed() throws IOException {
		log.info("Test Case 2: Verify that API returns correct status code for 'Get All Channel Post' Request");
		statusCode = response.getStatusCode();
		ReuseableMethods.assertEquals(statusCode, RESPONSE_STATUS_CODE_200);

	}

}
