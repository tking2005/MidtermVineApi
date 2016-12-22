package nyc.C4Q.tarynking;

/**
 * Created by tarynking on 10/5/16.
 */
import java.text.DecimalFormat;
import java.util.*;
import java.math.BigInteger;//This library is imported to use the BigInteger integer type

public class CalBasicOps {
    static ArrayList alistEntVal = new ArrayList();
    static ArrayList alistCalVal = new ArrayList();
    static ArrayList alistOperations = new ArrayList();
    static ArrayList alistMemory = new ArrayList();
    static DecimalFormat numFormat = new DecimalFormat("#,###.##############");

    public static void displayDigit(String number) {
        if(number.equals("."))
            CalGUI.jtDisplay.setText(numFormat.format((Double.parseDouble(CalNumKeys.sNumberTemp+=number)))+".");
        else{
            if(CalNumKeys.sNumberTemp.length()>14)
            { CalGUI.jlMessage.setText("Out of capacity !");
            }
            else
                CalGUI.jtDisplay.setText((CalNumKeys.sNumberTemp+=number));
        }
    }


    public static void performAddition() {
        CalNumKeys.sNumberTemp = "";
        CalGUI.jlMessage.setText(" ");

        if(alistEntVal.size() == 1) {
            CalGUI.jtDisplay.setText(numFormat.format((alistEntVal.get(0))));
        }
        else {
            if(CalBasicOpAct.opNotClickedFlag){
                if(alistOperations.get(alistOperations.size()-2).equals("+")) {
                    alistCalVal.add((alistCalVal.get(alistCalVal.size()-1))+(alistEntVal.get((alistEntVal.size()-1))));
                    CalGUI.jtDisplay.setText(numFormat.format((Double.parseDouble((alistCalVal.get(alistCalVal.size()-1)+"")))));
                }
                else {
                    getOperation(alistOperations.get(alistOperations.size()-2));
                }
            }
        }
    }

    public static void performSubtraction() {
        CalNumKeys.sNumberTemp = "";
        CalGUI.jlMessage.setText(" ");
        if(alistEntVal.size() == 1) {
            CalGUI.jtDisplay.setText(numFormat.format((alistEntVal.get(0))));
        }
        else {
            if(CalBasicOpAct.opNotClickedFlag){
                if(alistOperations.get(alistOperations.size()-2).equals("-")) {
                    alistCalVal.add((alistCalVal.get(alistCalVal.size()-1))-(alistEntVal.get((alistEntVal.size()-1))));
                    CalGUI.jtDisplay.setText(numFormat.format((Double.parseDouble((alistCalVal.get(alistCalVal.size()-1)+"")))));
                }
                else {
                    getOperation(alistOperations.get(alistOperations.size()-2));
                }
            }
        }
    }

    public static void performDivision() {
        CalNumKeys.sNumberTemp = "";
        CalGUI.jlMessage.setText(" ");
        if(alistEntVal.get((alistEntVal.size()-1))==0.0) {
            CalGUI.jtDisplay.setText(0+"");
            CalGUI.jlMessage.setText("You cannot divide by 0!");
        }
        else {
            if(alistEntVal.size() == 1) {
                CalGUI.jtDisplay.setText(numFormat.format((alistEntVal.get(0))));
            }
            else {
                if(CalBasicOpAct.opNotClickedFlag){
                    if(alistOperations.get(alistOperations.size()-2).equals("\u00F7")) {
                        alistCalVal.add((alistCalVal.get(alistCalVal.size()-1))/(alistEntVal.get((alistEntVal.size()-1))));
                        CalGUI.jtDisplay.setText(numFormat.format((Double.parseDouble((alistCalVal.get(alistCalVal.size()-1)+"")))));
                    }
                    else {
                        getOperation(alistOperations.get(alistOperations.size()-2));
                    }
                }
            }
        }
    }

