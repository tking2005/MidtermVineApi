package nyc.c4q.tarynking.randomgiphycat.models;

/**
 * Created by tarynking on 11/26/16.
 */

import java.util.HashMap;
import java.util.Map;



public class Meta {

    private Integer status;
    private String msg;
    private String responseId;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     *
     * @return
     * The msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     *
     * @param msg
     * The msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     *
     * @return
     * The responseId
     */
    public String getResponseId() {
        return responseId;
    }

    /**
     *
     * @param responseId
     * The response_id
     */
    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}

