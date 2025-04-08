package com.xworkz.juice.FiftyRunner;


import com.xworkz.juice.fiftyfold.Compound.Compound;
import com.xworkz.juice.fiftyfold.Compound.Home;
import com.xworkz.juice.fiftyfold.Compound.Tower;

public class BuildingRunner {
    public static void main(String[] args) {
        Compound compound=new Home();
        compound.shelter();
        compound.structure();
        compound.floors();
        compound.foundation();

        System.out.println("-----------");
        Home home = new Home();
        home.shelter();
        home.structure();
        home.floors();
        home.foundation();


        System.out.println("--------------");
        Tower tower=new Tower();
        tower.Height(compound);
    }
}
