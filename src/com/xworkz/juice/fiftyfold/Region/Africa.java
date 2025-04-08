package com.xworkz.juice.fiftyfold.Region;

public class Africa {
    public void Elephant(Region region){
        region.climate();
        region.countries();
        region.culture();
        region.economy();
        region.population();
        if(region instanceof Europe){
            System.out.println("Region instance of Europe");
            Europe europe=(Europe)region;
        }
    }
}
