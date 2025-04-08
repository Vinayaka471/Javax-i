package com.xworkz.juice.fiftyfold.wildlife;

public class Tiger extends Wildlife {
    public Tiger() {
        super();
        System.out.println("Running non-arg constructor Tiger");
    }

    @Override
    public void eat(){
        System.out.println("eat in Tiger");
    }
    @Override
    public void sleep() {
        System.out.println("wildlife  is sleeping");
    }
    @Override
    public void sound() {
        System.out.println("wildlife  makes sound");
    }
    @Override
    public void run() {
        System.out.println("wildlife  is running");
    }
    @Override
    public void breathe() {
        System.out.println("wildlife  is breathing");
    }
}
