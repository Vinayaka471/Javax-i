package com.xworkz.juice.FiftyRunner;


import com.xworkz.juice.fiftyfold.Device.Device;
import com.xworkz.juice.fiftyfold.Device.Fridge;
import com.xworkz.juice.fiftyfold.Device.Watch;

public class ApplianceRunner {
    public static void main(String[] args) {
        Device appliance = new Fridge();
        appliance.powerOn();
        appliance.powerOff();
        appliance.consumeElectricity();
        appliance.function();
        appliance.brand();

        System.out.println("-----------");

        Fridge washingMachine = new Fridge();
        washingMachine.powerOn();
        washingMachine.powerOff();
        washingMachine.consumeElectricity();
        washingMachine.function();
        washingMachine.brand();


        System.out.println("-------------------");
        Watch watch=new Watch();
        watch.Time(appliance);
    }
}
