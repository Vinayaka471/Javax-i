package com.xworkz.juice.fiftyfold.drink;

public class Juice extends Drink {
    public Juice() {
        super();
        System.out.println("Running non-arg constructor Juice");
    }
    @Override
    public void sip() {
        System.out.println("Drink is sipped");
    }
    @Override
    public void refresh() {
        System.out.println("Drink is refreshing");
    }
    @Override
    public void cold() {
        System.out.println("Drink can be cold");
    }
    @Override
    public void sweet() {
        System.out.println("Drink can be sweet");
    }
    @Override
    public void healthy() {
        System.out.println("Drink can be healthy");
    }
}
