package nyc.c4q.tarynking.learnfragments;


import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import static android.R.attr.button;
import static android.support.v4.app.FragmentManagerImpl.FragmentTag.Fragment;

/**
 * Created by tarynking on 10/5/16.
 */

public class ChooserFragment extends Fragment{

    Button meme1, meme2, meme3, meme4;
    public static String TAG = "ChooseMemes";

    public ChooserFragment(){
        //default constructor
    }

    @Nullable
    @Overide
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_display, container, false);
        return view;
    }

    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated (view, savedInstanceState);
        meme1 = (Button) view.findViewById(R.id.meme_1);
        meme2 = (Button) view.findViewById(R.id.meme_2);
        meme3 = (Button) view.findViewById(R.id.meme_3);
        meme4 = (Button) view.findViewById(R.id.meme_4);
        meme1.setOnClickListener(new View.OnClickListener()){
            @Override
            public void onClick(View v) {
                Activity activity = getActivity();
                FragmentManager fragmentManager = activity.getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.main_container, new ArcherFragment()).
            }

        }
    }
}
