package nyc.C4Q.tarynking;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Main {

    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;


    public static void main(String[] args) {
        countUp(1, 20);
        String printWord = changeXY("codex");
        System.out.println(printWord);

        char[][] grayScale = createGrayScale2DArray(WIDTH, HEIGHT);
        char[][] chessBoard = createChessBoard(WIDTH, HEIGHT);
        printGrayScale(grayScale);
        printChessBoard(chessBoard);
//        String noDupWord = removeDups("cchhhhharraacctterr");
//        System.out.println(noDupWord);
        System.out.println(recursiveZip("cat","doggy"));
        long num = recursionFactorial(5);
        System.out.println(num);

        int [] array = {};
        int [] array1 = {11};
        int [] array2 = {12,13};
        int [] array3 = {112,3,5};
        int [] array4 = {112,3,5,7};

        System.out.println(recursionFindmin(array4, 4));

        System.out.println(sum(5));



        Node list = new Node("Apple");
        list.next = new Node("Orange");
        list.next.next = new Node("Banana");
        list.next.next.next = new Node("Carrot");
        list.next.next.next.next = new Node("Beet");

        LinkedList linkedList = new LinkedList();
        linkedList.add(0, "apple");


        recursionSearchLinkedList(list,"Beet");
    }


    public static void countUp (int start, int max){
        if(start<max+1){
            System.out.println(start);
            start++;
            countUp(start, max);
        }
    }

    public static int sum(int n){
        if (n<1){
            return n;
        }else {
            return n+(sum(n-1));
        }
    }

    public static String changeXY(String word){
        int c=0;
        char word2[]=word.toCharArray();
        String newWord2  = recursiveChangeXY(word2, c);
        return newWord2;
    }

    public static String recursiveChangeXY(char[] word2, int c){
        if(c<word2.length) {
            if (word2[c] == 'x') {
                word2[c] = 'y';
            }
            c++;
            recursiveChangeXY(word2,c);
        }
        return new String(word2);
    }
    /*Write a method that returns a two-dimensional array representing a random grayscale image using the
    ░, ▒, and ▓ characters. Your method should accept an int x and int y as parameters that determine the
    width and height of the image.*/

    public static char getRandomGrayScaleImage() {

        final Random RANDOM = new Random();

        int randNum = RANDOM.nextInt(3);
        char[] GrayScaleImage = {'░', '▒', '▓'};
        return GrayScaleImage[randNum];
    }

    private static void printGrayScale(char[][] grayScale) {

        for (int i = 0; i< grayScale.length;i++){
            for (int j = 0;j<grayScale[0].length;j++){
                System.out.print(grayScale[i][j]);
            }
            System.out.println();
        }
    }

    private static char[][] createGrayScale2DArray(int width, int height) {

        char[][] grayscale = new char[width][height];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                grayscale[i][j] = getRandomGrayScaleImage();
            }
        }
        return grayscale;

    }

    private static char[][] createChessBoard(int row, int column){

        char [][] chessBoard = new char [row][column];
        for (int rowCount = 0; rowCount < column;rowCount++){
            for (int columnCount = 0; columnCount < row; columnCount++){
                if( (rowCount%2==0 && columnCount%2==1) || (rowCount%2==1 && columnCount%2==0)){
                    chessBoard[rowCount][columnCount] = '#';
                }else{
                    chessBoard[rowCount][columnCount]=' ';
                }
            }
        }

        return chessBoard;

    }

    private static void printChessBoard(char[][] chessBoard) {

        for (int i = 0; i< chessBoard.length;i++){
            for (int j = 0;j<chessBoard[0].length;j++){
                System.out.print(chessBoard[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] addPairs(int[] numArray, int sumValue) {
        int[][] pairArray = new int[numArray.length][2];
        for (int rowCount = 0; rowCount < numArray.length; rowCount++) {
            for (int columnCount = 0; columnCount < 2; columnCount++) {
                pairArray[rowCount][columnCount] = 0;
            }
        }
        int rowCounter = 0;
        int col = 0;

        for (int rowCount2 = 0; rowCount2 < numArray.length; rowCount2++) {
            for (int columnCount2 = 0; columnCount2 < numArray.length; columnCount2++) {
                if (numArray[rowCount2] + numArray[columnCount2] == sumValue) {
                    pairArray[rowCounter][0] = numArray[rowCount2];
                    pairArray[rowCounter][1] = numArray[columnCount2];
                    rowCounter++;
                }
            }
        }
        return pairArray;
    }



//    public static String removeDups(String input){
//
//        char [] noDupArray = new char [input.length()];
//        int charCount = 0;
//        for (int i=0; i<input.length();i++){
////            if ((input.charAt(i+1)!=n)&&input.charAt(i) == input.charAt(i+1)){
//
////                removeDups(input.substring(i+1));
//            }else {
//                noDupArray[charCount]=input.charAt(i);
//                if (input!=null){
//
//                }
//                charCount++;
//            }
//
//        }
////        String newWord = Arrays.toString(noDupArray);
//        String newWord = new String(noDupArray);
//        return newWord;
//    }

   public static boolean searchLinkedList(Node head, Object target){
       Node currNode = head;
       while (currNode!=null){
           if (currNode.equals(target)){
               return true;
           }
       }currNode = currNode.next;
       return false;
   }

   public static boolean recursionSearchLinkedList(Node head, Object target){
       Node currNode = head;
       if (currNode ==null){
           return false;
       }else if (target.equals(head.value)){
           return true;
       }else {
           return recursionSearchLinkedList(currNode.next, target);
       }


   }

   public static String removeDups2(String input){

       if (input.length()<=1){
           return input;
       }else if (input.charAt(0)==input.charAt(1)){
           return removeDups2(input.substring(1));

       }
       return (input.charAt(0)+removeDups2(input.substring(1)));

   }

   public static String recursiveZip(String word1, String word2) {
       int length = word1.length();
       if (word1.length() < 1 || word2.length() < 1) {
           return word1 + word2;
       }
       return String.valueOf(word1.charAt(0)) + String.valueOf(word2.charAt(0)) + (recursiveZip(word1.substring(1), word2.substring(1)));

   }

   public static boolean charUnique(){
//       HashMap<>
       return false;
   }

    public static long factorial(long n){
        long ans = 1;
        if(n<=1){
            return ans;
        }
        for (long i=2; i<=n; n++){
            ans*=i;
        }
        return ans;
    }

    public static long recursionFactorial(long n){
        if (n<=1){
            return 1;
        }
        else
            return n*(recursionFactorial(n-1));

    }

    public static int recursionFindmin(int[] array, int size){

        int min = array[size-1];
        int potentialMin = recursionFindmin(array, size-1);

        if(min<potentialMin) {
            return min;
        }
        return potentialMin;


    }
}
