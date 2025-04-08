package com.xworkz.juice.fiftyfold.lock;

public class Gate {
    public void Enter(Key key){
        System.out.println("Enter running in Gate");
        key.big();
        key.open();
        key.close();
        key.small();
        key.white();
        if(key instanceof Seal){
            System.out.println("key is instance of Seal");
            Seal seal=(Seal)key;
        }
    }
}
