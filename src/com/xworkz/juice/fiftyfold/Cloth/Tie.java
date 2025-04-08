package com.xworkz.juice.fiftyfold.Cloth;

public class Tie {
    public void Length(Cloth cloth){
        System.out.println("Length running in Tie");
        cloth.wear();
        cloth.brand();
        cloth.design();
        cloth.size();
        cloth.material();
        if(cloth instanceof Jeans){
            System.out.println("Cloth is instance of jeans");
            Jeans jeans=(Jeans)cloth;
        }
    }
}
