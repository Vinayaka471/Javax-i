package com.xworkz.practice;

public class Clock {
    public Void Running() {
        System.out.println("No argument constructor running");

        return null;
    }
}
class Teeth {
    public static void main(String[] args) {
        Clock clock=new Clock();
        clock.Running();
    }
}
