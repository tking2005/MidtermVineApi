package nyc.c4q.tarynking.vinemidtermreview.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by tarynking on 12/10/16.
 */
public class User_ {

    @SerializedName("private")
    @Expose
    private Long _private;

    /**
     *
     * @return
     * The _private
     */
    public Long getPrivate() {
        return _private;
    }

    /**
     *
     * @param _private
     * The private
     */
    public void setPrivate(Long _private) {
        this._private = _private;
    }

}
