package nyc.c4q.tarynking.menussharedpreferences;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private SharedPreferences prefs;//variable to store
    TextView loremTV;

    private final static String TEXT_SIZE_KEY = "pref key";

    //.Edit - writing and saving preferences


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loremTV = (TextView) findViewById(R.id.loren_text);
        prefs = PreferenceManager.getDefaultSharedPreferences(this);

//        float defaultSize = prefs.getFloat(TEXT_SIZE_KEY, 0);
        float defaultSize = prefs.getFloat(TEXT_SIZE_KEY, getResources().getDimension(R.dimen.eight_sp));
        loremTV.setTextSize(defaultSize);


        //prefs = getPreferences((MODE_PRIVATE));
        //ways to access to sharedpreferences library to write pairs to key value strings.
        boolean isLogged = prefs.getBoolean("IS LOGGED IN", false);//by default false in case user didn't have pref

        //inflate example
//        LayoutInflater inflater = LayoutInflater.from(this);
//        View view = new View();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {//infate is specifically for layouts
        //void inflate(int menuRes, Menu menu)
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    //menu to ..(on option menu)..if log out..do soemthing..if log out do something
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item){
//        if (item.getItemId() == R.id.log_in_action){
//            Log.d (TAG, "Requested log in");
//        }
//        else if (item.getItemId()==R.id.log_out_action){
//            Log.d (TAG, "Requested log out");
//
//        }
//        return super.onOptionsItemSelected(item);
//    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.really_small_text:
                Log.d(TAG, "Smallest text selected");
                float size1 = getResources().getDimension(R.dimen.smallest_sp);
                loremTV.setTextSize(size1);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putFloat(TEXT_SIZE_KEY, size1);
                editor.apply();
                break;

            case R.id.largest:
                Log.d(TAG, "Largest text selected");
                float size2 = getResources().getDimension(R.dimen.sixfo);
                loremTV.setTextSize(size2);
                prefs.edit().putFloat(TEXT_SIZE_KEY, size2);
                break;
        }
        return super.onOptionsItemSelected(item);
    }


//        switch (item.getItemId()){
//            case R.id.log_in_action:
//                Log.d(TAG, "Requested log in");
//                break;
//            case R.id.log_out_action:
//                Log.d(TAG, "Requested log out");
//                break;
//        }
//        return super.onOptionsItemSelected(item);
}

