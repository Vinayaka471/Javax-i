package com.xworkz.juice.fiftyfold.Nation;

public class America {
    public void Captain(Nation nation){
        System.out.println("Captian running in America");
        nation.culture();
        nation.economy();
        nation.government();
        nation.name();
        nation.population();
        if(nation instanceof Japan){
            System.out.println("Nation is instance of Japan");
            Japan japan=(Japan)nation;
        }
    }
}
