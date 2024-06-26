// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.callback;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.events.CallbackEvent;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;

import java.util.Objects;

/**
 * LikeAddRemove object
 */
public class LikeAddRemove implements Validable, CallbackEvent {
    /**
     * Entity: owner
     */
    @SerializedName("liker_id")
    @Required
    private Long likerId;

    @SerializedName("object_id")
    @Required
    private Integer objectId;

    /**
     * Entity: owner
     */
    @SerializedName("object_owner_id")
    @Required
    private Long objectOwnerId;

    @SerializedName("object_type")
    @Required
    private LikeAddRemoveObjectType objectType;

    @SerializedName("post_id")
    @Required
    private Integer postId;

    @SerializedName("thread_reply_id")
    private Integer threadReplyId;

    public Long getLikerId() {
        return likerId;
    }

    public LikeAddRemove setLikerId(Long likerId) {
        this.likerId = likerId;
        return this;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public LikeAddRemove setObjectId(Integer objectId) {
        this.objectId = objectId;
        return this;
    }

    public Long getObjectOwnerId() {
        return objectOwnerId;
    }

    public LikeAddRemove setObjectOwnerId(Long objectOwnerId) {
        this.objectOwnerId = objectOwnerId;
        return this;
    }

    public LikeAddRemoveObjectType getObjectType() {
        return objectType;
    }

    public LikeAddRemove setObjectType(LikeAddRemoveObjectType objectType) {
        this.objectType = objectType;
        return this;
    }

    public Integer getPostId() {
        return postId;
    }

    public LikeAddRemove setPostId(Integer postId) {
        this.postId = postId;
        return this;
    }

    public Integer getThreadReplyId() {
        return threadReplyId;
    }

    public LikeAddRemove setThreadReplyId(Integer threadReplyId) {
        this.threadReplyId = threadReplyId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(likerId, objectOwnerId, postId, objectId, threadReplyId, objectType);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LikeAddRemove likeAddRemove = (LikeAddRemove) o;
        return Objects.equals(threadReplyId, likeAddRemove.threadReplyId) &&
                Objects.equals(postId, likeAddRemove.postId) &&
                Objects.equals(objectType, likeAddRemove.objectType) &&
                Objects.equals(likerId, likeAddRemove.likerId) &&
                Objects.equals(objectOwnerId, likeAddRemove.objectOwnerId) &&
                Objects.equals(objectId, likeAddRemove.objectId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("LikeAddRemove{");
        sb.append("threadReplyId=").append(threadReplyId);
        sb.append(", postId=").append(postId);
        sb.append(", objectType='").append(objectType).append("'");
        sb.append(", likerId=").append(likerId);
        sb.append(", objectOwnerId=").append(objectOwnerId);
        sb.append(", objectId=").append(objectId);
        sb.append('}');
        return sb.toString();
    }
}
