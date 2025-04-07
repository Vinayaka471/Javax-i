package com.xworkz.juice.fiftyfold.Component;

public class Hydrogen extends Component {
    public Hydrogen() {
        super();
        System.out.println("Running non-arg constructor Oxygen");
    }
    @Override
    public void atomicNumber() {
        System.out.println("Element has an atomic number");
    }
    @Override
    public void symbol() {
        System.out.println("Element has a chemical symbol");
    }
    @Override
    public void state() {
        System.out.println("Element exists in different states");
    }
    @Override
    public void bonding() {
        System.out.println("Element forms chemical bonds");
    }
    @Override
    public void reactivity() {
        System.out.println("Element has chemical reactivity");
    }
}
