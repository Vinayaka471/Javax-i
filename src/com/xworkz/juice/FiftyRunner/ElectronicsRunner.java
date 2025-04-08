package com.xworkz.juice.FiftyRunner;


import com.xworkz.juice.fiftyfold.Equipment.Calculator;
import com.xworkz.juice.fiftyfold.Equipment.Equipment;
import com.xworkz.juice.fiftyfold.Equipment.Laptop;

public class ElectronicsRunner {

        public static void main(String[] args) {
            Equipment device=new Laptop();
            device.powerOn();
            device.powerOff();
            device.battery();
            device.charge();

            System.out.println("-----------");
            Laptop mobile = new Laptop();
            mobile.powerOn();
            mobile.powerOff();
            mobile.battery();
            mobile.charge();

            System.out.println("--------------");
            Calculator calculator=new Calculator();
            calculator.Count(device);
        }
    }



