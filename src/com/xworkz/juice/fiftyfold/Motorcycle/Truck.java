package com.xworkz.juice.fiftyfold.Motorcycle;

public class Truck {
    public void Engine(Motorcycle motorcycle){
        System.out.println("Engine running in Truck");
        motorcycle.fuel();
        motorcycle.move();
        motorcycle.speed();
        motorcycle.stop();
        motorcycle.transport();
        if(motorcycle instanceof Bike);
        Bike bike=(Bike)motorcycle;
    }
}