    public static void performMultiplication() {
        CalNumKeys.sNumberTemp = "";
        CalGUI.jlMessage.setText(" ");
        if(alistEntVal.size() == 1) {
            CalGUI.jtDisplay.setText(numFormat.format((alistEntVal.get(0))));
        }
        else {
            if(CalBasicOpAct.opNotClickedFlag){
                if(alistOperations.get(alistOperations.size()-2).equals("X")) {
                    alistCalVal.add((alistCalVal.get(alistCalVal.size()-1))*(alistEntVal.get((alistEntVal.size()-1))));
                    CalGUI.jtDisplay.setText(numFormat.format((Double.parseDouble((alistCalVal.get(alistCalVal.size()-1)+"")))));
                }
                else {
                    getOperation(alistOperations.get(alistOperations.size()-2));
                }
            }
        }
    }

    public static void performEquals() {
        CalNumKeys.sNumberTemp = "";
        CalGUI.jlMessage.setText(" ");
        if(alistEntVal.size() == 1) {
            CalGUI.jtDisplay.setText(numFormat.format((alistEntVal.get(0))));
        }
        //Handle the case for value stored in memory
        else if(CalBasicOpAct.memoryRecalledFlag) {
            getOperation(alistOperations.get(alistOperations.size()-2));
            CalGUI.jtDisplay.setText(numFormat.format((Double.parseDouble((alistCalVal.get(alistCalVal.size()-1)+"")))));
            CalBasicOpAct.memoryRecalledFlag = false;
        }
        else {
            if(CalBasicOpAct.opNotClickedFlag){
                if(alistOperations.get(alistOperations.size()-2).equals("=")) {
                    getOperation(alistOperations.get(alistOperations.size()-2));
                    CalGUI.jtDisplay.setText(numFormat.format((Double.parseDouble((alistCalVal.get(alistCalVal.size()-1)+"")))));
                }
                else {
                    getOperation(alistOperations.get(alistOperations.size()-2));
                }
            }
        }
    }

    public static void clearDisplayLabel() {
        CalGUI.jlMessage.setText(" ");
    }

    public static void clearDisplay() {
        CalGUI.jlMessage.setText("Cleared all calculations EXCEPT Memory");
        alistEntVal.clear();
        alistCalVal.clear();
        alistOperations.clear();
        CalNumKeys.sNumberTemp = "";
    }//End clearDisplay

    public static void clearLastEntry() {
        if(alistEntVal.isEmpty()) {
            CalGUI.jtDisplay.setText(numFormat.format(0.0));
            CalNumKeys.sNumberTemp = "";
        }
        else {
            CalNumKeys.sNumberTemp = "";
            alistCalVal.remove(alistCalVal.size()-1);
            alistEntVal.remove(alistEntVal.size()-1);
            CalGUI.jtDisplay.setText(numFormat.format(0.0));
        }
    }

    public static void getOperation(String op) {
        if(op.equals("+")) {
            alistCalVal.add((alistCalVal.get(alistCalVal.size()-1))+(alistEntVal.get((alistEntVal.size()-1))));
            CalGUI.jtDisplay.setText(numFormat.format((Double.parseDouble((alistCalVal.get(alistCalVal.size()-1)+"")))));
        }
        else if(op.equals("-")) {
            alistCalVal.add((alistCalVal.get(alistCalVal.size()-1))-(alistEntVal.get((alistEntVal.size()-1))));
            CalGUI.jtDisplay.setText(numFormat.format((Double.parseDouble((alistCalVal.get(alistCalVal.size()-1)+"")))));
        }
        else if(op.equals("X")) {
            alistCalVal.add((alistCalVal.get(alistCalVal.size()-1))*(alistEntVal.get((alistEntVal.size()-1))));
            CalGUI.jtDisplay.setText(numFormat.format((Double.parseDouble((alistCalVal.get(alistCalVal.size()-1)+"")))));
        }
        else if(op.equals("\u00F7")) {
            if(alistEntVal.get((alistEntVal.size()-1))==0.0) {
                CalGUI.jtDisplay.setText(0+"");
                CalGUI.jlMessage.setText("You cannot divide by 0!");
            }
            else {
                alistCalVal.add((alistCalVal.get(alistCalVal.size()-1))/(alistEntVal.get((alistEntVal.size()-1))));
                CalGUI.jtDisplay.setText(numFormat.format((Double.parseDouble((alistCalVal.get(alistCalVal.size()-1)+"")))));
            }
        }
    }

