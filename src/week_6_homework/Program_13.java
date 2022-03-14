package week_6_homework;

import javax.swing.*;

public class Program_13 {

    public static void main(String[] args) {
        // Three variables to enter the numbers
        int a;
        int b;
        int c;

        // Initialising the variable to calculate average of 3 number by importing javax.swing.*;
        a = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Enter Third Number"));
        // Average formula
        int avg = (a + b + c) / 3;
        JOptionPane.showMessageDialog(null, avg);
    }
}
