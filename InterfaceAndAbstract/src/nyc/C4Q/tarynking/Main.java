package nyc.C4Q.tarynking;


import java.util.ArrayList;
import java.util.List;

public class Main {

//    public static void main(String[] args) {
//        AbstractList list = new OrderedList(50);
//        list.add(300);
//        System.out.println(list.get(2));
//    }


    public static void main(String[] args) {
        AbstractList list = new OrderedList(50);
       // ArrayList<String> testStringArray = new ArrayList<>();
        //testStringArray.add("uwfjef");
        list.add(300);
        System.out.println(list.get(2));
        list.printValues();
    }
}