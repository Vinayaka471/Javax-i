package com.xworkz.demo1;

public class Transport {
    String vehicleType;
    String model;
    int capacity;
    boolean electric;

    public Transport(String vehicleType, String model, int capacity, boolean electric) {
        this.vehicleType = vehicleType;
        this.model = model;
        this.capacity = capacity;
        this.electric = electric;
    }

    public void display() {
        System.out.println("        Transport: Type: " + vehicleType + ", Model: " + model + ", Capacity: " + capacity + " passengers, Electric: " + electric);
    }
}
