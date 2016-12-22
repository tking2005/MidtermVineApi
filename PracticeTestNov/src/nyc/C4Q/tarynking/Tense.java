package nyc.C4Q.tarynking;

/**
 * Created by tarynking on 11/23/16.
 */
public class Tense {


    public String getTense (String word){
        String tense = "";

        if ( word.length()>=3 && word.substring(word.length()-3).equals("ing")){
            tense = "Progressive";
        }else if (word.length()>=2 && word.substring(word.length()-2).equals("ed")){
            tense = "Past";
        }else
            tense = "Present";

        return tense;
    }
}
