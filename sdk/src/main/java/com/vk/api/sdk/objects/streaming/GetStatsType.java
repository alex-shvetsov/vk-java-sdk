// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.streaming;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum GetStatsType implements EnumParam<String> {
    @SerializedName("prepared")
    PREPARED("prepared"),

    @SerializedName("received")
    RECEIVED("received");

    private final String value;

    GetStatsType(String value) {
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
