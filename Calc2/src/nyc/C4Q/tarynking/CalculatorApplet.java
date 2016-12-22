package nyc.C4Q.tarynking;

/**
 * Created by tarynking on 10/5/16.
 */
import javax.swing.*;

public class CalculatorApplet extends JApplet{
    CalGUI calcGUIStand = new CalGUI();
    CalNumKeys calcNumKeyListener = new CalNumKeys();
    CalBasicOpAct calcStandListener = new CalBasicOpAct();

    public void init() {
        try {
            SwingUtilities.invokeAndWait(new Runnable () {
                public void run() {
                    makeGUI();
                }
            });
        } catch (Exception e) {}
    }

    public void makeGUI() {
        this.setSize(300, 400);
        add(calcGUIStand);
    }
}