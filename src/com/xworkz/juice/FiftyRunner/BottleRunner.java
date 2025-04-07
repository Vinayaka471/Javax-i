package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.Glass.Bottle;
import com.xworkz.juice.fiftyfold.Glass.Cap;

public class BottleRunner {
    public static void main(String[] args) {
        Bottle bottle=new Cap();
        bottle.fill();
        bottle.frozen();
        bottle.glass();
        bottle.milk();
        bottle.water();

        System.out.println("----------");
        Cap cap = new Cap();
        cap.fill();
        cap.frozen();
        cap.glass();
        cap.milk();
        cap.water();

    }
}
