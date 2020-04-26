package Profiles;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.adweb.qa.base.TestBase;
import com.adweb.qa.data.Payload;
import com.adweb.qa.data.ReuseableMethods;

import OAuth.LoginAPITest;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class LoadProfileAPITest extends TestBase {

	Logger log = Logger.getLogger(LoadProfileAPITest.class);

	TestBase testBase;
	String baseUrl;
	String apiUrl;
	String url;
	Response response;
	JsonPath m_js;

	public LoadProfileAPITest() throws IOException {
		super();

	}

	@BeforeMethod
	public void setUp() throws IOException {
		testBase = new TestBase();
		baseUrl = prop.getProperty("URL");
		apiUrl = prop.getProperty("ApiURL");
		url = baseUrl + apiUrl;

	}

	// Test Case1: Verify that API returns all the information about the User.
	@Test
	public void loadProfileTest() throws IOException {
	//	LoginAPITest login = new LoginAPITest();
	//	login.loginTest("iphone", "iphone@123");
		Login.getLoginResponse();
		System.out.println();
		System.out.println("Test Case1: Verify that API returns all the information about the User.");
		log.info("Load Profile request execution started");

		response = given().
				header("Content-Type", "application/json").
				header("User-Agent", "Greenorbit").
				header("Authorization", Login.accessToken).
				body(Payload.loadProfilerequest()).
				when().
				post(url).
				then().extract().response();
		System.out.println(response.asString());
		log.info("Load Profile request execution ended");
		System.out.println();
	}

	// Test Case2: Verify that API returns the correct status code.
	@Test
	public void verifyStatusCodeForLoadProfile() {

		log.info("Test Case2: Verify that API returns the correct status code for 'Profile Details' request");
		int statusCode = response.getStatusCode();
		ReuseableMethods.assertEquals(statusCode, RESPONSE_STATUS_CODE_200);
	}

	// Test Case3: Verify that API returns the correct GO Version
	@Test
	public void verifyFrontEndActorIDForLoadProfile() {
		log.info("Test Case3: Verify that API returns the correct GO Version");
		m_js = ReuseableMethods.rawToJSON(response);
		String ActorID = m_js.get("profiles.\"" + Login.actorID + "\".id");
		ReuseableMethods.assertEquals(ActorID, Login.actorID);
	}

}
