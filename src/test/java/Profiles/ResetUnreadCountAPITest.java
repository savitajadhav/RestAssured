package Profiles;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.adweb.qa.base.TestBase;
import com.adweb.qa.data.Payload;
import com.adweb.qa.data.ReuseableMethods;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class ResetUnreadCountAPITest extends TestBase{
	
	TestBase testBase;
	Response response;
	String baseUrl;
	String apiUrl;
	String url;
	int statusCode;

	
	public ResetUnreadCountAPITest() throws IOException {
		super();
	}

	
	@BeforeMethod
	public void setUp() throws IOException {
		testBase = new TestBase();
		baseUrl = prop.getProperty("URL");
		apiUrl = prop.getProperty("ApiURL");
		url = baseUrl + apiUrl;
	}
	
	@Test
	public void resetUnreadCountTest() throws IOException {
		//	LoginAPITest login = new LoginAPITest();
		//	login.loginTest("iphone", "iphone@123");
		Login.getLoginResponse();
		log.info("Reset Unread Count Reuest execution started");
		System.out.println("****************Reset Unread Count API Request Response*********************");
		response = given().
		header("Content-Type", "application/json").
		header("User-Agent", "Greenorbit").
		header("Authorization", Login.accessToken).
		body(Payload.resetUnreadCountRequest()).
		when().
		post(url).
		then().extract().response();
		System.out.println(response.asString());
		log.info("Reset unread count requet execution ended");
		
	}
	
	//Verifying status code
	@Test
	public void verifyStatusCodeForResetUnreadCountRequest() {
		log.info("Verifying status code for Reset Unread Count API Request");
		statusCode = response.getStatusCode();
		ReuseableMethods.assertEquals(statusCode, RESPONSE_STATUS_CODE_200);
	}

}
