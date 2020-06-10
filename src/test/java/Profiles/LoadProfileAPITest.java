package Profiles;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.http.ParseException;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.adweb.qa.base.Login;
import com.adweb.qa.base.TestBase;
import com.adweb.qa.client.RestClient;
import com.adweb.qa.resources.Constant;
import com.adweb.qa.resources.RequestPayload;
import com.adweb.qa.resources.loadprofiles.LoadProfilesResponse;
import com.adweb.qa.resources.loadprofiles.Profile;
import com.google.gson.Gson;

import OAuth.LoginAPITest;

public class LoadProfileAPITest {

	private String responseString;
	private LoginAPITest loginAPITest = new LoginAPITest();

	@Test(priority = 1)
	public void loadProfileTest() throws IOException {
		// Use below uncommented code only for single test case execution
		//loginAPITest.loginTest("guest1", "guest1");
		//Login.getInstance().getLogin();
		TestBase.getInstance().generateURL("DataloaderUrl");
		TestBase.getInstance().logger.info("Test Case1: Verify that API returns all the information about the User.");
		TestBase.getInstance().closebaleHttpResponse = RestClient.post(TestBase.getInstance().finalUrl,RequestPayload.loadProfilePayload(Login.getInstance().actorid),Login.getInstance().headerMapWithToken);
		responseString = EntityUtils.toString(TestBase.getInstance().closebaleHttpResponse.getEntity(), "UTF-8");
		TestBase.getInstance().logger.info("Load Profile Response===>" + responseString);

	}

	// Test Case2: Verify that API returns the correct status code.
	@Test(priority = 2)

	public void verifyStatusCodeForLoadProfile() {

		TestBase.getInstance().logger
				.info("Test Case2: Verify that API returns the correct status code for 'Profile Details' request");
		TestBase.getInstance().logger.info(
				"Status Code is===> " + TestBase.getInstance().closebaleHttpResponse.getStatusLine().getStatusCode());
		Assert.assertEquals(TestBase.getInstance().closebaleHttpResponse.getStatusLine().getStatusCode(),
				Constant.RESPONSE_STATUS_CODE_200);

	}

	// Test Case3: Verify that API returns the correct Correct Actor ID Version
	@Test(priority = 3)
	public void verifyFrontEndActorIDForLoadProfile() throws ParseException, IOException {

		TestBase.getInstance().logger.info("Test Case3: Verify that API returns the correct Actor ID");
		final Gson gson = new Gson();
		LoadProfilesResponse loadProfilesResponse = gson.fromJson(responseString, LoadProfilesResponse.class);
		HashMap<String, Profile> profiles = loadProfilesResponse.getProfiles();
		for(Map.Entry<String,Profile> m: profiles.entrySet()) {
			//String key = m.getKey();
			Profile profile = m.getValue();
			TestBase.getInstance().logger.info("Actor ID is===>" +profile.getId());
			Assert.assertEquals(profile.getId(), Login.getInstance().actorid);
			}
		
	}
	
}


