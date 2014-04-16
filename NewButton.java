/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author Soroush
 */
public class NewButton extends JButton implements ActionListener {
    
    private String fText;
    private String sText;
    private boolean fMode;
    private ArrayList<ActionListener> fModeAls;
    private ArrayList<ActionListener> sModeAls;

    public NewButton(String fText, String sText) {
        this.fModeAls = new ArrayList<>();
        this.sModeAls = new ArrayList<>();
        this.fText = fText;
        this.sText = sText;
        this.fMode = true;
        this.setText(sText);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        fMode = !fMode;
        
        if (fMode) {
            this.setText(sText);
            for (ActionListener l: sModeAls) {
                l.actionPerformed(e);
            }
        }
        else {
            this.setText(fText);
            for (ActionListener l: fModeAls) {
                l.actionPerformed(e);
            }
        }
    }
    
    public void addActionListenerToFMode(ActionListener al) {
        /*for (ActionListener l: fModeAls) {
            if (l == al) {
                throw ...
            }
        }*/
        this.fModeAls.add(al);
    }
    
    public void addActionListenerToSMode(ActionListener al) {
        this.sModeAls.add(al);
    }
    
    public void removeFromFMode(ActionListener al) {
        this.fModeAls.remove(al);
    }
    
    public void removeFromSMode(ActionListener al) {
        this.sModeAls.remove(al);
    }
}
