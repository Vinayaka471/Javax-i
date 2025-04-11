package com.xworkz.external;

import com.xworkz.internal.Fruit;

public class Orange extends Fruit {
    private int cost;
    private String quality;
    private int kg;
    public Orange(String quality,int cost,int kg){
        this.quality=quality;
        this.cost=cost;
        this.kg=kg;
    }
    @Override
    public int hashCode()
    {
        System.out.println("Default:"+super.hashCode());
        return 22;
    }
    @Override
    public String toString()
    {
        return ("Quality: "+this.quality+" Cost:" +this.cost+" Kg:"+this.kg);
    }
}
