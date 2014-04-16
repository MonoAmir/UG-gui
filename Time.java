/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Soroush
 */
public class Time {
    
    private int h;
    private int m;
    private int s;
    private boolean mode24;
    
    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
        this.mode24 = true;
    }
    
    public void setMode24(boolean mode24) {
        this.mode24 = mode24;
    }
    
    public boolean getMode24() {
        return mode24;
    }

    @Override
    public String toString() {
        
        if (mode24) {
            return (h > 9 ? h : "0" + h) + ":" + (m > 9 ? m : "0" + m) + ":" + (s > 9 ? s : "0" + s);
        }
        
        if (h > 12) {
            int ht = h - 12;
            return (ht > 9 ? ht : "0" + ht) + ":" + (m > 9 ? m : "0" + m) + ":" + (s > 9 ? s : "0" + s) + "pm";
        }
        
        return (h > 9 ? h : "0" + h) + ":" + (m > 9 ? m : "0" + m) + ":" + (s > 9 ? s : "0" + s) + "am";
    }
    
}
