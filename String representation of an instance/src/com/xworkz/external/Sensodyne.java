package com.xworkz.external;

import com.xworkz.internal.Paste;

public class Sensodyne extends Paste {
    private String color;
    private int weight;
    private char grade;
    public Sensodyne(String color,int weight,char grade){
        this.color=color;
        this.weight=weight;
        this.grade=grade;
    }
    @Override
    public int hashCode()
    {
        System.out.println("Default:"+super.hashCode());
        return 49;
    }
    @Override
    public String toString(){
        return(" Color:"+this.color+" Weight:"+this.weight+" Grade:"+this.grade);

    }
}
