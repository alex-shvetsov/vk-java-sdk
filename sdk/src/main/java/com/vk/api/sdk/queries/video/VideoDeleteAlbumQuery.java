// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.video;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Video.deleteAlbum method
 */
public class VideoDeleteAlbumQuery extends AbstractQueryBuilder<VideoDeleteAlbumQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param albumId value of "album id" parameter. Minimum is 0.
     */
    public VideoDeleteAlbumQuery(VkApiClient client, UserActor actor, Integer albumId) {
        super(client, "video.deleteAlbum", OkResponse.class);
        accessToken(actor.getAccessToken());
        albumId(albumId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public VideoDeleteAlbumQuery(VkApiClient client, UserActor actor) {
        super(client, "video.deleteAlbum", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Community ID (if the album is owned by a community).
     *
     * @param value value of "group id" parameter. Minimum is 1. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("group_id")
    public VideoDeleteAlbumQuery groupId(Long value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Album ID.
     *
     * @param value value of "album id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("album_id")
    public VideoDeleteAlbumQuery albumId(Integer value) {
        return unsafeParam("album_id", value);
    }

    /**
     * Set owner id
     *
     * @param value value of "owner id" parameter. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("owner_id")
    public VideoDeleteAlbumQuery ownerId(Long value) {
        return unsafeParam("owner_id", value);
    }

    @Override
    protected VideoDeleteAlbumQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("album_id", "access_token");
    }
}
