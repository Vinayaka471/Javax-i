package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.prof.Engineer;
import com.xworkz.juice.fiftyfold.prof.Proffession;
import com.xworkz.juice.fiftyfold.prof.Teacher;

public class ProfessionRunner {
    public static void main(String[] args) {
        Proffession profession=new Engineer();
        profession.work();
        profession.salary();
        profession.skills();
        profession.education();

        System.out.println("-----------");
        Engineer engineer = new Engineer();
        engineer.work();
        engineer.salary();
        engineer.skills();
        engineer.education();


        System.out.println("--------------------");
        Teacher teacher=new Teacher();
        teacher.Staff(profession);
    }
}
