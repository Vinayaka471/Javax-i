package com.xworkz.external;

import com.xworkz.internal.Hospital;

public class Doctor extends Hospital {
    private String name;
    private int number;
    private String location;
    public Doctor(String name,int number,String location){
        this.name=name;
        this.location=location;
        this.number=number;
    }
    public String toString()
    {
        return ("Name: "+this.name+" Location:" +this.location+" Number:"+this.number);
    }
}
