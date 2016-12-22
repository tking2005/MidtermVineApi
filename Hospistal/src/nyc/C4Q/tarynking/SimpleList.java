package nyc.C4Q.tarynking;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by tarynking on 9/14/16.
 */
public class SimpleList<T> { //T represents generic type
    //parameterized type list

    //Composition - build something up of other lists
    private List<T> list = new ArrayList<T>();

    public void add(T t){

        list.add(t);

    }

    public void remove(T t){
        list.remove(t);

    }

    public void remove(int index){
        list.remove(index);
    }


}
