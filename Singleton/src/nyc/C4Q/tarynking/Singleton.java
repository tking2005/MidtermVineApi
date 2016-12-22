package nyc.C4Q.tarynking;

/**
 * Created by tarynking on 12/5/16.
 */
public class Singleton {
    private static Singleton sInstance;

    public static Singleton getsInstance(){
        if (sInstance==null){
            sInstance = new Singleton();
        }
     return sInstance;
    }

}
