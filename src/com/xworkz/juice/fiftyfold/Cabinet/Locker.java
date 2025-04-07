package com.xworkz.juice.fiftyfold.Cabinet;

public class Locker extends Cabinet{
    public Locker(){
        System.out.println("running non-arg const Locker");
    }
    @Override
    public void lock(){
        System.out.println("lock Cabinet");
    }
    @Override
    public void key(){
        System.out.println("key Cabinet");
    }
    @Override
    public void handle(){
        System.out.println("handle Cabinet");
    }
    @Override
    public void open(){
        System.out.println("open Cabinet");
    }
    @Override
    public void close(){
        System.out.println("close Cabinet");
    }
}
