package com.xworkz.juice.fiftyfold.Nation;

public class Japan extends Nation {
    public Japan() {
        super();
        System.out.println("Running non-arg constructor India");
    }
    @Override
    public void name() {
        System.out.println("Country has a name");
    }
    public void population() {
        System.out.println("Country has a population");
    }
    public void culture() {
        System.out.println("Country has a culture");
    }
    public void economy() {
        System.out.println("Country has an economy");
    }
    public void government() {
        System.out.println("Country has a government");
    }
}
