package com.xworkz.juice.fiftyfold.Power;

public class Cable extends Power{
    public Cable(){
        System.out.println("running non-arg const cable");
    }
    @Override
    public void plug(){
        System.out.println("plug Power");
    }
    public void white(){
        System.out.println("white Power");
    }
    public void small(){
        System.out.println("small Power");
    }
    public void cPin(){
        System.out.println("cPin Power");
    }
    public void phone(){
        System.out.println("phone Power");
    }
}

