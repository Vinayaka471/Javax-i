package com.xworkz.juice.fiftyfold.Codinglanguage;

public class HTML extends Codinglanguage {
    public HTML() {
        super();
        System.out.println("Running non-arg constructor Java");
    }
    @Override
    public void speak() {
        System.out.println("Language is spoken");
    }
    @Override
    public void write() {
        System.out.println("Language is written");
    }
    @Override
    public void communicate() {
        System.out.println("Language is used for communication");
    }
    @Override
    public void grammar() {
        System.out.println("Language has grammar rules");
    }
    @Override
    public void origin() {
        System.out.println("Language has an origin");
    }
}
