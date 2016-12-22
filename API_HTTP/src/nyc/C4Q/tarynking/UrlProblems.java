package nyc.C4Q.tarynking;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;
 /* Created by tarynking on 9/10/16.
 */

public class UrlProblems extends HTTP {
    public static void main(String[] input){
    //public static void main(String[] input)throws MalformedURLException{
        //throw new IllegalFormatCodePointException("This error just got thrown");
        //throw new MalformedURLException("This error just got thrown");
        URL url = null;
        String userInput = null; //like  string "google.com"
        //URL url = makeHttpUrl("google.com", 80,"/gosomewhere");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a valid url with http:");
        userInput = scanner.next();

        //url = makeHttpUrl(userInput, 80,"");
        HTTP.stringToURL(userInput);
        HTTP checkUrl = new HTTP();
        checkUrl.toString();
        System.out.println("Scheme:"+ url.getProtocol());
        System.out.println("Host:"+ url.getHost());
        System.out.println("Port:"+ url.getPort());
        System.out.println("Path:"+ url.getPath());
        System.out.println(url);

    }

    //google.com/gosomewhere
    public static URL makeHttpUrl(String host, int port, String path) throws MalformedURLException{
        if (port ==80) {
            //URL webAddress = new URL("http", host, path);
            return new URL("http",host,path);
        }else{
            return new URL("http",host,port,path);
        }

        //return webAddress;
    }
}


//public class HttpTest {
//
//    public static final String
//            URL = "http://alexsamuel.net/AliceInWonderland.txt";
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a url: ");
//        String input = scanner.nextLine();
//        URL url = HTTP.stringToURL(input);
//        String document = HTTP.get(url);
//
//        System.out.println(document);
//    }
//
//}
