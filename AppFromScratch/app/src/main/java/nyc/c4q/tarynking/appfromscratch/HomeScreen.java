package nyc.c4q.tarynking.appfromscratch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import layout.HomeScreenFragment;

public class HomeScreen extends AppCompatActivity {

    private static final String HOME_SCREEN_FRAGMENT_ID = "homescreen_fragment_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        getFragmentManager()
                .beginTransaction()
                .add(R.id.activity_home_screen, new HomeScreenFragment(), HOME_SCREEN_FRAGMENT_ID)
                .commit();
    }


}
