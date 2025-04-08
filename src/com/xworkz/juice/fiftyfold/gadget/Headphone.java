package com.xworkz.juice.fiftyfold.gadget;

public class Headphone {
    public void Music(Gadget gadget){
        System.out.println("Music Running in Headphone");
        gadget.brand();
        gadget.charge();
        gadget.connect();
        gadget.powerOn();
        gadget.powerOff();
        if(gadget instanceof Tablet){
            System.out.println("Gadget is instance of Tablet");
            Tablet tablet=(Tablet)gadget;

        }
    }
}
