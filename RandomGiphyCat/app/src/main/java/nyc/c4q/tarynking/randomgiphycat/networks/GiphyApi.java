package nyc.c4q.tarynking.randomgiphycat.networks;

import nyc.c4q.tarynking.randomgiphycat.models.GiphyModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by tarynking on 11/26/16.
 */

public interface GiphyApi {
    @GET ("/wp-srv/simulation/simulation_test.json")
    Call<GiphyModel> getrandomCat(
            @Query("api_key") String apiKey,
            @Query("tag") String tagName
    );



}
