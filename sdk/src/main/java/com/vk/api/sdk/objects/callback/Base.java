// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.callback;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.events.CallbackEvent;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;

import java.util.Objects;

/**
 * Base object
 */
public class Base implements Validable, CallbackEvent {
    /**
     * Unique event id. If it passed twice or more - you should ignore it.
     */
    @SerializedName("event_id")
    @Required
    private String eventId;

    /**
     * Entity: groups
     */
    @SerializedName("group_id")
    @Required
    private Long groupId;

    @SerializedName("secret")
    private String secret;

    @SerializedName("type")
    @Required
    private Type type;

    /**
     * API object version
     */
    @SerializedName("v")
    @Required
    private String v;

    public String getEventId() {
        return eventId;
    }

    public Base setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    public Long getGroupId() {
        return groupId;
    }

    public Base setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getSecret() {
        return secret;
    }

    public Base setSecret(String secret) {
        this.secret = secret;
        return this;
    }

    public Type getType() {
        return type;
    }

    public Base setType(Type type) {
        this.type = type;
        return this;
    }

    public String getV() {
        return v;
    }

    public Base setV(String v) {
        this.v = v;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, v, groupId, secret, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Base base = (Base) o;
        return Objects.equals(eventId, base.eventId) &&
                Objects.equals(groupId, base.groupId) &&
                Objects.equals(v, base.v) &&
                Objects.equals(secret, base.secret) &&
                Objects.equals(type, base.type);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Base{");
        sb.append("eventId='").append(eventId).append("'");
        sb.append(", groupId=").append(groupId);
        sb.append(", v='").append(v).append("'");
        sb.append(", secret='").append(secret).append("'");
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
