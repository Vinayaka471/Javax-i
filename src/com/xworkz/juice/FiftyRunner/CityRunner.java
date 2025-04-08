package com.xworkz.juice.FiftyRunner;


import com.xworkz.juice.fiftyfold.Area.Area;
import com.xworkz.juice.fiftyfold.Area.Btm;
import com.xworkz.juice.fiftyfold.Area.Rajajinagara;

public class CityRunner {
    public static void main(String[] args) {
        Area city = new Area();
        city.population();
        city.infrastructure();
        city.tourism();
        city.culture();
        city.economy();

        System.out.println("-----------");

        Rajajinagara newYork = new Rajajinagara();
        newYork.population();
        newYork.infrastructure();
        newYork.tourism();
        newYork.culture();
        newYork.economy();

        System.out.println("-----------------");
        Btm btm=new Btm();
        btm.Traffic(city);

    }
}
