package com.xworkz.juice.fiftyfold.wildlife;

public class Snake {
    public void Venom(Wildlife wildlife){
        wildlife.breathe();
        wildlife.eat();
        wildlife.run();
        wildlife.sleep();
        wildlife.sound();
        if(wildlife instanceof Tiger){
            System.out.println("Wildlife is instance of Tiger");
            Tiger tiger=(Tiger)wildlife;
        }
    }
}
