package Channels;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.adweb.qa.base.Login;
import com.adweb.qa.base.TestBase;
import com.adweb.qa.client.RestClient;
import com.adweb.qa.resources.RequestPayload;

import OAuth.LoginAPITest;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class GetAllChannelsAPITest{
	
	
	
	/*
	 * public GetAllChannelsAPITest() throws IOException { super(); }
	 * 
	 * @BeforeMethod public void setUp() { baseUrl = prop.getProperty("URL"); apiUrl
	 * = prop.getProperty("ApiURL"); url = baseUrl + apiUrl; }
	 * 
	 * @Test public void getAllChannelsTest() throws IOException { // LoginAPITest
	 * login = new LoginAPITest(); // login.loginTest("iphone", "iphone@123");
	 * System.out.
	 * println("Test Case1: Verify that API returns all existing Channels of the application"
	 * ); log.info("Get all channels request execution started");
	 * Login.getLoginResponse(); response = given(). header("Content-Type",
	 * "application/json"). header("User-Agent", "Greenorbit").
	 * header("Authorization", Login.accessToken).
	 * body(Payload.getAllChannelList()). when(). post(url).
	 * then().extract().response(); System.out.println(response.asString());
	 * log.info("Get all pinned and trending channels request execution started");
	 * 
	 * }
	 * 
	 * @Test public void verifyStatusCodeForGetAllChannels() { log.
	 * info("Test Case2: Verify that API returns the correct status code for 'Get Channels List' request"
	 * ); statusCode = response.getStatusCode(); Utility.assertEquals(statusCode,
	 * RESPONSE_STATUS_CODE_200); }
	 */

}
