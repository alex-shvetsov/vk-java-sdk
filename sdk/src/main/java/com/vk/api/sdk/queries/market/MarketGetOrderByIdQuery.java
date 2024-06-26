// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.market.responses.GetOrderByIdResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.getOrderById method
 */
public class MarketGetOrderByIdQuery extends AbstractQueryBuilder<MarketGetOrderByIdQuery, GetOrderByIdResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param orderId value of "order id" parameter. Minimum is 0.
     */
    public MarketGetOrderByIdQuery(VkApiClient client, GroupActor actor, Integer orderId) {
        super(client, "market.getOrderById", GetOrderByIdResponse.class);
        accessToken(actor.getAccessToken());
        orderId(orderId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MarketGetOrderByIdQuery(VkApiClient client, GroupActor actor) {
        super(client, "market.getOrderById", GetOrderByIdResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param orderId value of "order id" parameter. Minimum is 0.
     */
    public MarketGetOrderByIdQuery(VkApiClient client, UserActor actor, Integer orderId) {
        super(client, "market.getOrderById", GetOrderByIdResponse.class);
        accessToken(actor.getAccessToken());
        orderId(orderId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MarketGetOrderByIdQuery(VkApiClient client, UserActor actor) {
        super(client, "market.getOrderById", GetOrderByIdResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set user id
     *
     * @param value value of "user id" parameter. Minimum is 0. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("user_id")
    public MarketGetOrderByIdQuery userId(Long value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Set order id
     *
     * @param value value of "order id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("order_id")
    public MarketGetOrderByIdQuery orderId(Integer value) {
        return unsafeParam("order_id", value);
    }

    /**
     * Set extended
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("extended")
    public MarketGetOrderByIdQuery extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    @Override
    protected MarketGetOrderByIdQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("order_id", "access_token");
    }
}
