package nyc.C4Q.tarynking;

/**
 * Created by tarynking on 10/10/16.
 */
public class Calculate2 {
}

//private void parenthesis() {
//        boolean incomplete = true;
//        while (incomplete) {
//        for (int i = 0; i < this.operation.size(); i++) {
//        if (this.operation.get(i) instanceof String &&
//        ((String)this.operation.get(i)).trim() == "(") {
//        int j = i + 1; // i is the open paran, i+1 is the next char after parenthe
//        int pCount = 1; // how many parenthesis is open par (
//
//        ArrayList subOperation = new ArrayList<Object>(); // create another array
//
//        while (true) {
//        if (this.operation.get(j) instanceof String && ((String) this.operation.get(j)).trim() == ")")
//
//        if (pCount == 1) {
//        break;
//
//        } else {
//        pCount--;
//        }
//
//        else if (this.operation.get(j) instanceof String && ((String) this.operation.get(j)).trim() == "("){
//        pCount ++;
//
//        }
//
//        subOperation.add(this.operation.get(j));
//        j++;
//        }
//        Expression subExpression = new Expression(subOperation);
//        double result = subExpression.evaluate();
//        this.operation.set(i, result);
//
//        while (j > i) {
//        this.operation.remove(j);
//        j--;
//        }
//        break;
//        }
//        if (i == this.operation.size() - 1) {
//        incomplete = false;
//        break;
//        }
//        }
//        }
//        }
