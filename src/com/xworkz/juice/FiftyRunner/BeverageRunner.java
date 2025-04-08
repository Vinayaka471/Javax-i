package com.xworkz.juice.FiftyRunner;


import com.xworkz.juice.fiftyfold.Juice.Coffee;
import com.xworkz.juice.fiftyfold.Juice.Juice;
import com.xworkz.juice.fiftyfold.Juice.Juice;

public class BeverageRunner {
    public static void main(String[] args) {
        Juice beverage=new Juice();
        beverage.drink();
        beverage.temperature();
        beverage.flavor();
        beverage.refresh();

        System.out.println("-----------");
        Juice water = new Juice();
        water.drink();
        water.temperature();
        water.flavor();
        water.refresh();


        System.out.println("--------------");
        Coffee coffee=new Coffee();
        coffee.Beans(beverage);
    }
}
