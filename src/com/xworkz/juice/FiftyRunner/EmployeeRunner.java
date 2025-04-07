package com.xworkz.juice.FiftyRunner;


import com.xworkz.juice.fiftyfold.Worker.Worker;
import com.xworkz.juice.fiftyfold.Worker.Leader;

public class EmployeeRunner {
    public static void main(String[] args) {
        Worker emp = new Leader();
        emp.work();
        emp.salary();
        emp.benefits();
        emp.experience();
        emp.department();

        System.out.println("-------------------");
        Leader manager=new Leader();
        manager.work();
        manager.salary();
        manager.benefits();
        manager.experience();
        manager.department();

    }
}
