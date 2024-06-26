// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.ads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;

import java.util.List;
import java.util.Objects;

/**
 * StatsFormat object
 */
public class StatsFormat implements Validable {
    /**
     * Clicks number
     */
    @SerializedName("clicks")
    private Integer clicks;

    /**
     * Conversions count
     */
    @SerializedName("conversion_count")
    private Integer conversionCount;

    /**
     * Conversions CR
     */
    @SerializedName("conversion_cr")
    private String conversionCr;

    /**
     * Conversions external
     */
    @SerializedName("conversions_external")
    private Integer conversionsExternal;

    /**
     * Ctr
     */
    @SerializedName("ctr")
    private String ctr;

    /**
     * Day as YYYY-MM-DD
     */
    @SerializedName("day")
    private String day;

    /**
     * Day from
     */
    @SerializedName("day_from")
    private String dayFrom;

    /**
     * Day to
     */
    @SerializedName("day_to")
    private String dayTo;

    /**
     * Effective cost per click
     */
    @SerializedName("effective_cost_per_click")
    private String effectiveCostPerClick;

    /**
     * Effective cost per message
     */
    @SerializedName("effective_cost_per_message")
    private String effectiveCostPerMessage;

    /**
     * Effective cost per mille
     */
    @SerializedName("effective_cost_per_mille")
    private String effectiveCostPerMille;

    /**
     * Effective cpf
     */
    @SerializedName("effective_cpf")
    private String effectiveCpf;

    /**
     * Impressions number
     */
    @SerializedName("impressions")
    private Integer impressions;

    /**
     * Events number
     */
    @SerializedName("join_rate")
    private Integer joinRate;

    /**
     * External clicks number
     */
    @SerializedName("link_external_clicks")
    private Integer linkExternalClicks;

    /**
     * Message sends count
     */
    @SerializedName("message_sends")
    private Integer messageSends;

    /**
     * Message sends by anu user
     */
    @SerializedName("message_sends_by_any_user")
    private Integer messageSendsByAnyUser;

    /**
     * Mobile app stat
     */
    @SerializedName("mobile_app_stat")
    private List<MobileStatItem> mobileAppStat;

    /**
     * Month as YYYY-MM
     */
    @SerializedName("month")
    private String month;

    /**
     * 1 if period=overall
     */
    @SerializedName("overall")
    private Integer overall;

    /**
     * Reach 
     */
    @SerializedName("reach")
    private Integer reach;

    /**
     * Spent funds
     */
    @SerializedName("spent")
    private String spent;

    /**
     * Unique views count
     */
    @SerializedName("uniq_views_count")
    private Integer uniqViewsCount;

    /**
     * Video plays unique 100 percents count
     */
    @SerializedName("video_plays_unique_100_percents")
    private Integer videoPlaysUnique100Percents;

    /**
     * Video plays unique 10 seconds count
     */
    @SerializedName("video_plays_unique_10_seconds")
    private Integer videoPlaysUnique10Seconds;

    /**
     * Video plays unique 25 percents count
     */
    @SerializedName("video_plays_unique_25_percents")
    private Integer videoPlaysUnique25Percents;

    /**
     * Video plays unique 3 seconds count
     */
    @SerializedName("video_plays_unique_3_seconds")
    private Integer videoPlaysUnique3Seconds;

    /**
     * Video plays unique 50 percents count
     */
    @SerializedName("video_plays_unique_50_percents")
    private Integer videoPlaysUnique50Percents;

    /**
     * Video plays unique 75 percents count
     */
    @SerializedName("video_plays_unique_75_percents")
    private Integer videoPlaysUnique75Percents;

    /**
     * Video plays unique started count
     */
    @SerializedName("video_plays_unique_started")
    private Integer videoPlaysUniqueStarted;

    /**
     * Year as YYYY
     */
    @SerializedName("year")
    private Integer year;

    public Integer getClicks() {
        return clicks;
    }

    public StatsFormat setClicks(Integer clicks) {
        this.clicks = clicks;
        return this;
    }

    public Integer getConversionCount() {
        return conversionCount;
    }

