package nyc.C4Q.tarynking;

import java.util.ArrayList;

/**
 * Created by tarynking on 10/9/16.
 */
public class Calculate {


    //take string input and put in an arrayList
    public Integer scientificCalc(String arg) {//i.e. 20+6
        ArrayList<String> calcArray = putArgIntoArrayList(arg);
        String findOperand = evaluateOperands(calcArray);

        return Integer.parseInt(findOperand);

    }//close scientific calc


    public ArrayList<String> putArgIntoArrayList(String arg) {
        ArrayList<String> equation = new ArrayList<String>();
        for (int i = 0; i < arg.length(); i++) {

            char a_char = arg.charAt(i);
            String element = "";
            System.out.println(Character.isDigit(arg.charAt(i)));


            //check if multiple digits is a whole number
            while (i < arg.length() && Character.isDigit(arg.charAt(i))) {

                element += Character.toString(arg.charAt(i));
                i++;
            }

            if(i ==0 && Character.toString(arg.charAt(i)).equals("-")){
                element+=("-"+Character.toString(arg.charAt(i+1)));
                i+=2;
                while (i < arg.length() && Character.isDigit(arg.charAt(i))) {

                    element += Character.toString(arg.charAt(i));
                    i++;
                }
            }

            equation.add(element);
            element = "";

            if (i < arg.length()) {
                element = Character.toString(arg.charAt(i));
            }
            System.out.println(element);

            if (!element.equals("")) {//check if not empty space
                equation.add(element);
            }


            System.out.println("This is the equation: " + equation);
        }
        equation.add(null);
        return equation;

    }

    public String evaluateOperands(ArrayList calcArray) {
        ArrayList<String> calcArray2 = new ArrayList();



        for (int k = 0; k < calcArray.size() - 1; k++) {//(2+3+1)



            if (calcArray.get(k).equals("(")) {
                calcArray.remove(k);



                while (!calcArray.get(k).equals(")")) {
                    calcArray2.add((String) calcArray.get(k));
                    calcArray.remove(k);
                }
                String numofOperand = operandMulDiv(calcArray2);
                calcArray.set(k, numofOperand);

                }//close if

            }//close for


        return "";//temporary return
    }


    public String operandMulDiv(ArrayList<String> calcArray) {


        for (int j = 0; j < calcArray.size() - 1; j++) {
            for (int i = 0; i < calcArray.size() - 1; i++) {


                String operand = (String) calcArray.get(i);


                switch (operand) {

                    case "*":
                        Integer num = Integer.parseInt((String) calcArray.get(i - 1)) * Integer.parseInt((String) calcArray.get(i + 1));
                        calcArray.set(i + 1, Integer.toString(num));
                        calcArray.remove(i);
                        calcArray.remove(i - 1);
                        break;
                    case "/":

                        Integer num2 = Integer.parseInt((String) calcArray.get(i - 1)) / Integer.parseInt((String) calcArray.get(i + 1));
                        calcArray.set(i + 1, Integer.toString(num2));
                        calcArray.remove(i);
                        calcArray.remove(i - 1);
                        break;


                }
                System.out.println("This is new CalcArray: " + calcArray);


            }

        }

        for (int j = 0; j < calcArray.size() - 1; j++) {
            for (int i = 0; i < calcArray.size() - 1; i++) {


                String operand = (String) calcArray.get(i);


                switch (operand) {

                    case "+":
                        Integer num = Integer.parseInt((String) calcArray.get(i - 1)) + Integer.parseInt((String) calcArray.get(i + 1));
                        calcArray.set(i + 1, Integer.toString(num));
                        calcArray.remove(i);
                        calcArray.remove(i - 1);
                        break;
                    case "-":
//                        if(calcArray.get(0).equals("-")){
//                            num = Integer.parseInt((String) calcArray.get(1));
//                            num= num*(-1);
//                            calcArray.set(1, Integer.toString(num));
//                        calcArray.remove(0);
//
//                        }
                        Integer num2 = Integer.parseInt((String) calcArray.get(i - 1)) - Integer.parseInt((String) calcArray.get(i + 1));
                        calcArray.set(i + 1, Integer.toString(num2));
                        calcArray.remove(i);
                        calcArray.remove(i - 1);
                        break;


                }
                System.out.println("This is new CalcArray: " + calcArray);


            }

        }
        return String.valueOf(calcArray);
    }



}//close class

