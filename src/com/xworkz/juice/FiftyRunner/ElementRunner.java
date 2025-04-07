package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.Component.Component;
import com.xworkz.juice.fiftyfold.Component.Hydrogen;

public class ElementRunner {
    public static void main(String[] args) {
        Component element = new Hydrogen();
        element.atomicNumber();
        element.symbol();
        element.state();
        element.bonding();
        element.reactivity();

        System.out.println("-----------");

        Hydrogen oxygen = new Hydrogen();
        oxygen.atomicNumber();
        oxygen.symbol();
        oxygen.state();
        oxygen.bonding();
        oxygen.reactivity();
    }
}
