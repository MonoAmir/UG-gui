/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_mediaapplet;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JApplet;

/**
 *
 * @author Soroush
 */
public class MyApplet extends JApplet {
    
    public MyApplet() {
        setLayout(new GridLayout(2, 1));
        add(new AnimPanel());
        add(new MyNewAnimPanel());
    }
    
    @Override
    public void init() {
        showStatus("(init)");
    }
    
    @Override
    public void start() {
        showStatus("(start)");
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        showStatus("(paint)");
    }
}
