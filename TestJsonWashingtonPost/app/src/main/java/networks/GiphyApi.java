package networks;

import models.WashingtonPojo;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by tarynking on 12/6/16.
 */

public interface GiphyApi {
    @GET("wp-srv/simulation/simulation_test.json")
    Call<WashingtonPojo> getWP();

}