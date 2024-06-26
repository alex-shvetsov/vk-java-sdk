// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.photos.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.photos.Photo;

import java.util.List;
import java.util.Objects;

/**
 * GetResponse object
 */
public class GetResponse implements Validable {
    /**
     * Total number
     */
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("items")
    @Required
    private List<Photo> items;

    /**
     * next from pagination cursor
     */
    @SerializedName("next_from")
    private String nextFrom;

    public Integer getCount() {
        return count;
    }

    public GetResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<Photo> getItems() {
        return items;
    }

    public GetResponse setItems(List<Photo> items) {
        this.items = items;
        return this;
    }

    public String getNextFrom() {
        return nextFrom;
    }

    public GetResponse setNextFrom(String nextFrom) {
        this.nextFrom = nextFrom;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, nextFrom, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetResponse getResponse = (GetResponse) o;
        return Objects.equals(nextFrom, getResponse.nextFrom) &&
                Objects.equals(count, getResponse.count) &&
                Objects.equals(items, getResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetResponse{");
        sb.append("nextFrom='").append(nextFrom).append("'");
        sb.append(", count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
