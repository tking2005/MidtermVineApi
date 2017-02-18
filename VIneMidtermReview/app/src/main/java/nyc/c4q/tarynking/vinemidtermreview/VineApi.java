package nyc.c4q.tarynking.vinemidtermreview;

import nyc.c4q.tarynking.vinemidtermreview.models.VineModel;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by tarynking on 12/10/16.
 */

public interface VineApi {
    @GET("api/timelines/users/918753190470619136")
    Call<ResponseBody> getResponseBody();


    @GET("api/timelines/users/918753190470619136")
    Call<VineModel> getVines();
}
