package com.xworkz.external;

import com.xworkz.internal.Fruit;

public class Banana extends Fruit {
    private int cost;
    private String quality;
    private int kg;
    public Banana(String quality,int cost,int kg){
        this.quality=quality;
        this.cost=cost;
        this.kg=kg;
    }
    public String toString()
    {
        return ("Quality: "+this.quality+" Cost:" +this.cost+" Kg:"+this.kg);
    }
}
