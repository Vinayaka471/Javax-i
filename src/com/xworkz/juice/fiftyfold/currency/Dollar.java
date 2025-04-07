package com.xworkz.juice.fiftyfold.currency;

public class Dollar extends Currency {
    public Dollar() {
        super();
        System.out.println("Running non-arg constructor Dollar");
    }
    @Override
    public void move() {
        System.out.println("Vehicle is moving");
    }
    @Override
    public void stop() {
        System.out.println("Vehicle is stopping");
    }
    @Override
    public void fuel() {
        System.out.println("Vehicle needs fuel");
    }
    @Override
    public void speed() {
        System.out.println("Vehicle has speed");
    }
    @Override
    public void transport() {
        System.out.println("Vehicle is used for transport");
    }
}
