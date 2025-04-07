package com.xworkz.juice.fiftyfold.food;

public class Burger extends Food {
    public Burger() {
        super();
        System.out.println("Running non-arg constructor Burger");
    }
    @Override
    public void eat() {
        System.out.println("Food can be eaten");
    }
    @Override
    public void taste() {
        System.out.println("Food has different tastes");
    }
    @Override
    public void cook() {
        System.out.println("Food is cooked");
    }
    @Override
    public void healthy() {
        System.out.println("Some food is healthy");
    }
    @Override
    public void spicy() {
        System.out.println("Food can be spicy");
    }
}
