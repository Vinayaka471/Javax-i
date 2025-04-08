package com.xworkz.juice.fiftyfold.Area;

    public class Btm {
        public void Traffic(Area area){
            System.out.println("Traffic running in Btm");
            area.population();
            area.infrastructure();
            area.tourism();
            area.culture();
            area.economy();
            if(area instanceof Rajajinagara){
                System.out.println("Area is instance of Rajajinagara");
                Rajajinagara rajajinagara=(Rajajinagara)area;
            }
        }

    }
