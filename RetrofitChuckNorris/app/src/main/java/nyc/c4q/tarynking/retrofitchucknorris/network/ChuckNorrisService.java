package nyc.c4q.tarynking.retrofitchucknorris.network;

import nyc.c4q.tarynking.retrofitchucknorris.model.ChuckNorrisJoke;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by tarynking on 10/23/16.
 */

public interface ChuckNorrisService {

    @GET("jokes/random")
    Call<ChuckNorrisJoke> getRandomJoke();
}
