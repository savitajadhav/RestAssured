package com.adweb.qa.base;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.adweb.qa.data.Payload;
import com.adweb.qa.data.ReuseableMethods;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class TestBase {

	public static Properties prop;
	public static Logger log;
	public static String baseUrl;
	public static String apiUrl;
	public static String url;

	public static int RESPONSE_STATUS_CODE_200 = 200;
	public static String GOVERSION = "2.1.0";

	public TestBase() throws IOException {
		
	    log = Logger.getLogger(TestBase.class);


		prop = new Properties();

		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//java//com//adweb//qa//config//config.properties");
		prop.load(ip);
	}

	public static class Login extends TestBase {

		
		public static int statusCode;
		public static String accessToken;
		public static String refreshToken;
		public static String actorID;
		public static String version;
		public static String username;
		public static String password;
		public static Response  response;
		

		public Login() throws IOException {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public static void getLoginResponse() throws IOException{

			baseUrl = prop.getProperty("URL");
			apiUrl = prop.getProperty("LoginURL");
			url = baseUrl + apiUrl;
			//System.out.println("Username:"+Login.username+ " and Password:" +Login.password);
			response = given().
					header("Content-Type", "application/json").
					header("User-Agent", "Greenorbit").
					body(Payload.buildLoginRequest(username, password)).
					when().
					post(url).
					then().extract().response();
						       
			JsonPath m_js = ReuseableMethods.rawToJSON(response);
			accessToken = m_js.get("access_token");
			// System.out.println("The access token value is:" +accessToken);
			refreshToken = m_js.get("refresh_token");
			// System.out.println("The refresh token value is:" +refreshToken);
			actorID = m_js.get("frontEndActorID");
			// System.out.println("The Front End Actor ID is:"+actorID);
			statusCode = response.getStatusCode();
			version = m_js.get("GOVersion");
			//System.out.println(version);
		}
	}



}
