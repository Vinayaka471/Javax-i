package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.Motorcycle.Bike;

public class VehicleRunner {
    public static void main(String[] args) {
        Bike vehicle = new Bike();
        vehicle.move();
        vehicle.stop();
        vehicle.fuel();
        vehicle.speed();
        vehicle.transport();

        System.out.println("-----------");
        Bike car=new Bike();
        car.move();
        car.stop();
        car.fuel();
        car.speed();
        car.transport();

    }
}
