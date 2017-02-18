package nyc.c4q.tarynking.appfromscratchprep.services;

import nyc.c4q.tarynking.appfromscratchprep.HousesModel;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by tarynking on 12/20/16.
 */

public interface HouseApi {

        @GET("cgi-bin/class_12_20_2016.pl")
        Call<HousesModel> getHouses();
    }
