/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.JCheckBox;

/**
 *
 * @author Soroush
 */
public class CheckboxGroup implements ActionListener {
    
    private ArrayList<JCheckBox> ch;
    private JCheckBox c1;
    private JCheckBox c2;
    
    private static ArrayList<JCheckBox> allch = new ArrayList<>();
    
    public CheckboxGroup() {
        ch = new ArrayList<>();
    }
    
    public void add(JCheckBox checkbox) {
        if (allch.contains(checkbox))
            return;
        ch.add(checkbox);
        checkbox.setSelected(false);
        checkbox.addActionListener(this);
        allch.add(checkbox);
    }
    
    public void remove(JCheckBox checkbox) {
        ch.remove(checkbox);
        allch.remove(checkbox);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        JCheckBox thisCheckbox = (JCheckBox)e.getSource();
        
        if (thisCheckbox == c1) {
            c1 = c2;
            c2 = null;
        }
        else if (thisCheckbox == c2) {
            c2 = null;
        }
        else {
            
            int count = 0;

            for (JCheckBox c: ch) {
                if (c.isSelected())
                    count++;
            }

            if (count > 2) {
                c1.setSelected(false);
                c1 = c2;
                c2 = thisCheckbox;
            }
            else if (count == 1) {
                c1 = thisCheckbox;
            }
            else if (count == 2) {
                c2 = thisCheckbox;
            }
        }
    }
    
    
}
