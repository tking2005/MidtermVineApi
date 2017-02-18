package nyc.C4Q.tarynking;

public class Main {

    public static void main(String[] args) {

	    fizzbuzz(3,9);

    }

    private static String[] fizzbuzz(int start, int end) {

        int stringlength = end-start;
        String[] fizzBuzz = new String [stringlength];
        for (int i=0; i<stringlength; i++){
            if (start%15==0){
                fizzBuzz[i]= "FizzBuzz";
            }else if(start%5==0){
                fizzBuzz[i]= "Buzz";
            }else if (start%3==0){
                fizzBuzz[i]="Fizz";
            }else {
                fizzBuzz[i]=String.valueOf(start);
            }
            start++;
        }

        return fizzBuzz;

    }


}
