package nyc.C4Q.tarynking;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by tarynking on 9/3/16.
 */
public class BoroughGuess {

    public enum Borough {
        BROOKLYN, BRONX, QUEENS, MANHATTAN, STATEN_ISLAND;

        @Override
        public String toString () {
            return name().replace('_', ' ');
        }
    }

    final int MAX_TRIES = 3;



    Borough boroughName;

    public String readBoroughGuess(){
        Scanner scanner=new Scanner(System.in);
        String lastGuess=scanner.next();
        return lastGuess;
    }



    public void startBoroughGame()

    {

        System.out.println("WHICH BOROUGH WILL YOU VISIT TODAY?" + "\n" + "In case you didn't know, NYC is composed of five " +
                "boroughs." + "\n" + "They are MANHATTAN, BRONX, QUEENS, BROOKLYN, and STATEN ISLAND." + "\n" + "Every borough has " +
                "something unique to offer." + "\n" + "Guess which borough we advise you to visit during this game. " + "\n" +
                "You will have three chances to guess the right borough." + "\n" + "If you guess the right borough, " +
                "you will have one chance to guess the tourist attraction we want you to visit." + "\n" +
                "If you get it right, you will get a free cab ride for a day! Good Luck!");

        //Draws a triangle representative of NYC buildings
        int i, j, k;
        for (i = 1; i <= 5; i++) {
            for (j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++) {
                System.out.print("H");
            }
            System.out.println("");
        }
        for (int u = 7; u>=1;u--) {
            for (int y = 9; y >= 1; y--) {
                System.out.print("H");
                int t = 1;
                if (t == y)
                    System.out.println();
            }
        }


        System.out.println();


        Random r = new Random();
        int index = r.nextInt(Borough.values().length);
        int tries = 0;
        int exitLoop=0;

        boroughName = Borough.values()[index];
        System.out.println("You just landed in NYC and want to begin your journey." + "\n" +
                "However, you have the chance to win a cab ride for a day with the correct guesses. " + "\n" +
                "Which borough did we advise you to visit today?" + "\n" +
                "MANHATTAN, BRONX, QUEENS, BROOKLYN, or STATEN ISLAND?");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        String boroughGuess = null;
        boroughName = Borough.values()[index];



            while ((tries < MAX_TRIES) && (exitLoop == 0)) {
                boroughGuess = scanner.nextLine();
                if (boroughGuess.toUpperCase().equals(boroughName.toString()))
                    switch (boroughName) {

                        case MANHATTAN:
                            System.out.println("That's correct!  This is the most exciting borough of them all!");
                            System.out.println("Places to visit include the Empire State Building, Times Square or World Trade Center.");
                            manhattan();
                            tries++;
                            exitLoop = 1;
                            break;
                        case BRONX:
                            System.out.println("That's correct!  This is the boogie down Bronx where hip hop began!");
                            System.out.println("Places to visit include the Bronx Zoo, the New York Botanical Garden or Yankee Stadium");
                            bronx();
                            tries++;
                            exitLoop = 1;
                            break;
                        case BROOKLYN:
                            System.out.println("That's correct!  Brooklyn offers a variety of culture!");
                            System.out.println("Places to visit include the Prospect Park, Coney Island or the Brooklyn Heights Promenade");
                            brooklyn();
                            tries++;
                            exitLoop = 1;
                            break;
                        case QUEENS:
                            System.out.println("That's correct! Queens is the largest borough and the most diverse!");
                            System.out.println("Places to visit include C4Q, Citi Field, or Corona Park");
                            queens();
                            tries++;
                            exitLoop = 1;
                            break;
                        case STATEN_ISLAND:
                            System.out.println("That's correct! This is the southern most borough and includes a ferry ride!");
                            System.out.println("Places to visit include the Staten Island Ferry, Snug Harbor or The Children's Museum.");
                            staten_island();
                            tries++;
                            exitLoop = 1;
                            break;

                        default:
                            break;
                    }
                else {
                    if (tries != 2)
                        System.out.println("Try again:");
                }
                tries++;

            }
            if (!boroughGuess.toUpperCase().equals(boroughName.toString())) {
                System.out.println("The borough we advised you to visit today was: " + boroughName);
            }


    }

