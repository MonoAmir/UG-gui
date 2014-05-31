/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_mediaapplet;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Soroush
 */
public class MyNewAnimPanel extends AnimPanel {
    
    private GeneralPath path;
    private Rectangle2D.Double rect;
    
    public MyNewAnimPanel() {
        super();
        
        path = new GeneralPath();
        path.moveTo(0, 20);
        path.lineTo(20, 40);
        path.lineTo(0, 40);
        path.closePath();
        
        rect = new Rectangle2D.Double(0, 0, 30, 30);
        
        //setShape(path);
        setShape(rect);
        
        setShapePaint(new GradientPaint(0, 0, Color.red, 0, 5, Color.blue, true));
        setDelay(5);
        setBackground(Color.yellow);
    }
}
