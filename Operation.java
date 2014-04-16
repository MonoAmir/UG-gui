/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Soroush
 */
public class Operation {
    
    private int operator;
    private double operand1;
    private double operand2;
    private char[] operators;

    public Operation(int operator, double operand1, double operand2) {
        this.operator = operator;
        this.operand1 = operand1;
        this.operand2 = operand2;
        
        operators = new char[4];
        operators[0] = '*';
        operators[1] = '+';
        operators[2] = '-';
        operators[3] = '/';
    }

    public int getOperator() {
        return operator;
    }
    
    public double getResult() {
        switch (operator) {
            case 0:
                return operand1 * operand2;
            case 1:
                return operand1 + operand2;
            case 2:
                return operand1 - operand2;
            case 3:
                return operand2 == 0 ? Double.NaN : operand1 / operand2;
            default:
                return 0;
        }
    }
    
    @Override
    public String toString() {
        return operand1 + " " + operators[operator] + " " + operand2 + " = " + getResult();
    }
}
