package nyc.C4Q.tarynking;

/**
 * Created by tarynking on 11/21/16.
 */
public class Recursions_part2 {

    public static void main(String[] args){

    }

    public void parens(int input){

    }

    private void printComma(){
        System.out.print(",");
    }

    private void printOpenParens(){
        System.out.print("(");
    }

    private void printCloseParens(){
        System.out.print(")");
    }

    public String parens2(int input){
        if (input ==0){
            return"-";
        }
        for (int i = 0;i< input; i++){
            printOpenParens();
            printCloseParens();
        }
        return "-"+parens2((input-1))+ "-";
    }

    public String printParens(int leftParens, int rightParens){
        if (leftParens==0 && rightParens==0){
            //return "";
        }
        String result = "";
        for (int i=0;i<leftParens;i++){
            printOpenParens();
            result +="(";
        }
        for (int i=0;i<rightParens;i++){
            printCloseParens();
        }

    }
}
