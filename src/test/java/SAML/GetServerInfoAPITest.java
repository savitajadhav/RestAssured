package SAML;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.adweb.qa.base.TestBase;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class GetServerInfoAPITest extends TestBase {

	Logger log = Logger.getLogger(GetServerInfoAPITest.class);

	String baseUrl;
	String apiUrl;
	String url;

	public GetServerInfoAPITest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {

		baseUrl = prop.getProperty("URL");
		apiUrl = prop.getProperty("ServerInfoURL");
		url = baseUrl + apiUrl;

	}

	// Test Case1: Verify that API returns basic information about GO instance.
	@Test
	public void getServerInfoAPITest() {

		System.out.println("Test Case1: Verify that API returns basic information about GO instance.");
		log.info("Get Server info request execution started");
		Response response = given().
				header("Content-Type", "application/json").
				header("User-Agent", "Greenorbit").
				when().
				get(url).
				then().extract().response();

		System.out.println(response.asString());
		log.info("Get Server info request execution ended");
	}

}
