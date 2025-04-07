package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.university.Harvard;
import com.xworkz.juice.fiftyfold.university.University;

public class UniversityRunner {
    public static void main(String[] args) {
        University university = new Harvard();
        university.education();
        university.research();
        university.students();
        university.faculty();
        university.campus();

        System.out.println("-----------");

        Harvard harvard = new Harvard();
        harvard.education();
        harvard.research();
        harvard.students();
        harvard.faculty();
        harvard.campus();
    }
}
