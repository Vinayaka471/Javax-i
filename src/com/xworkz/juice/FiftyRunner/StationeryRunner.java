package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.stationery.Pen;
import com.xworkz.juice.fiftyfold.stationery.Report;
import com.xworkz.juice.fiftyfold.stationery.Stationery;

public class StationeryRunner {
    public static void main(String[] args) {
        Stationery stationery=new Pen();
        stationery.write();
        stationery.erase();
        stationery.color();
        stationery.size();

        System.out.println("-----------");
        Pen pen = new Pen();
        pen.write();
        pen.erase();
        pen.color();
        pen.size();


        System.out.println("---------------");
        Report report=new Report();
        report.Pages(stationery);
    }
}
