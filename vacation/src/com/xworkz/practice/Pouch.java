package com.xworkz.practice;
import javax.swing.JOptionPane;

public class Pouch {
    public static void main(String[] args){
        String name=JOptionPane.showInputDialog("Enter Your Name");
        JOptionPane.showMessageDialog(null,"Hello "+name);

        int age=Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));
        JOptionPane.showMessageDialog(null,"Your age "+age+" years old");

        double height=Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height"));
        JOptionPane.showMessageDialog(null,"Your "+height+" feet tall");


    }
}
