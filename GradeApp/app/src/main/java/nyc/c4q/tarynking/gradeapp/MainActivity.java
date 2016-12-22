package nyc.c4q.tarynking.gradeapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity //Activity is the most recent version of the activity AppCompatActivity give new feature of activity and support on all devices
{

    //private static final long FIVE_SECONDS = 5000;
    private EditText gradeInput;

    private Button submitButton;

    private TextView gradeDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Handler handler = new Handler();
        //handler.postDelayed(launch2ndActivity(), FIVE_SECONDS); //from JJ if create delay before showing 2nd Activity Alt+Enter

        gradeInput = (EditText) findViewById(R.id.et_grade_input);
        submitButton = (Button) findViewById(R.id.button_submit);
        submitButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //String inputGrade = gradeInput.getText().toString();
                String inputGrade = gradeInput.getText().toString();
                //Toast.makeText(getBaseContext(),"You clicked the button!", Toast.LENGTH_SHORT).show();
                //gradeDisplay.setText(inputGrade);
                //String letterGrade = getLetterGrade(Integer.parseInt(inputGrade));

                //gradeDisplay.setText(letterGrade);
                gradeDisplay.setText(getLetterGrade(Integer.parseInt(inputGrade)));

            }
        });
        gradeDisplay = (TextView) findViewById(R.id.tv_letter_grade_textView);
    }

    public String getLetterGrade(int number){
        String grade = "A";

        if (number == 100) {
            grade = "A+";
            gradeDisplay.setTextColor(Color.GREEN);
        } else if (number >= 90 && number <= 99) {
            grade = "A";
            gradeDisplay.setTextColor(Color.BLACK);
        } else if (number >= 80 && number <= 89) {
            grade = "B";
            gradeDisplay.setTextColor(Color.BLUE);
        } else if (number >= 70 && number <= 79) {
            grade = "C";
            gradeDisplay.setTextColor(Color.GRAY);
        } else if (number >= 60 && number <= 69) {
            grade = "D";
            gradeDisplay.setTextColor(Color.MAGENTA);
        } else if (number >= 0 && number <= 59) {
            grade = "F";
            gradeDisplay.setTextColor(Color.RED);
        } else {
            grade = "?";
        }
        return grade;
    }
}

//anonymous class is a class without a name that is not saved...usually instantiated inline of method..preface by new
//MainActivity.this.startActivity(intent); same as startActivity(intent)
//runnable...allow some code to run in the future...use handler and post delay function and runnable
//to destroy activity you have to call finish
