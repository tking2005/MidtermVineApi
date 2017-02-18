package nyc.c4q.tarynking.genericlesson.models;

import java.util.List;

/**
 * Created by tarynking on 1/14/17.
 */

public class LockModel {


    private Boolean success;

    private List<KeyCombo> keyCombos = null;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<KeyCombo> getAvailableKeys() {
        return keyCombos;
    }

    public void setAvailableKeys(List<KeyCombo> keyCombos) {
        this.keyCombos = keyCombos;}
}
