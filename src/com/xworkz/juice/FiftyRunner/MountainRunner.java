package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.Peak.Everest;
import com.xworkz.juice.fiftyfold.Peak.Kailash;
import com.xworkz.juice.fiftyfold.Peak.Peak;

public class MountainRunner {
    public static void main(String[] args) {
        Peak mountain = new Everest();
        mountain.height();
        mountain.climate();
        mountain.location();
        mountain.trekking();
        mountain.wildlife();

        System.out.println("-----------");

        Everest everest = new Everest();
        everest.height();
        everest.climate();
        everest.location();
        everest.trekking();
        everest.wildlife();


        System.out.println("-------------------");
        Kailash kailash=new Kailash();
        kailash.Snow(mountain);
    }
}
