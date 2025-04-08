package com.xworkz.juice.fiftyfold.Sea;

public class SouthPacific {
    public void South(Sea sea){
        System.out.println("South running in SouthPacific");
        sea.depth();
        sea.marineLife();
        sea.temperature();
        sea.tides();
        sea.waves();
        if(sea instanceof Redsea){
            System.out.println("Sea is instance of Redsea");
            Redsea redsea=(Redsea)sea;

        }
    }
}
