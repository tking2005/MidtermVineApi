package nyc.c4q.tarynking.appfromscratch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import layout.DetailScreenFragment;

public class DetailScreen extends AppCompatActivity {

    private static final String DETAIL_SCREEN_FRAGMENT_ID = "detail_screen_fragment_id" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_screen);

        getFragmentManager()
                .beginTransaction()
                .add(R.id.activity_detail_screen, new DetailScreenFragment(), DETAIL_SCREEN_FRAGMENT_ID)
                .commit();
    }
}
