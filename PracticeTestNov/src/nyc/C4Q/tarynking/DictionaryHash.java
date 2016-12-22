package nyc.C4Q.tarynking;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by tarynking on 11/23/16.
 */
public class DictionaryHash {

    public ArrayList<String> synonymOf(HashMap<String, String> dictionary, String definition){
        ArrayList<String> synonyms = new ArrayList<>();

        for (String word : dictionary.keySet()){
            String def = dictionary.get(word);
            if (def.equals(definition))
                synonyms.add(def);
        }
        return synonyms;
    }

}
