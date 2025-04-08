package com.xworkz.juice.fiftyfold.Compound;

public class Tower {
    public void Height(Compound compound){
        System.out.println("Height running in Tower");
        compound.shelter();
        compound.floors();
        compound.foundation();
        compound.structure();
        if(compound instanceof Home){
            System.out.println("Compound is instance of Home");
            Home home=(Home)compound;
        }
    }
}
