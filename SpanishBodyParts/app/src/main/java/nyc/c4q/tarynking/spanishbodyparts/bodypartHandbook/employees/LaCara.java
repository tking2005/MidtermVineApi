package nyc.c4q.tarynking.spanishbodyparts.bodypartHandbook.employees;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nyc.c4q.tarynking.spanishbodyparts.R;

/**
 * Created by tarynking on 10/22/16.
 */

public class LaCara extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.la_cara,container,false);
    }
}
