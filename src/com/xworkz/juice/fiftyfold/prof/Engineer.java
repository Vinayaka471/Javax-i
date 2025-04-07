package com.xworkz.juice.fiftyfold.prof;

public class Engineer extends Proffession {
    public Engineer() {
        super();
        System.out.println("Running non-arg constructor of Engineer");
    }
    @Override
    public void work() {
        System.out.println("Profession involves work");
    }
    public void salary() {
        System.out.println("Profession provides a salary");
    }
    public void skills() {
        System.out.println("Profession requires skills");
    }
    public void education() {
        System.out.println("Profession requires education");
    }
}
