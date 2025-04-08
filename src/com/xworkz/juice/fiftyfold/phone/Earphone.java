package com.xworkz.juice.fiftyfold.phone;

public class Earphone {
    public void Hear(Phone phone){
        System.out.println("Hear running in Earphone");
        phone.battery();
        phone.call();
        phone.camera();
        phone.message();
        phone.internet();
        if(phone instanceof Cellphone){
            System.out.println("Phone is instance of Cellphone");
            Cellphone cellphone=(Cellphone)phone;
        }
    }
}
