package com.xworkz.juice.fiftyfold.season;

public class Rainy {
    public void Cloud(Season season){
        System.out.println("Cloud running in Rainy");
        season.activities();
        season.temperature();
        season.duration();
        season.impact();
        season.weather();
        if(season instanceof Winter){
            System.out.println("Season is instanceof Winter");
            Winter winter=(Winter)season;
        }
        
    }
}
