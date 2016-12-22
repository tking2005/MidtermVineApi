package nyc.C4Q.tarynking;

/**
 * Created by tarynking on 8/29/16.
 */
public class twitterMentions {
    public static void main(String[] args) {
        twitterMentions("@c4q #rocks #tweet let try this");
    }

    public static void twitterMentions(String tweet){
        String mentions="";
        String hashtags ="";

        for (int i = 0; i < tweet.length(); i++) {
            char c =tweet.charAt(i);
            switch (c){
                case '@':
                    System.out.println("we found an @");
                    //int j=i;
                    while(c != ' ' && i < tweet.length()){
                        mentions += tweet.charAt(i);
                    }
                default://fixme
            }

        }
        System.out.println(mentions);
    }


}
