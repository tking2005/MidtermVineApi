package nyc.C4Q.tarynking;

public class Main {

    public static void main(String[] args) {
        int[] array = {2,4,6,8,10};
        int target = 8;
        int guess = binarySearch(array,target);
        // write your code here
    }

    public static int binarySearch(int[] array, int target) {

        int min = 0;
        int max = array.length-1;
        if (max<min){
            return 0;
        }
        int guess = ((max+min)/2);
        if (array[guess]==target) {
            return array[guess];
        }
        else if (array[guess]<target){
            min = guess+1;
            binarySearch(array, target);
        }
        else {
            max = guess-1;
            binarySearch(array, target);
        }

        return -1;
    };
}

/*
Let min = 0 and max = n-1.
If max < min, then stop: target is not present in array. Return -1.
Compute guess as the average of max and min, rounded down (so that it is an integer).
If array[guess] equals target, then stop. You found it! Return guess.
If the guess was too low, that is, array[guess] < target, then set min = guess + 1.
Otherwise, the guess was too high. Set max = guess - 1.
Go back to step 2.
 */