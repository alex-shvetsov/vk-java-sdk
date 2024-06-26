// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.base;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;

import java.util.Objects;

/**
 * OwnerCoverCropParams object
 */
public class OwnerCoverCropParams implements Validable {
    @SerializedName("height")
    private Integer height;

    @SerializedName("width")
    private Integer width;

    @SerializedName("x")
    private Integer x;

    @SerializedName("y")
    private Integer y;

    public Integer getHeight() {
        return height;
    }

    public OwnerCoverCropParams setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public OwnerCoverCropParams setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getX() {
        return x;
    }

    public OwnerCoverCropParams setX(Integer x) {
        this.x = x;
        return this;
    }

    public Integer getY() {
        return y;
    }

    public OwnerCoverCropParams setY(Integer y) {
        this.y = y;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, x, y, height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OwnerCoverCropParams ownerCoverCropParams = (OwnerCoverCropParams) o;
        return Objects.equals(width, ownerCoverCropParams.width) &&
                Objects.equals(x, ownerCoverCropParams.x) &&
                Objects.equals(y, ownerCoverCropParams.y) &&
                Objects.equals(height, ownerCoverCropParams.height);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("OwnerCoverCropParams{");
        sb.append("width=").append(width);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
