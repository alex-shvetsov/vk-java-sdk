// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.support;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;

import java.util.Objects;

/**
 * UnblockScreenButtonSupportFields object
 */
public class UnblockScreenButtonSupportFields implements UnblockScreenItem, Validable {
    @SerializedName("id")
    private Number id;

    @SerializedName("text")
    private String text;

    @SerializedName("type")
    @Required
    private UnblockScreenButtonSupportFieldsType type;

    public Number getId() {
        return id;
    }

    public UnblockScreenButtonSupportFields setId(Number id) {
        this.id = id;
        return this;
    }

    public String getText() {
        return text;
    }

    public UnblockScreenButtonSupportFields setText(String text) {
        this.text = text;
        return this;
    }

    public UnblockScreenButtonSupportFieldsType getType() {
        return type;
    }

    public UnblockScreenButtonSupportFields setType(UnblockScreenButtonSupportFieldsType type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnblockScreenButtonSupportFields unblockScreenButtonSupportFields = (UnblockScreenButtonSupportFields) o;
        return Objects.equals(id, unblockScreenButtonSupportFields.id) &&
                Objects.equals(text, unblockScreenButtonSupportFields.text) &&
                Objects.equals(type, unblockScreenButtonSupportFields.type);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("UnblockScreenButtonSupportFields{");
        sb.append("id=").append(id);
        sb.append(", text='").append(text).append("'");
        sb.append(", type='").append(type).append("'");
        sb.append('}');
        return sb.toString();
    }
}
