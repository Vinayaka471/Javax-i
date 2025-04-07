package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.Topic.ComputerNetworks;
import com.xworkz.juice.fiftyfold.Topic.Topic;

public class SubjectRunner {
    public static void main(String[] args) {
        Topic subject=new ComputerNetworks();
        subject.study();
        subject.exam();
        subject.difficulty();
        subject.syllabus();

        System.out.println("-----------");
        ComputerNetworks mathematics = new ComputerNetworks();
        mathematics.study();
        mathematics.exam();
        mathematics.difficulty();
        mathematics.syllabus();
    }
}
