// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.market.responses.GroupItemsResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.groupItems method
 */
public class MarketGroupItemsQuery extends AbstractQueryBuilder<MarketGroupItemsQuery, GroupItemsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 1. Entity - owner
     *
     * @param itemIds value of "item ids" parameter.
     */
    public MarketGroupItemsQuery(VkApiClient client, UserActor actor, Long groupId,
            Integer... itemIds) {
        super(client, "market.groupItems", GroupItemsResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        itemIds(itemIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 1. Entity - owner
     *
     * @param itemIds value of "item ids" parameter.
     */
    public MarketGroupItemsQuery(VkApiClient client, UserActor actor, Long groupId,
            List<Integer> itemIds) {
        super(client, "market.groupItems", GroupItemsResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        itemIds(itemIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MarketGroupItemsQuery(VkApiClient client, UserActor actor) {
        super(client, "market.groupItems", GroupItemsResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Group id.
     *
     * @param value value of "group id" parameter. Minimum is 1. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("group_id")
    public MarketGroupItemsQuery groupId(Long value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Items group id.
     *
     * @param value value of "item group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("item_group_id")
    public MarketGroupItemsQuery itemGroupId(Integer value) {
        return unsafeParam("item_group_id", value);
    }

    /**
     * itemIds
     * Item ids.
     *
     * @param value value of "item ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("item_ids")
    public MarketGroupItemsQuery itemIds(Integer... value) {
        return unsafeParam("item_ids", value);
    }

    /**
     * Item ids.
     *
     * @param value value of "item ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("item_ids")
    public MarketGroupItemsQuery itemIds(List<Integer> value) {
        return unsafeParam("item_ids", value);
    }

    @Override
    protected MarketGroupItemsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "item_ids", "access_token");
    }
}