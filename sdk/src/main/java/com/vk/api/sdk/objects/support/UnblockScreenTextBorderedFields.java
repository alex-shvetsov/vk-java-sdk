// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.support;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;

import java.util.Objects;

/**
 * UnblockScreenTextBorderedFields object
 */
public class UnblockScreenTextBorderedFields implements UnblockScreenItem, Validable {
    /**
     * Нужна ли кнопка 'Получить уведомление'
     */
    @SerializedName("notify_btn")
    private Boolean notifyBtn;

    /**
     * Текст
     */
    @SerializedName("text")
    private String text;

    @SerializedName("type")
    @Required
    private UnblockScreenTextBorderedFieldsType type;

    public Boolean getNotifyBtn() {
        return notifyBtn;
    }

    public UnblockScreenTextBorderedFields setNotifyBtn(Boolean notifyBtn) {
        this.notifyBtn = notifyBtn;
        return this;
    }

    public String getText() {
        return text;
    }

    public UnblockScreenTextBorderedFields setText(String text) {
        this.text = text;
        return this;
    }

    public UnblockScreenTextBorderedFieldsType getType() {
        return type;
    }

    public UnblockScreenTextBorderedFields setType(UnblockScreenTextBorderedFieldsType type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, notifyBtn, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnblockScreenTextBorderedFields unblockScreenTextBorderedFields = (UnblockScreenTextBorderedFields) o;
        return Objects.equals(notifyBtn, unblockScreenTextBorderedFields.notifyBtn) &&
                Objects.equals(text, unblockScreenTextBorderedFields.text) &&
                Objects.equals(type, unblockScreenTextBorderedFields.type);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("UnblockScreenTextBorderedFields{");
        sb.append("notifyBtn=").append(notifyBtn);
        sb.append(", text='").append(text).append("'");
        sb.append(", type='").append(type).append("'");
        sb.append('}');
        return sb.toString();
    }
}
