package nyc.c4q.tarynking.simonsaystarynmax;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final Animation animation = new AlphaAnimation(1, 0); // Change alpha from fully visible to invisible
//        animation.setDuration(500); // duration - half a second
//        animation.setInterpolator(new LinearInterpolator()); // do not alter animation rate
//        animation.setRepeatCount(Animation.INFINITE); // Repeat animation infinitely
//        animation.setRepeatMode(Animation.REVERSE); // Reverse animation at the end so the button will fade back in
//        final Button btn = (Button) findViewById(R.id.button);
//        btn.startAnimation(animation);
//        btn.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(final View view) {
//                view.clearAnimation();
//            }
//        });
    }
}
