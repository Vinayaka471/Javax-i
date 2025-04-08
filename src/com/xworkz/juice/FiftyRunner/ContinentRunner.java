package com.xworkz.juice.FiftyRunner;


import com.xworkz.juice.fiftyfold.Region.Africa;
import com.xworkz.juice.fiftyfold.Region.Europe;
import com.xworkz.juice.fiftyfold.Region.Region;

public class ContinentRunner {
    public static void main(String[] args) {
        Region continent = new Europe();
        continent.countries();
        continent.population();
        continent.culture();
        continent.economy();
        continent.climate();

        System.out.println("-----------");

        Europe asia = new Europe();
        asia.countries();
        asia.population();
        asia.culture();
        asia.economy();
        asia.climate();


        Africa africa=new Africa();
        africa.Elephant(continent);
    }
}
