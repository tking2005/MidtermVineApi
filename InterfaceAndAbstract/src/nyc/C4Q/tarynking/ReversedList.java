package nyc.C4Q.tarynking;

/**
 * Created by tarynking on 9/7/16.
 */
public abstract class ReversedList extends AbstractList implements ListInterface {
    @Override
    int getSize(){
        return 15;
    }

    @Override
    public void add(Integer integer) {

    }

    @Override
    public Integer get(int index) {
        return null;
    }

    @Override
    public void printAll(){
        System.out.println("printing in reverse");
        for (int i=getSize(); i>0;i--){
            System.out.println(i);
        }
    }

    @Override
    public void set(Integer value, int index) {

    }

    @Override
    public void remove(int index) {

    }
}
