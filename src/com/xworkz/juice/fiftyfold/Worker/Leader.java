package com.xworkz.juice.fiftyfold.Worker;

public class Leader extends Worker {
    public Leader() {
        super();
        System.out.println("Running non-arg constructor Manager");
    }
    @Override
    public void work() {
        System.out.println("Employee is working");
    }
    @Override
    public void salary() {
        System.out.println("Employee gets salary");
    }
    @Override
    public void benefits() {
        System.out.println("Employee gets benefits");
    }
    @Override
    public void experience() {
        System.out.println("Employee gains experience");
    }
    @Override
    public void department() {
        System.out.println("Employee belongs to a department");
    }
}