    public StatsFormat setConversionCount(Integer conversionCount) {
        this.conversionCount = conversionCount;
        return this;
    }

    public String getConversionCr() {
        return conversionCr;
    }

    public StatsFormat setConversionCr(String conversionCr) {
        this.conversionCr = conversionCr;
        return this;
    }

    public Integer getConversionsExternal() {
        return conversionsExternal;
    }

    public StatsFormat setConversionsExternal(Integer conversionsExternal) {
        this.conversionsExternal = conversionsExternal;
        return this;
    }

    public String getCtr() {
        return ctr;
    }

    public StatsFormat setCtr(String ctr) {
        this.ctr = ctr;
        return this;
    }

    public String getDay() {
        return day;
    }

    public StatsFormat setDay(String day) {
        this.day = day;
        return this;
    }

    public String getDayFrom() {
        return dayFrom;
    }

    public StatsFormat setDayFrom(String dayFrom) {
        this.dayFrom = dayFrom;
        return this;
    }

    public String getDayTo() {
        return dayTo;
    }

    public StatsFormat setDayTo(String dayTo) {
        this.dayTo = dayTo;
        return this;
    }

    public String getEffectiveCostPerClick() {
        return effectiveCostPerClick;
    }

    public StatsFormat setEffectiveCostPerClick(String effectiveCostPerClick) {
        this.effectiveCostPerClick = effectiveCostPerClick;
        return this;
    }

    public String getEffectiveCostPerMessage() {
        return effectiveCostPerMessage;
    }

    public StatsFormat setEffectiveCostPerMessage(String effectiveCostPerMessage) {
        this.effectiveCostPerMessage = effectiveCostPerMessage;
        return this;
    }

    public String getEffectiveCostPerMille() {
        return effectiveCostPerMille;
    }

    public StatsFormat setEffectiveCostPerMille(String effectiveCostPerMille) {
        this.effectiveCostPerMille = effectiveCostPerMille;
        return this;
    }

    public String getEffectiveCpf() {
        return effectiveCpf;
    }

    public StatsFormat setEffectiveCpf(String effectiveCpf) {
        this.effectiveCpf = effectiveCpf;
        return this;
    }

    public Integer getImpressions() {
        return impressions;
    }

    public StatsFormat setImpressions(Integer impressions) {
        this.impressions = impressions;
        return this;
    }

    public Integer getJoinRate() {
        return joinRate;
    }

    public StatsFormat setJoinRate(Integer joinRate) {
        this.joinRate = joinRate;
        return this;
    }

    public Integer getLinkExternalClicks() {
        return linkExternalClicks;
    }

    public StatsFormat setLinkExternalClicks(Integer linkExternalClicks) {
        this.linkExternalClicks = linkExternalClicks;
        return this;
    }

    public Integer getMessageSends() {
        return messageSends;
    }

    public StatsFormat setMessageSends(Integer messageSends) {
        this.messageSends = messageSends;
        return this;
    }

    public Integer getMessageSendsByAnyUser() {
        return messageSendsByAnyUser;
    }

    public StatsFormat setMessageSendsByAnyUser(Integer messageSendsByAnyUser) {
        this.messageSendsByAnyUser = messageSendsByAnyUser;
        return this;
    }

    public List<MobileStatItem> getMobileAppStat() {
        return mobileAppStat;
    }

    public StatsFormat setMobileAppStat(List<MobileStatItem> mobileAppStat) {
        this.mobileAppStat = mobileAppStat;
        return this;
    }

    public String getMonth() {
        return month;
    }

    public StatsFormat setMonth(String month) {
        this.month = month;
        return this;
    }

    public Integer getOverall() {
        return overall;
    }

    public StatsFormat setOverall(Integer overall) {
        this.overall = overall;
        return this;
    }

    public Integer getReach() {
        return reach;
    }

    public StatsFormat setReach(Integer reach) {
        this.reach = reach;
        return this;
    }

    public String getSpent() {
        return spent;
    }

    public StatsFormat setSpent(String spent) {
        this.spent = spent;
        return this;
    }

