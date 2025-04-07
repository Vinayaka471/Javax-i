package com.xworkz.juice.fiftyfold.Cloth;

public class jeans extends Cloth {
    public jeans() {
        super();
        System.out.println("Running non-arg constructor TShirt");
    }
    @Override
    public void wear() {
        System.out.println("Cloth is worn");
    }
    @Override
    public void material() {
        System.out.println("Cloth is made of different materials");
    }
    @Override
    public void size() {
        System.out.println("Cloth has different sizes");
    }
    @Override
    public void brand() {
        System.out.println("Cloth has brands");
    }
    @Override
    public void design() {
        System.out.println("Cloth has designs");
    }
}
