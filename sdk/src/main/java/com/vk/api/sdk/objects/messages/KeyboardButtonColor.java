// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Button color
 */
public enum KeyboardButtonColor implements EnumParam<String> {
    @SerializedName("default")
    DEFAULT("default"),

    @SerializedName("positive")
    POSITIVE("positive"),

    @SerializedName("negative")
    NEGATIVE("negative"),

    @SerializedName("primary")
    PRIMARY("primary");

    private final String value;

    KeyboardButtonColor(String value) {
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
