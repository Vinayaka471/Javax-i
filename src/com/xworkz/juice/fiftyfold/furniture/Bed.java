package com.xworkz.juice.fiftyfold.furniture;

public class Bed {
    public void Sleep(Furniture furniture){
        System.out.println("Sleep running Bad");
        furniture.design();
        furniture.material();
        furniture.move();
        furniture.support();
        furniture.weight();
        if(furniture instanceof Chair){
            System.out.println("furniture is instance of Chair");
            Chair chair=(Chair)furniture;
        }
    }
}
