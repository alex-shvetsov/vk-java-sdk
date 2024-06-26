// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.pages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Pages.clearCache method
 */
public class PagesClearCacheQuery extends AbstractQueryBuilder<PagesClearCacheQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param url value of "url" parameter.
     */
    public PagesClearCacheQuery(VkApiClient client, ServiceActor actor, String url) {
        super(client, "pages.clearCache", OkResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        url(url);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public PagesClearCacheQuery(VkApiClient client, ServiceActor actor) {
        super(client, "pages.clearCache", OkResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param url value of "url" parameter.
     */
    public PagesClearCacheQuery(VkApiClient client, UserActor actor, String url) {
        super(client, "pages.clearCache", OkResponse.class);
        accessToken(actor.getAccessToken());
        url(url);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public PagesClearCacheQuery(VkApiClient client, UserActor actor) {
        super(client, "pages.clearCache", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Address of the page where you need to refesh the cached version
     *
     * @param value value of "url" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("url")
    public PagesClearCacheQuery url(String value) {
        return unsafeParam("url", value);
    }

    @Override
    protected PagesClearCacheQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("url", "access_token");
    }
}
