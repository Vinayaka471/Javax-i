package com.xworkz.juice.fiftyfold.metal;

public class Magnesium {
    public void Nitrogen(Metal metal){
        System.out.println("Nitrogen running in Magnesium");
        metal.conductivity();
        metal.corrosion();
        metal.density();
        metal.durability();
        metal.malleability();
        if(metal instanceof Silver){
            System.out.println("Metal instance of Silver");
            Silver silver=(Silver)metal;
        }
    }
}
