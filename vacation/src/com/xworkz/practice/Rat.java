package com.xworkz.practice;

public class Rat {
//    double radius;
    public static double calculateArea(double radius) {
        double area = 3.14 * radius * radius;
        return area;
    }
    public static void displayArea(double area) {
        System.out.println(area);

    }
    public static void main(String[] args){
        double radius=2.5;
        double area = calculateArea(radius);
        displayArea(area);

    }
}

// Calculate The Area of The Circle.