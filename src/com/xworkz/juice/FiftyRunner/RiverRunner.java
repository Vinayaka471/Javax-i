package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.Stream.Jogfalls;
import com.xworkz.juice.fiftyfold.Stream.Sharavathi;

public class RiverRunner {
    public static void main(String[] args) {


        System.out.println("-----------");

        Sharavathi sharavathi = new Sharavathi();
        sharavathi.length();
        sharavathi.origin();
        sharavathi.flows();
        sharavathi.providesWater();
        sharavathi.wildlife();

        System.out.println("----------------");
        Jogfalls jogfalls=new Jogfalls();
        jogfalls.Sagara(sharavathi);
    }
}
