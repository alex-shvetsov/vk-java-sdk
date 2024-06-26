// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiMethod;
import com.vk.api.sdk.queries.stats.StatsGetPostReachQuery;
import com.vk.api.sdk.queries.stats.StatsGetQuery;
import com.vk.api.sdk.queries.stats.StatsTrackVisitorQuery;

import java.util.List;

/**
 * List of Stats methods
 */
public class Stats extends AbstractAction {
    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Stats(VkApiClient client) {
        super(client);
    }

    /**
     * Returns statistics of a community or an application.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("stats.get")
    public StatsGetQuery get(UserActor actor) {
        return new StatsGetQuery(getClient(), actor);
    }

    /**
     * Returns stats for a wall post.
     *
     * @param actor vk user actor
     * @param ownerId post owner community id. Specify with "-" sign.
     * @param postIds wall posts id
     * @return query
     */
    @ApiMethod("stats.getPostReach")
    public StatsGetPostReachQuery getPostReach(UserActor actor, Long ownerId, Long... postIds) {
        return new StatsGetPostReachQuery(getClient(), actor, ownerId, postIds);
    }

    /**
     * Returns stats for a wall post.
     *
     * @param actor vk user actor
     * @param ownerId post owner community id. Specify with "-" sign.
     * @param postIds wall posts id
     * @return query
     */
    @ApiMethod("stats.getPostReach")
    public StatsGetPostReachQuery getPostReach(UserActor actor, Long ownerId, List<Long> postIds) {
        return new StatsGetPostReachQuery(getClient(), actor, ownerId, postIds);
    }

    /**
     * Returns stats for a wall post.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("stats.getPostReach")
    public StatsGetPostReachQuery getPostReach(UserActor actor) {
        return new StatsGetPostReachQuery(getClient(), actor);
    }

    /**
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("stats.trackVisitor")
    public StatsTrackVisitorQuery trackVisitor(UserActor actor) {
        return new StatsTrackVisitorQuery(getClient(), actor);
    }
}
