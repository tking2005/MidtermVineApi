package nyc.c4q.tarynking.downloadimage.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by tarynking on 1/11/17.
 */
public class KeyList {


    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("available keys")
    @Expose
    private List<AvailableKey> availableKeys = null;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<AvailableKey> getAvailableKeys() {
        return availableKeys;
    }

    public void setAvailableKeys(List<AvailableKey> availableKeys) {
        this.availableKeys = availableKeys;
    }


}
