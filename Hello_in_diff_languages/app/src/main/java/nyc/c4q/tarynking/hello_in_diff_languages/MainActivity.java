package nyc.c4q.tarynking.hello_in_diff_languages;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1. Create an array
        final String[] langs = {
                "French",
                "English",
                "Spanish"
        };

        //2. Get reference to ListView
        ListView listViewRef = (ListView) findViewById(R.id.list_view);
        textView = (TextView) findViewById(R.id.text_view);

        //3. Create adapter to bind data to the LIst View
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.adapt_list_languages, langs);

        //4. Bind adapter to the ListView
        listViewRef.setAdapter(adapter);

        //Listen to clicks
//        listViewRef.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Toast.makeText(// user clicked somehing)
//            }
//        });
        listViewRef.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "you chose " + langs[position], Toast.LENGTH_SHORT).show();


//                switch(position){
//
//                }

                switch (langs[position]){
                    case "French":
                        textView.setText("bonjour");
                        break;

                    case "English":
                        textView.setText("hello");
                        break;

                    case "Spanish":
                        textView.setText("hola");
                        break;
                }

            }
        });



    }
}
