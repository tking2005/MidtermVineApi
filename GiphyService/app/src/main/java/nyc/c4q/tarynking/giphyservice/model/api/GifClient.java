package nyc.c4q.tarynking.giphyservice.model.api;

import nyc.c4q.tarynking.giphyservice.pojos.GifPojo;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by tarynking on 11/19/16.
 */

public class GifClient {

    private static final String API_KEY = "dc6zaTOxFJmzC";
    private static final String giphyUrl = "http://api.giphy.com/";

    private static Retrofit retrofit;
    private static Retrofit.Builder builder; //builder.build() will retrun our retrofit instance.

    private GifService service;
    private static GifClient instance;


    public static GifClient getInstance() {
        if (instance == null) {
            instance = new GifClient();
        }
        return instance;
    }


    private GifClient() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(giphyUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(GifService.class);
    }

    private Call<GifPojo> showRandomGif(String apiKey) {
        return service.showRandomGif(apiKey);
    }

    private Call<GifPojo> showRandomGif() {
        return showRandomGif(API_KEY);
    }
}
