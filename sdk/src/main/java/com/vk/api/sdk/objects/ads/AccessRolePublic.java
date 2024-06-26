// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Current user's role
 */
public enum AccessRolePublic implements EnumParam<String> {
    @SerializedName("manager")
    MANAGER("manager"),

    @SerializedName("reports")
    REPORTS("reports");

    private final String value;

    AccessRolePublic(String value) {
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
