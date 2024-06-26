// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.apps;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.BoolResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Apps.removeUsersFromTestingGroups method
 */
public class AppsRemoveUsersFromTestingGroupsQuery extends AbstractQueryBuilder<AppsRemoveUsersFromTestingGroupsQuery, BoolResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param userIds value of "user ids" parameter.
     */
    public AppsRemoveUsersFromTestingGroupsQuery(VkApiClient client, ServiceActor actor,
            Long... userIds) {
        super(client, "apps.removeUsersFromTestingGroups", BoolResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        userIds(userIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param userIds value of "user ids" parameter.
     */
    public AppsRemoveUsersFromTestingGroupsQuery(VkApiClient client, ServiceActor actor,
            List<Long> userIds) {
        super(client, "apps.removeUsersFromTestingGroups", BoolResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        userIds(userIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public AppsRemoveUsersFromTestingGroupsQuery(VkApiClient client, ServiceActor actor) {
        super(client, "apps.removeUsersFromTestingGroups", BoolResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * userIds
     * Set user ids
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("user_ids")
    public AppsRemoveUsersFromTestingGroupsQuery userIds(Long... value) {
        return unsafeParam("user_ids", value);
    }

    /**
     * Set user ids
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("user_ids")
    public AppsRemoveUsersFromTestingGroupsQuery userIds(List<Long> value) {
        return unsafeParam("user_ids", value);
    }

    @Override
    protected AppsRemoveUsersFromTestingGroupsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("user_ids", "access_token");
    }
}
