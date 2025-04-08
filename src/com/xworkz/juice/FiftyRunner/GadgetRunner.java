package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.gadget.Gadget;
import com.xworkz.juice.fiftyfold.gadget.Headphone;
import com.xworkz.juice.fiftyfold.gadget.Tablet;

public class GadgetRunner {
    public static void main(String[] args) {
        Gadget gadget = new Tablet();
        gadget.powerOn();
        gadget.powerOff();
        gadget.charge();
        gadget.connect();
        gadget.brand();

        System.out.println("-----------");

        Tablet tablet = new Tablet();
        tablet.powerOn();
        tablet.powerOff();
        tablet.charge();
        tablet.connect();
        tablet.brand();


        System.out.println("------------------");
        Headphone headphone=new Headphone();
        headphone.Music(gadget);
    }
}
