// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.ads.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;

import java.util.Objects;

/**
 * RemoveTargetContactsResponse object
 */
public class RemoveTargetContactsResponse implements Validable {
    /**
     * Operation result
     */
    @SerializedName("result")
    @Required
    private RemoveTargetContactsResponseResult result;

    public RemoveTargetContactsResponseResult getResult() {
        return result;
    }

    public RemoveTargetContactsResponse setResult(RemoveTargetContactsResponseResult result) {
        this.result = result;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RemoveTargetContactsResponse removeTargetContactsResponse = (RemoveTargetContactsResponse) o;
        return Objects.equals(result, removeTargetContactsResponse.result);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("RemoveTargetContactsResponse{");
        sb.append("result=").append(result);
        sb.append('}');
        return sb.toString();
    }
}
