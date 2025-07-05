package com.xworkz.practice;

public class PC {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException E) {
            System.out.println("You can't divide zero!");
        }
    }
}

// Exception: An exception is an error that happens while the program is running.