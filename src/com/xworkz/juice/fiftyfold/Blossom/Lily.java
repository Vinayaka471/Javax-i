package com.xworkz.juice.fiftyfold.Blossom;

public class Lily extends Blossom {
    public Lily() {
        super();
        System.out.println("Running non-arg constructor Rose");
    }
    @Override
    public void bloom() {
        System.out.println("Flower blooms");
    }
    @Override
    public void fragrance() {
        System.out.println("Flower has fragrance");
    }
    @Override
    public void color() {
        System.out.println("Flower has color");
    }
    @Override
    public void petals() {
        System.out.println("Flower has petals");
    }
    @Override
    public void pollination() {
        System.out.println("Flower helps in pollination");
    }
}
