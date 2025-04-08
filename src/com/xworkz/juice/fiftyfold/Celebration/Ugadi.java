package com.xworkz.juice.fiftyfold.Celebration;

public class Ugadi extends Celebration {
    public Ugadi() {
        super();
        System.out.println("Running non-arg constructor of Diwali");
    }
    @Override
    public void celebrate() {
        System.out.println("Festivals are celebrated joyfully");
    }
    @Override
    public void traditions() {
        System.out.println("Festivals follow different traditions");
    }
    @Override
    public void holidays() {
        System.out.println("Festivals often bring holidays");
    }
    @Override
    public void food() {
        System.out.println("Festivals have special food items");
    }
    @Override
    public void dress() {
        System.out.println("Festival have new dress");
    }
}
