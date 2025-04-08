package com.xworkz.juice.fiftyfold.transportation;

public class Bus {
    public void Road(Transportation transportation){
        transportation.capacity();
        transportation.fuel();
        transportation.move();
        transportation.speed();
        transportation.type();
        if(transportation instanceof Train){
            Train train=(Train)transportation;
        }
    }
}
