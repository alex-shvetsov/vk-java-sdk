// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.video.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.groups.GroupFull;
import com.vk.api.sdk.objects.users.UserFull;
import com.vk.api.sdk.objects.wall.WallComment;

import java.util.List;
import java.util.Objects;

/**
 * GetCommentsExtendedResponse object
 */
public class GetCommentsExtendedResponse implements Validable {
    /**
     * Information whether current user can comment the post
     */
    @SerializedName("can_post")
    private Boolean canPost;

    /**
     * Total number
     */
    @SerializedName("count")
    @Required
    private Integer count;

    /**
     * Count of replies of current level
     */
    @SerializedName("current_level_count")
    private Integer currentLevelCount;

    @SerializedName("groups")
    @Required
    private List<GroupFull> groups;

    /**
     * Information whether groups can comment the post
     */
    @SerializedName("groups_can_post")
    private Boolean groupsCanPost;

    @SerializedName("items")
    @Required
    private List<WallComment> items;

    @SerializedName("profiles")
    @Required
    private List<UserFull> profiles;

    @SerializedName("real_offset")
    private Integer realOffset;

    @SerializedName("show_reply_button")
    private Boolean showReplyButton;

    public Boolean getCanPost() {
        return canPost;
    }

    public GetCommentsExtendedResponse setCanPost(Boolean canPost) {
        this.canPost = canPost;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public GetCommentsExtendedResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public Integer getCurrentLevelCount() {
        return currentLevelCount;
    }

    public GetCommentsExtendedResponse setCurrentLevelCount(Integer currentLevelCount) {
        this.currentLevelCount = currentLevelCount;
        return this;
    }

    public List<GroupFull> getGroups() {
        return groups;
    }

    public GetCommentsExtendedResponse setGroups(List<GroupFull> groups) {
        this.groups = groups;
        return this;
    }

    public Boolean getGroupsCanPost() {
        return groupsCanPost;
    }

    public GetCommentsExtendedResponse setGroupsCanPost(Boolean groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
        return this;
    }

    public List<WallComment> getItems() {
        return items;
    }

    public GetCommentsExtendedResponse setItems(List<WallComment> items) {
        this.items = items;
        return this;
    }

    public List<UserFull> getProfiles() {
        return profiles;
    }

    public GetCommentsExtendedResponse setProfiles(List<UserFull> profiles) {
        this.profiles = profiles;
        return this;
    }

    public Integer getRealOffset() {
        return realOffset;
    }

    public GetCommentsExtendedResponse setRealOffset(Integer realOffset) {
        this.realOffset = realOffset;
        return this;
    }

    public Boolean getShowReplyButton() {
        return showReplyButton;
    }

    public GetCommentsExtendedResponse setShowReplyButton(Boolean showReplyButton) {
        this.showReplyButton = showReplyButton;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(realOffset, canPost, count, profiles, groups, groupsCanPost, currentLevelCount, items, showReplyButton);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetCommentsExtendedResponse getCommentsExtendedResponse = (GetCommentsExtendedResponse) o;
        return Objects.equals(currentLevelCount, getCommentsExtendedResponse.currentLevelCount) &&
                Objects.equals(realOffset, getCommentsExtendedResponse.realOffset) &&
                Objects.equals(count, getCommentsExtendedResponse.count) &&
                Objects.equals(groupsCanPost, getCommentsExtendedResponse.groupsCanPost) &&
                Objects.equals(profiles, getCommentsExtendedResponse.profiles) &&
                Objects.equals(groups, getCommentsExtendedResponse.groups) &&
                Objects.equals(canPost, getCommentsExtendedResponse.canPost) &&
                Objects.equals(showReplyButton, getCommentsExtendedResponse.showReplyButton) &&
                Objects.equals(items, getCommentsExtendedResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetCommentsExtendedResponse{");
        sb.append("currentLevelCount=").append(currentLevelCount);
        sb.append(", realOffset=").append(realOffset);
        sb.append(", count=").append(count);
        sb.append(", groupsCanPost=").append(groupsCanPost);
        sb.append(", profiles=").append(profiles);
        sb.append(", groups=").append(groups);
        sb.append(", canPost=").append(canPost);
        sb.append(", showReplyButton=").append(showReplyButton);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
