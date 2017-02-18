package nyc.c4q.tarynking.appfromscratchprep;

import java.util.List;

/**
 * Created by tarynking on 12/20/16.
 */

public class HousesModel {

    private Boolean success;

    private List<House> houses = null;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }

}
