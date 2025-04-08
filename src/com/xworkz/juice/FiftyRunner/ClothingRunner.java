package com.xworkz.juice.FiftyRunner;


import com.xworkz.juice.fiftyfold.Cloth.Cloth;
import com.xworkz.juice.fiftyfold.Cloth.Jeans;
import com.xworkz.juice.fiftyfold.Cloth.Tie;

public class ClothingRunner {
    public static void main(String[] args) {
        Cloth clothing = new Jeans();
        clothing.wear();
        clothing.material();
        clothing.size();
        clothing.brand();
        clothing.design();

        System.out.println("-----------");

        Jeans tShirt = new Jeans();
        tShirt.wear();
        tShirt.material();
        tShirt.size();
        tShirt.brand();
        tShirt.design();


        System.out.println("-----------------");
        Tie tie=new Tie();
        tie.Length(clothing);
    }
}
