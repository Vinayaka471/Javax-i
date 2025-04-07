package com.xworkz.juice.FiftyRunner;


import com.xworkz.juice.fiftyfold.Nation.Nation;
import com.xworkz.juice.fiftyfold.Nation.Japan;

public class CountryRunner {
    public static void main(String[] args) {
        Nation country = new Japan();
        country.name();
        country.population();
        country.culture();
        country.economy();
        country.government();

        System.out.println("-----------");
        Japan india=new Japan();
        india.name();
        india.population();
        india.culture();
        india.economy();
        india.government();


    }
}
