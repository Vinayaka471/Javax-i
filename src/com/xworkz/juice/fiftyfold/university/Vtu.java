package com.xworkz.juice.fiftyfold.university;

public class Vtu {
    public void Engineering(University university){
        System.out.println("Engineering running in Vtu");
        university.campus();
        university.education();
        university.faculty();
        university.research();
        university.students();
        if(university instanceof Harvard){
            Harvard harvard=(Harvard)university;
        }
    }
}
