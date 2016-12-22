package nyc.C4Q.tarynking;

/**
 * Created by tarynking on 9/11/16.
 */


// Pizza.java
public class Pizza {
    String cheese;
    //int toppingCount;
    String[] toppings;
    boolean fresh;

    //public Pizza(String cheese, String[] toppings, int toppingCount, boolean fresh) {
    public Pizza(String cheese, String[] toppings, boolean fresh) {
        this.cheese = cheese;
        //this.toppingCount = toppingCount;
        this.toppings = toppings;
        this.fresh = fresh;
    }
}
