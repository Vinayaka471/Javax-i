package com.xworkz.juice.FiftyRunner;


import com.xworkz.juice.fiftyfold.furniture.Bed;
import com.xworkz.juice.fiftyfold.furniture.Chair;
import com.xworkz.juice.fiftyfold.furniture.Furniture;

public class FurnitureRunner {
    public static void main(String[] args) {
        Furniture furniture = new Chair();
        furniture.support();
        furniture.material();
        furniture.weight();
        furniture.move();
        furniture.design();

        System.out.println("-----------");

        Chair chair = new Chair();
        chair.support();
        chair.material();
        chair.weight();
        chair.move();
        chair.design();


        System.out.println("------------------");
        Bed bed=new Bed();
        bed.Sleep(furniture);
    }
}
