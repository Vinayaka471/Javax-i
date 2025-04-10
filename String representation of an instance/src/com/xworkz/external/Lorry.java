package com.xworkz.external;

import com.xworkz.internal.Vehicle;

public class Lorry extends Vehicle {
    private String color;
    private int number;
    private char grade;
    public Lorry(String color, int number, char grade){
        this.color=color;
        this.number=number;
        this.grade=grade;
    }
    @Override
    public int hashCode()
    {
        System.out.println("Default:"+super.hashCode());
        return 84;
    }
    @Override
    public String toString(){
        return(" Color:"+this.color+" Number:"+this.number+" Grade:"+this.grade);
    }
}
