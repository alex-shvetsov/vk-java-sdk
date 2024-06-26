// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.groups.responses.AddCallbackServerResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.addCallbackServer method
 */
public class GroupsAddCallbackServerQuery extends AbstractQueryBuilder<GroupsAddCallbackServerQuery, AddCallbackServerResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 1. Entity - owner
     *
     * @param url value of "url" parameter.
     * @param title value of "title" parameter.
     */
    public GroupsAddCallbackServerQuery(VkApiClient client, GroupActor actor, Long groupId,
            String url, String title) {
        super(client, "groups.addCallbackServer", AddCallbackServerResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
        groupId(groupId);
        url(url);
        title(title);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public GroupsAddCallbackServerQuery(VkApiClient client, GroupActor actor) {
        super(client, "groups.addCallbackServer", AddCallbackServerResponse.class);
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
     * @param url value of "url" parameter.
     * @param title value of "title" parameter.
     */
    public GroupsAddCallbackServerQuery(VkApiClient client, UserActor actor, Long groupId,
            String url, String title) {
        super(client, "groups.addCallbackServer", AddCallbackServerResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        url(url);
        title(title);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public GroupsAddCallbackServerQuery(VkApiClient client, UserActor actor) {
        super(client, "groups.addCallbackServer", AddCallbackServerResponse.class);
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
    public GroupsAddCallbackServerQuery groupId(Long value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Set url
     *
     * @param value value of "url" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("url")
    public GroupsAddCallbackServerQuery url(String value) {
        return unsafeParam("url", value);
    }

    /**
     * Set title
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("title")
    public GroupsAddCallbackServerQuery title(String value) {
        return unsafeParam("title", value);
    }

    /**
     * Set secret key
     *
     * @param value value of "secret key" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("secret_key")
    public GroupsAddCallbackServerQuery secretKey(String value) {
        return unsafeParam("secret_key", value);
    }

    @Override
    protected GroupsAddCallbackServerQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("url", "group_id", "title", "access_token");
    }
}
