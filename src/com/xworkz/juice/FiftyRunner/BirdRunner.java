package com.xworkz.juice.FiftyRunner;


import com.xworkz.juice.fiftyfold.Aves.Aves;
import com.xworkz.juice.fiftyfold.Aves.Crow;

public class BirdRunner {
    public static void main(String[] args) {
        Aves bird = new Crow();
        bird.fly();
        bird.feathers();
        bird.laysEggs();
        bird.sound();
        bird.vision();

        System.out.println("-----------");

        Aves eagle = new Crow();
        eagle.fly();
        eagle.feathers();
        eagle.laysEggs();
        eagle.sound();
        eagle.vision();
    }
}
