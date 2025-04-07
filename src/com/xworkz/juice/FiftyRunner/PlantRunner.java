package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.Blossom.Blossom;
import com.xworkz.juice.fiftyfold.Blossom.Flower;
import com.xworkz.juice.fiftyfold.Herb.Herb;

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
    }
}
