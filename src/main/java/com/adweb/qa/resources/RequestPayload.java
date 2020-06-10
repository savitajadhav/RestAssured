package com.adweb.qa.resources;

import org.json.JSONArray;
import org.json.JSONObject;

import com.adweb.qa.base.Login;
import com.adweb.qa.resources.Constant;
import com.adweb.qa.utils.Util;

public class RequestPayload {
	
	Login login = Login.getInstance();


	public static String loginPayload(String username, String password) {

		JSONObject login = new JSONObject();
		login.put(Constant.USERNAME, username);
		login.put(Constant.PASSWORD, password);
		login.put(Constant.GRANT_TYPE, "password");
		login.put(Constant.DEVICEID, "Test11");
		return login.toString();
	}
	
	public static String refreshTokenPayload(String accesstoken, String refreshtoken) {
		
		JSONObject refreshToken = new JSONObject();
		refreshToken.put(Constant.ACCESSTOKEN, accesstoken );
		refreshToken.put(Constant.REFRESHTOKEN, refreshtoken);
		refreshToken.put(Constant.GRANT_TYPE, "refresh_token");
		return refreshToken.toString();
	}

	public static String loadProfilePayload(String actorid) {

		JSONObject newsArticleCount = new JSONObject();
		newsArticleCount.put(Constant.STARTDATE, "2018-03-23T02:40:00Z");
		
		JSONObject properties = new JSONObject();
		properties.put(Constant.EMAIL, new JSONObject());
		properties.put(Constant.ACTIVITYFEEDPROFILEID, new JSONObject());
		properties.put(Constant.UNREADACTIVITYFEEDPOSTCOUNT, new JSONObject());
		properties.put(Constant.UNREADCHANNELPOSTCOUNT, new JSONObject());
		properties.put(Constant.UNREADPRIVATEGROUPCOUNT, new JSONObject());
		properties.put(Constant.BLOCKEDUSERS, new JSONObject());
		properties.put(Constant.BLOCKEDPOSTS, new JSONObject());
		properties.put(Constant.ENTITYLOCATIONID, new JSONObject());
		properties.put(Constant.UNREADNEWSARTICLECOUNT, newsArticleCount);
		
		JSONObject frontendActorId = new JSONObject();
		frontendActorId.put(Constant.PROPERTIES, properties);
		
		JSONObject profiles = new JSONObject();
		profiles.put(actorid, frontendActorId);
		
		JSONObject loadProfile = new JSONObject();
		loadProfile.put(Constant.PROFILES, profiles);
		return loadProfile.toString();
	}
	
	
	  public static String renderActivityFeedPayload(String actorId, int startAt) {
	  
	  JSONObject commentsProperties = new JSONObject();
	  commentsProperties.put(Constant.MOBILEDATA, new JSONObject());
	  commentsProperties.put(Constant.FILES, new JSONObject()); 
	  JSONObject activityItem = new JSONObject(); 
	  activityItem.put(Constant.PROPERTIES,commentsProperties); 
	  JSONObject loaders = new JSONObject();
	  loaders.put(Constant.ACTIVITYITEM, activityItem); 
	  JSONObject commentsOrder =new JSONObject(); 
	  commentsOrder.put(Constant.DATE, Constant.DESC); 
	  JSONObject commentsLoaders = new JSONObject();
	  commentsLoaders.put(Constant.ACTIVITYITEM, new JSONObject());
	  JSONObject comments = new JSONObject();
	  comments.put(Constant.LOADERS, commentsLoaders);
	  comments.put(Constant.ORDER, commentsOrder);
	  JSONObject likeOrder = new JSONObject();
	  likeOrder.put(Constant.ORDER, Constant.DESC);
	  JSONObject likeLoaders = new JSONObject();
	  likeLoaders.put(Constant.ACTIVITYITEM, new JSONObject());
	  JSONObject likes = new JSONObject();
	  likes.put(Constant.LOADERS, likeLoaders);
	  likes.put(Constant.ORDER, likeOrder);
	  
	  JSONObject properties = new JSONObject();
	  properties.put(Constant.MOBILEDATA, new JSONObject());
	  properties.put(Constant.DATE, new JSONObject());
	  properties.put(Constant.TYPE, new JSONObject());
	  properties.put(Constant.PARENTID, new JSONObject());
	  properties.put(Constant.POSTEDBYPROFILEID, new JSONObject());
	  properties.put(Constant.ACTIVITYFEEDPROFILEID, new JSONObject());
	  properties.put(Constant.FILES, new JSONObject());
	  properties.put(Constant.HASFULLCONTROL, new JSONObject());
	  properties.put(Constant.LIKES, likes);
	  properties.put(Constant.COMMENTS, comments);
	  
	  JSONObject ACTIVITYITEM = new JSONObject();
	  ACTIVITYITEM.put(Constant.PROPERTIES, properties);
	  JSONObject LOADERS = new JSONObject();
	  LOADERS.put(Constant.ACTIVITYITEM, ACTIVITYITEM);
	  JSONObject activityFeed = new JSONObject();
	  activityFeed.put(Constant.LOADERS, LOADERS);
	  activityFeed.put(Constant.COUNT, 5);
	  activityFeed.put(Constant.STARTAT, startAt);
	  activityFeed.put(Constant.ISMOBILE, "true");
	  JSONArray excludedActivityTypes = new JSONArray(Util.excludeActivityTypes());
	  JSONObject filter = new JSONObject();
	  filter.put(Constant.EXCLUDEDACTIVITYTYPES, excludedActivityTypes);
	  JSONObject order = new JSONObject();
	  order.put(Constant.DATE, Constant.DESC);
	  activityFeed.put(Constant.FILTER, filter);
	  activityFeed.put(Constant.ORDER,order);
	  JSONObject PROPERTIES = new JSONObject();
	  PROPERTIES.put(Constant.ACTIVITYFEED,activityFeed);
	  JSONObject frontendactorid = new JSONObject();
	  frontendactorid.put(Constant.PROPERTIES, PROPERTIES);
	  JSONObject profiles = new JSONObject();
	  profiles.put(actorId, frontendactorid);
	  JSONObject renderActivityFeed = new JSONObject();
	  renderActivityFeed.put(Constant.PROFILES, profiles);
	  return renderActivityFeed.toString();
	  
	  }
	 
