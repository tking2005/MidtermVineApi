package nyc.c4q.tarynking.grocerystoreemployee;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TarynFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TarynFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TarynFragment extends Fragment {

    public TarynFragment() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View tarynView = inflater.inflate(R.layout.taryn_fragment_display, container, false);
        return tarynView;

    }




}
