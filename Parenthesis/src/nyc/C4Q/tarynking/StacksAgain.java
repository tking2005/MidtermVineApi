package nyc.C4Q.tarynking;

import java.util.Stack;

/**
 * Created by tarynking on 11/22/16.
 */
public class StacksAgain { //Last in First out


    private Stack<String> stack;
    private TestPrep testPrep;

    public StacksAgain(){
        testPrep = new TestPrep();
        stack = new Stack<>();
        addToStack(5);
        StacksAgain s = new StacksAgain();
        s.printStack();
        s.addCharacter('A');
        s.addCharacterValue('A');

//        for (int index = 0; index<5; index++){
//            stack.push(testPrep.randomString());
//        }
    }

    private void addCharacterValue(char charToAdd) {
        stack.push(String.valueOf((int)charToAdd));
    }

    private void addCharacter(char charToAdd) {
        stack.push(String.valueOf((int)charToAdd));
    }

    public void addToStack(int numberOfItems){
        for (int index = 0; index<numberOfItems;index++){
            stack.push(testPrep.randomString());
        }
    }

    public void printStack(){
        int totalSiz
        for (int index = 0; index<stack.size(); index++){
            System.out.println(stack.pop());
        }
    }
}
