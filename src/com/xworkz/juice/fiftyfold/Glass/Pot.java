package com.xworkz.juice.fiftyfold.Glass;

public class Pot {
    public void Hot(Glass glass){
        glass.fill();
        glass.frozen();
        glass.frozen();
        glass.milk();
        glass.water();
        if(glass instanceof Jar){
            System.out.println("Glass is instance of Jar");
            Jar jar=(Jar)glass;

    }
}
}
