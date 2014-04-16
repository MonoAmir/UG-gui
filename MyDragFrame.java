/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Soroush
 */
public class MyDragFrame extends DragFrame2 {
    
    private JButton b1;
    private JButton b2;
    private JTextField t1;
    private JCheckBox ch1;
    private ArrayList<JRadioButton> r;
    
    public MyDragFrame() {
        b1 = new JButton("b1");
        b2 = new JButton("b2");
        t1 = new JTextField("t1");
        ch1 = new JCheckBox("ch1");
        r = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            JRadioButton radio = new JRadioButton("r" + (i + 1));
            radio.setSize(50, 25);
            radio.setLocation(50, i * 30);
            add(radio);
            if (i % 2 == 0) {
                addToDragMode(radio);
            }
            r.add(radio);
        }
        b1.setSize(100, 50);
        b2.setSize(100, 50);
        t1.setSize(100, 25);
        ch1.setSize(100, 25);
        b2.setLocation(150, 200);
        t1.setLocation(150, 300);
        ch1.setLocation(150, 400);
        add(b1);
        add(b2);
        add(t1);
        add(ch1);
        addToDragMode(b1);
        addToDragMode(b2);
        //removeFromDragMode(b2);
        addToDragMode(t1);
        addToDragMode(ch1);
    }
    
    public static void main(String args[]) {
        MyDragFrame f = new MyDragFrame();
    }
}
