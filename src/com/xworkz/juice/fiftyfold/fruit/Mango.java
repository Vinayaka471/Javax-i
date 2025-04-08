package com.xworkz.juice.fiftyfold.fruit;

public class Mango {
    public void Yellow(Fruit fruit){
        System.out.println("Fruit running in Mango");
        fruit.color();
        fruit.nutrients();
        fruit.seasonal();
        fruit.taste();
        if(fruit instanceof  Apple){
            System.out.println("Fruit is instance of Apple");
            Apple apple=(Apple)fruit;
        }
    }
}
