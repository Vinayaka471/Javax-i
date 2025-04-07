package com.xworkz.juice.fiftyfold.Topic;

public class ComputerNetworks extends Topic {
    public ComputerNetworks() {
        super();
        System.out.println("Running non-arg constructor of Mathematics");
    }
    @Override
    public void study() {
        System.out.println("Subject requires study");
    }
    public void exam() {
        System.out.println("Subject is tested in exams");
    }
    public void difficulty() {
        System.out.println("Subject can be difficult");
    }
    public void syllabus() {
        System.out.println("Subject has a syllabus");
    }
}
