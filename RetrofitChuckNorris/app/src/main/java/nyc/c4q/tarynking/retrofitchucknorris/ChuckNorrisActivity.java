package nyc.c4q.tarynking.retrofitchucknorris;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import java.io.IOException;

import nyc.c4q.tarynking.retrofitchucknorris.model.ChuckNorrisJoke;
import nyc.c4q.tarynking.retrofitchucknorris.network.ChuckNorrisService;
import nyc.c4q.tarynking.retrofitchucknorris.network.SendMessageResponse;
import nyc.c4q.tarynking.retrofitchucknorris.network.SlackService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ChuckNorrisActivity extends AppCompatActivity {
    private static final String API_KEY = BuildConfig.API_KEY;

    public static final String BOTS_CHANNEL_ID = "C2ABKERFT";

    private static final String TAG = ChuckNorrisActivity.class.getName();

    public static String currentJoke = "";

    private TextView chuckTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuck_norris);

        chuckTV = (TextView) findViewById(R.id.tv_chuck);

        //Create an instance of Retrofit. We give it the Base URL for any Service we create
        Retrofit retrofitChuck = new Retrofit.Builder()
                .baseUrl("https://api.chucknorris.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        /*Create an instance of your Service (an interface) Retrofit turns it into a class by implementing it under the hood
        * The service knows the end URL to be used with the baseURL*/
        ChuckNorrisService norrisService = retrofitChuck.create(ChuckNorrisService.class);

        /*3. Creating a call. Preparing the object with everything that needs to happen to make the request.
        * We haven't connected to the internet yet*/
        Call<ChuckNorrisJoke> norrisCall = norrisService.getRandomJoke();

        norrisCall.enqueue(new Callback<ChuckNorrisJoke>() { //executes url
            @Override
            public void onResponse(Call<ChuckNorrisJoke> call, Response<ChuckNorrisJoke> response) {
                try {
                    if(response.isSuccessful()) {
                        ChuckNorrisJoke joke = response.body();
                        sendToSlackBot(joke.getValue());
                    } else {
                        Log.d(TAG, "Error" + response.errorBody().string());
                    }
                } catch(IOException e) {
                    Log.e(TAG, e.getMessage());
                }
            }

            @Override
            public void onFailure(Call<ChuckNorrisJoke> call, Throwable t) {
                // Something went completely wrong (like no internet connection)
                Log.d("Error", t.getMessage());
            }
        });

    }

    //SLACK STUFF
    private void sendToSlackBot(String value) {

        //SLACK BOT
        Retrofit retrofitBot = new Retrofit.Builder()
                .baseUrl("https://slack.com/api/") //https://api.chucknorris.io/
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        //SLACKBOT
        SlackService slackService = retrofitBot.create(SlackService.class);

        //SLACKBOT
        Call<SendMessageResponse> call = slackService.sendMessage(API_KEY, BOTS_CHANNEL_ID, value);

        //4. async ?!?
        call.enqueue(new Callback<SendMessageResponse>() {
            @Override
            public void onResponse(Call<SendMessageResponse> call, Response<SendMessageResponse> response) {
                try {
                    if(response.isSuccessful()) {
                        SendMessageResponse sendMessageResponse = response.body();
                        chuckTV.setText(sendMessageResponse.getMessage().getText());
                    } else {
                        Log.d(TAG, "Error" + response.errorBody().string());
                    }
                } catch(IOException e) {
                    Log.e(TAG, e.getMessage());
                }
            }

            @Override
            public void onFailure(Call<SendMessageResponse> call, Throwable t) {
                // Something went completely wrong (like no internet connection)
                Log.d("Error", t.getMessage());
            }
        });
    }
}

