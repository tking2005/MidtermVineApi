package nyc.C4Q.tarynking;

import java.util.ArrayList;

/**
 * Created by tarynking on 11/22/16.
 */
public class MoreLists {

    private final TestPrep testPrep;
    private ArrayList<String> list;

    public static void

    public int loopsAndLoops(int result){
        if (result<=0){
            return 0;
        }
        if (list.size()< result){
            return 1 + loopsAndLoops(result-1);
        }else if (list.size()>result){
            return 2 +loopsAndLoops(result-1);
        }else{
            return 0 + loopsAndLoops(result-1);
        }
    }

    public MoreLists(){
        list = new ArrayList<>();
        testPrep = new TestPrep();
        for (int index=0;index<10;index++){
            list.add(testPrep.randomString());
        }
    }

    public int countListItems(){
        int result = 0;
        for (int i=0;i<list.size();i++){
            result++;
        }
        return result;
    }

    public int countListItems2(){ //iterative
        if (list.size90==0){
            return 0;

        }
        return 1+ countListItems2();
    }
}
