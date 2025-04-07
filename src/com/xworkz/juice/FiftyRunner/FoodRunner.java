package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.food.Burger;
import com.xworkz.juice.fiftyfold.food.Food;

public class FoodRunner {
    public static void main(String[] args) {
        Food food = new Burger();
        food.eat();
        food.taste();
        food.cook();
        food.healthy();
        food.spicy();

        System.out.println("--------------");
        Burger burger=new Burger();
        burger.eat();
        burger.taste();
        burger.cook();
        burger.healthy();
        burger.spicy();

    }
}
