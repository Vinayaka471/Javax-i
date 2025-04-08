package com.xworkz.juice.fiftyfold.drink;

public class Soda {
    public void Water(Drink drink){
        System.out.println("Water running in Soda");
        drink.cold();
        drink.healthy();
        drink.refresh();
        drink.sip();
        drink.sweet();
        if(drink instanceof Juice);
        System.out.println("Drink instance of Juice");
        Juice juice=(Juice)drink;
    }
}
