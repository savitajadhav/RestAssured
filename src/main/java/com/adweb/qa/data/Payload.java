package com.adweb.qa.data;

import java.io.IOException;


import com.adweb.qa.base.TestBase.Login;
import com.adweb.qa.base.Utility.Channel;


public class Payload{
	

	public Payload() throws IOException {
		super();

	}    
	public static String buildLoginRequest(String username, String password) throws IOException {
	   String m_credentials = "{" + " " + "   \"username\":\""+username+"\"," + " " + "   \"password\": \""+password+"\","
				+ "    \"grant_type\": \"password\"," + " " + "   \"deviceId\": \"Test1\"" + "}";
		return m_credentials;
        
	}

	public static String refreshTokenrequest() throws IOException {

		 //Login.getLoginResponse();

		String m_refreshtokenrequestdata = "{" + "\"access_token\":\"" + Login.accessToken + "\","
				+ "\"refresh_token\": \"" + Login.refreshToken + "\"," + "\"grant_type\": \"refresh_token\"" + "}";
		return m_refreshtokenrequestdata;
	}

	public static String loadProfilerequest() throws IOException {

		//Login.getLoginResponse();
		String m_loadprofilerequestdata = "{\r\n" + "	\"profiles\":\r\n" + "	{\r\n" + "		\"" +  Login.actorID
				+ "\":\r\n" + "		{\r\n" + "			\"properties\":\r\n" + "			{\r\n"
				+ "				\"email\":{},\r\n" + "				\"ActivityFeedProfileID\":{},\r\n"
				+ "				\"unreadActivityFeedPostCount\": {},\r\n"
				+ "				\"unreadChannelPostCount\": {},\r\n"
				+ "				\"unreadPrivateGroupCount\":{},\r\n" + "				\"blockedUsers\": {},\r\n"
				+ "                \"blockedPosts\": {},\r\n" + "                \"entityLocationID\": {},\r\n"
				+ "                \"unreadNewsArticleCount\": {\r\n"
				+ "                    \"startDate\": \"2018-03-23T02:40:00Z\"\r\n" + "                }\r\n" + "\r\n"
				+ "			}\r\n" + "		}\r\n" + "	}\r\n" + "}\r\n" + "\r\n" + "";
		return m_loadprofilerequestdata;

	}
	
	public static String samlLoginRequest() {
		
		String m_samlloginrequestdata = "{\r\n" + 
				"	\"deviceId\":\"5345345fgfdgdfg125\"\r\n" + 
				"}	";
		
		return m_samlloginrequestdata;
		
	}
	
	public static String resetUnreadCountRequest() {
		
		String resetunreadcountrequestdata = "{\r\n" + 
				"	\"profiles\":\r\n" + 
				"    {\r\n" + 
				"        \""+ Login.actorID + "\":\r\n" + 
				"        {\r\n" + 
				"            \"properties\":\r\n" + 
				"            {\r\n" + 
				"                \"unreadActivityFeedPostCount\": {},\r\n" + 
				"				\"unreadChannelPostCount\": {},\r\n" + 
				"				\"unreadNewsArticleCount\": {}\r\n" + 
				"            }\r\n" + 
				"        }\r\n" + 
				"    }\r\n" + 
				"}\r\n" + 
				"";
		
		return resetunreadcountrequestdata;
		
	}
	
