package com.xworkz.juice.fiftyfold.Component;

public class Iron {
    public void Rod(Component component){
        System.out.println("Rod running in Iron");
        component.atomicNumber();
        component.bonding();
        component.reactivity();
        component.state();
        component.symbol();
        if(component instanceof Hydrogen){
            System.out.println("Component is instance of Hydrogen");
            Hydrogen hydrogen=(Hydrogen)component;
        }
    }
}
