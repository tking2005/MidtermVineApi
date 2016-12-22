package nyc.C4Q.tarynking;

/**
 * Created by tarynking on 11/21/16.
 */
public class Factorial {

    private static int input = 0;

    public static void main(String[] args){
        System.out.println(new Factorial().factorial(input));
    }

    //0! = 1
    //1!=1;
    //5!= 5 * 4 * 3 * 2 * 1
    public int factorial(int input){
        if (input ==0 || input ==1){
            return 1;
        }
        return input * factorial(input-1);
    }


}
