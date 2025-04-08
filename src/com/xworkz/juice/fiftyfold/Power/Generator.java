package com.xworkz.juice.fiftyfold.Power;

public class Generator {
    public void Diesel(Power power){
        System.out.println("Diesel Running in Generator");
        power.phone();
        power.cPin();
        power.plug();
        power.small();
        power.white();
        if(power instanceof Cable){
            System.out.println("Power is instance of Cable");
            Cable cable=(Cable)power;
        }
    }
}
