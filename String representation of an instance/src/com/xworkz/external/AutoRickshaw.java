package com.xworkz.external;

import com.xworkz.internal.Vehicle;

public class AutoRickshaw extends Vehicle {
    private String brand;
    private int number;
    private String location;
    public AutoRickshaw(String brand,int number,String location){
        this.brand=brand;
        this.location=location;
        this.number=number;
    }
    @Override
    public int hashCode()
    {
        System.out.println("Default:"+super.hashCode());
        return 04;
    }
    @Override
    public String toString()
    {
        return ("Brand: "+this.brand+" Location:" +this.location+" Number:"+this.number);
    }
}

