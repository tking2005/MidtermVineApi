package nyc.C4Q.tarynking;

import java.util.Scanner;

/**
 * Created by tarynking on 8/29/16.
 */
public class TweetPrints {
    public static void main(String[] args) {
        System.out.println("Enter a tweet:");
        Scanner scanner = new Scanner(System.in);
        String tweeted = scanner.next();
        System.out.println(tweetPrints(tweeted));
    }

    public static String tweetPrints(String input){
        int stringLength=0;

        //while (stringLength<=input.length()) {
            String tweeted_Ats_Hash = "";
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '@' ||input.charAt(i) == '#' ) {
                    while (input.charAt(i)!= ' ' || i!=input.length()-1) {
                        tweeted_Ats_Hash += input.charAt(i);
                        System.out.println(i);
                        System.out.println(tweeted_Ats_Hash);
                        System.out.println(input.length());
                        break;
                    }






//                    for (int j = i; j < input.length(); j++) {
//                        if (input.charAt(j) == ' ') {
//                            tweeted_Ats_Hash+=(input.substring(i,j))+" ";
//                            break;
//                        }
//                    }
//                    // continue to space
//                    if (input.charAt(i)==' ')
//                        continue;
                    //tweeted_Ats_Hash+=input.charAt(i)

                }
            }
            return (tweeted_Ats_Hash);
        //};


    }

}

//for (int i= 0; i< input.length();i++){
//        if (input.charAt(i) == letter){
//        return (input.substring(i+1));
//        }
//        }

