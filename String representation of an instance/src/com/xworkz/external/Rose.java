package com.xworkz.external;


import com.xworkz.internal.Flower;

public class Rose extends Flower {
    private String color;
    private int cost;
    private char grade;
    public Rose(String color,int cost,char grade){
        this.color=color;
        this.cost=cost;
        this.grade=grade;
    }
    public String toString(){
        return(" Color:"+this.color+" Weight:"+this.cost+" Grade:"+this.grade);

    }
}