	public static String renderActivityFeed() {
		
		String renderactivityFeedrequestdata = "{\r\n" + 
				"  \"profiles\": {\r\n" + 
				"    \"" + Login.actorID + "\": {\r\n" + 
				"      \"properties\": {\r\n" + 
				"        \"activityFeed\": {\r\n" + 
				"          \"loaders\": {\r\n" + 
				"            \"ActivityItem\": {\r\n" + 
				"              \"properties\": {\r\n" + 
				"                \"mobileData\": {},\r\n" + 
				"                \"date\": {},\r\n" + 
				"                \"type\": {},\r\n" + 
				"                \"parentId\": {},\r\n" + 
				"                \"postedByProfileId\": {},\r\n" + 
				"                \"activityFeedProfileId\": {},\r\n" + 
				"                \"files\": {},\r\n" + 
				"                \"hasFullControl\": {},\r\n" + 
				"                \"likes\": {\r\n" + 
				"                  \"loaders\": {\r\n" + 
				"                    \"ActivityItem\": {}\r\n" + 
				"                  },\r\n" + 
				"                  \"order\": {\r\n" + 
				"                    \"date\": \"desc\"\r\n" + 
				"                  }\r\n" + 
				"                },\r\n" + 
				"                \"comments\": {\r\n" + 
				"                  \"loaders\": {\r\n" + 
				"                    \"ActivityItem\": {\r\n" + 
				"                      \"properties\": {\r\n" + 
				"                        \"mobileData\": {},\r\n" + 
				"                        \"files\": {}\r\n" + 
				"                      }\r\n" + 
				"                    }\r\n" + 
				"                  },\r\n" + 
				"                  \"count\": 1,\r\n" + 
				"                  \"order\": { \"date\": \"desc\" }\r\n" + 
				"                }\r\n" + 
				"              }\r\n" + 
				"            }\r\n" + 
				"          },\r\n" + 
				"          \"count\": 10,\r\n" + 
				"          \"startAt\": 21,\r\n" + 
				"          \"isMobile\": true,\r\n" + 
				"          \"filter\": { \"excludedActivityTypes\": [2, 3, 4, 6, 7, 8, 10, 11, 12, 13, 14]},\r\n" + 
				"          \"order\": { \"date\": \"desc\" }\r\n" + 
				"        }\r\n" + 
				"      }\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"} \r\n" + 
				"";
		return renderactivityFeedrequestdata;
		
	}
	public static String renderAllChannelFeed() {
		
		String renderallchannelfeedrequestdata = "{\r\n" + 
				"   \"profiles\":{\r\n" + 
				"      \"" + Login.actorID +"\":{\r\n" + 
				"         \"properties\":{\r\n" + 
				"            \"allPosts\":{\r\n" + 
				"               \"loaders\":{\r\n" + 
				"                  \"ActivityItem\":{\r\n" + 
				"                     \"properties\":{\r\n" + 
				"                     	\"mobileData\":{},\r\n" + 
				"                        \"activityFeedProfileId\":{\r\n" + 
				"\r\n" + 
				"                        },\r\n" + 
				"                        \"likes\":{\r\n" + 
				"                           \"loaders\":{ \"ActivityItem\":{ \"properties\":{}}},\r\n" + 
				"                           \"order\":{\"date\":\"asc\"}\r\n" + 
				"                        },\r\n" + 
				"                        \"comments\":{\r\n" + 
				"                           \"loaders\":{\r\n" + 
				"                              \"ActivityItem\":{\r\n" + 
				"                                 \"properties\":{\r\n" + 
				"                                 	\"mobileData\":{},\r\n" + 
				"                                    \"files\":{}\r\n" + 
				"                                 }\r\n" + 
				"                              }\r\n" + 
				"                           },\r\n" + 
				"                           \"order\":{ \"date\":\"desc\"}\r\n" + 
				"                        }\r\n" + 
				"                     }\r\n" + 
				"                  }\r\n" + 
				"               },\r\n" + 
				"               \"count\":10,\r\n" + 
				"               \"startAt\":0,\r\n" + 
				"               \"filter\":{ \"excludedActivityTypes\": [2, 6, 9, 11, 13, 14] },\r\n" + 
				"               \"order\":{ \"date\":\"desc\" }\r\n" + 
				"            }\r\n" + 
				"         }\r\n" + 
				"      }\r\n" + 
				"   }\r\n" + 
				"}";
		
		return renderallchannelfeedrequestdata;
		
	}
	
	public static String getPinnedChannelList() {
		
		String getpinnedchannelsrequestdata = "{\r\n" + 
				"  \"channelList\": {\r\n" + 
				"    \""+Login.actorID+"\": {\r\n" + 
				"      \"properties\": {\r\n" + 
				"        \"pinnedChannels\": {\r\n" + 
				"          \"loaders\": {\r\n" + 
				"            \"Channel\": {\r\n" + 
				"              \"properties\": {\r\n" + 
				"                \"title\": {},\r\n" + 
				"                \"channelUrl\": {},\r\n" + 
				"                \"hashTag\": {},\r\n" + 
				"                \"isPinned\": {},\r\n" + 
				"                \"unreadPostCount\": {},\r\n" + 
				"                \"activityFeedActorID\": {}\r\n" + 
				"              },\r\n" + 
				"              \"itemKind\": \"Channel\",\r\n" + 
				"              \"groupName\": \"channelItemList\"\r\n" + 
				"            }\r\n" + 
				"          },\r\n" + 
				"          \"count\": 10,\r\n" + 
				"          \"startAt\": 0,\r\n" + 
				"          \"order\": {\r\n" + 
				"            \"title\": \"asc\"\r\n" + 
				"          },\r\n" + 
				"          \"startDate\": \"\",\r\n" + 
				"          \"endDate\": \"\"\r\n" + 
				"        }\r\n" + 
				"      },\r\n" + 
				"      \"itemKind\": \"Channel\",\r\n" + 
				"      \"groupName\": \"channelList\"\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"}";
				
		return getpinnedchannelsrequestdata;
		
	}
	
	
	public static String renderSingleChannelFeed() {
		
		String rendersinglechannelfeedrequestdata = "{\r\n" + 
				"   \"channelItemList\":{\r\n" + 
				"      \"" + Channel.channelID + "\":{\r\n" + 
				"         \"properties\":{\r\n" + 
				"         	\"activityFeedActorId\": {},\r\n" + 
				"            \"description\":{\r\n" + 
				"\r\n" + 
				"            },\r\n" + 
				"            \"channelItemId\":{\r\n" + 
				"\r\n" + 
				"            },\r\n" + 
				"            \"activityFeed\":{\r\n" + 
				"               \"loaders\":{\r\n" + 
				"                  \"ActivityItem\":{\r\n" + 
				"                     \"properties\":{\r\n" + 
				"                        \"data\":{\r\n" + 
				"\r\n" + 
				"                        },\r\n" + 
				"                        \"files\":{\r\n" + 
				"\r\n" + 
				"                        },\r\n" + 
				"                        \"likes\":{\r\n" + 
				"                           \"loaders\":{\r\n" + 
				"                              \"ActivityItem\":{\r\n" + 
				"                              }\r\n" + 
				"                           },\r\n" + 
				"                           \"order\":{\r\n" + 
				"                              \"date\":\"desc\"\r\n" + 
				"                           }\r\n" + 
				"                        },\r\n" + 
				"                        \"comments\":{\r\n" + 
				"                           \"loaders\":{\r\n" + 
				"                              \"ActivityItem\":{\r\n" + 
				"                                 \"properties\":{\r\n" + 
				"                                    \"mobileData\":{\r\n" + 
				"\r\n" + 
				"                                    },\r\n" + 
				"                                    \"files\":{\r\n" + 
				"\r\n" + 
				"                                    }\r\n" + 
				"                                 },\r\n" + 
				"                                 \"itemKind\":\"ActivityItem\",\r\n" + 
				"                                 \"groupName\":\"activityFeedItems\"\r\n" + 
				"                              }\r\n" + 
				"                           },\r\n" + 
				"                           \"order\":{\r\n" + 
				"                              \"date\":\"desc\"\r\n" + 
				"                           }\r\n" + 
				"                        }\r\n" + 
				"                     }\r\n" + 
				"                  }\r\n" + 
				"               },\r\n" + 
				"               \"count\":10,\r\n" + 
				"               \"startAt\":0,\r\n" + 
				"               \"filter\": { \"excludedActivityTypes\": [2, 3, 4, 6, 7, 8, 11, 12, 13, 14]},\r\n" + 
				"               \"order\":{\r\n" + 
				"                  \"date\":\"desc\"\r\n" + 
				"               }\r\n" + 
				"            },\r\n" + 
				"            \"urlPart\":{\r\n" + 
				"            },\r\n" + 
				"            \"hasChannelPermission\":{\r\n" + 
				"\r\n" + 
				"            },\r\n" + 
				"            \"hasChannelApprovalPermission\":{\r\n" + 
				"\r\n" + 
				"            },\r\n" + 
				"            \"isFullControl\":{\r\n" + 
				"\r\n" + 
				"            }\r\n" + 
				"         }\r\n" + 
				"      }\r\n" + 
				"   }\r\n" + 
				"}";
		//System.out.println("Channel id from payload:"+Channel.channelID);
		return rendersinglechannelfeedrequestdata;
		
	}
	
	public static String renderNewsLandingInfo() {
		
		String rendernewslandingrequestdata = "{\r\n" + 
				"  \"unreadNewsArticleList\": {\r\n" + 
				"    \"\": {\r\n" + 
				"      \"properties\": {\r\n" + 
				"        \"unreadNewsArticles\": {\r\n" + 
				"          \"loaders\": {\r\n" + 
				"            \"NewsDocument\": {\r\n" + 
				"              \"properties\": {\r\n" + 
				"                \"displayDate\": {},\r\n" + 
				"                \"image\": {},\r\n" + 
				"                \"parentCategory\": {},\r\n" + 
				"                \"subsiteName\": {},\r\n" + 
				"                \"createdBy\": {\r\n" + 
				"                  \"properties\": {\r\n" + 
				"                    \"email\": {}\r\n" + 
				"                  }\r\n" + 
				"                }\r\n" + 
				"              }\r\n" + 
				"            }\r\n" + 
				"          },\r\n" + 
				"          \"count\": 10, \r\n" + 
				"          \"startDate\": \"2018-05-23T02:40:00Z\",\r\n" + 
				"          \"filter\": {\r\n" + 
				"            \"resultTypes\": 1\r\n" + 
				"          },\r\n" + 
				"          \"order\": {\r\n" + 
				"            \"displayDate\": \"desc\"\r\n" + 
				"          }\r\n" + 
				"\r\n" + 
				"        }\r\n" + 
				"      }\r\n" + 
				"    }\r\n" + 
				"  },\r\n" + 
				"  \"subsiteList\": {\r\n" + 
				"    \"\": {\r\n" + 
				"      \"properties\": {\r\n" + 
				"        \"subsites\": {\r\n" + 
				"          \"loaders\": {\r\n" + 
				"            \"Subsite\": {\r\n" + 
				"              \"properties\": {\r\n" + 
				"                \"id\": {},\r\n" + 
				"                \"title\": {},\r\n" + 
				"                \"latestNewsArticleDate\": {},\r\n" + 
				"                \"news\": {\r\n" + 
				"                  \"loaders\": {\r\n" + 
				"                    \"NewsGroup\": {\r\n" + 
				"                      \"properties\": {\r\n" + 
				"                        \"image\": {},\r\n" + 
				"                        \"thumbnail\": {},\r\n" + 
				"                        \"subsiteEntityID\": {},\r\n" + 
				"                        \"latestArticleDate\": {},\r\n" + 
				"                        \"children\": {\r\n" + 
				"                          \"loaders\": {\r\n" + 
				"                            \"NewsDocument\": {\r\n" + 
				"                              \"properties\": {\r\n" + 
				"                                \"displayDate\": {},\r\n" + 
				"                                \"image\": {},\r\n" + 
				"                                \"parentCategory\": {},\r\n" + 
				"                                \"subsiteName\": {},\r\n" + 
				"                                \"createdBy\": {\r\n" + 
				"                                  \"properties\": {\r\n" + 
				"                                    \"email\": {}\r\n" + 
				"                                  }\r\n" + 
				"                                }\r\n" + 
				"                              }\r\n" + 
				"                            }\r\n" + 
				"                          },\r\n" + 
				"                          \"count\": 10,\r\n" + 
				"                          \"filter\": {\r\n" + 
				"                            \"resultTypes\": 1\r\n" + 
				"                          },\r\n" + 
				"                          \"order\": {\r\n" + 
				"                            \"displayDate\": \"desc\"\r\n" + 
				"                          }\r\n" + 
				"                        }\r\n" + 
				"                      }\r\n" + 
				"                    }\r\n" + 
				"                  },\r\n" + 
				"                  \"filter\": {\r\n" + 
				"                    \"resultTypes\": 1,\r\n" + 
				"                    \"lineage\": \"news\",\r\n" + 
				"                    \"isRSS\": false\r\n" + 
				"                  },\r\n" + 
				"                  \"order\": {\r\n" + 
				"                    \"latestArticleDate\": \"desc\",\r\n" + 
				"                    \"title\": \"asc\"\r\n" + 
				"                  }\r\n" + 
				"                }\r\n" + 
				"              }\r\n" + 
				"            }\r\n" + 
				"          },\r\n" + 
				"          \"order\": {\r\n" + 
				"            \"latestNewsArticleDate\": \"desc\",\r\n" + 
				"            \"title\": \"asc\"\r\n" + 
				"          }\r\n" + 
				"        }\r\n" + 
				"      }\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"}";
		
		// System.out.println(Channel.channelID);
		return rendernewslandingrequestdata;	  	
	}
	
	public static String getPinnedAndTrendingChannels() {
		String getpinnedtrendeingchannelrequestdata ="{\r\n" + 
				"  \"channelList\": {\r\n" + 
				"    \""+Login.actorID+"\": {\r\n" + 
				"      \"properties\": {\r\n" + 
				"        \"pinnedChannels\": {\r\n" + 
				"          \"loaders\": {\r\n" + 
				"            \"Channel\": {\r\n" + 
				"              \"properties\": {\r\n" + 
				"                \"title\": {},\r\n" + 
				"                \"channelUrl\": {},\r\n" + 
				"                \"hashTag\": {},\r\n" + 
				"                \"isPinned\": {},\r\n" + 
				"                \"unreadPostCount\": {},\r\n" + 
				"                \"activityFeedActorID\": {}\r\n" + 
				"              },\r\n" + 
				"              \"itemKind\": \"Channel\",\r\n" + 
				"              \"groupName\": \"channelItemList\"\r\n" + 
				"            }\r\n" + 
				"          },\r\n" + 
				"          \"count\": 3,\r\n" + 
				"          \"startAt\": 1,\r\n" + 
				"          \"order\": {\r\n" + 
				"            \"title\": \"asc\"\r\n" + 
				"          },\r\n" + 
				"          \"startDate\": \"\",\r\n" + 
				"          \"endDate\": \"\"\r\n" + 
				"        },\r\n" + 
				"        \"trendingChannels\": {\r\n" + 
				"          \"loaders\": {\r\n" + 
				"            \"Channel\": {\r\n" + 
				"              \"properties\": {\r\n" + 
				"                \"title\": {},\r\n" + 
				"                \"channelUrl\": {},\r\n" + 
				"                \"hashTag\": {},\r\n" + 
				"                \"isPinned\": {},\r\n" + 
				"                \"unreadPostCount\": {},\r\n" + 
				"                \"activityFeedActorID\": {}\r\n" + 
				"              },\r\n" + 
				"              \"itemKind\": \"Channel\",\r\n" + 
				"              \"groupName\": \"channelItemList\"\r\n" + 
				"            }\r\n" + 
				"          },\r\n" + 
				"          \"count\": null,\r\n" + 
				"          \"startAt\": 0,\r\n" + 
				"          \"order\": {},\r\n" + 
				"          \"startDate\": \"\",\r\n" + 
				"          \"endDate\": \"\"\r\n" + 
				"        }\r\n" + 
				"      },\r\n" + 
				"      \"itemKind\": \"Channel\",\r\n" + 
				"      \"groupName\": \"channelList\"\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"}";
		return getpinnedtrendeingchannelrequestdata;
		
	}

	public static String getAllChannelList() {
		String getallchannellistrequestdata = "{\r\n" + 
				"  \"channelList\": {\r\n" + 
				"    \""+Login.actorID+"\": {\r\n" + 
				"      \"properties\": {\r\n" + 
				"        \"Channels\": {\r\n" + 
				"          \"loaders\": {\r\n" + 
				"            \"Channel\": {\r\n" + 
				"              \"properties\": {\r\n" + 
				"                \"title\": {},\r\n" + 
				"                \"channelUrl\": {},\r\n" + 
				"                \"hashTag\": {},\r\n" + 
				"                \"isPinned\": {},\r\n" + 
				"                \"unreadPostCount\": {},\r\n" + 
				"                \"activityFeedActorID\": {}\r\n" + 
				"              },\r\n" + 
				"              \"itemKind\": \"Channel\",\r\n" + 
				"              \"groupName\": \"channelItemList\"\r\n" + 
				"            }\r\n" + 
				"          },\r\n" + 
				"          \"count\": 25,\r\n" + 
				"          \"startAt\": 0,\r\n" + 
				"          \"order\": {\r\n" + 
				"            \"title\": \"asc\"\r\n" + 
				"          },\r\n" + 
				"          \"startDate\": \"\",\r\n" + 
				"          \"endDate\": \"\"\r\n" + 
				"        }\r\n" + 
				"      },\r\n" + 
				"      \"itemKind\": \"Channel\",\r\n" + 
				"      \"groupName\": \"channelList\"\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"}";
		return getallchannellistrequestdata;
		
	}
	public static String renderSubsiteList() {
		String getsubsitelistrequestdata = "{\r\n" + 
				"    \"subsiteList\": {\r\n" + 
				"        \"\": {\r\n" + 
				"            \"properties\": {\r\n" + 
				"                \"subsites\": {\r\n" + 
				"                    \"loaders\": {\r\n" + 
				"                        \"Subsite\": {\r\n" + 
				"                            \"properties\": {\r\n" + 
				"                                \"id\": {},\r\n" + 
				"                                \"title\": {},\r\n" + 
				"                                \"latestNewsArticleDate\": {}\r\n" + 
				"                            }\r\n" + 
				"                        }\r\n" + 
				"                    },\r\n" + 
				"                    \"news\": {\r\n" + 
				"                     \"properties\": {\r\n" + 
				"                      \"latestArticleDate\": {}\r\n" + 
				"                       }\r\n" + 
				"                     },\r\n" + 
				"                    \"order\": {\r\n" + 
				"                        \"latestNewsArticleDate\": \"desc\",\r\n" + 
				"						\"title\": \"asc\"\r\n" + 
				"                    }\r\n" + 
				"                }\r\n" + 
				"            }\r\n" + 
				"        }\r\n" + 
				"    }\r\n" + 
				"}";
		return getsubsitelistrequestdata;
		
	}

}