    public Integer getUniqViewsCount() {
        return uniqViewsCount;
    }

    public StatsFormat setUniqViewsCount(Integer uniqViewsCount) {
        this.uniqViewsCount = uniqViewsCount;
        return this;
    }

    public Integer getVideoPlaysUnique100Percents() {
        return videoPlaysUnique100Percents;
    }

    public StatsFormat setVideoPlaysUnique100Percents(Integer videoPlaysUnique100Percents) {
        this.videoPlaysUnique100Percents = videoPlaysUnique100Percents;
        return this;
    }

    public Integer getVideoPlaysUnique10Seconds() {
        return videoPlaysUnique10Seconds;
    }

    public StatsFormat setVideoPlaysUnique10Seconds(Integer videoPlaysUnique10Seconds) {
        this.videoPlaysUnique10Seconds = videoPlaysUnique10Seconds;
        return this;
    }

    public Integer getVideoPlaysUnique25Percents() {
        return videoPlaysUnique25Percents;
    }

    public StatsFormat setVideoPlaysUnique25Percents(Integer videoPlaysUnique25Percents) {
        this.videoPlaysUnique25Percents = videoPlaysUnique25Percents;
        return this;
    }

    public Integer getVideoPlaysUnique3Seconds() {
        return videoPlaysUnique3Seconds;
    }

    public StatsFormat setVideoPlaysUnique3Seconds(Integer videoPlaysUnique3Seconds) {
        this.videoPlaysUnique3Seconds = videoPlaysUnique3Seconds;
        return this;
    }

    public Integer getVideoPlaysUnique50Percents() {
        return videoPlaysUnique50Percents;
    }

    public StatsFormat setVideoPlaysUnique50Percents(Integer videoPlaysUnique50Percents) {
        this.videoPlaysUnique50Percents = videoPlaysUnique50Percents;
        return this;
    }

    public Integer getVideoPlaysUnique75Percents() {
        return videoPlaysUnique75Percents;
    }

    public StatsFormat setVideoPlaysUnique75Percents(Integer videoPlaysUnique75Percents) {
        this.videoPlaysUnique75Percents = videoPlaysUnique75Percents;
        return this;
    }

    public Integer getVideoPlaysUniqueStarted() {
        return videoPlaysUniqueStarted;
    }

    public StatsFormat setVideoPlaysUniqueStarted(Integer videoPlaysUniqueStarted) {
        this.videoPlaysUniqueStarted = videoPlaysUniqueStarted;
        return this;
    }

    public Integer getYear() {
        return year;
    }

