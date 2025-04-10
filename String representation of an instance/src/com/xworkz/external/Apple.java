package com.xworkz.external;

import com.xworkz.internal.Fruit;

public class Apple extends Fruit {
    private int cost;
    private String quality;
    private int kg;
    public Apple(String quality,int cost,int kg){
        this.quality=quality;
        this.cost=cost;
        this.kg=kg;
    }
    public String toString()
    {
        return ("Quality: "+this.quality+" Cost:" +this.cost+" Kg:"+this.kg);
    }
}
