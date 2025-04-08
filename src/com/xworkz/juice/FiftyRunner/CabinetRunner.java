package com.xworkz.juice.FiftyRunner;


import com.xworkz.juice.fiftyfold.Cabinet.Cabinet;
import com.xworkz.juice.fiftyfold.Cabinet.Locker;
import com.xworkz.juice.fiftyfold.Cabinet.Step;

public class CabinetRunner {
    public static void main(String[] args) {
        Cabinet caboard=new Locker();
        caboard.close();
        caboard.key();
        caboard.lock();
        caboard.handle();
        caboard.open();

        System.out.println("-----------");
        Locker door=new Locker();
        door.close();
        door.key();
        door.handle();
        door.open();
        door.lock();


        System.out.println("-------------------");
        Step step=new Step();
        step.One(caboard);


    }

}