    public StatsFormat setYear(Integer year) {
        this.year = year;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mobileAppStat, year, reach, messageSendsByAnyUser, effectiveCpf, videoPlaysUnique75Percents, messageSends, videoPlaysUnique3Seconds, videoPlaysUniqueStarted, uniqViewsCount, dayTo, dayFrom, joinRate, day, effectiveCostPerMessage, videoPlaysUnique50Percents, effectiveCostPerClick, ctr, spent, videoPlaysUnique10Seconds, videoPlaysUnique100Percents, conversionCr, impressions, effectiveCostPerMille, conversionCount, month, clicks, overall, linkExternalClicks, videoPlaysUnique25Percents, conversionsExternal);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatsFormat statsFormat = (StatsFormat) o;
        return Objects.equals(messageSendsByAnyUser, statsFormat.messageSendsByAnyUser) &&
                Objects.equals(year, statsFormat.year) &&
                Objects.equals(reach, statsFormat.reach) &&
                Objects.equals(videoPlaysUnique50Percents, statsFormat.videoPlaysUnique50Percents) &&
                Objects.equals(videoPlaysUniqueStarted, statsFormat.videoPlaysUniqueStarted) &&
                Objects.equals(effectiveCostPerMille, statsFormat.effectiveCostPerMille) &&
                Objects.equals(dayTo, statsFormat.dayTo) &&
                Objects.equals(linkExternalClicks, statsFormat.linkExternalClicks) &&
                Objects.equals(uniqViewsCount, statsFormat.uniqViewsCount) &&
                Objects.equals(effectiveCpf, statsFormat.effectiveCpf) &&
                Objects.equals(conversionsExternal, statsFormat.conversionsExternal) &&
                Objects.equals(videoPlaysUnique75Percents, statsFormat.videoPlaysUnique75Percents) &&
                Objects.equals(day, statsFormat.day) &&
                Objects.equals(joinRate, statsFormat.joinRate) &&
                Objects.equals(ctr, statsFormat.ctr) &&
                Objects.equals(videoPlaysUnique25Percents, statsFormat.videoPlaysUnique25Percents) &&
                Objects.equals(effectiveCostPerMessage, statsFormat.effectiveCostPerMessage) &&
                Objects.equals(messageSends, statsFormat.messageSends) &&
                Objects.equals(spent, statsFormat.spent) &&
                Objects.equals(conversionCount, statsFormat.conversionCount) &&
                Objects.equals(videoPlaysUnique3Seconds, statsFormat.videoPlaysUnique3Seconds) &&
                Objects.equals(impressions, statsFormat.impressions) &&
                Objects.equals(videoPlaysUnique10Seconds, statsFormat.videoPlaysUnique10Seconds) &&
                Objects.equals(month, statsFormat.month) &&
                Objects.equals(effectiveCostPerClick, statsFormat.effectiveCostPerClick) &&
                Objects.equals(conversionCr, statsFormat.conversionCr) &&
                Objects.equals(clicks, statsFormat.clicks) &&
                Objects.equals(overall, statsFormat.overall) &&
                Objects.equals(dayFrom, statsFormat.dayFrom) &&
                Objects.equals(videoPlaysUnique100Percents, statsFormat.videoPlaysUnique100Percents) &&
                Objects.equals(mobileAppStat, statsFormat.mobileAppStat);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("StatsFormat{");
        sb.append("messageSendsByAnyUser=").append(messageSendsByAnyUser);
        sb.append(", year=").append(year);
        sb.append(", reach=").append(reach);
        sb.append(", videoPlaysUnique50Percents=").append(videoPlaysUnique50Percents);
        sb.append(", videoPlaysUniqueStarted=").append(videoPlaysUniqueStarted);
        sb.append(", effectiveCostPerMille='").append(effectiveCostPerMille).append("'");
        sb.append(", dayTo='").append(dayTo).append("'");
        sb.append(", linkExternalClicks=").append(linkExternalClicks);
        sb.append(", uniqViewsCount=").append(uniqViewsCount);
        sb.append(", effectiveCpf='").append(effectiveCpf).append("'");
        sb.append(", conversionsExternal=").append(conversionsExternal);
        sb.append(", videoPlaysUnique75Percents=").append(videoPlaysUnique75Percents);
        sb.append(", day='").append(day).append("'");
        sb.append(", joinRate=").append(joinRate);
        sb.append(", ctr='").append(ctr).append("'");
        sb.append(", videoPlaysUnique25Percents=").append(videoPlaysUnique25Percents);
        sb.append(", effectiveCostPerMessage='").append(effectiveCostPerMessage).append("'");
        sb.append(", messageSends=").append(messageSends);
        sb.append(", spent='").append(spent).append("'");
        sb.append(", conversionCount=").append(conversionCount);
        sb.append(", videoPlaysUnique3Seconds=").append(videoPlaysUnique3Seconds);
        sb.append(", impressions=").append(impressions);
        sb.append(", videoPlaysUnique10Seconds=").append(videoPlaysUnique10Seconds);
        sb.append(", month='").append(month).append("'");
        sb.append(", effectiveCostPerClick='").append(effectiveCostPerClick).append("'");
        sb.append(", conversionCr='").append(conversionCr).append("'");
        sb.append(", clicks=").append(clicks);
        sb.append(", overall=").append(overall);
        sb.append(", dayFrom='").append(dayFrom).append("'");
        sb.append(", videoPlaysUnique100Percents=").append(videoPlaysUnique100Percents);
        sb.append(", mobileAppStat=").append(mobileAppStat);
        sb.append('}');
        return sb.toString();
    }
}
