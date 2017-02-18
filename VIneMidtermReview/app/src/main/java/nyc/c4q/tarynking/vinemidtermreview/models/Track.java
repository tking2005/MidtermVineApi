package nyc.c4q.tarynking.vinemidtermreview.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by tarynking on 12/10/16.
 */
public class Track {

    @SerializedName("albumTrackCount")
    @Expose
    private Long albumTrackCount;
    @SerializedName("hasAudioTrackTimeline")
    @Expose
    private Long hasAudioTrackTimeline;
    @SerializedName("trackName")
    @Expose
    private String trackName;
    @SerializedName("beatsPerMinute")
    @Expose
    private Long beatsPerMinute;
    @SerializedName("albumTrackNumber")
    @Expose
    private Long albumTrackNumber;
    @SerializedName("albumName")
    @Expose
    private String albumName;
    @SerializedName("releaseDate")
    @Expose
    private String releaseDate;
    @SerializedName("artistName")
    @Expose
    private String artistName;
    @SerializedName("albumArtist")
    @Expose
    private String albumArtist;
    @SerializedName("composer")
    @Expose
    private String composer;
    @SerializedName("genre")
    @Expose
    private String genre;
    @SerializedName("discNumber")
    @Expose
    private Long discNumber;
    @SerializedName("discCount")
    @Expose
    private Long discCount;

    /**
     *
     * @return
     * The albumTrackCount
     */
    public Long getAlbumTrackCount() {
        return albumTrackCount;
    }

    /**
     *
     * @param albumTrackCount
     * The albumTrackCount
     */
    public void setAlbumTrackCount(Long albumTrackCount) {
        this.albumTrackCount = albumTrackCount;
    }

    /**
     *
     * @return
     * The hasAudioTrackTimeline
     */
    public Long getHasAudioTrackTimeline() {
        return hasAudioTrackTimeline;
    }

    /**
     *
     * @param hasAudioTrackTimeline
     * The hasAudioTrackTimeline
     */
    public void setHasAudioTrackTimeline(Long hasAudioTrackTimeline) {
        this.hasAudioTrackTimeline = hasAudioTrackTimeline;
    }

    /**
     *
     * @return
     * The trackName
     */
    public String getTrackName() {
        return trackName;
    }

    /**
     *
     * @param trackName
     * The trackName
     */
    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    /**
     *
     * @return
     * The beatsPerMinute
     */
    public Long getBeatsPerMinute() {
        return beatsPerMinute;
    }

    /**
     *
     * @param beatsPerMinute
     * The beatsPerMinute
     */
    public void setBeatsPerMinute(Long beatsPerMinute) {
        this.beatsPerMinute = beatsPerMinute;
    }

    /**
     *
     * @return
     * The albumTrackNumber
     */
    public Long getAlbumTrackNumber() {
        return albumTrackNumber;
    }

    /**
     *
     * @param albumTrackNumber
     * The albumTrackNumber
     */
    public void setAlbumTrackNumber(Long albumTrackNumber) {
        this.albumTrackNumber = albumTrackNumber;
    }

    /**
     *
     * @return
     * The albumName
     */
    public String getAlbumName() {
        return albumName;
    }

    /**
     *
     * @param albumName
     * The albumName
     */
    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    /**
     *
     * @return
     * The releaseDate
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     *
     * @param releaseDate
     * The releaseDate
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     *
     * @return
     * The artistName
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     *
     * @param artistName
     * The artistName
     */
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    /**
     *
     * @return
     * The albumArtist
     */
    public String getAlbumArtist() {
        return albumArtist;
    }

    /**
     *
     * @param albumArtist
     * The albumArtist
     */
    public void setAlbumArtist(String albumArtist) {
        this.albumArtist = albumArtist;
    }

    /**
     *
     * @return
     * The composer
     */
    public String getComposer() {
        return composer;
    }

    /**
     *
     * @param composer
     * The composer
     */
    public void setComposer(String composer) {
        this.composer = composer;
    }

    /**
     *
     * @return
     * The genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     *
     * @param genre
     * The genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     *
     * @return
     * The discNumber
     */
    public Long getDiscNumber() {
        return discNumber;
    }

    /**
     *
     * @param discNumber
     * The discNumber
     */
    public void setDiscNumber(Long discNumber) {
        this.discNumber = discNumber;
    }

    /**
     *
     * @return
     * The discCount
     */
    public Long getDiscCount() {
        return discCount;
    }

    /**
     *
     * @param discCount
     * The discCount
     */
    public void setDiscCount(Long discCount) {
        this.discCount = discCount;
    }

}
