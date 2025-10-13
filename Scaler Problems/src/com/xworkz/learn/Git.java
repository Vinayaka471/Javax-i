package com.xworkz.learn;

public class Git {

    boolean persistence = true;
    int intelligence = 1;
    int cupsOfCoffee = 1;

    public void keepCoding() {
        while (persistence && cupsOfCoffee > 0) {
            intelligence++;
            cupsOfCoffee--; // Decrease coffee count to avoid infinite loop
            System.out.println("Coding... Intelligence: " + intelligence);
        }
    }

    public static void main(String[] args) {
        Git dev = new Git();
        dev.keepCoding();
    }
}
