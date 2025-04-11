package com.xworkz.external;

import com.xworkz.internal.Soap;

public class Vim extends Soap {
    private String color;
    private int weight;
    private char grade;
    public Vim(String color,int weight,char grade){
        this.color=color;
        this.weight=weight;
        this.grade=grade;
    }
    @Override
    public int hashCode()
    {
        System.out.println("Default:"+super.hashCode());
        return 889;
    }
    @Override
    public String toString(){
        return(" Color:"+this.color+" Weight:"+this.weight+" Grade:"+this.grade);

    }
}
