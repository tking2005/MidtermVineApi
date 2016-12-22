package nyc.c4q.tarynking.randomgiphycat.models;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tarynking on 11/26/16.
 */

public class Data {

    private String type;
    private String id;
    private String url;
    @SerializedName("image_original_url")
    private String imageOriginalUrl;
    private String imageUrl;
    private String imageMp4Url;
    private String imageFrames;
    private String imageWidth;
    private String imageHeight;
    private String fixedHeightDownsampledUrl;
    private String fixedHeightDownsampledWidth;
    private String fixedHeightDownsampledHeight;
    private String fixedWidthDownsampledUrl;
    private String fixedWidthDownsampledWidth;
    private String fixedWidthDownsampledHeight;
    private String fixedHeightSmallUrl;
    private String fixedHeightSmallStillUrl;
    private String fixedHeightSmallWidth;
    private String fixedHeightSmallHeight;
    private String fixedWidthSmallUrl;
    private String fixedWidthSmallStillUrl;
    private String fixedWidthSmallWidth;
    private String fixedWidthSmallHeight;
    private String username;
    private String caption;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     * The imageOriginalUrl
     */
    public String getImageOriginalUrl() {
        return imageOriginalUrl;
    }

    /**
     *
     * @param imageOriginalUrl
     * The image_original_url
     */
    public void setImageOriginalUrl(String imageOriginalUrl) {
        this.imageOriginalUrl = imageOriginalUrl;
    }

    /**
     *
     * @return
     * The imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     *
     * @param imageUrl
     * The image_url
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     *
     * @return
     * The imageMp4Url
     */
    public String getImageMp4Url() {
        return imageMp4Url;
    }

    /**
     *
     * @param imageMp4Url
     * The image_mp4_url
     */
    public void setImageMp4Url(String imageMp4Url) {
        this.imageMp4Url = imageMp4Url;
    }

    /**
     *
     * @return
     * The imageFrames
     */
    public String getImageFrames() {
        return imageFrames;
    }

    /**
     *
     * @param imageFrames
     * The image_frames
     */
    public void setImageFrames(String imageFrames) {
        this.imageFrames = imageFrames;
    }

    /**
     *
     * @return
     * The imageWidth
     */
    public String getImageWidth() {
        return imageWidth;
    }

    /**
     *
     * @param imageWidth
     * The image_width
     */
    public void setImageWidth(String imageWidth) {
        this.imageWidth = imageWidth;
    }

    /**
     *
     * @return
     * The imageHeight
     */
    public String getImageHeight() {
        return imageHeight;
    }

    /**
     *
     * @param imageHeight
     * The image_height
     */
    public void setImageHeight(String imageHeight) {
        this.imageHeight = imageHeight;
    }

    /**
     *
     * @return
     * The fixedHeightDownsampledUrl
     */
    public String getFixedHeightDownsampledUrl() {
        return fixedHeightDownsampledUrl;
    }

    /**
     *
     * @param fixedHeightDownsampledUrl
     * The fixed_height_downsampled_url
     */
    public void setFixedHeightDownsampledUrl(String fixedHeightDownsampledUrl) {
        this.fixedHeightDownsampledUrl = fixedHeightDownsampledUrl;
    }

    /**
     *
     * @return
     * The fixedHeightDownsampledWidth
     */
    public String getFixedHeightDownsampledWidth() {
        return fixedHeightDownsampledWidth;
    }

    /**
     *
     * @param fixedHeightDownsampledWidth
     * The fixed_height_downsampled_width
     */
    public void setFixedHeightDownsampledWidth(String fixedHeightDownsampledWidth) {
        this.fixedHeightDownsampledWidth = fixedHeightDownsampledWidth;
    }

    /**
     *
     * @return
     * The fixedHeightDownsampledHeight
     */
    public String getFixedHeightDownsampledHeight() {
        return fixedHeightDownsampledHeight;
    }

    /**
     *
     * @param fixedHeightDownsampledHeight
     * The fixed_height_downsampled_height
     */
    public void setFixedHeightDownsampledHeight(String fixedHeightDownsampledHeight) {
        this.fixedHeightDownsampledHeight = fixedHeightDownsampledHeight;
    }

    /**
     *
     * @return
     * The fixedWidthDownsampledUrl
     */
    public String getFixedWidthDownsampledUrl() {
        return fixedWidthDownsampledUrl;
    }

    /**
     *
     * @param fixedWidthDownsampledUrl
     * The fixed_width_downsampled_url
     */
    public void setFixedWidthDownsampledUrl(String fixedWidthDownsampledUrl) {
        this.fixedWidthDownsampledUrl = fixedWidthDownsampledUrl;
    }

