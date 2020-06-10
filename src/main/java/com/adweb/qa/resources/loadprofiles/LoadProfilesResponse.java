
package com.adweb.qa.resources.loadprofiles;

import java.util.HashMap;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoadProfilesResponse {

    @SerializedName("profiles")
    @Expose
    private HashMap<String, Profile> profiles;

	public HashMap<String, Profile> getProfiles() {
		return profiles;
	}

	public void setProfiles(HashMap<String, Profile> profiles) {
		this.profiles = profiles;
	}

    

}
