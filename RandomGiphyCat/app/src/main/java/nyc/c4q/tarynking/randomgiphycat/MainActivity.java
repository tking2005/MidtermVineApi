package nyc.c4q.tarynking.randomgiphycat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import nyc.c4q.tarynking.randomgiphycat.models.GiphyModel;
import nyc.c4q.tarynking.randomgiphycat.networks.GiphyApi;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private static final String API_URL = "http://api.giphy.com/";
    private static final String API_KEY = "dc6zaTOxFJmzC";
    private ImageView catImage ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catImage = (ImageView) findViewById(R.id.cat_image);



        //retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GiphyApi api = retrofit.create(GiphyApi.class);

        Call<GiphyModel> call = api.getrandomCat(API_KEY, "cat");
        call.enqueue(new Callback<GiphyModel>() {
            @Override
            public void onResponse(Call<GiphyModel> call, Response<GiphyModel> response) {
                GiphyModel giphyModel = response.body();
                String catUrl = giphyModel.getData().getImageOriginalUrl();
                Glide.with(MainActivity.this).load(catUrl).into(catImage);
            }

            @Override
            public void onFailure(Call<GiphyModel> call, Throwable t) {

            }
        });



    }



}
