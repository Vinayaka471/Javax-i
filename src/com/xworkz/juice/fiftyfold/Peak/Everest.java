package com.xworkz.juice.fiftyfold.Peak;

public class Everest extends Peak {
    public Everest() {
        super();
        System.out.println("Running non-arg constructor Everest");
    }
    @Override
    public void height() {
        System.out.println("Mountain has a height");
    }
    public void climate() {
        System.out.println("Mountain has a unique climate");
    }
    public void location() {
        System.out.println("Mountain is located in different regions");
    }
    public void trekking() {
        System.out.println("Mountain is used for trekking");
    }
    public void wildlife() {
        System.out.println("Mountain supports unique wildlife");
    }
}
