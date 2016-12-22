package nyc.C4Q.tarynking;

import com.sun.tools.classfile.Annotation;

/**
 * Created by tarynking on 12/5/16.
 */
public class ClassToBeBuilt {
    private String mA;
    private String mB;
    private int mC;
    private int mD;
    private double mE;
    private Class mF;

    public ClassToBeBuilt(String a, String b, int c, int d, double e, Class<?> f){

    }
    public static class Builder{
        String mA = "a";
        String mB = "b";
        int mC = 1;
        int mD;
        double mE = 5.0;
        private Class<?> mF = int.class;


        public ClassToBeBuilt build (){
            return new ClassToBeBuilt(mA, mB, m)
        }
    }

}