    public static void manhattan(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Type 1: for Empire State Building or" +"\n"+"Type 2: for Times Square"+"\n"+"Type 3: for World Trade Center");
        int placeToVisit=0;
        if (scanner.hasNextInt()){placeToVisit = scanner.nextInt();}
        if (placeToVisit == 1){
            System.out.println("This is correct!  A cab will be on the way to take you to your destination!");
        }else if (placeToVisit == 2 || placeToVisit ==3){
            System.out.println("This is incorrect. I will not send a cab your way!");
        }else{
            System.out.println("This was not an option. You Lose!");
        }
    }

    public static void bronx(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Type 1: for Bronx Zoo" +"\n"+"Type 2: for NY Botanical Garden"+"\n"+"Type 3: for Yankee Stadium");
        int placeToVisit = scanner.nextInt();
        if (placeToVisit == 1){
            System.out.println("This is correct!  A cab will be on the way to take you to your destination!");
        }else if (placeToVisit == 2 || placeToVisit ==3){
            System.out.println("This is not correct.  I will not send a cab your way!");
        }else{
            System.out.println("This was not an option. You Lose!");
        }
    }

    public static void brooklyn(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Type 1: for Coney Island or" +"\n"+"Type 2: for Brooklyn Botanical Garden"+"\n"+"Type 3: for Brooklyn Heights Promenade");
        int placeToVisit=0;
        if (scanner.hasNextInt()){placeToVisit = scanner.nextInt();}

        if (placeToVisit == 1){
            System.out.println("This is correct!  A cab will be on the way to take you to your destination!");
        }else if (placeToVisit == 2 || placeToVisit ==3){
            System.out.println("This is not correct..  I will not send a cab your way!");
        }else{
            System.out.println("This was not an option. You Lose!");
        }
    }

    public static void queens(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Type 1: for C4Q or" +"\n"+"Type 2: for CitiField Stadium"+"\n"+"Type 3: for Corona Park");
        int placeToVisit=0;
        if (scanner.hasNextInt()){placeToVisit = scanner.nextInt();}

        if (placeToVisit == 1 ){
            System.out.println("This is correct!  A cab will be on the way to take you to your destination!");
        }else if (placeToVisit == 2 || placeToVisit ==3){
            System.out.println("This is not correct..  I will not send a cab your way!");
        }else{
            System.out.println("This was not an option. You Lose!");
        }
    }

    public static void staten_island(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Type 1: for Staten Island Ferry or" +"\n"+"Type 2: for Snug Harbor"+"\n"+"Type 3: for SI Children's Museum");
        int placeToVisit=0;
        if (scanner.hasNextInt()){placeToVisit = scanner.nextInt();}
        if (placeToVisit == 1){
            System.out.println("This is correct!  A cab will be on the way to take you to your destination!");
        }else if (placeToVisit == 2 || placeToVisit ==3){
            System.out.println("This is not correct..  I will not send a cab your way!");
        }else{
            System.out.println("This was not an option. You Lose!");
        }
    }


//    public static void main(String[] args) {
//
//        BoroughGuess game = new BoroughGuess();
//        game.startBoroughGame();
//
//        String userAnswer;       //code needed to get input
//
//
//        do{
//            System.out.println("Do you want to play again?");
//            Scanner scanner = new Scanner(System.in);
//            userAnswer = scanner.next().toLowerCase();
//            //System.out.println(userAnswer);
//            if (userAnswer.equals("yes") || userAnswer.equals("y")){
//                game.startBoroughGame();
//            }
//            else if (userAnswer.equals("no") || userAnswer.equals("n")) {
//                break;
//             }else {
//                 System.out.println("Try again:");
//            }
//        }while(true);
//        /******************************************/
//    }





}


