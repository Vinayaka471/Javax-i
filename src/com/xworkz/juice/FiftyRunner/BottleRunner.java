package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.Glass.Glass;
import com.xworkz.juice.fiftyfold.Glass.Jar;
import com.xworkz.juice.fiftyfold.Glass.Pot;

public class BottleRunner {
    public static void main(String[] args) {
        Glass bottle=new Jar();
        bottle.fill();
        bottle.frozen();
        bottle.glass();
        bottle.milk();
        bottle.water();

        System.out.println("----------");
        Jar cap = new Jar();
        cap.fill();
        cap.frozen();
        cap.glass();
        cap.milk();
        cap.water();

        Pot pot=new Pot();
        pot.Hot(bottle);

    }
}
