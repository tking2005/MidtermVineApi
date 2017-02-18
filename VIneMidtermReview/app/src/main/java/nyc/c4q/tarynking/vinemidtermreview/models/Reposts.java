package nyc.c4q.tarynking.vinemidtermreview.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by tarynking on 12/10/16.
 */
public class Reposts {

    @SerializedName("count")
    @Expose
    private Long count;
    @SerializedName("anchorStr")
    @Expose
    private String anchorStr;
    @SerializedName("records")
    @Expose
    private List<Object> records = null;
    @SerializedName("previousPage")
    @Expose
    private Object previousPage;
    @SerializedName("backAnchor")
    @Expose
    private String backAnchor;
    @SerializedName("anchor")
    @Expose
    private Object anchor;
    @SerializedName("nextPage")
    @Expose
    private Object nextPage;
    @SerializedName("size")
    @Expose
    private Long size;

    /**
     *
     * @return
     * The count
     */
    public Long getCount() {
        return count;
    }

    /**
     *
     * @param count
     * The count
     */
    public void setCount(Long count) {
        this.count = count;
    }

    /**
     *
     * @return
     * The anchorStr
     */
    public String getAnchorStr() {
        return anchorStr;
    }

    /**
     *
     * @param anchorStr
     * The anchorStr
     */
    public void setAnchorStr(String anchorStr) {
        this.anchorStr = anchorStr;
    }

    /**
     *
     * @return
     * The records
     */
    public List<Object> getRecords() {
        return records;
    }

    /**
     *
     * @param records
     * The records
     */
    public void setRecords(List<Object> records) {
        this.records = records;
    }

    /**
     *
     * @return
     * The previousPage
     */
    public Object getPreviousPage() {
        return previousPage;
    }

    /**
     *
     * @param previousPage
     * The previousPage
     */
    public void setPreviousPage(Object previousPage) {
        this.previousPage = previousPage;
    }

    /**
     *
     * @return
     * The backAnchor
     */
    public String getBackAnchor() {
        return backAnchor;
    }

    /**
     *
     * @param backAnchor
     * The backAnchor
     */
    public void setBackAnchor(String backAnchor) {
        this.backAnchor = backAnchor;
    }

    /**
     *
     * @return
     * The anchor
     */
    public Object getAnchor() {
        return anchor;
    }

    /**
     *
     * @param anchor
     * The anchor
     */
    public void setAnchor(Object anchor) {
        this.anchor = anchor;
    }

    /**
     *
     * @return
     * The nextPage
     */
    public Object getNextPage() {
        return nextPage;
    }

    /**
     *
     * @param nextPage
     * The nextPage
     */
    public void setNextPage(Object nextPage) {
        this.nextPage = nextPage;
    }

    /**
     *
     * @return
     * The size
     */
    public Long getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(Long size) {
        this.size = size;
    }

}
