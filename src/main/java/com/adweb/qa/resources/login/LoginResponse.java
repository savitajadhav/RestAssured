package com.adweb.qa.resources.login;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginResponse {
	private String access_token;
	private String token_type;
	private String  expires_in;
	private String refresh_token;
	private String refresh_expires_in;
	private String createdAt;
	private String frontEndActorID;
	private String securityCookie;
	private String myiDAppID;
	private String subsiteID;
	@JsonProperty
	private String GOVersion;
	
	  private String error; 
	  private String error_description;
	  
	  
	  public String getError() 
	  { 
		  return error; 
	  } 
	  public void setError(String error)
	  { 
		  this.error = error;  
	  } 
	  public String getError_description() 
	  { 
		  return error_description; 
	  } 
	  public void setError_description(String error_description)
	  { 
		  this.error_description = error_description;
	  }
	 
	
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getToken_type() {
		return token_type;
	}
	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}
	public String getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}
	public String getRefresh_token() {
		return refresh_token;
	}
	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}
	public String getRefresh_expires_in() {
		return refresh_expires_in;
	}
	public void setRefresh_expires_in(String refresh_expires_in) {
		this.refresh_expires_in = refresh_expires_in;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getFrontEndActorID() {
		return frontEndActorID;
	}
	public void setFrontEndActorID(String frontEndActorID) {
		this.frontEndActorID = frontEndActorID;
	}
	public String getSecurityCookie() {
		return securityCookie;
	}
	public void setSecurityCookie(String securityCookie) {
		this.securityCookie = securityCookie;
	}
	public String getMyiDAppID() {
		return myiDAppID;
	}
	public void setMyiDAppID(String myiDAppID) {
		this.myiDAppID = myiDAppID;
	}
	public String getSubsiteID() {
		return subsiteID;
	}
	public void setSubsiteID(String subsiteID) {
		this.subsiteID = subsiteID;
	}
	public String getGOVersion() {
		return GOVersion;
	}
	public void setGOVersion(String gOVersion) {
		GOVersion = gOVersion;
	}

}
