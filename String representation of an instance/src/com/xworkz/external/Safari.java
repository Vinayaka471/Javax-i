package com.xworkz.external;

import com.xworkz.internal.Bag;

public class Safari extends Bag {
    private String color;
    private int cost;
    private char grade;
    public Safari(String color,int cost,char grade){
        this.color=color;
        this.cost=cost;
        this.grade=grade;
    }
    public String toString(){
        return(" Color:"+this.color+" Cost:"+this.cost+" Grade:"+this.grade);

    }
}
