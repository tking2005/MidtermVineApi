package nyc.C4Q.tarynking;

/**
 * Created by tarynking on 10/5/16.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalNumKeys implements ActionListener{
    static String sNumberTemp = "";
    static boolean doubleFlag = false;

    protected static ActionListener alDouble;

    public CalNumKeys() {
        for(int i=0; i      CalGUI.jbStanCalcOps[i].addActionListener(this);
    }
}

    public void actionPerformed(ActionEvent e) {
        for(int i=0; i      if(e.getSource() == CalGUI.jbStanCalcOps[i]) {
            switch(i) {
                case 16:
                    CalBasicOpAct.opNotClickedFlag = true;
                    CalBasicOps.displayDigit("1");
                    break;
                case 17:
                    CalBasicOpAct.opNotClickedFlag = true;
                    CalBasicOps.displayDigit("2");
                    break;
                case 18:
                    CalBasicOpAct.opNotClickedFlag = true;
                    CalBasicOps.displayDigit("3");
                    break;
                case 12:
                    CalBasicOpAct.opNotClickedFlag = true;
                    CalBasicOps.displayDigit("4");
                    break;
                case 13:
                    CalBasicOpAct.opNotClickedFlag = true;
                    CalBasicOps.displayDigit("5");
                    break;
                case 14:
                    CalBasicOpAct.opNotClickedFlag = true;
                    CalBasicOps.displayDigit("6");
                    break;
                case 8:
                    CalBasicOpAct.opNotClickedFlag = true;
                    CalBasicOps.displayDigit("7");
                    break;
                case 9:
                    CalBasicOpAct.opNotClickedFlag = true;
                    CalBasicOps.displayDigit("8");
                    break;
                case 10:
                    CalBasicOpAct.opNotClickedFlag = true;
                    CalBasicOps.displayDigit("9");
                    break;
                case 21:
                    CalBasicOpAct.opNotClickedFlag = true;
                    CalBasicOps.displayDigit("0");
                    break;
                case 20:
                    CalBasicOpAct.opNotClickedFlag = true;
                    CalBasicOps.displayDigit(".");
                    break;
            }
        }
    }
}


}