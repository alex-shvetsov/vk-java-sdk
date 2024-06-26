// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.notes;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Notes.createComment method
 */
public class NotesCreateCommentQuery extends AbstractQueryBuilder<NotesCreateCommentQuery, Integer> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param noteId value of "note id" parameter. Minimum is 0.
     * @param message value of "message" parameter.
     */
    public NotesCreateCommentQuery(VkApiClient client, UserActor actor, Integer noteId,
            String message) {
        super(client, "notes.createComment", Integer.class);
        accessToken(actor.getAccessToken());
        noteId(noteId);
        message(message);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public NotesCreateCommentQuery(VkApiClient client, UserActor actor) {
        super(client, "notes.createComment", Integer.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Note ID.
     *
     * @param value value of "note id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("note_id")
    public NotesCreateCommentQuery noteId(Integer value) {
        return unsafeParam("note_id", value);
    }

    /**
     * Note owner ID.
     *
     * @param value value of "owner id" parameter. Minimum is 0. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("owner_id")
    public NotesCreateCommentQuery ownerId(Long value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * ID of the user to whom the reply is addressed (if the comment is a reply to another comment).
     *
     * @param value value of "reply to" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("reply_to")
    public NotesCreateCommentQuery replyTo(Integer value) {
        return unsafeParam("reply_to", value);
    }

    /**
     * Comment text.
     *
     * @param value value of "message" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("message")
    public NotesCreateCommentQuery message(String value) {
        return unsafeParam("message", value);
    }

    /**
     * Set guid
     *
     * @param value value of "guid" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("guid")
    public NotesCreateCommentQuery guid(String value) {
        return unsafeParam("guid", value);
    }

    @Override
    protected NotesCreateCommentQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("note_id", "message", "access_token");
    }
}
