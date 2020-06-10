package SAML;

import java.io.IOException;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.adweb.qa.base.TestBase;


public class SAMLLoginAPITest{
	
	TestBase testBase;
	Response response;
	
	
	/*
	 * public SAMLLoginAPITest() throws IOException { super(); }
	 * 
	 * @BeforeMethod public void setUp() throws IOException {
	 * 
	 * testBase = new TestBase(); baseUrl = prop.getProperty("URL"); apiUrl =
	 * prop.getProperty("SamlLoginURL"); finalUrl = baseUrl + apiUrl; }
	 * 
	 * // Test Case1: Verify that API returns the Identity Provider URL if the SAML
	 * based login is enabled.
	 * 
	 * @Test public void SAMLLoginTest() throws IOException { System.out.println();
	 * System.out.
	 * println("Test Case1: Verify that API returns the Identity Provider URL if the SAML based login is enabled."
	 * ); log.info("SAML Login request execution started"); response = given().
	 * header("Content-Type", "application/json").
	 * header("User-Agent","Greenorbit"). body(Payload.samlLoginRequest()). when().
	 * post(finalUrl). then().extract().response();
	 * System.out.println(response.asString());
	 * log.info("SAML Login request execution ended");
	 * 
	 * }
	 */
}
