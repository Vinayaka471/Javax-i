package com.xworkz.juice.fiftyfold.Aves;

public class Crow extends Aves {
    public Crow() {
        super();

        System.out.println("Running non-arg constructor Crow");

    }
    @Override
    public void fly() {
        System.out.println("Aves can fly");
    }
    @Override
    public void feathers() {
        System.out.println("Aves has feathers");
    }
    @Override
    public void laysEggs() {
        System.out.println("Aves lays eggs");
    }
    @Override
    public void sound() {
        System.out.println("Aves makes sounds");
    }
    @Override
    public void vision() {
        System.out.println("Aves has sharp vision");}
    public void speed(){
        System.out.println("Crows are in normal speed");
    }
}
