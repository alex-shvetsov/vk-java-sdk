// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.support;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;

import java.util.Objects;

/**
 * UnblockScreenContentBlockFields object
 */
public class UnblockScreenContentBlockFields implements UnblockScreenItem, Validable {
    /**
     * Тип контента
     */
    @SerializedName("content_type")
    private UnblockScreenContentBlockFieldsContentType contentType;

    @SerializedName("type")
    @Required
    private UnblockScreenContentBlockFieldsType type;

    public UnblockScreenContentBlockFieldsContentType getContentType() {
        return contentType;
    }

    public UnblockScreenContentBlockFields setContentType(
            UnblockScreenContentBlockFieldsContentType contentType) {
        this.contentType = contentType;
        return this;
    }

    public UnblockScreenContentBlockFieldsType getType() {
        return type;
    }

    public UnblockScreenContentBlockFields setType(UnblockScreenContentBlockFieldsType type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, contentType);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnblockScreenContentBlockFields unblockScreenContentBlockFields = (UnblockScreenContentBlockFields) o;
        return Objects.equals(contentType, unblockScreenContentBlockFields.contentType) &&
                Objects.equals(type, unblockScreenContentBlockFields.type);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("UnblockScreenContentBlockFields{");
        sb.append("contentType='").append(contentType).append("'");
        sb.append(", type='").append(type).append("'");
        sb.append('}');
        return sb.toString();
    }
}
