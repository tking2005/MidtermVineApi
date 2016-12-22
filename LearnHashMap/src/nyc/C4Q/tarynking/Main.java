package nyc.C4Q.tarynking;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//store objects and look up values
//first argument always the key and the second always the value
//map is a parent interface


public class Main {

    public static void main(String[] args) {
	    Map<String, String> stringMap = new HashMap<String,String>();
        Map<Integer, MyClass<String>> map = new HashMap<Integer, MyClass<String>>();

        stringMap.put("Today",  "Sept8");
        stringMap.put ("Tomorrow", "Sept9");
        stringMap.put("Yesterday", "Sept7");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input key1: ");

        String key1 = "userKey1";
        String userInput = scanner.next();
        stringMap.put(key1, userInput);

        System.out.println(stringMap.get(key1));

        //System.out.println("Today"));

        //System.out.println(stringMap.get("Today"));  //stringMap size= 3
    }
}
