// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;

import java.util.List;
import java.util.Objects;

/**
 * ReactionCountersResponseItem object
 */
public class ReactionCountersResponseItem implements Validable {
    @SerializedName("cmid")
    @Required
    private Integer cmid;

    @SerializedName("counters")
    @Required
    private List<ReactionCounterResponseItem> counters;

    public Integer getCmid() {
        return cmid;
    }

    public ReactionCountersResponseItem setCmid(Integer cmid) {
        this.cmid = cmid;
        return this;
    }

    public List<ReactionCounterResponseItem> getCounters() {
        return counters;
    }

    public ReactionCountersResponseItem setCounters(List<ReactionCounterResponseItem> counters) {
        this.counters = counters;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(counters, cmid);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReactionCountersResponseItem reactionCountersResponseItem = (ReactionCountersResponseItem) o;
        return Objects.equals(counters, reactionCountersResponseItem.counters) &&
                Objects.equals(cmid, reactionCountersResponseItem.cmid);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ReactionCountersResponseItem{");
        sb.append("counters=").append(counters);
        sb.append(", cmid=").append(cmid);
        sb.append('}');
        return sb.toString();
    }
}
