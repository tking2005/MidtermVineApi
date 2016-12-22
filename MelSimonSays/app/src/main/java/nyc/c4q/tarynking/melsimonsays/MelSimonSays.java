package nyc.c4q.tarynking.melsimonsays;



        import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MelSimonSays extends AppCompatActivity implements View.OnClickListener {

    private Button button_red;
    private Button blueBtn;
    private Button button_green;
    private Button button_blue;
    private Button button_start;
    private Handler time;
    private int gameRound = 0;
    private List<Integer> startingNumArray = new ArrayList<Integer>();
    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_start = (Button) findViewById(R.id.button_start);
        button_red = (Button) findViewById(R.id.button_red);
        blueBtn = (Button) findViewById(R.id.button_blue);
        button_blue = (Button) findViewById(R.id.button_yellow);
        button_green = (Button) findViewById(R.id.button_green);

        button_red.setOnClickListener(this);

        blueBtn.setOnClickListener(this);
        button_green.setOnClickListener(this);
        button_blue.setOnClickListener(this);

        button_red.setEnabled(false);
        blueBtn.setEnabled(false);
        button_green.setEnabled(false);
        button_blue.setEnabled(false);

        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beginGame(true);
                button_start.setClickable(false);
                button_start.setText(String.valueOf(gameRound));


            }
        });
    }


    /**
     * @param button:      get reference view that is going to be used for changing the background color to a lighter one
     * @param main_color:  original color
     * @param hover_color: a lighter color
     * @param indexTime:   to delay the first button, second... and so on
     */
    public void flashUpButtons(final Button button, final int main_color, final int hover_color, final int indexTime) {
        time = new Handler();
        time.postDelayed(new Runnable() {
            @Override
            public void run() {
                button.setBackgroundColor(getResources().getColor(hover_color));

            }
        }, 900 * indexTime);
        time.postDelayed(new Runnable() {
            public void run() {
                button.setBackgroundColor(getResources().getColor(main_color));
            }
        }, 900 * indexTime + 500); // will go back after a half of a second
    }

    /**
     * Restart everything
     */
    public void beginGame(boolean reset) {

        if (reset) {
            /**
             * Enabling all buttons again
             */
            button_red.setEnabled(true);
            button_green.setEnabled(true);
            blueBtn.setEnabled(true);
            button_blue.setEnabled(true);
            gameRound = 0;
            gameRound++;
        }


        //startingNumArray = new ArrayList<>(); // clicked  Start button and create an empty array
        // Generate random number depending on your level and add them in to starting array


        //Generate random numbers according to the level

        //for (int i = 0; i < gameRound; i++) { // it will make + 1
        Random nums = new Random();
        int colorNum = nums.nextInt(4);
        // add a random number
        startingNumArray.add(colorNum); // run gameRound times and add the numbers into an array
        //}


        //make buttons to blink
        matchingColors(startingNumArray); // match numbers to colors

    }


    public void validateUserInput(int colorNumber) {
        if (startingNumArray.get(index) == colorNumber) {
            index++;

            // if all checks matches the size of the array it means you won
            if (index == startingNumArray.size()) {

                // and you will go to the next level
                gameRound++;
                index = 0;

                //Changes the start button where it shows the round
                button_start.setText(String.valueOf(gameRound));
                beginGame(false);

            }
        } else {
            /**
             * if you lose then we have to reset the game level and disable all buttons until
             * you press start
             * Start button cannot be disabled because you wouldn't be able to restart the game
             */

            Toast.makeText(MelSimonSays.this, "You Lost!", Toast.LENGTH_SHORT)
                    .show();
            startingNumArray.clear();
            button_start.setText("START");
            button_red.setEnabled(false);
            button_green.setEnabled(false);
            blueBtn.setEnabled(false);
            button_blue.setEnabled(false);
            button_start.setClickable(true);

        }

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_red:
                //flashUpButtons(button_red, R.color.red, R.color.hover_red, 1);
                validateUserInput(0);
                break;
            case R.id.button_green:
                validateUserInput(1);
                break;
            case R.id.button_blue:
                validateUserInput(2);
                break;
            case R.id.button_yellow:
                validateUserInput(3);
                break;
        }
    }

    public void matchingColors(List<Integer> givenArray) {
        for (int index = 0; index < givenArray.size(); index++) {

            switch (givenArray.get(index)) {
                case 0:
                    flashUpButtons(button_red, R.color.red, R.color.lightred2, index + 0);
                    break;
                case 1:
                    flashUpButtons(button_green, R.color.green, R.color.lightgreen, index + 1);
                    break;
                case 2:
                    flashUpButtons(blueBtn, R.color.blue, R.color.lightblue, index + 1);
                    break;
                case 3:
                    flashUpButtons(button_blue, R.color.yellow, R.color.darkyellow, index + 1);
                    break;
            }
        }
    }
}




