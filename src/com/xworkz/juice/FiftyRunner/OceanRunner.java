package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.Sea.Sea;
import com.xworkz.juice.fiftyfold.Sea.Redsea;

public class OceanRunner {
    public static void main(String[] args) {
        Sea ocean = new Redsea();
        ocean.depth();
        ocean.marineLife();
        ocean.waves();
        ocean.temperature();
        ocean.tides();

        System.out.println("-----------");

        Redsea pacific = new Redsea();
        pacific.depth();
        pacific.marineLife();
        pacific.waves();
        pacific.temperature();
        pacific.tides();
    }
}
