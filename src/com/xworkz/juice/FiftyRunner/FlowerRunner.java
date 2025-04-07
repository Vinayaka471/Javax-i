package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.Blossom.Blossom;
import com.xworkz.juice.fiftyfold.Blossom.Lily;

public class FlowerRunner {
    public static void main(String[] args) {
        Blossom flower = new Lily();
        flower.bloom();
        flower.fragrance();
        flower.color();
        flower.petals();
        flower.pollination();

        System.out.println("-----------");

        Lily rose = new Lily();
        rose.bloom();
        rose.fragrance();
        rose.color();
        rose.petals();
        rose.pollination();
    }
}
