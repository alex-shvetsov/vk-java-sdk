// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.support;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;

import java.util.Objects;

/**
 * UnblockScreenSlidersFieldsItem object
 */
public class UnblockScreenSlidersFieldsItem implements Validable {
    /**
     * Краткое описание, выпадающее при нажатии
     */
    @SerializedName("short_desc")
    private String shortDesc;

    /**
     * Экран, на который происходит переход; обычно содержимое другого экрана - просто заголовок с текстом и кнопкой
     */
    @SerializedName("target_screen")
    private String targetScreen;

    @SerializedName("title")
    private String title;

    public String getShortDesc() {
        return shortDesc;
    }

    public UnblockScreenSlidersFieldsItem setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
        return this;
    }

    public String getTargetScreen() {
        return targetScreen;
    }

    public UnblockScreenSlidersFieldsItem setTargetScreen(String targetScreen) {
        this.targetScreen = targetScreen;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public UnblockScreenSlidersFieldsItem setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetScreen, shortDesc, title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnblockScreenSlidersFieldsItem unblockScreenSlidersFieldsItem = (UnblockScreenSlidersFieldsItem) o;
        return Objects.equals(targetScreen, unblockScreenSlidersFieldsItem.targetScreen) &&
                Objects.equals(shortDesc, unblockScreenSlidersFieldsItem.shortDesc) &&
                Objects.equals(title, unblockScreenSlidersFieldsItem.title);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("UnblockScreenSlidersFieldsItem{");
        sb.append("targetScreen='").append(targetScreen).append("'");
        sb.append(", shortDesc='").append(shortDesc).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}
