package com.xworkz.juice.fiftyfold.Peak;

public class Kailash {
    public void Snow(Peak peak){
        System.out.println("Snow running Kailash");
        peak.climate();
        peak.height();
        peak.location();
        peak.trekking();
        peak.wildlife();
        if(peak instanceof Everest){
            System.out.println("Peak is instance of Everest");
            Everest everest=(Everest)peak;
        }
    }
}
