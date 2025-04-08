package com.xworkz.juice.fiftyfold.sports;

public class Kabaddi {
    public void Raid(Sports sports){
        System.out.println("Raid running in Kabaddi");
        sports.competition();
        sports.play();
        sports.rules();
        sports.team();
        sports.training();
        if(sports instanceof Football){
            System.out.println("Spots is instance of Football");
            Football football=(Football)sports;
        }
    }
}
