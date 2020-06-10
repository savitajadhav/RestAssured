package com.adweb.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestBase {

	private static TestBase testbase = null;

	private Properties prop;
	public String finalUrl;
	public String apiUrl;
	public String baseUrl;
	public CloseableHttpResponse closebaleHttpResponse;
	public Logger logger;

	private TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/adweb/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//baseUrl = TestBase.getInstance().getBaseUrl();
		logging();

	}

	public static TestBase getInstance() {
		if (testbase == null) {

			testbase = new TestBase();
			
		}
		return testbase;
	}

	public Properties getProperties() {
		return prop;
	}

	public String getBaseUrl() {
		String baseUrl = prop.getProperty("baseUrl");
		if (baseUrl != null)
			return baseUrl;
		else
			throw new RuntimeException("baseUrl not specified in the configuration.properties file.");
	}

	public void generateURL(String url) {
		baseUrl = TestBase.getInstance().getBaseUrl();
		apiUrl = TestBase.getInstance().getProperties().getProperty(url);
		finalUrl = baseUrl + apiUrl;
		
	}

	
	private void logging() {
		
		 logger = Logger.getLogger("APIAutomation");
		 		PropertyConfigurator.configure("src/main/java/com/adweb/qa/resources/log4j.properties");
		logger.setLevel(Level.DEBUG);
	}

}
