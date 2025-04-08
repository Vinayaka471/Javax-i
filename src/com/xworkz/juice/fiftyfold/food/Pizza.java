package com.xworkz.juice.fiftyfold.food;

public class Pizza {
    public void Buy(Food food){
        System.out.println("Buy running in Pizza");
        food.cook();
        food.eat();
        food.healthy();
        food.spicy();
        food.taste();
        if(food instanceof Burger){
            System.out.println("Food is instance of Burger");
            Burger burger=(Burger)food;
        }
    }
}
