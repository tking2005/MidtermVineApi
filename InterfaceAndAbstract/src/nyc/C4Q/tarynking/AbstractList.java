package nyc.C4Q.tarynking;

/**
 * Created by tarynking on 9/7/16.
 */
public abstract class AbstractList implements ListInterface {

    abstract int getSize();

    public void printAll(){
        for(int i = 0; i < getSize(); i++){
            System.out.println("printing in order");
            System.out.println(i);

        }
    }

    public abstract void printValues();
}