	public static String renderAllChannelsFeedpayload(String actorId, int startAt) {
		
		JSONObject commentsProperties = new JSONObject();
		commentsProperties.put(Constant.DATA, new JSONObject());
		commentsProperties.put(Constant.DATE, new JSONObject());
		commentsProperties.put(Constant.TYPE, new JSONObject());
		commentsProperties.put(Constant.PARENTID, new JSONObject());
		commentsProperties.put(Constant.POSTEDBYPROFILEID, new JSONObject());
		commentsProperties.put(Constant.FILES, new JSONObject());
		JSONObject commentsActivityItem = new JSONObject();
		commentsActivityItem.put(Constant.PROPERTIES, commentsProperties);
		commentsActivityItem.put(Constant.ITEMKIND, "ActivityItem");
		commentsActivityItem.put(Constant.GROUPNAME, "activityFeedItems");
		JSONObject commenstLoaders = new JSONObject();
		commenstLoaders.put(Constant.ACTIVITYITEM, commentsActivityItem);
		JSONObject comments = new JSONObject();
		comments.put(Constant.LOADERS, commenstLoaders);
		comments.put(Constant.STARTAT, 0);
		JSONObject commentsOrder = new JSONObject();
		commentsOrder.put(Constant.DATE, Constant.DESC);
		comments.put(Constant.ORDER, commentsOrder);
		comments.put(Constant.STARTDATE, "");
		comments.put(Constant.ENDDATE, "");
		
		JSONObject channelsProperties = new JSONObject();
		channelsProperties.put(Constant.ACTIVITYFEEDACTORID, new JSONObject());
		channelsProperties.put(Constant.CHANNELID, new JSONObject());
		JSONObject channels = new JSONObject();
		channels.put(Constant.PROPERTIES, channelsProperties);
		
		JSONObject likesProperties = new JSONObject();
		likesProperties.put(Constant.DATA, new JSONObject());
		likesProperties.put(Constant.DATE, new JSONObject());
		likesProperties.put(Constant.TYPE, new JSONObject());
		likesProperties.put(Constant.PARENTID, new JSONObject());
		likesProperties.put(Constant.POSTEDBYPROFILEID, new JSONObject());
		likesProperties.put(Constant.FILES, new JSONObject());
		JSONObject likesActivityItem = new JSONObject();
		likesActivityItem.put(Constant.PROPERTIES, likesProperties);
		likesActivityItem.put(Constant.ITEMKIND,"ActivityItem");
		likesActivityItem.put(Constant.GROUPNAME, "activityFeedItems");
		JSONObject likesLoaders = new JSONObject();
		likesLoaders.put(Constant.LOADERS, likesActivityItem);
		JSONObject likes = new JSONObject();
		likes.put(Constant.LOADERS, likesLoaders);
		likes.put(Constant.STARTAT, startAt);
		JSONObject likesOrder = new JSONObject();
		likesOrder.put(Constant.DATE, Constant.DESC);
		likes.put(Constant.ORDER, likesOrder);
		likes.put(Constant.STARTDATE, "");
		likes.put(Constant.ENDDATE, "");
		
		//JSONObject activityItem = new JSONObject();
		JSONObject allPostsProperties = new JSONObject();
		allPostsProperties.put(Constant.ACTIVITYFEEDPROFILEID, new JSONObject());
		allPostsProperties.put(Constant.HASFULLCONTROL, new JSONObject());
		allPostsProperties.put(Constant.LIKES, likes);
		allPostsProperties.put(Constant.COMMENTS, comments);
		JSONObject allPostsActivityItem = new JSONObject();
		allPostsActivityItem.put(Constant.PROPERTIES, allPostsProperties);
		
		JSONObject allPostsLoaders = new JSONObject();
		allPostsLoaders.put(Constant.ACTIVITYITEM, allPostsActivityItem);
		allPostsLoaders.put(Constant.CHANNELS,channels);
		
		JSONObject allPosts = new JSONObject();
		allPosts.put(Constant.LOADERS, allPostsLoaders);
		allPosts.put(Constant.COUNT, 10);
		allPosts.put(Constant.STARTAT, 0);
		allPosts.put(Constant.ISMOBILE, true);
		JSONArray excludedActivityTypes = new JSONArray(Util.excludeActivityTypes());
		JSONObject filter = new JSONObject();
		filter.put(Constant.EXCLUDEDACTIVITYTYPES, excludedActivityTypes);
		allPosts.put(Constant.FILTER, filter);
		JSONObject order = new JSONObject();
		order.put(Constant.DATE, Constant.DESC);
		allPosts.put(Constant.ORDER, order);
		
		JSONObject properties = new JSONObject();
		properties.put(Constant.ALLPOSTS, allPosts);
		properties.put(Constant.UNREADACTIVITYFEEDPOSTCOUNT, new JSONObject());
		properties.put(Constant.UNREADCHANNELPOSTCOUNT, new JSONObject());
		
		JSONObject frontendactorid = new JSONObject();
		frontendactorid.put(Constant.PROPERTIES, properties);
		JSONObject profiles = new JSONObject();
		profiles.put(actorId, frontendactorid);
		JSONObject allChannelsFeed = new JSONObject();
		allChannelsFeed.put(Constant.PROFILES, profiles);
		return allChannelsFeed.toString();
		
	}
	

}
