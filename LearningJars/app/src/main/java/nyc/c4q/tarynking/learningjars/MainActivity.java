package nyc.c4q.tarynking.learningjars;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import java.io.IOException;

import nyc.c4q.tarynking.learningjars.models.PojoChuckJoke;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text_view);

        //Done in onCreate to allow program to connect to a server...retrofit builder
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://10.3.3.60:8080/")
                .addConverterFactory(GsonConverterFactory.create()) //parses json
                .build();

        HelloService service = retrofit.create(HelloService.class);

//        Call<ResponseBody> call = service.getHelloWorld();
        Call<PojoChuckJoke> call = service.getHelloWorld();

        call.enqueue(new Callback<PojoChuckJoke>() {
            @Override
            public void onResponse(Call<PojoChuckJoke> call, Response<PojoChuckJoke> response) {

                try { if(response.isSuccessful()) {

                    PojoChuckJoke chuckJoke = response.body();
                    String textToDisplay = chuckJoke.getValue();
                    textView.setText(textToDisplay);
                    Log.d(TAG, "Success: " + response.body());
                } else {
                    Log.d(TAG, "Error" + response.errorBody().string());
                }
//


                } catch(IOException e) {
                    e.printStackTrace();
                }



            }
            @Override
            public void onFailure(Call<PojoChuckJoke> call, Throwable t) {
                // Something went completely wrong (like no internet connection)
                Log.d("Error", t.getMessage());
            }
        });
    }


}
