package com.xworkz.juice.fiftyfold.Herb;

public class Stem {
    public void Sepal(Herb herb){
        System.out.println("Sepal running in Stem");
        herb.absorbWater();
        herb.grow();
        herb.photosynthesis();
        herb.provideOxygen();
        herb.provideOxygen();
        herb.reproduce();
        if(herb instanceof Petal){
            System.out.println("Herb is instance of Petal");
            Petal petal=(Petal)herb;
        }
    }
}
