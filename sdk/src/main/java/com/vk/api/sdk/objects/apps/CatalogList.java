// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.apps;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.users.UserMin;

import java.util.List;
import java.util.Objects;

/**
 * CatalogList object
 */
public class CatalogList implements Validable {
    /**
     * Total number
     */
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("items")
    @Required
    private List<App> items;

    @SerializedName("profiles")
    private List<UserMin> profiles;

    public Integer getCount() {
        return count;
    }

    public CatalogList setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<App> getItems() {
        return items;
    }

    public CatalogList setItems(List<App> items) {
        this.items = items;
        return this;
    }

    public List<UserMin> getProfiles() {
        return profiles;
    }

    public CatalogList setProfiles(List<UserMin> profiles) {
        this.profiles = profiles;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, profiles, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CatalogList catalogList = (CatalogList) o;
        return Objects.equals(count, catalogList.count) &&
                Objects.equals(profiles, catalogList.profiles) &&
                Objects.equals(items, catalogList.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("CatalogList{");
        sb.append("count=").append(count);
        sb.append(", profiles=").append(profiles);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
