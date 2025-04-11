package com.xworkz.external;

import com.xworkz.internal.Police;

public class Security extends Police {
    private String brand;
    private int cost;
    private String color;
    public  Security(String brand,int cost,String color){
        this.brand=brand;
        this.color=color;
        this.cost=cost;
    }
    @Override
    public int hashCode()
    {
        System.out.println("Default:"+super.hashCode());
        return 37;
    }
    @Override
    public String toString(){
        return(" Brand:"+this.brand+" Color:"+this.color+" Cost"+this.cost);
    }
}
