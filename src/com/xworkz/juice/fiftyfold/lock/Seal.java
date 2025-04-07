package com.xworkz.juice.fiftyfold.lock;

public class Seal extends Key{
    public Seal(){
        System.out.println("running non-arg const Lock");
    }
    @Override
    public void open(){
        System.out.println("open Key");
    }
    public void white(){
        System.out.println("white Key");
    }
    public void small(){
        System.out.println("small Key");
    }
    public void close(){
        System.out.println("close Key");
    }
    public void big(){
        System.out.println("big Key");
    }
}
