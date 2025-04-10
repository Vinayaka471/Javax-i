package com.xworkz.external;

import com.xworkz.internal.Police;

public class Gaurd extends Police {
    private String brand;
    private int cost;
    private String color;
    public  Gaurd(String brand,int cost,String color){
        this.brand=brand;
        this.color=color;
        this.cost=cost;
    }
    public String toString(){
        return(" Brand:"+this.brand+" Color:"+this.color+" Cost"+this.cost);
    }
}
