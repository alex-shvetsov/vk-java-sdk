// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.base;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;

import java.util.Objects;

/**
 * LinkRating object
 */
public class LinkRating implements Validable {
    /**
     * Count of reviews
     */
    @SerializedName("reviews_count")
    private Integer reviewsCount;

    /**
     * Count of stars
     */
    @SerializedName("stars")
    private Number stars;

    @SerializedName("type")
    private LinkRatingType type;

    public Integer getReviewsCount() {
        return reviewsCount;
    }

    public LinkRating setReviewsCount(Integer reviewsCount) {
        this.reviewsCount = reviewsCount;
        return this;
    }

    public Number getStars() {
        return stars;
    }

    public LinkRating setStars(Number stars) {
        this.stars = stars;
        return this;
    }

    public LinkRatingType getType() {
        return type;
    }

    public LinkRating setType(LinkRatingType type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stars, reviewsCount, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkRating linkRating = (LinkRating) o;
        return Objects.equals(stars, linkRating.stars) &&
                Objects.equals(type, linkRating.type) &&
                Objects.equals(reviewsCount, linkRating.reviewsCount);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("LinkRating{");
        sb.append("stars=").append(stars);
        sb.append(", type='").append(type).append("'");
        sb.append(", reviewsCount=").append(reviewsCount);
        sb.append('}');
        return sb.toString();
    }
}
