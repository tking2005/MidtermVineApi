package nyc.c4q.tarynking.vinemidtermreview.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by tarynking on 12/10/16.
 */
public class AudioTrack {

    @SerializedName("origin")
    @Expose
    private String origin;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("deleted")
    @Expose
    private Object deleted;
    @SerializedName("trackId")
    @Expose
    private Long trackId;
    @SerializedName("modified")
    @Expose
    private Object modified;
    @SerializedName("numberOfMeasures")
    @Expose
    private Long numberOfMeasures;
    @SerializedName("track")
    @Expose
    private Track track;
    @SerializedName("audioOffset")
    @Expose
    private Double audioOffset;
    @SerializedName("snapToBeat")
    @Expose
    private Long snapToBeat;
    @SerializedName("linkId")
    @Expose
    private Long linkId;
    @SerializedName("duration")
    @Expose
    private Double duration;
    @SerializedName("averageBpm")
    @Expose
    private Long averageBpm;
    @SerializedName("videoOffset")
    @Expose
    private Double videoOffset;

    /**
     *
     * @return
     * The origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     *
     * @param origin
     * The origin
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     *
     * @return
     * The created
     */
    public String getCreated() {
        return created;
    }

    /**
     *
     * @param created
     * The created
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     *
     * @return
     * The deleted
     */
    public Object getDeleted() {
        return deleted;
    }

    /**
     *
     * @param deleted
     * The deleted
     */
    public void setDeleted(Object deleted) {
        this.deleted = deleted;
    }

    /**
     *
     * @return
     * The trackId
     */
    public Long getTrackId() {
        return trackId;
    }

    /**
     *
     * @param trackId
     * The trackId
     */
    public void setTrackId(Long trackId) {
        this.trackId = trackId;
    }

    /**
     *
     * @return
     * The modified
     */
    public Object getModified() {
        return modified;
    }

    /**
     *
     * @param modified
     * The modified
     */
    public void setModified(Object modified) {
        this.modified = modified;
    }

    /**
     *
     * @return
     * The numberOfMeasures
     */
    public Long getNumberOfMeasures() {
        return numberOfMeasures;
    }

    /**
     *
     * @param numberOfMeasures
     * The numberOfMeasures
     */
    public void setNumberOfMeasures(Long numberOfMeasures) {
        this.numberOfMeasures = numberOfMeasures;
    }

    /**
     *
     * @return
     * The track
     */
    public Track getTrack() {
        return track;
    }

    /**
     *
     * @param track
     * The track
     */
    public void setTrack(Track track) {
        this.track = track;
    }

    /**
     *
     * @return
     * The audioOffset
     */
    public Double getAudioOffset() {
        return audioOffset;
    }

    /**
     *
     * @param audioOffset
     * The audioOffset
     */
    public void setAudioOffset(Double audioOffset) {
        this.audioOffset = audioOffset;
    }

    /**
     *
     * @return
     * The snapToBeat
     */
    public Long getSnapToBeat() {
        return snapToBeat;
    }

    /**
     *
     * @param snapToBeat
     * The snapToBeat
     */
    public void setSnapToBeat(Long snapToBeat) {
        this.snapToBeat = snapToBeat;
    }

    /**
     *
     * @return
     * The linkId
     */
    public Long getLinkId() {
        return linkId;
    }

    /**
     *
     * @param linkId
     * The linkId
     */
    public void setLinkId(Long linkId) {
        this.linkId = linkId;
    }

    /**
     *
     * @return
     * The duration
     */
    public Double getDuration() {
        return duration;
    }

    /**
     *
     * @param duration
     * The duration
     */
    public void setDuration(Double duration) {
        this.duration = duration;
    }

    /**
     *
     * @return
     * The averageBpm
     */
    public Long getAverageBpm() {
        return averageBpm;
    }

    /**
     *
     * @param averageBpm
     * The averageBpm
     */
    public void setAverageBpm(Long averageBpm) {
        this.averageBpm = averageBpm;
    }

    /**
     *
     * @return
     * The videoOffset
     */
    public Double getVideoOffset() {
        return videoOffset;
    }

    /**
     *
     * @param videoOffset
     * The videoOffset
     */
    public void setVideoOffset(Double videoOffset) {
        this.videoOffset = videoOffset;
    }

}
