package nyc.c4q.tarynking.layoutlearning;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button submitButton1, submitButton2, submitButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.exercise_one);


        setContentView(R.layout.exercise_two);

        submitButton1 = (Button) findViewById(R.id.button);
        submitButton1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                // Make a toast that says "Button One"
                Context context = getApplicationContext();
                CharSequence button_one_text = "Button One";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, button_one_text, duration);
                toast.show();

            }
        });

        submitButton2 = (Button) findViewById(R.id.button2);
        submitButton2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                // Make a toast that says "Button One"
                Context context = getApplicationContext();
                CharSequence button_two_text = "Button Two";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, button_two_text, duration);
                toast.show();

            }
        });

        submitButton3 = (Button) findViewById(R.id.button3);
        submitButton3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                // Make a toast that says "Button One"
                Context context = getApplicationContext();
                CharSequence button_three_text = "Button Three";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, button_three_text, duration);
                toast.show();

            }
        });

        setContentView(R.layout.exercise_three);
    }


}
