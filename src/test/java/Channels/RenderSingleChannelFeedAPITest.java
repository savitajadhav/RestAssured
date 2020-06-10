package Channels;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.adweb.qa.base.TestBase;
import OAuth.LoginAPITest;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class RenderSingleChannelFeedAPITest{

	Response response;
	String baseUrl;
	String apiUrl;
	String url;

	/*
	 * public RenderSingleChannelFeedAPITest() throws IOException { super(); }
	 * 
	 * @BeforeMethod public void setUp() throws IOException {
	 * 
	 * baseUrl = prop.getProperty("URL"); apiUrl = prop.getProperty("ApiURL"); url =
	 * baseUrl + apiUrl; }
	 * 
	 * // Test Case1: Verify that API returns all the posts of a particular channel.
	 * 
	 * @Test public void renderSingleChannelFeedTest() throws IOException { //
	 * LoginAPITest login = new LoginAPITest(); // login.loginTest("iphone",
	 * "iphone@123"); Login.getLoginResponse(); System.out.
	 * println("Test Case1: Verify that API returns all the posts of a particular channel."
	 * ); log.info("Render Single Channel feed request execution started"); response
	 * = given(). header("Content-Type", "application/json"). header("User-Agent",
	 * "Greenorbit"). header("Authorization", Login.accessToken).
	 * body(Payload.renderSingleChannelFeed()). when(). post(url).
	 * then().extract().response();
	 * 
	 * System.out.println(response.asString());
	 * log.info("Render Single Channel feed request execution Ended");
	 * 
	 * }
	 */

}
