package nyc.c4q.tarynking.learnjson;

import android.renderscript.Sampler;
import android.util.Log;

import org.json.JSONObject;

/**
 * Created by tarynking on 10/22/16.
 */

public class ChuckPOJO {

    private String joke;

    public ChuckPOJO(JSONObject jsonObject){
        this.joke = jsonObject.optString("joke");
        Log.d("Chuck", joke);
    }

        private Sampler.Value value;

        private String type;

        public Sampler.Value getValue ()
        {
            return value;
        }

        public void setValue (Sampler.Value value)
        {
            this.value = value;
        }

        public String getType ()
        {
            return type;
        }

        public void setType (String type)
        {
            this.type = type;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [value = "+value+", type = "+type+"]";
        }



}
