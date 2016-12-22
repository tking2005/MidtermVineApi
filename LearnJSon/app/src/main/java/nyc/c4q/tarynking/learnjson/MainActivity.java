package nyc.c4q.tarynking.learnjson;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.RawRes;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private TextView myTextView;
    String chuckNorrisAPI = "http://api.icndb.com/jokes/random";
    String cnEndpoint = chuckNorrisAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myTextView = (TextView) findViewById((R.id.displayJson));
        new AsyncJokeHelper().execute();


//        new AsyncLocal().execute();
//        new AsyncHelperHttp().execute();

//        String jsonText = performLongLocalOperation(R.raw.movies);
//        myTextView.setText(jsonText);
    }

    //one exectuion must be completed before the next
    //this is not recommended because it can block the main thread
    private String doBlockingNetworkCall() {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(chuckNorrisAPI)
                .build();
        try {
            Response response = client.newCall(request).execute();
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String networkRequest() {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(cnEndpoint)
                .build();
        try {
            Response response = client.newCall(request).execute();
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }


    }

    public void doAsyncOKHTTPStuff() {//doesn't block anything
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(cnEndpoint)
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Toast.makeText(MainActivity.this, response.body().string(), Toast.LENGTH_LONG).show();

            }
        });

    }


    public String performNetworkOperation(String urlEndpoint) {
        try {
            URL url = new URL(urlEndpoint);
            InputStream stream = url.openStream();
            String out = new LocalDownLoader().readInputStream(stream);
            return out;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String performLongLocalOperation(@RawRes int filePath) {
        InputStream is = getResources().openRawResource(filePath);
        String jsonText = new LocalDownLoader().readInputStream(is);
        return jsonText;
    }

    public String readFile(@RawRes Integer resFilePath) {
        InputStream inputStream = this.getResources().openRawResource(resFilePath);
        return new LocalDownLoader().readInputStream(null);
    }

    public class AsyncLocal extends AsyncTask<Void, Void, String> {

        @Override
        protected String doInBackground(Void... params) {
            return readFile(R.raw.movies);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            myTextView.setText(s);
        }
    }

    private class AsyncHelper extends AsyncTask<Void, Void, String> {
        @Override
        protected String doInBackground(Void... voids) {
            // runs on a background thread
            return performNetworkOperation(chuckNorrisAPI);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            // runs on main thread
            myTextView.setText(s);
        }
    }

    private class AsyncHelper2 extends AsyncTask<Void, Void, String> {
        @Override
        protected String doInBackground(Void... voids) {
            // runs on a background thread
            return performLongLocalOperation(R.raw.movies);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            // runs on main thread
            myTextView.setText(s);
        }


    }

    private class AsyncHelperHttp extends AsyncTask<Void, Void, String> {
        @Override
        protected String doInBackground(Void... voids) {
            // runs on a background thread
            return doBlockingNetworkCall();
        }

        @Override
        protected void onPostExecute(String whatIgotFromBackgroundThread) {
            super.onPostExecute(whatIgotFromBackgroundThread);
            // runs on main thread
            myTextView.setText(whatIgotFromBackgroundThread);
        }
    }

    public String downloadJoke(String url) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        try {
            Response response = client.newCall(request).execute();
            String body = response.body().string();
            return body;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private class AsyncJokeHelper extends AsyncTask<Void, Void, String> {
        @Override
        protected String doInBackground(Void... voids) {
            // runs on a background thread
            return downloadJoke(chuckNorrisAPI);
        }

        @Override
        protected void onPostExecute(String json) {
            super.onPostExecute(json);
            JSONObject jsonObject = null;
            try {
                jsonObject = new JSONObject(json);
                JSONObject value = jsonObject.getJSONObject("value");
                String joke = value.optString("joke");
                myTextView.setText(joke);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }






}
