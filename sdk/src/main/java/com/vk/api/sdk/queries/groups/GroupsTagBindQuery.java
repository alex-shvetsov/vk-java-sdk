// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.BoolResponse;
import com.vk.api.sdk.objects.groups.TagBindAct;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.tagBind method
 */
public class GroupsTagBindQuery extends AbstractQueryBuilder<GroupsTagBindQuery, BoolResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 1. Entity - owner
     *
     * @param tagId value of "tag id" parameter. Minimum is 0.
     * @param userId value of "user id" parameter. Maximum is 2000000000. Minimum is 1. Entity - owner
     *
     * @param act value of "act" parameter.
     */
    public GroupsTagBindQuery(VkApiClient client, GroupActor actor, Long groupId, Integer tagId,
            Long userId, TagBindAct act) {
        super(client, "groups.tagBind", BoolResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
        groupId(groupId);
        tagId(tagId);
        userId(userId);
        act(act);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public GroupsTagBindQuery(VkApiClient client, GroupActor actor) {
        super(client, "groups.tagBind", BoolResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 1. Entity - owner
     *
     * @param tagId value of "tag id" parameter. Minimum is 0.
     * @param userId value of "user id" parameter. Maximum is 2000000000. Minimum is 1. Entity - owner
     *
     * @param act value of "act" parameter.
     */
    public GroupsTagBindQuery(VkApiClient client, UserActor actor, Long groupId, Integer tagId,
            Long userId, TagBindAct act) {
        super(client, "groups.tagBind", BoolResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        tagId(tagId);
        userId(userId);
        act(act);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public GroupsTagBindQuery(VkApiClient client, UserActor actor) {
        super(client, "groups.tagBind", BoolResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set group id
     *
     * @param value value of "group id" parameter. Minimum is 1. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("group_id")
    public GroupsTagBindQuery groupId(Long value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Set tag id
     *
     * @param value value of "tag id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("tag_id")
    public GroupsTagBindQuery tagId(Integer value) {
        return unsafeParam("tag_id", value);
    }

    /**
     * Set user id
     *
     * @param value value of "user id" parameter. Maximum is 2000000000. Minimum is 1. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("user_id")
    public GroupsTagBindQuery userId(Long value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Describe the action
     *
     * @param value value of "act" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("act")
    public GroupsTagBindQuery act(TagBindAct value) {
        return unsafeParam("act", value);
    }

    @Override
    protected GroupsTagBindQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "tag_id", "user_id", "act", "access_token");
    }
}
