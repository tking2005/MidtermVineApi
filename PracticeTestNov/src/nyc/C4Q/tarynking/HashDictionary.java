package nyc.C4Q.tarynking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by tarynking on 11/23/16.
 */
public class HashDictionary {

    public static void main(String[] args) {
        HashMap<String, String> wordDefs = new HashMap<>();

        wordDefs.put("Dog", "animal");
        wordDefs.put("Cat", "feline");
        wordDefs.put("Tiger", "feline");
        wordDefs.put("Cheetah", "feline");
        wordDefs.put("Snake", "sneaky beast");
        wordDefs.put("Leopard", "feline");


        ArrayList<String> sameDef = synonymOf(wordDefs, "feline");
        System.out.println(sameDef);

    }


    public static ArrayList<String> synonymOf(HashMap<String, String> dictionary, String definition) {
        ArrayList<String> sameWord = new ArrayList<>();
        Iterator<Map.Entry<String, String>> iterator = dictionary.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();
            if(entry.getValue() == definition) {
                sameWord.add(entry.getKey());
            }
        }
        return sameWord;
    }
}
