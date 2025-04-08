package com.xworkz.juice.fiftyfold.Celebration;

public class Sankranti {
    public void Village(Celebration celebration){
        System.out.println("Village running in Sankranti");
        celebration.celebrate();
        celebration.dress();
        celebration.food();
        celebration.holidays();
        celebration.traditions();
        if(celebration instanceof Ugadi){
            System.out.println("Celebration is instance of Ugadi");
        }
    }
}
