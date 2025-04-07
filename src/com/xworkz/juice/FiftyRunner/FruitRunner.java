package com.xworkz.juice.FiftyRunner;


import com.xworkz.juice.fiftyfold.fruit.Apple;
import com.xworkz.juice.fiftyfold.fruit.Fruit;

public class FruitRunner {
    public static void main(String[] args) {
        Fruit fruit=new Apple();
        fruit.taste();
        fruit.color();
        fruit.nutrients();
        fruit.seasonal();

        System.out.println("-----------");
        Apple apple = new Apple();
        apple.taste();
        apple.color();
        apple.nutrients();
        apple.seasonal();
    }
}
