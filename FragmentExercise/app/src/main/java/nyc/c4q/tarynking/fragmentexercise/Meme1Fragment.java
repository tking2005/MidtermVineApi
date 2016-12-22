package nyc.c4q.tarynking.fragmentexercise;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by tarynking on 10/5/16.
 */

public class Meme1Fragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.meme_layout, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        ImageView imageView =(ImageView) view.findViewById(R.id.baby_image_view);
        TextView textView = (TextView) view.findViewById(R.id.meme_caption);
        imageView.setImageResource(R.drawable.meme2);
        textView.setText("Meme - 1");
    }


}
