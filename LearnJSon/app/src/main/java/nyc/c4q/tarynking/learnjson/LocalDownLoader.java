package nyc.c4q.tarynking.learnjson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by tarynking on 10/22/16.
 */

public class LocalDownLoader {

    public String readInputStream(InputStream inputStream){
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        StringBuilder stringBuilder = new StringBuilder();

        try {
            while (bufferedReader.readLine() != null) {
                String line = bufferedReader.readLine();
                stringBuilder.append(line + "\n");
            }
            //fixme - close IO Objects
            inputStream.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String jsonText = stringBuilder.toString();
        return jsonText;
    }
}
