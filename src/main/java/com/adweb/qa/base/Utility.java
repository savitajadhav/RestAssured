package com.adweb.qa.base;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import com.adweb.qa.data.Payload;
import com.adweb.qa.data.ReuseableMethods;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Utility extends TestBase {

	public static Response response;
	public static JsonPath m_js;
	
	public Utility() throws IOException {

		super();
	}
	
	public static void initilization() {
		String baseUrl;
		String apiUrl;
		baseUrl = prop.getProperty("URL"); 
		apiUrl = prop.getProperty("ApiURL");
		url = baseUrl + apiUrl;
	}

	public static class Channel extends TestBase {

		
		public static String channelID;
		public static int statusCode;
	
		public Channel() throws IOException {
			super();
		}
        
		//Function to get channel ID
		public static void getChannel() throws IOException {

			initilization(); 
			response = given().
					header("Content-Type", "application/json").
					header("User-Agent", "Greenorbit").
					header("Authorization", Login.accessToken).
					body(Payload.getPinnedChannelList()).
					when().
					post(url).
					then().extract().response();
			// log.info("Get List of Channels Request execution starated");
			System.out.println(response.asString());
			// log.info("Get List of channels Request execution ended");
			System.out.println();
			System.out.println();

			m_js = ReuseableMethods.rawToJSON(response);
			channelID = m_js
					.getString("channelList.\"" + Login.actorID + "\".pinnedChannels.''.order.\"title asc\"[1].id");
		//	System.out.println("Channel id from utility:" + channelID);
			statusCode = response.getStatusCode();

		}

	}

	public static class News extends TestBase {

		
		public static int statusCode;
		public static String subsiteID;

		public News() throws IOException {
			super();
		}

		//Function to get subsiteID
		public static void getSubsiteID() throws IOException {
			
			 initilization();
			 response = given().
					 header("Content-Type", "application/json").
					 header("User-Agent", "Greenorbit").
					 header("Authorization", Login.accessToken).
					 body(Payload.renderSubsiteList()).
					 when().
					 post(url).
					 then().extract().response();
			// log.info("Getting subsite list request execution started");
			System.out.println(response.asString());
			// log.info("Getting subsite list request execution ended");
			System.out.println();

			m_js = ReuseableMethods.rawToJSON(response);
			subsiteID = m_js
					.getString("subsiteList.''.subsites.''.order.\"latestNewsArticleDate desc|title asc\"[0].id");
			// System.out.println("subsiteID:"+subsiteID);
			statusCode = response.getStatusCode();

		}

	}

}
