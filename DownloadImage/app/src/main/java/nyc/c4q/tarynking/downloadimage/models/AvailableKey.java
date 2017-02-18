package nyc.c4q.tarynking.downloadimage.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by tarynking on 1/11/17.
 */
public class AvailableKey {


    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("textColor")
    @Expose
    private String textColor;
    @SerializedName("url")
    @Expose
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


}
