package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.Celebration.Sankranti;
import com.xworkz.juice.fiftyfold.Celebration.Ugadi;
import com.xworkz.juice.fiftyfold.Celebration.Celebration;

public class FestivalRunner {
    public static void main(String[] args) {
        Celebration festival=new Ugadi();
        festival.celebrate();
        festival.traditions();
        festival.holidays();
        festival.food();

        System.out.println("-----------");
        Ugadi diwali = new Ugadi();
        diwali.celebrate();
        diwali.traditions();
        diwali.holidays();
        diwali.food();


        System.out.println("----------------");
        Sankranti sankranti=new Sankranti();
        sankranti.Village(festival);
    }
}
