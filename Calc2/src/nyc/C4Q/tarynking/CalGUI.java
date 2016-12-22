package nyc.C4Q.tarynking;

/**
 * Created by tarynking on 10/5/16.
 */
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class CalGUI extends JPanel implements ItemListener{
    static int count = 0;
    JPanel jpCalStanMain;
    static JLabel jlMessage;
    static JFormattedTextField jtDisplay;
    static JButton[] jbStanCalcOps;
    static Choice choiceMem;

    public CalGUI() {
        createLayout();
    }// End Constructor

    public void createLayout() {

        Border raisedPanelBorder = new BevelBorder(BevelBorder.RAISED);
        jpCalStanMain = new JPanel();
        jpCalStanMain.setBorder(raisedPanelBorder);
        GridBagConstraints gbc = new GridBagConstraints();
        jpCalStanMain.setLayout(new GridBagLayout());
        add(jpCalStanMain);
        this.setBackground(Color.BLUE);

        String[] buttonNames = {"MC","M+","M-","MR",
                "AC","CE","+/-","\u00F7",
                "7","8","9","X",
                "4","5","6","-",
                "1","2","3","+",
                ".","0","=",
                "x!","\u221A","x\u00B2","x\u00B3",
                "log","sin","cos","tan",
                "\u03C0","E","Rad","Deg"};

        jbStanCalcOps = new JButton[buttonNames.length];

        gbc.insets = new Insets(3,3,3,3);

        for(int j=2; j<11; j++) {
            if(j==7) {
                for(int i=0; i<3; i++) {
                    if(i==2) {
                        jbStanCalcOps[count] = new JButton(buttonNames[count]);
                        gbc.fill = GridBagConstraints.HORIZONTAL;
                        gbc.gridx = i;
                        gbc.gridy = j;
                        gbc.gridwidth = 2;
                        jpCalStanMain.add(jbStanCalcOps[count], gbc);
                        count++;
                    }//End if
                    else {
                        jbStanCalcOps[count] = new JButton(buttonNames[count]);
                        gbc.fill = GridBagConstraints.HORIZONTAL;
                        gbc.gridx = i;
                        gbc.gridy = j;
                        jpCalStanMain.add(jbStanCalcOps[count], gbc);
                        count++;
                    }//End else
                }//End for
            }//End if
            else {
                for(int i=0; i<4; i++) {
                    gbc.gridwidth = 1;
                    jbStanCalcOps[count] = new JButton(buttonNames[count]);
                    gbc.fill = GridBagConstraints.HORIZONTAL;
                    gbc.gridx = i;
                    gbc.gridy = j;
                    jpCalStanMain.add(jbStanCalcOps[count], gbc);
                    count++;
                }//End for
            }//End else
        }//End for

        Border etchedBorder = new LineBorder(Color.GRAY,3);
        Font f2 = new Font("Arial", Font.BOLD, 16);
        jtDisplay = new JFormattedTextField();
        jtDisplay.setHorizontalAlignment(JTextField.RIGHT);
        jtDisplay.setEditable(false);
        jtDisplay.setBackground(Color.YELLOW);
        jtDisplay.setForeground(Color.BLACK);
        jtDisplay.setFont(f2);
        jtDisplay.setBorder(etchedBorder);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 0;
        gbc.ipady = 10;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 4;
        jpCalStanMain.add(jtDisplay, gbc);

        jlMessage = new JLabel(" ");
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 10;
        gbc.ipady = 0;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        jpCalStanMain.add(jlMessage, gbc);

        choiceMem = new Choice();
        choiceMem.addItem("List of Items stored in the memory:");
        choiceMem.addItemListener(this);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 11;
        gbc.gridwidth = 4;
        jpCalStanMain.add(choiceMem, gbc);

        Font f = new Font("Arial", Font.BOLD, 12);
        for(int i=0; i<4; i++) {
            jbStanCalcOps[i].setFont(f);
            jbStanCalcOps[i].setForeground(Color.BLUE);
        }
        for(int i=4; i<6; i++) {
            jbStanCalcOps[i].setFont(f);
            jbStanCalcOps[i].setForeground(Color.RED);
        }
        Font f1 = new Font("Arial", Font.BOLD, 19);
        jbStanCalcOps[22].setFont(f1);
        jbStanCalcOps[22].setForeground(Color.BLACK);
    }

    public void itemStateChanged(ItemEvent e) {
        String selection = CalGUI.choiceMem.getSelectedItem();
        //  CalGUI.jtDisplay.setText(""+CalBasicOps.numFormat.format((Double.parseDouble(
        //     selection.replace(",", "")))));
    }
}
