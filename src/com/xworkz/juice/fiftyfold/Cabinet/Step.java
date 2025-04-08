package com.xworkz.juice.fiftyfold.Cabinet;

public class Step extends Locker{
    public void One(Cabinet cabinet){
        System.out.println("One running in Step");
        cabinet.lock();
        cabinet.close();
        cabinet.handle();
        cabinet.key();
        cabinet.open();
        if(cabinet instanceof Locker){
            System.out.println("cabinet instance of Locker");
            Locker locker=(Locker)cabinet;
        }
    }
}
