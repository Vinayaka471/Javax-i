package com.xworkz.practice;

public class Bus {
    String name;
    Long price;
    String color;
    int weight;
    String bus_stop;

    public Bus(String n,Long p,String c,int w,String b_s){
        name=n;
        price=p;
        color=c;
        weight=w;
        bus_stop=b_s;
    }
    public void Run(){
        System.out.println("Bus Details: ");
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
        System.out.println("Color: "+color);
        System.out.println("Weight: "+weight);
        System.out.println("Bus Stop: "+bus_stop);
        System.out.println("========================");
    }

    public static void main(String[] args) {
        Bus bus1=new Bus("Sri Jyothi",2500000L,"White",13000,"Konanduru");
        Bus bus2=new Bus("Roshan Travels",1500000L,"Blue",10000,"Ripponpet");
        Bus bus3=new Bus("Durgamba",160000L,"Orange",14000,"Kundapura");
        Bus bus4=new Bus("Sri Gajanana",120000L,"White&Blue",12000,"Sagara");

        bus1.Run();
        bus2.Run();
        bus3.Run();
        bus4.Run();


    }
}


//Implement Bus class with parameterized constructor and object display functionality