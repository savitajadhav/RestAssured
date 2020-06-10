package News;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.adweb.qa.base.TestBase;
import OAuth.LoginAPITest;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class GetSubsiteListAPITest{

	String baseUrl;
	String apiUrl;
	String url;
	int statusCode;
	Response response;

	/*
	 * public GetSubsiteListAPITest() throws IOException { super();
	 * 
	 * }
	 * 
	 * @BeforeMethod public void setUp() { baseUrl = prop.getProperty("URL"); apiUrl
	 * = prop.getProperty("ApiURL"); url = baseUrl + apiUrl; }
	 * 
	 * @Test public void getSubsiteListTest() throws IOException { // LoginAPITest
	 * login = new LoginAPITest(); // login.loginTest("iphone", "iphone@123");
	 * System.out.
	 * println("Test Case1: Verify that API returns the details about the subsites of the application"
	 * ); log.info("Get Subsite List request execution started"); response =
	 * given(). header("Content-Type", "application/json"). header("User-Agent",
	 * "Greenorbit"). header("Authorization", Login.accessToken).
	 * body(Payload.renderSubsiteList()). when(). post(url).
	 * then().extract().response(); System.out.println(response.asString());
	 * log.info("Get Subsite List request execution ended");
	 * 
	 * }
	 * 
	 * @Test public void verifyStatusCodeForGetSubsiteList() { log.
	 * info("Test Case2: Verify that API returns the correct status code for 'Subsite List' request"
	 * ); statusCode = response.getStatusCode(); Utility.assertEquals(statusCode,
	 * RESPONSE_STATUS_CODE_200); }
	 */

}
