// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.Likes;

import java.util.Objects;

/**
 * CommentsItemTypeNotes object
 */
public class CommentsItemTypeNotes extends CommentsItemBase implements CommentsItem, Validable {
    @SerializedName("comments")
    private CommentsBase comments;

    @SerializedName("likes")
    private Likes likes;

    @SerializedName("text")
    private String text;

    public CommentsBase getComments() {
        return comments;
    }

    public CommentsItemTypeNotes setComments(CommentsBase comments) {
        this.comments = comments;
        return this;
    }

    public Likes getLikes() {
        return likes;
    }

    public CommentsItemTypeNotes setLikes(Likes likes) {
        this.likes = likes;
        return this;
    }

    public String getText() {
        return text;
    }

    public CommentsItemTypeNotes setText(String text) {
        this.text = text;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(comments, text, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentsItemTypeNotes commentsItemTypeNotes = (CommentsItemTypeNotes) o;
        return Objects.equals(comments, commentsItemTypeNotes.comments) &&
                Objects.equals(text, commentsItemTypeNotes.text) &&
                Objects.equals(likes, commentsItemTypeNotes.likes);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("CommentsItemTypeNotes{");
        sb.append("comments=").append(comments);
        sb.append(", text='").append(text).append("'");
        sb.append(", likes=").append(likes);
        sb.append('}');
        return sb.toString();
    }
}
