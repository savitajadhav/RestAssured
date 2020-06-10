package News;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.adweb.qa.base.TestBase;
import OAuth.LoginAPITest;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class GetNewsLandingInfoAPITest{

	String baseUrl;
	String apiUrl;
	String url;
	int statusCode;
	Response response;

	/*
	 * public GetNewsLandingInfoAPITest() throws IOException { super(); }
	 * 
	 * @BeforeMethod public void setUp() { baseUrl = prop.getProperty("URL"); apiUrl
	 * = prop.getProperty("ApiURL"); url = baseUrl + apiUrl; }
	 * 
	 * @Test public void getNewsLandingInfoTest() throws IOException { //
	 * LoginAPITest login = new LoginAPITest(); // login.loginTest("iphone",
	 * "iphone@123"); System.out.println(
	 * "Test Case1: Verify that API returns the details of Unread News Article Details and Subsite List as well"
	 * ); log.info("Get News landing info request execution started");
	 * Login.getLoginResponse(); response = given(). header("Content-Type",
	 * "application/json"). header("User-Agent", "Greenorbit").
	 * header("Authorization", Login.accessToken).
	 * body(Payload.renderNewsLandingInfo()). when(). post(url).
	 * then().extract().response(); System.out.println(response.asString());
	 * log.info("Get News landing info request execution ended");
	 * 
	 * }
	 * 
	 * @Test public void verifyStausCodeForNewsLandingPage() { log.
	 * info("Test Case2: Verify that API returns the correct status code for 'News Landing' request"
	 * ); statusCode = response.getStatusCode(); Utility.assertEquals(statusCode,
	 * RESPONSE_STATUS_CODE_200); }
	 */
}
