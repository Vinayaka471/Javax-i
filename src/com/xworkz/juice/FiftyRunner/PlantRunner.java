package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.Blossom.Blossom;
import com.xworkz.juice.fiftyfold.Blossom.*;
import com.xworkz.juice.fiftyfold.Herb.Herb;
import com.xworkz.juice.fiftyfold.Herb.Stem;

public class PlantRunner {
    public static void main(String[] args) {
        Herb plant = new Herb();
        plant.grow();
        plant.photosynthesis();
        plant.absorbWater();
        plant.provideOxygen();
        plant.reproduce();

        System.out.println("-----------");

        Blossom flower = new Blossom();
        flower.bloom();
        flower.color();
        flower.fragrance();
        flower.pollination();
        flower.petals();

        System.out.println("----------------");
        Stem stem=new Stem();
        stem.Sepal(plant);
    }
}
