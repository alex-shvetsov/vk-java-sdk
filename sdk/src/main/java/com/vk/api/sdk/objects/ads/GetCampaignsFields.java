// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum GetCampaignsFields implements EnumParam<String> {
    @SerializedName("ads_count")
    ADS_COUNT("ads_count");

    private final String value;

    GetCampaignsFields(String value) {
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
