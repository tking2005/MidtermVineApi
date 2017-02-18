package nyc.C4Q.tarynking;

public class Main {

    public static void main(String[] args) {
	int unSortArray[] =   new int[11];
        int unSortArray2 [] = {3,2,6,9,6,4,60,30,20,10,11};
        int firstHalfArraySize = unSortArray2.length/2;
        int secondhalfArraySize = unSortArray2.length-firstHalfArraySize;
        int intArray1[] = new int[firstHalfArraySize];
        int intArray2[] = new int[secondhalfArraySize];

        for (int i=0;i<firstHalfArraySize-1;i++){
            intArray1[i] = unSortArray2[i];
        }

        for (int i=0;i<secondhalfArraySize;i++){
            intArray2 [i] = unSortArray2[firstHalfArraySize];
        }

    }
}

