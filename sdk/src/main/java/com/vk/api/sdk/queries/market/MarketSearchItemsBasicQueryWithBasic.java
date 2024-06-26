// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.market.SearchItemsBasicSortBy;
import com.vk.api.sdk.objects.market.SearchItemsBasicSortDirection;
import com.vk.api.sdk.objects.market.responses.SearchBasicResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.searchItemsBasic method
 */
public class MarketSearchItemsBasicQueryWithBasic extends AbstractQueryBuilder<MarketSearchItemsBasicQueryWithBasic, SearchBasicResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param q value of "q" parameter.
     */
    public MarketSearchItemsBasicQueryWithBasic(VkApiClient client, UserActor actor, String q) {
        super(client, "market.searchItemsBasic", SearchBasicResponse.class);
        accessToken(actor.getAccessToken());
        q(q);
    }

    /**
     * Set q
     *
     * @param value value of "q" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("q")
    public MarketSearchItemsBasicQueryWithBasic q(String value) {
        return unsafeParam("q", value);
    }

    /**
     * Set offset
     *
     * @param value value of "offset" parameter. Maximum is 1000. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("offset")
    public MarketSearchItemsBasicQueryWithBasic offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Set count
     *
     * @param value value of "count" parameter. Maximum is 300. Minimum is 0. By default 30.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("count")
    public MarketSearchItemsBasicQueryWithBasic count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Set category id
     *
     * @param value value of "category id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("category_id")
    public MarketSearchItemsBasicQueryWithBasic categoryId(Integer value) {
        return unsafeParam("category_id", value);
    }

    /**
     * Set price from
     *
     * @param value value of "price from" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("price_from")
    public MarketSearchItemsBasicQueryWithBasic priceFrom(Integer value) {
        return unsafeParam("price_from", value);
    }

    /**
     * Set price to
     *
     * @param value value of "price to" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("price_to")
    public MarketSearchItemsBasicQueryWithBasic priceTo(Integer value) {
        return unsafeParam("price_to", value);
    }

    /**
     * Set sort by
     *
     * @param value value of "sort by" parameter. By default 3.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("sort_by")
    public MarketSearchItemsBasicQueryWithBasic sortBy(SearchItemsBasicSortBy value) {
        return unsafeParam("sort_by", value);
    }

    /**
     * Set sort direction
     *
     * @param value value of "sort direction" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("sort_direction")
    public MarketSearchItemsBasicQueryWithBasic sortDirection(SearchItemsBasicSortDirection value) {
        return unsafeParam("sort_direction", value);
    }

    /**
     * Set country
     *
     * @param value value of "country" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("country")
    public MarketSearchItemsBasicQueryWithBasic country(Integer value) {
        return unsafeParam("country", value);
    }

    /**
     * Set city
     *
     * @param value value of "city" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("city")
    public MarketSearchItemsBasicQueryWithBasic city(Integer value) {
        return unsafeParam("city", value);
    }

    /**
     * Set only my groups
     *
     * @param value value of "only my groups" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("only_my_groups")
    public MarketSearchItemsBasicQueryWithBasic onlyMyGroups(Boolean value) {
        return unsafeParam("only_my_groups", value);
    }

    @Override
    protected MarketSearchItemsBasicQueryWithBasic getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("q", "access_token");
    }
}
