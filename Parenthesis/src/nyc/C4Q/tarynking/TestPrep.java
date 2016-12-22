package nyc.C4Q.tarynking;

/**
 * Created by tarynking on 11/22/16.
 */
public class TestPrep {

    public static void main(String[] args) {
        TestPrep t = new TestPrep();
        String s =t.randomString();
        System.out.println(s);
    }
    private Random random = new Random();
    public String randomString(){
        int length = random.nextInt(20);
        String result = " ";
        System.out.println("random num is: " + length);
        System.out.println(" ");
        for (int i = 0; i < length; i++) {
            result += randomLetter();
        }
        return result;
    }
    private String randomLetter() {
        int choice = random.nextInt(5);
        switch(choice) {
            case 0:
                return "i";
            case 1:
                return "a";
            case 2:
                return "b";
            case 3:
                return "c";
            case 4:
                return "d";
            default:
                throw new IllegalArgumentException("invalid state");
        }
    }
    private boolean isVowel(char c) {
        switch (c) {
            case 'a':case 'e':case'i':case'o':case 'u':
                return true;
        }
        return false;
    }
    private int countVowels (String input) {
        if (input.isEmpty()){
            return 0;
        }
        char currentLetter = input.charAt(0);
        String remainingString = input.substring(1);
        if (isVowel(currentLetter)) {
            return 1 + countVowels(remainingString);
        } else {
            return countVowels(remainingString);
        }
    }
}
