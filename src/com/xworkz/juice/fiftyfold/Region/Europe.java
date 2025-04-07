package com.xworkz.juice.fiftyfold.Region;

public class Europe extends Region {
    public Europe() {
        super();
        System.out.println("Running non-arg constructor Asia");
    }
    @Override
    public void countries() {
        System.out.println("Region has multiple countries");
    }
    public void population() {
        System.out.println("Region has a large population");
    }
    public void culture() {
        System.out.println("Region has diverse cultures");
    }
    public void economy() {
        System.out.println("Region contributes to the global economy");
    }
    public void climate() {
        System.out.println("Region has different climates");
    }
}
