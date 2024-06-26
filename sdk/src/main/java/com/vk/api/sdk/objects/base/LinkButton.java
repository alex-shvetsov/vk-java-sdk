// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.base;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.prettycards.ButtonOneOf;

import java.util.Objects;

/**
 * LinkButton object
 */
public class LinkButton implements ButtonOneOf, Validable {
    /**
     * Button action
     */
    @SerializedName("action")
    private LinkButtonAction action;

    /**
     * Video album id
     */
    @SerializedName("album_id")
    private Integer albumId;

    /**
     * artist id
     */
    @SerializedName("artist_id")
    private String artistId;

    @SerializedName("audio_id")
    private Integer audioId;

    /**
     * Target block id
     */
    @SerializedName("block_id")
    private String blockId;

    /**
     * curator id
     */
    @SerializedName("curator_id")
    private Integer curatorId;

    @SerializedName("hashtag")
    private String hashtag;

    /**
     * Button icon name, e.g. 'phone' or 'gift'
     */
    @SerializedName("icon")
    private String icon;

    /**
     * Owner id
     * Entity: owner
     */
    @SerializedName("owner_id")
    private Long ownerId;

    /**
     * Target section id
     */
    @SerializedName("section_id")
    private String sectionId;

    @SerializedName("style")
    private LinkButtonStyle style;

    /**
     * Button title
     */
    @SerializedName("title")
    private String title;

    public LinkButtonAction getAction() {
        return action;
    }

    public LinkButton setAction(LinkButtonAction action) {
        this.action = action;
        return this;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public LinkButton setAlbumId(Integer albumId) {
        this.albumId = albumId;
        return this;
    }

    public String getArtistId() {
        return artistId;
    }

    public LinkButton setArtistId(String artistId) {
        this.artistId = artistId;
        return this;
    }

    public Integer getAudioId() {
        return audioId;
    }

    public LinkButton setAudioId(Integer audioId) {
        this.audioId = audioId;
        return this;
    }

    public String getBlockId() {
        return blockId;
    }

    public LinkButton setBlockId(String blockId) {
        this.blockId = blockId;
        return this;
    }

    public Integer getCuratorId() {
        return curatorId;
    }

    public LinkButton setCuratorId(Integer curatorId) {
        this.curatorId = curatorId;
        return this;
    }

    public String getHashtag() {
        return hashtag;
    }

    public LinkButton setHashtag(String hashtag) {
        this.hashtag = hashtag;
        return this;
    }

    public String getIcon() {
        return icon;
    }

    public LinkButton setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public LinkButton setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public String getSectionId() {
        return sectionId;
    }

    public LinkButton setSectionId(String sectionId) {
        this.sectionId = sectionId;
        return this;
    }

    public LinkButtonStyle getStyle() {
        return style;
    }

    public LinkButton setStyle(LinkButtonStyle style) {
        this.style = style;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public LinkButton setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockId, curatorId, audioId, icon, action, albumId, style, artistId, sectionId, ownerId, title, hashtag);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkButton linkButton = (LinkButton) o;
        return Objects.equals(sectionId, linkButton.sectionId) &&
                Objects.equals(ownerId, linkButton.ownerId) &&
                Objects.equals(curatorId, linkButton.curatorId) &&
                Objects.equals(icon, linkButton.icon) &&
                Objects.equals(action, linkButton.action) &&
                Objects.equals(albumId, linkButton.albumId) &&
                Objects.equals(style, linkButton.style) &&
                Objects.equals(title, linkButton.title) &&
                Objects.equals(artistId, linkButton.artistId) &&
                Objects.equals(blockId, linkButton.blockId) &&
                Objects.equals(audioId, linkButton.audioId) &&
                Objects.equals(hashtag, linkButton.hashtag);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("LinkButton{");
        sb.append("sectionId='").append(sectionId).append("'");
        sb.append(", ownerId=").append(ownerId);
        sb.append(", curatorId=").append(curatorId);
        sb.append(", icon='").append(icon).append("'");
        sb.append(", action=").append(action);
        sb.append(", albumId=").append(albumId);
        sb.append(", style=").append(style);
        sb.append(", title='").append(title).append("'");
        sb.append(", artistId='").append(artistId).append("'");
        sb.append(", blockId='").append(blockId).append("'");
        sb.append(", audioId=").append(audioId);
        sb.append(", hashtag='").append(hashtag).append("'");
        sb.append('}');
        return sb.toString();
    }
}
