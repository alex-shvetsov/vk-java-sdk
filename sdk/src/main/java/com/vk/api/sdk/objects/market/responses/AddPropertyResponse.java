// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.market.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;

import java.util.Objects;

/**
 * AddPropertyResponse object
 */
public class AddPropertyResponse implements Validable {
    @SerializedName("property_id")
    @Required
    private Integer propertyId;

    public Integer getPropertyId() {
        return propertyId;
    }

    public AddPropertyResponse setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(propertyId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddPropertyResponse addPropertyResponse = (AddPropertyResponse) o;
        return Objects.equals(propertyId, addPropertyResponse.propertyId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("AddPropertyResponse{");
        sb.append("propertyId=").append(propertyId);
        sb.append('}');
        return sb.toString();
    }
}
