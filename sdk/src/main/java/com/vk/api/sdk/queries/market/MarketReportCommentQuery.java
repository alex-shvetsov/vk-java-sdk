// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import com.vk.api.sdk.objects.market.ReportCommentReason;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.reportComment method
 */
public class MarketReportCommentQuery extends AbstractQueryBuilder<MarketReportCommentQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter. Entity - owner
     *
     * @param commentId value of "comment id" parameter. Minimum is 0.
     * @param reason value of "reason" parameter. Minimum is 0.
     */
    public MarketReportCommentQuery(VkApiClient client, UserActor actor, Long ownerId,
            Integer commentId, ReportCommentReason reason) {
        super(client, "market.reportComment", OkResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        commentId(commentId);
        reason(reason);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MarketReportCommentQuery(VkApiClient client, UserActor actor) {
        super(client, "market.reportComment", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * ID of an item owner community.
     *
     * @param value value of "owner id" parameter. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("owner_id")
    public MarketReportCommentQuery ownerId(Long value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Comment ID.
     *
     * @param value value of "comment id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("comment_id")
    public MarketReportCommentQuery commentId(Integer value) {
        return unsafeParam("comment_id", value);
    }

    /**
     * Complaint reason. Possible values: *'0' - spam,, *'1' - child porn,, *'2' - extremism,, *'3' - violence,, *'4' - drugs propaganda,, *'5' - adult materials,, *'6' - insult.
     *
     * @param value value of "reason" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("reason")
    public MarketReportCommentQuery reason(ReportCommentReason value) {
        return unsafeParam("reason", value);
    }

    @Override
    protected MarketReportCommentQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("reason", "owner_id", "comment_id", "access_token");
    }
}
