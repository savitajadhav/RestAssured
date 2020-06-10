
package com.adweb.qa.resources.loadprofiles;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Profile {

    @SerializedName("_status")
    @Expose
    private String status;
    @SerializedName("itemKind")
    @Expose
    private String itemKind;
    @SerializedName("ActivityFeedProfileID")
    @Expose
    private String activityFeedProfileID;
    @SerializedName("blockedPosts")
    @Expose
    private List<Object> blockedPosts = null;
    @SerializedName("blockedUsers")
    @Expose
    private List<Object> blockedUsers = null;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("entityLocationID")
    @Expose
    private String entityLocationID;
    @SerializedName("fullName")
    @Expose
    private String fullName;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("isAdmin")
    @Expose
    private boolean isAdmin;
    @SerializedName("profileImageUrl")
    @Expose
    private String profileImageUrl;
    @SerializedName("profileUrl")
    @Expose
    private String profileUrl;
    @SerializedName("unreadActivityFeedPostCount")
    @Expose
    private int unreadActivityFeedPostCount;
    @SerializedName("unreadChannelPostCount")
    @Expose
    private int unreadChannelPostCount;
    @SerializedName("unreadNewsArticleCount")
    @Expose
    private int unreadNewsArticleCount;
    @SerializedName("unreadPrivateGroupCount")
    @Expose
    private int unreadPrivateGroupCount;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getItemKind() {
        return itemKind;
    }

    public void setItemKind(String itemKind) {
        this.itemKind = itemKind;
    }

    public String getActivityFeedProfileID() {
        return activityFeedProfileID;
    }

    public void setActivityFeedProfileID(String activityFeedProfileID) {
        this.activityFeedProfileID = activityFeedProfileID;
    }

    public List<Object> getBlockedPosts() {
        return blockedPosts;
    }

    public void setBlockedPosts(List<Object> blockedPosts) {
        this.blockedPosts = blockedPosts;
    }

    public List<Object> getBlockedUsers() {
        return blockedUsers;
    }

    public void setBlockedUsers(List<Object> blockedUsers) {
        this.blockedUsers = blockedUsers;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEntityLocationID() {
        return entityLocationID;
    }

    public void setEntityLocationID(String entityLocationID) {
        this.entityLocationID = entityLocationID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public int getUnreadActivityFeedPostCount() {
        return unreadActivityFeedPostCount;
    }

    public void setUnreadActivityFeedPostCount(int unreadActivityFeedPostCount) {
        this.unreadActivityFeedPostCount = unreadActivityFeedPostCount;
    }

    public int getUnreadChannelPostCount() {
        return unreadChannelPostCount;
    }

    public void setUnreadChannelPostCount(int unreadChannelPostCount) {
        this.unreadChannelPostCount = unreadChannelPostCount;
    }

    public int getUnreadNewsArticleCount() {
        return unreadNewsArticleCount;
    }

    public void setUnreadNewsArticleCount(int unreadNewsArticleCount) {
        this.unreadNewsArticleCount = unreadNewsArticleCount;
    }

    public int getUnreadPrivateGroupCount() {
        return unreadPrivateGroupCount;
    }

    public void setUnreadPrivateGroupCount(int unreadPrivateGroupCount) {
        this.unreadPrivateGroupCount = unreadPrivateGroupCount;
    }

}
