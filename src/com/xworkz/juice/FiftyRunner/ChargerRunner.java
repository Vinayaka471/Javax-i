package com.xworkz.juice.FiftyRunner;


import com.xworkz.juice.fiftyfold.Power.Power;
import com.xworkz.juice.fiftyfold.Power.Cable;

public class ChargerRunner {
    public static void main(String[] args) {
        Power charger=new Cable();
        charger.cPin();
        charger.phone();
        charger.plug();
        charger.small();
        charger.white();

        System.out.println("---------");
        Cable wire=new Cable();
        wire.cPin();
        wire.plug();
        wire.phone();
        wire.small();
        wire.white();

    }

}
