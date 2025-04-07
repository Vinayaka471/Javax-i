package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.phone.Cellphone;
import com.xworkz.juice.fiftyfold.phone.Phone;
import com.xworkz.juice.fiftyfold.phone.Cellphone;

public class PhoneRunner {
    public static void main(String[] args) {
        Phone phone = new Cellphone();
        phone.call();
        phone.message();
        phone.camera();
        phone.battery();
        phone.internet();

        System.out.println("----------");
        Cellphone smartphone=new Cellphone();
        smartphone.call();
        smartphone.message();
        smartphone.camera();
        smartphone.battery();
        smartphone.internet();

    }
}
