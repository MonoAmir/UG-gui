/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import javax.swing.JCheckBox;

/**
 *
 * @author Soroush
 */
public class CheckFrame extends DragFrame2 {
    
    private ArrayList<JCheckBox> ch;
    private CheckboxGroup group1;
    private CheckboxGroup group2;
    
    public CheckFrame() {
        
        ch = new ArrayList<>();
        group1 = new CheckboxGroup();
        group2 = new CheckboxGroup();
        
        for (int i = 0; i < 10; i++) {
            ch.add(new JCheckBox("Ch" + i));
            ch.get(i).setSize(50, 25);
            ch.get(i).setLocation(10, 30 * i + 10);
            //ch.get(i).setSelected(true);
            add(ch.get(i));
            addToDragMode(ch.get(i));
            if (i <= 5)
                group1.add(ch.get(i));
            if (i >= 5)
                group2.add(ch.get(i));
        }
    }
    
    public static void main(String[] argv) {
        CheckFrame f = new CheckFrame();
    }
}
