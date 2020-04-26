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

public class GetPinnedAndTrendingChannelsAPITest extends TestBase {

	String baseUrl;
	String apiUrl;
	String url;
	int statusCode;
	Response response;

	public GetPinnedAndTrendingChannelsAPITest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUp() {
		baseUrl = prop.getProperty("URL");
		apiUrl = prop.getProperty("ApiURL");
		url = baseUrl + apiUrl;
	}

	@Test
	public void getPinnedAndTrendingChannelsTest() throws IOException {
//		LoginAPITest login = new LoginAPITest();
//		login.loginTest("iphone", "iphone@123");
		System.out.println("Test Case1: Verify that API returns all the Pinned Channels and Trending Channels");
		log.info("Get all pinned and trending channels request execution started");
		Login.getLoginResponse();
		response = given().
				header("Content-Type", "application/json").
				header("User-Agent", "Greenorbit").
				header("Authorization", Login.accessToken).
				body(Payload.getPinnedAndTrendingChannels()).
				when().
				post(url).
				then().extract().response();
		System.out.println(response.asString());
		log.info("Get all pinned and trending channels request execution started");
	}

	@Test
	public void verifyStatusCodeForTrendingandPinnedChannels() {
		log.info(
				"Test Case2: Verify that API returns the correct status code for 'Get Pinned, Trending Channels' request");
		statusCode = response.getStatusCode();
		ReuseableMethods.assertEquals(statusCode, RESPONSE_STATUS_CODE_200);
	}
}
