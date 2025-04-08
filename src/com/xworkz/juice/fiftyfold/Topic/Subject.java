package com.xworkz.juice.fiftyfold.Topic;

public class Subject {
    public void Mathematics(Topic topic){
        topic.difficulty();
        topic.exam();
        topic.study();
        topic.syllabus();
        if(topic instanceof ComputerNetworks){
            System.out.println("Topic is instanceof ComputerNetworks");
            ComputerNetworks computerNetworks=(ComputerNetworks)topic;
        }
    }
}
