// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum CommentsItemTypePostInnerType implements EnumParam<String> {
    @SerializedName("wall_wallpost")
    WALL_WALLPOST("wall_wallpost");

    private final String value;

    CommentsItemTypePostInnerType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toLowerCase();
    }
}