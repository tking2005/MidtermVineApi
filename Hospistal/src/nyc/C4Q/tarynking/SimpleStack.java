package nyc.C4Q.tarynking;

import java.util.Stack;

/**
 * Created by tarynking on 9/14/16.
 */
public class SimpleStack<T>{

    //LIFO

    private Stack<T> stack = new Stack<T>();
    private boolean peek;


    public void SimpleStack(){

    }

    public void push(T item){
        stack.push(item);

    }

    public T pop(){
        return stack.pop();
    }

    public boolean isEmpty(){
        return stack.empty();

    }


    public Object peek(T item) {
        return item;
    }
}
