package nyc.C4Q.tarynking;
import java.util.Scanner;

/**
 * Created by tarynking on 9/24/16.
 */
public class Main {

    public static void main(String[] args) {

        BoroughGuess game = new BoroughGuess();
        game.startBoroughGame();

        String userAnswer;       //code needed to get input


        do{
            System.out.println("Do you want to play again?");
            Scanner scanner = new Scanner(System.in);
            userAnswer = scanner.next().toLowerCase();
            //System.out.println(userAnswer);
            if (userAnswer.equals("yes") || userAnswer.equals("y")){
                game.startBoroughGame();
            }
            else if (userAnswer.equals("no") || userAnswer.equals("n")) {
                break;
            }else {
                System.out.println("Try again:");
            }
        }while(true);
        /******************************************/
    }

}
