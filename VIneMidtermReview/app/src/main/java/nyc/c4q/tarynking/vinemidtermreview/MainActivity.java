package nyc.c4q.tarynking.vinemidtermreview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.io.IOException;
import java.util.List;

import nyc.c4q.tarynking.vinemidtermreview.models.Record;
import nyc.c4q.tarynking.vinemidtermreview.models.VineModel;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public static final String BASE_URL = "https://vine.co/";
    private static final String TAG = "MainActivity";
    private RecyclerView rv;
    private VineAdapter vineAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = (RecyclerView) findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(vineAdapter);

        //retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        VineApi api = retrofit.create(VineApi.class);

        Call<ResponseBody> call = api.getResponseBody();
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    Log.d(TAG, "onResponse: " + response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });


        Call<VineModel> call2 = api.getVines();
        call2.enqueue(new Callback<VineModel>() {
            @Override
            public void onResponse(Call<VineModel> call, Response<VineModel> response) {
                VineModel model = response.body();
                List<Record> list = model.getData().getRecords();
                Record record = list.get(0);
//                record.getUsername();
//                record.getLiked();
                vineAdapter = new VineAdapter(list);
                rv.setAdapter(vineAdapter);
                vineAdapter.notifyDataSetChanged();



                Log.d(TAG, "onResponse:" + list.size());
                Log.d(TAG, response.body().toString());


            }

            @Override
            public void onFailure(Call<VineModel> call, Throwable t) {
                Log.d(TAG, "onFailure: This failed");
                t.printStackTrace();
            }
        });



    }
}
