/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Soroush
 */
public class CalcPanel extends javax.swing.JPanel implements ActionListener {

    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JTextField t;
    
    private ArrayList<JButton> buttons;
    
    private int operator = -1;
    private double operand1;
    private double operand2;
    
    private ArrayList<Operation> history;
    
    private double memory = 0;
    
    /**
     * Creates new form CalcPanel
     */
    public CalcPanel() {
        
        initComponents();
        
        setLayout(new GridLayout(2, 1));
        
        p1 = new JPanel();
        p1.setBackground(Color.red);
        p1.setLayout(new GridLayout(3, 1));
        p2 = new JPanel();
        p2.setBackground(Color.green);
        p2.setLayout(new GridLayout(2, 4));
        
        add(p1);
        add(p2);
        
        buttons = new ArrayList<>();
        
        buttons.add(new JButton("*"));
        buttons.add(new JButton("+"));
        buttons.add(new JButton("-"));
        buttons.add(new JButton("/"));
        buttons.add(new JButton("M"));//4
        buttons.add(new JButton("M+"));//5
        buttons.add(new JButton("MC"));//6
        buttons.add(new JButton("MS"));//7
        buttons.add(new JButton("AC"));//8
        buttons.add(new JButton("HIS"));
        buttons.add(new JButton("M-"));
        buttons.add(new JButton("="));
        
        for (int i = 4; i < 12; i++) {
            p2.add(buttons.get(i));
        }
        
        t = new JTextField();
        p1.add(t);
        p1.add(new JPanel());
        
        p3 = new JPanel(new GridLayout(1, 4));
        p1.add(p3);
        
        for (int i = 0; i < 4; i++) {
            p3.add(buttons.get(i));
        }
        
        for (JButton b: buttons) {
            b.addActionListener(this);
        }
        
        buttons.get(11).setEnabled(false);
        t.setText("0");
        history = new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        
        int i;
        for (i = 0; i < buttons.size(); i++) {
            if (e.getSource() == buttons.get(i)) {
                break;
            }
        }
        
        if (i < 4) {
            operator = i;
            operand1 = Double.parseDouble(t.getText());
            t.setText(i == 3 ? "1" : "0");
            
            for (int j = 0; j < buttons.size(); j++) {
                buttons.get(j).setEnabled(j == 8 || j == 11);
            }
        }
        else if (i == 11) {
            
            operand2 = Double.parseDouble(t.getText());
            Operation op = new Operation(operator, operand1, operand2);
            t.setText(String.valueOf(op.getResult()));
            history.add(op);
            
            for (int j = 0; j < buttons.size(); j++) {
                buttons.get(j).setEnabled(j != 11);
            }
            
            operator = -1;
        }
        else if (i == 9) {
            new CalcHistory(history);
        }
        else if (i == 4) {
            memory = Double.parseDouble(t.getText());
        }
        else if (i == 5) {
            memory += Double.parseDouble(t.getText());
        }
        else if (i == 6) {
            memory = 0;
        }
        else if (i == 10) {
            memory -= Double.parseDouble(t.getText());
        }
        else if (i == 7) {
            t.setText(String.valueOf(memory));
        }
        else if (i == 8) {
            t.setText("0");
        }
    }
}
