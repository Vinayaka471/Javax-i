package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.metal.Magnesium;
import com.xworkz.juice.fiftyfold.metal.Silver;
import com.xworkz.juice.fiftyfold.metal.Metal;

public class MetalRunner {
    public static void main(String[] args) {
        Metal metal = new Silver();
        metal.conductivity();
        metal.durability();
        metal.malleability();
        metal.density();
        metal.corrosion();

        System.out.println("-----------");

        Silver gold = new Silver();
        gold.conductivity();
        gold.durability();
        gold.malleability();
        gold.density();
        gold.corrosion();


        System.out.println("---------------");
        Magnesium magnesium=new Magnesium();
        magnesium.Nitrogen(metal);
    }
}
