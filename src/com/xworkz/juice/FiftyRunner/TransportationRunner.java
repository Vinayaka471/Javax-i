package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.transportation.Train;
import com.xworkz.juice.fiftyfold.transportation.Transportation;

public class TransportationRunner {
    public static void main(String[] args) {
        Transportation transport = new Train();
        transport.move();
        transport.speed();
        transport.fuel();
        transport.capacity();
        transport.type();

        System.out.println("-----------");

        Train train = new Train();
        train.move();
        train.speed();
        train.fuel();
        train.capacity();
        train.type();
    }
}
