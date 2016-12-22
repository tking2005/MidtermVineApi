package nyc.c4q.tarynking.retrofitchucknorris.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by tarynking on 10/23/16.
 */

public interface SlackService {

    @GET("chat.postMessage")
    Call<SendMessageResponse> sendMessage(
        @Query("token") String token,
        @Query("channel") String channel,
        @Query("text") String text);


}
