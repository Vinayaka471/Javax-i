package com.xworkz.external;

import com.xworkz.internal.Hospital;

public class Drip extends Hospital {
    private String name;
    private int number;
    private String location;
    public Drip(String name,int number,String location){
        this.name=name;
        this.location=location;
        this.number=number;
    }
    @Override
    public int hashCode()
    {
        System.out.println("Default:"+super.hashCode());
        return 32;
    }
    @Override
    public String toString()
    {
        return ("Name: "+this.name+" Location:" +this.location+" Number:"+this.number);
    }
}
