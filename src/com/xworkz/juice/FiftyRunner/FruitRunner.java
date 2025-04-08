package com.xworkz.juice.FiftyRunner;


import com.xworkz.juice.fiftyfold.fruit.Apple;
import com.xworkz.juice.fiftyfold.fruit.Fruit;
import com.xworkz.juice.fiftyfold.fruit.Mango;

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


        System.out.println("---------------");
        Mango mango=new Mango();
        mango.Yellow(fruit);
    }
}
