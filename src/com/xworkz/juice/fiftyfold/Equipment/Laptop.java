package com.xworkz.juice.fiftyfold.Equipment;

public class Laptop extends Equipment{

    public Laptop() {
        super();
        System.out.println("Running non-arg constructor of Mobile");
    }
    @Override
    public void powerOn() {
        System.out.println("Equipment is powered on");
    }
    @Override
    public void powerOff() {
        System.out.println("Equipment is powered off");
    }
    @Override
    public void battery() {
        System.out.println("Equipment has a battery");
    }
    @Override
    public void charge() {
        System.out.println("Equipment is charging");
    }
}
