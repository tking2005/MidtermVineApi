package nyc.c4q.tarynking.testjsonwashingtonpost;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.List;

import models.Posts;
import models.WashingtonPojo;
import networks.GiphyApi;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static nyc.c4q.tarynking.testjsonwashingtonpost.R.id.news;

public class MainActivity extends AppCompatActivity {

    private static final String API_URL = "http://www.washingtonpost.com/";
    private TextView Wnews ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Wnews = (TextView) findViewById(news);



        //retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GiphyApi api = retrofit.create(GiphyApi.class);

        Call<WashingtonPojo> call = api.getWP();//calling method from interface
        call.enqueue(new Callback<WashingtonPojo>() {
            @Override
            public void onResponse(Call<WashingtonPojo> call, Response<WashingtonPojo> response) {
                WashingtonPojo giphyModel = response.body();
                List<Posts> listofPosts = giphyModel.getPosts();
                Posts pieceofPost = listofPosts.get(0);
                String title = pieceofPost.getTitle();
                Wnews.setText(title);


            }

            @Override
            public void onFailure(Call<WashingtonPojo> call, Throwable t) {

            }
        });



    }
}
