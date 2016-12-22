package nyc.c4q.tarynking.giphyservice.pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

/**
 * Created by tarynking on 11/19/16.
 */

@Generated("org.jsonschema2pojo")
public class Data {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("image_original_url")
    @Expose
    private String imageOriginalUrl;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("image_mp4_url")
    @Expose
    private String imageMp4Url;

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

}
