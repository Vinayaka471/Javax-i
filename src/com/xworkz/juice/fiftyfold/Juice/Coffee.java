package com.xworkz.juice.fiftyfold.Juice;

public class Coffee {
    public void Beans(Juice juice){
        System.out.println("Beans running in Coffee");
        juice.drink();
        juice.flavor();
        juice.refresh();
        juice.temperature();
        if(juice instanceof Tea){
            System.out.println("Juice is instance of Tea");
            Tea tea=(Tea)juice;

        }
    }
}
