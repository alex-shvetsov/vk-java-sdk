// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.adsweb;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.adsweb.responses.GetSitesResponse;
import com.vk.api.sdk.objects.annotations.ApiParam;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Adsweb.getSites method
 */
public class AdswebGetSitesQuery extends AbstractQueryBuilder<AdswebGetSitesQuery, GetSitesResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param officeId value of "office id" parameter.
     */
    public AdswebGetSitesQuery(VkApiClient client, UserActor actor, Integer officeId) {
        super(client, "adsweb.getSites", GetSitesResponse.class);
        accessToken(actor.getAccessToken());
        officeId(officeId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public AdswebGetSitesQuery(VkApiClient client, UserActor actor) {
        super(client, "adsweb.getSites", GetSitesResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set office id
     *
     * @param value value of "office id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("office_id")
    public AdswebGetSitesQuery officeId(Integer value) {
        return unsafeParam("office_id", value);
    }

    /**
     * Set sites ids
     *
     * @param value value of "sites ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("sites_ids")
    public AdswebGetSitesQuery sitesIds(String value) {
        return unsafeParam("sites_ids", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("fields")
    public AdswebGetSitesQuery fields(String value) {
        return unsafeParam("fields", value);
    }

    /**
     * Set limit
     *
     * @param value value of "limit" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("limit")
    public AdswebGetSitesQuery limit(Integer value) {
        return unsafeParam("limit", value);
    }

    /**
     * Set offset
     *
     * @param value value of "offset" parameter. Minimum is 0. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("offset")
    public AdswebGetSitesQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    @Override
    protected AdswebGetSitesQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("office_id", "access_token");
    }
}
