/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author Soroush
 */
public class GraphicButton extends JButton {
    
    public GraphicButton(String text) {
        super(text);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.green);
        g.drawRoundRect(10, 10, 50, 200, 20, 20);
    }
}