    /**
     *
     * @return
     * The fixedWidthDownsampledWidth
     */
    public String getFixedWidthDownsampledWidth() {
        return fixedWidthDownsampledWidth;
    }

    /**
     *
     * @param fixedWidthDownsampledWidth
     * The fixed_width_downsampled_width
     */
    public void setFixedWidthDownsampledWidth(String fixedWidthDownsampledWidth) {
        this.fixedWidthDownsampledWidth = fixedWidthDownsampledWidth;
    }

    /**
     *
     * @return
     * The fixedWidthDownsampledHeight
     */
    public String getFixedWidthDownsampledHeight() {
        return fixedWidthDownsampledHeight;
    }

    /**
     *
     * @param fixedWidthDownsampledHeight
     * The fixed_width_downsampled_height
     */
    public void setFixedWidthDownsampledHeight(String fixedWidthDownsampledHeight) {
        this.fixedWidthDownsampledHeight = fixedWidthDownsampledHeight;
    }

    /**
     *
     * @return
     * The fixedHeightSmallUrl
     */
    public String getFixedHeightSmallUrl() {
        return fixedHeightSmallUrl;
    }

    /**
     *
     * @param fixedHeightSmallUrl
     * The fixed_height_small_url
     */
    public void setFixedHeightSmallUrl(String fixedHeightSmallUrl) {
        this.fixedHeightSmallUrl = fixedHeightSmallUrl;
    }

    /**
     *
     * @return
     * The fixedHeightSmallStillUrl
     */
    public String getFixedHeightSmallStillUrl() {
        return fixedHeightSmallStillUrl;
    }

    /**
     *
     * @param fixedHeightSmallStillUrl
     * The fixed_height_small_still_url
     */
    public void setFixedHeightSmallStillUrl(String fixedHeightSmallStillUrl) {
        this.fixedHeightSmallStillUrl = fixedHeightSmallStillUrl;
    }

    /**
     *
     * @return
     * The fixedHeightSmallWidth
     */
    public String getFixedHeightSmallWidth() {
        return fixedHeightSmallWidth;
    }

    /**
     *
     * @param fixedHeightSmallWidth
     * The fixed_height_small_width
     */
    public void setFixedHeightSmallWidth(String fixedHeightSmallWidth) {
        this.fixedHeightSmallWidth = fixedHeightSmallWidth;
    }

    /**
     *
     * @return
     * The fixedHeightSmallHeight
     */
    public String getFixedHeightSmallHeight() {
        return fixedHeightSmallHeight;
    }

    /**
     *
     * @param fixedHeightSmallHeight
     * The fixed_height_small_height
     */
    public void setFixedHeightSmallHeight(String fixedHeightSmallHeight) {
        this.fixedHeightSmallHeight = fixedHeightSmallHeight;
    }

    /**
     *
     * @return
     * The fixedWidthSmallUrl
     */
    public String getFixedWidthSmallUrl() {
        return fixedWidthSmallUrl;
    }

    /**
     *
     * @param fixedWidthSmallUrl
     * The fixed_width_small_url
     */
    public void setFixedWidthSmallUrl(String fixedWidthSmallUrl) {
        this.fixedWidthSmallUrl = fixedWidthSmallUrl;
    }

    /**
     *
     * @return
     * The fixedWidthSmallStillUrl
     */
    public String getFixedWidthSmallStillUrl() {
        return fixedWidthSmallStillUrl;
    }

    /**
     *
     * @param fixedWidthSmallStillUrl
     * The fixed_width_small_still_url
     */
    public void setFixedWidthSmallStillUrl(String fixedWidthSmallStillUrl) {
        this.fixedWidthSmallStillUrl = fixedWidthSmallStillUrl;
    }

    /**
     *
     * @return
     * The fixedWidthSmallWidth
     */
    public String getFixedWidthSmallWidth() {
        return fixedWidthSmallWidth;
    }

    /**
     *
     * @param fixedWidthSmallWidth
     * The fixed_width_small_width
     */
    public void setFixedWidthSmallWidth(String fixedWidthSmallWidth) {
        this.fixedWidthSmallWidth = fixedWidthSmallWidth;
    }

    /**
     *
     * @return
     * The fixedWidthSmallHeight
     */
    public String getFixedWidthSmallHeight() {
        return fixedWidthSmallHeight;
    }

    /**
     *
     * @param fixedWidthSmallHeight
     * The fixed_width_small_height
     */
    public void setFixedWidthSmallHeight(String fixedWidthSmallHeight) {
        this.fixedWidthSmallHeight = fixedWidthSmallHeight;
    }

    /**
     *
     * @return
     * The username
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     * The username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return
     * The caption
     */
    public String getCaption() {
        return caption;
    }

    /**
     *
     * @param caption
     * The caption
     */
    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
