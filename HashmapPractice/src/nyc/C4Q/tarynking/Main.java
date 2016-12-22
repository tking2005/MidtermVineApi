package nyc.C4Q.tarynking;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Object O = new Object();
        Object N = new Object();

        Map<Person, Integer> keyValues = new HashMap<>();

        Person person = new Person("James");
        Person person1 = new Person("Jane");
        Person person2 = new Person("Jack");



        keyValues.put(person, 25);
        keyValues.put(person1, 2);
        keyValues.put(person2, 5);
    }

    static class Person{
        private String name;
        public Person (String name){
            this.name = name;
        }


        public int hashCode(){

            return 1;
        }

    }
}
