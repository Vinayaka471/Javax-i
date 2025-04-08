package com.xworkz.juice.fiftyfold.prof;

public class Teacher {
    public void Staff(Proffession proffession){
        System.out.println("Staff running in Teacher");
        proffession.education();
        proffession.salary();
        proffession.skills();
        proffession.work();
        if(proffession instanceof Engineer){
            System.out.println("Proffession is instance of Engineer");
            Engineer engineer=(Engineer)proffession;
        }
    }
}
