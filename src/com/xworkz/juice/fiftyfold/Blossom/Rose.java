package com.xworkz.juice.fiftyfold.Blossom;

public class Rose {
    public void Pink(Blossom blossom){
        System.out.println("Pink Color Rose ");
        blossom.bloom();
        blossom.color();
        blossom.fragrance();
        blossom.petals();
        blossom.pollination();
        if(blossom instanceof Lily){
            System.out.println("Blossom is instance of Lily");
            Lily lily=(Lily)blossom;
        }
    }
}
