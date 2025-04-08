package com.xworkz.juice.fiftyfold.Device;

public class Watch {
    public void Time(Device device){
        System.out.println("Time running in Watch");
        device.powerOn();
        device.brand();
        device.consumeElectricity();
        device.function();
        device.powerOff();
        if(device instanceof Fridge){
            System.out.println("Device is instance of Fridge");
            Fridge fridge=(Fridge)device;
        }
    }
}
