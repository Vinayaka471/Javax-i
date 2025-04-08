package com.xworkz.juice.fiftyfold.Equipment;

public class Calculator {
    public void Count(Equipment equipment){
        System.out.println("Count running in Calculator");
        equipment.battery();
        equipment.powerOff();
        equipment.powerOn();
        equipment.charge();
        if(equipment instanceof Laptop){
            System.out.println("Equipment is instance of Laptop");
            Laptop laptop=(Laptop)equipment;
        }
    }
}
