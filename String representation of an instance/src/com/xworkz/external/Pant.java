package com.xworkz.external;

import com.xworkz.internal.Cloth;

public class Pant extends Cloth {
    private String brand;
    private int cost;
    private String color;
    public  Pant(String brand,int cost,String color){
        this.brand=brand;
        this.color=color;
        this.cost=cost;
    }
    public String toString(){
        return(" Brand:"+this.brand+" Color:"+this.color+" Cost"+this.cost);
    }
}
