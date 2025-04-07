package com.xworkz.juice.fiftyfold.planet;

public class Jupitar extends Planet {
    public Jupitar() {
        super();
        System.out.println("Running non-arg constructor Earth");
    }
    @Override
    public void orbitsSun() {
        System.out.println("Planet orbits the sun");
    }
    @Override
    public void hasGravity() {
        System.out.println("Planet has gravity");
    }
    @Override
    public void hasAtmosphere() {
        System.out.println("Planet has an atmosphere");
    }
    @Override
    public void supportsLife() {
        System.out.println("Some planets support life");
    }
    @Override
    public void hasOceans() {
        System.out.println("Some planets have oceans");
    }
}
