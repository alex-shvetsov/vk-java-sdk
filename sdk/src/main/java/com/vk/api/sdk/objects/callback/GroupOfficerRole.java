// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.callback;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum GroupOfficerRole implements EnumParam<Integer> {
    @SerializedName("0")
    NONE(0),

    @SerializedName("1")
    MODERATOR(1),

    @SerializedName("2")
    EDITOR(2),

    @SerializedName("3")
    ADMINISTRATOR(3);

    private final Integer value;

    GroupOfficerRole(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString().toLowerCase();
    }
}
