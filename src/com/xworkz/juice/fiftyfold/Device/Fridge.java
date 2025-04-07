package com.xworkz.juice.fiftyfold.Device;

public class Fridge extends Device {
    public Fridge() {
        super();
        System.out.println("Running non-arg constructor Fridge");
    }
    @Override
    public void powerOn() {
        System.out.println("Device is powered on");
    }
    @Override
    public void powerOff() {
        System.out.println("Device is powered off");
    }
    @Override
    public void consumeElectricity() {
        System.out.println("Device consumes electricity");
    }
    @Override
    public void function() {
        System.out.println("Device performs a function");
    }
    @Override
    public void brand() {
        System.out.println("Device has a brand");
    }
}
