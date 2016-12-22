package nyc.C4Q.tarynking;

/**
 * Created by tarynking on 10/5/16.
 */

        import java.awt.Color;
        import java.awt.Event;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;


public class CalBasicOpAct implements ActionListener{

    static boolean opNotClickedFlag = true;
    static boolean memoryRecalledFlag = false;


    public CalBasicOpAct() {
        for(int i=0; i      CalGUI.jbStanCalcOps[i].addActionListener(this);
    }
}

    public void actionPerformed(ActionEvent e) throws NumberFormatException{
        try {
            for(int i=0; i      if(e.getSource() == CalGUI.jbStanCalcOps[i]) {
                switch(i) {
                    case 19:   //Addition
                        addToArrayList();
                        CalBasicOps.alistOperations.add("+");
                        CalBasicOps.performAddition();
                        displayCalculatedVal();
                        opNotClickedFlag = false;
                        break;
                    case 15:   //Subtraction
                        addToArrayList();
                        CalBasicOps.alistOperations.add("-");
                        CalBasicOps.performSubtraction();
                        displayCalculatedVal();
                        opNotClickedFlag = false;
                        break;
                    case 7:   //Division
                        addToArrayList();
                        CalBasicOps.alistOperations.add("\u00F7");
                        CalBasicOps.performDivision();
                        displayCalculatedVal();
                        CalBasicOps.clearDisplayLabel();
                        opNotClickedFlag = false;
                        break;
                    case 11:   //Multiplication
                        addToArrayList();
                        CalBasicOps.alistOperations.add("X");
                        CalBasicOps.performMultiplication();
                        displayCalculatedVal();
                        opNotClickedFlag = false;
                        break;
                    case 22:   //Equals
                        addToArrayList();
                        CalBasicOps.alistOperations.add("=");
                        CalBasicOps.performEquals();
                        displayCalculatedVal();
                        opNotClickedFlag = false;
                        break;
                    case 4:   //Clear All
                        CalBasicOps.clearDisplay();
                        CalGUI.jtDisplay.setText("0");
                        break;
                    case 5:   //Clear Entry
                        CalBasicOps.clearLastEntry();
                        break;
                    case 6:    //Sign (Positive or Negative)
                        changeNumberSign();
                        break;
                    case 1:    //Memory Add
                        CalNumKeys.sNumberTemp = "";
                        CalBasicOps.addToMemory(CalGUI.jtDisplay.getText());
                        break;
                    case 3:    //Memory Recall
                        if(CalBasicOps.alistMemory.isEmpty()) {
                            CalGUI.jlMessage.setText("The Calculator's Memory is Empty!");
                            break;
                        }
                        memoryRecalledFlag = true;
                        CalGUI.jtDisplay.setText(CalBasicOps.getFromMemory());
                        break;
                    case 0:    //Clear Memory contents
                        CalBasicOps.clearMemory();
                        break;
                    case 2:    //Delete from Memory
                        CalBasicOps.deleteFromMemory();
                        break;
                    case 23:    //Factorial
                        CalGUI.jtDisplay.setText(""+CalBasicOps.numFormat.format(CalBasicOps.computeFactorial(Double.parseDouble(
                                CalGUI.jtDisplay.getText().replace(",", "")))));
                        break;
                    case 24:    //Square Root
                        CalGUI.jtDisplay.setText(""+CalBasicOps.numFormat.format(CalBasicOps.computeSquareRoot(Double.parseDouble(
                                CalGUI.jtDisplay.getText().replace(",", "")))));
                        break;
                    case 25:    //X squared
                        CalGUI.jtDisplay.setText(""+CalBasicOps.numFormat.format(CalBasicOps.computeSquare(Double.parseDouble(
                                CalGUI.jtDisplay.getText().replace(",", "")))));
                        break;
                    case 26:    //X cubed
                        CalGUI.jtDisplay.setText(""+CalBasicOps.numFormat.format(CalBasicOps.computeCube(Double.parseDouble(
                                CalGUI.jtDisplay.getText().replace(",", "")))));
                        break;
                    case 27:    //Log
                        CalGUI.jtDisplay.setText(""+CalBasicOps.numFormat.format(CalBasicOps.computeLog(Double.parseDouble(
                                CalGUI.jtDisplay.getText().replace(",", "")))));
                        break;
                    case 28:    //Sin
                        CalGUI.jtDisplay.setText(""+CalBasicOps.numFormat.format(CalBasicOps.computeSin(Double.parseDouble(
                                CalGUI.jtDisplay.getText().replace(",", "")))));
                        break;
                    case 29:    //Cos
                        CalGUI.jtDisplay.setText(""+CalBasicOps.numFormat.format(CalBasicOps.computeCos(Double.parseDouble(
                                CalGUI.jtDisplay.getText().replace(",", "")))));
                        break;
                    case 30:    //Tan
                        CalGUI.jtDisplay.setText(""+CalBasicOps.numFormat.format(CalBasicOps.computeTan(Double.parseDouble(
                                CalGUI.jtDisplay.getText().replace(",", "")))));
                        break;
                    case 31:    //Pi
                        CalGUI.jtDisplay.setText(""+CalBasicOps.numFormat.format(CalBasicOps.computePi()));
                        break;
                    case 32:    //E
                        CalGUI.jtDisplay.setText(""+CalBasicOps.numFormat.format(CalBasicOps.computeE()));
                        break;
                    case 33:    //Convert from Degrees to Radians
                        CalGUI.jtDisplay.setText(""+CalBasicOps.numFormat.format(CalBasicOps.computeToRadians(Double.parseDouble(
                                CalGUI.jtDisplay.getText().replace(",", "")))));
                        break;
                    case 34:    //Convert from Radians to Degrees
                        CalGUI.jtDisplay.setText(""+CalBasicOps.numFormat.format(CalBasicOps.computeToDegrees(Double.parseDouble(
                                CalGUI.jtDisplay.getText().replace(",", "")))));
                        break;
                }
            }

        }//End for
    } catch (Exception exc) {System.out.println(exc);}
        }


public void addToArrayList() {
        CalBasicOps.alistEntVal.add((Double.parseDouble(CalGUI.jtDisplay.getText().replace(",", ""))));
        }

public Double displayCalculatedVal() {
        if (CalBasicOps.alistCalVal.size() == 0) {
        CalBasicOps.alistCalVal.add(Double.parseDouble(CalGUI.jtDisplay.getText().replace(",", "")));
        return ((CalBasicOps.alistCalVal.get(CalBasicOps.alistEntVal.size()-1)));
        }
        else {
        return ((CalBasicOps.alistCalVal.get(CalBasicOps.alistCalVal.size()-1)));
        }
        }

public void changeNumberSign() {
        if(!(CalGUI.jtDisplay.getText()).contains("-")) {
        if(CalBasicOps.alistCalVal.isEmpty()) {
        CalGUI.jtDisplay.setText("-"+CalGUI.jtDisplay.getText());
        }
        else {
        if((CalGUI.jtDisplay.getText()).equals(""+(CalBasicOps.alistCalVal.get(
        CalBasicOps.alistCalVal.size()-1)))) {
        CalGUI.jlMessage.setText("Cannot change the sign of a computed value!");
        }
        else {
        CalGUI.jtDisplay.setText("-"+CalGUI.jtDisplay.getText());
        }
        }
        }
        else {
        CalGUI.jtDisplay.setText((CalGUI.jtDisplay.getText()).replace("-", ""));
        }
        }

public void checkNumberType(String enteredVal) {
        if(enteredVal.contains(".")){
        CalNumKeys.doubleFlag = true;
        }
        }


        }
