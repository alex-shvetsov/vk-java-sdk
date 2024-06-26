// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.apps;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.apps.responses.GetSnippetsResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Apps.getSnippets method
 */
public class AppsGetSnippetsQuery extends AbstractQueryBuilder<AppsGetSnippetsQuery, GetSnippetsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public AppsGetSnippetsQuery(VkApiClient client, ServiceActor actor) {
        super(client, "apps.getSnippets", GetSnippetsResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    @Override
    protected AppsGetSnippetsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
