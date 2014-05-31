/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author Soroush
 */
public class Person {
    
    private int x;
    private int y;
    private int headSize;
    private Paint headPaint;
    private Paint bodyPaint;

    public Person(int x, int y, int headSize, Paint headColor, Paint bodyColor) {
        this.x = x;
        this.y = y;
        this.headSize = headSize;
        this.headPaint = headColor;
        this.bodyPaint = bodyColor;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHeadSize() {
        return headSize;
    }

    public void setHeadSize(int headSize) {
        this.headSize = headSize;
    }

    public Paint getHeadColor() {
        return headPaint;
    }

    public void setHeadColor(Paint headColor) {
        this.headPaint = headColor;
    }

    public Paint getBodyColor() {
        return bodyPaint;
    }

    public void setBodyColor(Paint bodyColor) {
        this.bodyPaint = bodyColor;
    }
    
    public void draw(Graphics2D g) {
        g.setPaint(headPaint);
        g.fill(new Ellipse2D.Double(x, y, headSize, headSize));
        g.setPaint(bodyPaint);
        g.fillRoundRect(x - headSize / 4, y + headSize, (int)(headSize * 1.5), headSize * 2, 20, 20);
    }
}
