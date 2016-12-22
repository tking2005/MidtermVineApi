package nyc.c4q.tarynking.grocerystoreemployee;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.taryn_king);
//    }

    private static final String FIRST_FRAGMENT_ID = "fragment_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.taryn_king);

        getFragmentManager()
                .beginTransaction() //to do things with fragments need to begin transaction (stack for transaction)
                .add(R.id.taryn_fragment_container, new TarynFragment(), FIRST_FRAGMENT_ID) //add to the id specified by the linear layout, new DannysFragment() is an instance of your fragment, First_fragment_id is an id given the fragment
                .commit(); //commit to make it happen

        //second fragment
        /*getFragmentManager()
                .beginTransaction()
                .add(R.id.linear_layout, new DannysFragment(), FIRST_FRAGMENT_ID)
                .commit();*/
    }
}

