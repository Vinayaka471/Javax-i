package com.xworkz.juice.fiftyfold.Aves;

public class Parrot  {
    public void color(Aves aves){
        aves.fly();
        aves.feathers();
        aves.laysEggs();
        aves.sound();
        aves.vision();
        if(aves instanceof Crow){
            System.out.println("aves is instance of Crow");
            Crow crow=(Crow)aves;
            }
        }

    }
