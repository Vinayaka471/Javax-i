package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.Topic.ComputerNetworks;
import com.xworkz.juice.fiftyfold.Topic.Subject;
import com.xworkz.juice.fiftyfold.Topic.Topic;

public class SubjectRunner {
    public static void main(String[] args) {
        Topic module=new ComputerNetworks();
        module.study();
        module.exam();
        module.difficulty();
        module.syllabus();

        System.out.println("-----------");
        ComputerNetworks mathematics = new ComputerNetworks();
        mathematics.study();
        mathematics.exam();
        mathematics.difficulty();
        mathematics.syllabus();


        System.out.println("---------------------");
        Subject subject=new Subject();
        subject.Mathematics(module);
    }
}
