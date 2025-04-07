package com.xworkz.juice.fiftyfold.Herb;

public class Petal extends Herb {
    public Petal() {
        super();
        System.out.println("Running non-arg constructor Flower");
    }
    @Override
    public void grow() {
        System.out.println("Herb grows");
    }
    public void photosynthesis() {
        System.out.println("Herb performs photosynthesis");
    }
    public void absorbWater() {
        System.out.println("Herb absorbs water");
    }
    public void provideOxygen() {
        System.out.println("Herb provides oxygen");
    }
    public void reproduce() {
        System.out.println("Herb reproduces");
    }
}

