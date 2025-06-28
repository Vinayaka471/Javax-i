package com.xworkz.practice;


// OBJECTS in Java


public class Car {
    String color = "Red";
    void drive(){
        System.out.println("Arun drives the car");
    }
}
class Main{
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.color);
        car.drive();
    }

}