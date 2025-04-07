package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.lock.Key;
import com.xworkz.juice.fiftyfold.lock.Seal;

public class KeyRunner {
    public static void main(String[] args) {
        Key key=new Seal();
        key.big();
        key.close();
        key.open();
        key.white();
        key.small();

        System.out.println("-----");
        Key lock=new Seal();
        lock.big();
        lock.close();
        lock.open();
        lock.white();
        lock.small();
    }
}
