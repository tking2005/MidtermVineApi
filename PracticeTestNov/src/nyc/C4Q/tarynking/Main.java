package nyc.C4Q.tarynking;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String wordTense;
        Tense tense  = new Tense();
        wordTense = tense.getTense("a");
        System.out.println(wordTense);

    }
}
