// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.account;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Account.getAppPermissions method
 */
public class AccountGetAppPermissionsQuery extends AbstractQueryBuilder<AccountGetAppPermissionsQuery, Integer> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public AccountGetAppPermissionsQuery(VkApiClient client, UserActor actor) {
        super(client, "account.getAppPermissions", Integer.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * User ID whose settings information shall be got. By default: current user.
     *
     * @param value value of "user id" parameter. Minimum is 1. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("user_id")
    public AccountGetAppPermissionsQuery userId(Long value) {
        return unsafeParam("user_id", value);
    }

    @Override
    protected AccountGetAppPermissionsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
