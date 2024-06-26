// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.ads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;

import java.util.Objects;

/**
 * StatisticClickAction object
 */
public class StatisticClickAction implements Validable {
    @SerializedName("type")
    private StatisticClickActionType type;

    @SerializedName("url")
    private String url;

    public StatisticClickActionType getType() {
        return type;
    }

    public StatisticClickAction setType(StatisticClickActionType type) {
        this.type = type;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public StatisticClickAction setUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, url);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatisticClickAction statisticClickAction = (StatisticClickAction) o;
        return Objects.equals(type, statisticClickAction.type) &&
                Objects.equals(url, statisticClickAction.url);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("StatisticClickAction{");
        sb.append("type='").append(type).append("'");
        sb.append(", url='").append(url).append("'");
        sb.append('}');
        return sb.toString();
    }
}
