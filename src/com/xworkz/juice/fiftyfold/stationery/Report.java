package com.xworkz.juice.fiftyfold.stationery;

public class Report {
    public void Pages(Stationery stationery){
        System.out.println("Pages in Report");
        stationery.color();
        stationery.erase();
        stationery.size();
        stationery.write();
        if(stationery instanceof Pen){
            Pen pen=(Pen)stationery;
        }
    }
}
