package com.xworkz.juice.fiftyfold.Motorcycle;

public class Bike extends Motorcycle {
    public Bike() {
        super();
        System.out.println("Running non-arg constructor Car");
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
