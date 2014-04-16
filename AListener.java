/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;


/**
 *
 * @author Soroush
 */
public class AListener implements ActionListener {

    private JTextField jtext;

    public AListener(JTextField jtext) {
        this.jtext = jtext;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //JButton b = (JButton)e.getSource();
        jtext.setText("AListener");
    }
    
}
