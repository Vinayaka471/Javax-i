package com.xworkz.juice.FiftyRunner;


import com.xworkz.juice.fiftyfold.Cloth.Cloth;
import com.xworkz.juice.fiftyfold.Cloth.jeans;

public class ClothingRunner {
    public static void main(String[] args) {
        Cloth clothing = new jeans();
        clothing.wear();
        clothing.material();
        clothing.size();
        clothing.brand();
        clothing.design();

        System.out.println("-----------");

        jeans tShirt = new jeans();
        tShirt.wear();
        tShirt.material();
        tShirt.size();
        tShirt.brand();
        tShirt.design();
    }
}
