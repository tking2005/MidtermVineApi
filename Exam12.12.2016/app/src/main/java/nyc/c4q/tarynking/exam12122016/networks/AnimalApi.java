package nyc.c4q.tarynking.exam12122016.networks;

import nyc.c4q.tarynking.exam12122016.models.AnimalModel;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by tarynking on 12/21/16.
 */

public interface AnimalApi {

    @GET("cgi-bin/12_21_2016_exam.pl")
    Call<AnimalModel> getAnimals();
}
