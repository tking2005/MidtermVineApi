package nyc.C4Q.tarynking;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by tarynking on 8/29/16.
 */
public class Triangle {
    public static void main(String[] args) {
        System.out.println(triangle(8));
       triangle2(5);
    }

    // Q8. triangle
    public static String triangle(int size){
        String line="";
        String triangle="";
        for (int i = 0; i < size; i++){
            line +="#";
        }
        for (int i = 0; i < size; i++){
            //System.out.println(line.substring(0, i+1));
            triangle+=line.substring(0,i+1)+"\n";

        }
        return (triangle);
    }

    public static String triangle2(int size){

        String triangle="";
        for (int i = 0; i < size; i++){
            triangle =triangle+"#";
            System.out.println(triangle);
        }

        return (triangle);
    }
}
