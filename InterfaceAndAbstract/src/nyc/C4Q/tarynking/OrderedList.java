package nyc.C4Q.tarynking;

/**
 * Created by tarynking on 9/7/16.
 */
//public class OrderedList extends AbstractList {
//    private int size;
//    private Integer[] values;
//
//    public OrderedList(int size){
//        this.size = size;
//        values = new Integer[size];
//    }
//
//
//}

public class OrderedList extends AbstractList{
    private int size;
    private Integer[] values;

    public OrderedList(int size){
        this.size = size;
        values = new Integer[size];
    }

    @Override
    int getSize() {
        return size;
    }

    @Override
    public void add(Integer integer) {
        for (int i = 0; i < size; i++){
            if (values[i]==null){
                set(integer,i);
                break;
            }
        }


    }

    @Override
    public Integer get(int index) {
        return values[index];
    }

    @Override
    public void set(Integer value, int index) {

        values[index] = value;


    }

//    @Override
//    public void set(int index, Integer value) {
//        values[index] = value;
//    }

    @Override
    public void remove(int index) {
       values[index] = null;

    }

    @Override
    public void printValues(){
        for (int i = 0; i < size; i++){
            System.out.println(values[i]);
        }
    }
}
