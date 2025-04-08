package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.drink.Drink;
import com.xworkz.juice.fiftyfold.drink.Juice;
import com.xworkz.juice.fiftyfold.drink.Soda;

public class DrinkRunner {
    public static void main(String[] args) {
        Drink drink = new Juice();
        drink.sip();
        drink.refresh();
        drink.cold();
        drink.sweet();
        drink.healthy();

        System.out.println("--------");
        Juice juice=new Juice();
        juice.sip();
        juice.refresh();
        juice.cold();
        juice.sweet();
        juice.healthy();


        System.out.println("-----------------");
        Soda soda=new Soda();
        soda.Water(drink);

    }
}
