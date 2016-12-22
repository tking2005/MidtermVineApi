package nyc.C4Q.tarynking;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        SimpleStack<String> pancakeStack = new SimpleStack<String>();

        pancakeStack.push("Blueberry Pancakes");
        pancakeStack.push("Chocolate chip Pancakes");
        pancakeStack.push("Chocolate chip Pancakes");
        pancakeStack.pop();
        pancakeStack.isEmpty();
        System.out.printf("test");
        System.out.println(SimpleStack.class);
        System.out.println(pancakeStack.peek);

        Pair<String, Integer> pair;
        Pair<String, Integer> pair2 = new Pair<>();
        pair2.printPair("hello", 1);

        SimpleQueue<String> fakeQ = new SimpleQueue();

	// write your code here
        //parameterized type lists..can take any type..generic
        SimpleList<String>words;
        SimpleList<Integer>numbers;

        //Anti - Pattern - doesn't specifiy data type
        SimpleList words2 = new SimpleList();
        words2.add(1);

        SimpleList <String> words3 = new SimpleList();
        //words3.add(1); //can't do this when speciy type get error
        words3.add("This is a string");


        //MusicArtist<RockNRoll> musicArtist = new MusicArtist<RockNRoll>();
    }
}
