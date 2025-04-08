package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.wildlife.Tiger;

public class AnimalRunner {
    public static void main(String[] args) {
        Tiger animal = new Tiger();
        animal.eat();
        animal.sleep();
        animal.sound();
        animal.run();
        animal.breathe();

        System.out.println("-----------------");
        Tiger dog=new Tiger();
        dog.eat();
        dog.sleep();
        dog.sound();
        dog.run();
        dog.breathe();

    }

}