    public static void addToMemory(String val) {
        CalGUI.jlMessage.setText(" ");
        alistMemory.add(val);
        CalGUI.choiceMem.addItem(alistMemory.get(alistMemory.size()-1));
        CalGUI.jlMessage.setText(CalGUI.jtDisplay.getText() +" added to Memory.");
        CalGUI.jtDisplay.setText(""+0);
    }

    public static String getFromMemory() {
        return alistMemory.get(alistMemory.size()-1);
    }

    public static void clearMemory() {
        CalGUI.jlMessage.setText(" ");
        if(alistMemory.isEmpty()) {
            CalGUI.jlMessage.setText("The Calculator's Memory is Empty!");
        }
        else {
            CalGUI.choiceMem.removeAll();
            CalGUI.choiceMem.addItem("The Items added in Memory are:");
            alistMemory.clear();
            CalGUI.jlMessage.setText("The Calculator's Memory has been Cleared");
        }
    }

    public static void deleteFromMemory() {
        CalGUI.jlMessage.setText(" ");
        if(alistMemory.size()>0) {
            CalGUI.jlMessage.setText(alistMemory.get(alistMemory.size()-1)+ " Removed from Memory.");
            CalGUI.choiceMem.remove(alistMemory.get(alistMemory.size()-1));
            alistMemory.remove(alistMemory.size()-1);

        }
        else {
            CalGUI.jlMessage.setText("The Calculator's Memory is Empty!");
        }
    }

    public static BigInteger computeFactorial(Double val) {
        CalGUI.jlMessage.setText(" ");
        BigInteger fact = BigInteger.valueOf(1);
        if (val <  0) {
            CalGUI.jlMessage.setText("Enter Positive Integers only");
            fact = fact.multiply(BigInteger.valueOf(0));
            return fact;
        }
        else if (val > 0) {
            for(int i=1; i                 fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
        else if (val == 0) {
        alistCalVal.add(1.0);
        return fact;
    }
    return fact;
}

    public static Double computeSquareRoot(Double val) {
        CalGUI.jlMessage.setText(" ");
        alistCalVal.add(Math.sqrt(val));
        return Math.sqrt(val);
    }

    public static Double computeSquare(Double val) {
        CalGUI.jlMessage.setText(" ");
        alistCalVal.add(Math.pow(val, 2));
        return Math.pow(val, 2);
    }

    public static Double computeCube(Double val) {
        CalGUI.jlMessage.setText(" ");
        alistCalVal.add(Math.pow(val, 3));
        return Math.pow(val, 3);
    }

    public static Double computeLog(Double val) {
        CalGUI.jlMessage.setText(" ");
        alistCalVal.add(Math.log10(val));
        return Math.log10(val);
    }

    public static Double computeSin(Double val) {
        CalGUI.jlMessage.setText(" ");
        alistCalVal.add(Math.sin(val));
        return Math.sin(val);
    }

    public static Double computeCos(Double val) {
        CalGUI.jlMessage.setText(" ");
        alistCalVal.add(Math.cos(val));
        return Math.cos(val);
    }

    public static Double computeTan(Double val) {
        CalGUI.jlMessage.setText(" ");
        alistCalVal.add(Math.tan(val));
        return Math.tan(val);
    }

    public static Double computePi() {
        CalGUI.jlMessage.setText(" ");
        alistCalVal.add(Math.PI);
        return Math.PI;
    }

    public static Double computeE() {
        CalGUI.jlMessage.setText(" ");
        alistCalVal.add(Math.E);
        return Math.E;
    }

    public static Double computeToRadians(Double val) {
        CalGUI.jlMessage.setText(" ");
        alistCalVal.add(Math.toRadians(val));
        return Math.toRadians(val);
    }

    public static Double computeToDegrees(Double val) {
        CalGUI.jlMessage.setText(" ");
        alistCalVal.add(Math.toDegrees(val));
        return Math.toDegrees(val);
    }
}
