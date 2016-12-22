package nyc.C4Q.tarynking;

public class Main {

    public static void main(String[] args) {
	    int[] myName = {0x54, 0x61, 0x72, 0x79, 0x6E, };
	    String myString = "";
        for (int character : myName){
            myString += (char) character;
        }
        System.out.println(myString);

        int[] myName2 = {'T', 'a', 'r', 'y', 'n', ' ','K', 'i', 'n', 'g'};
        for (int character : myName2){
            System.out.print(Integer.toHexString(character)+" ");
        }
    }

    public static boolean isUpperCaseLetter (char c){
        int decimal = c;
        if (decimal >= 65 && decimal <= 90){
        }

        //if ((int)c >= 65 && (int) c <= 90)

        return false;
    }

    public static boolean isLowerrCaseLetter (char c){
        int decimal = c;
        if (decimal >= 97 && decimal <= 122){
        }
        return false;
    }

    public static String rotation13Encode(String string){

    }
}
