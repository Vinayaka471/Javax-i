package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.Blossom.Blossom;
import com.xworkz.juice.fiftyfold.Blossom.Lily;
import com.xworkz.juice.fiftyfold.Blossom.Rose;

public class FlowerRunner {
    public static void main(String[] args) {
        Blossom flower = new Lily();
        flower.bloom();
        flower.fragrance();
        flower.color();
        flower.petals();
        flower.pollination();

        System.out.println("-----------");

        Lily white = new Lily();
        white.bloom();
        white.fragrance();
        white.color();
        white.petals();
        white.pollination();

        System.out.println("----------------");
        Rose rose=new Rose();
        rose.Pink(flower);

    }
}
