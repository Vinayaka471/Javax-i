package com.xworkz.juice.fiftyfold.Worker;

public class Helper {
    public void Wage(Worker worker){
        System.out.println("Wage running in Helper");
        worker.benefits();
        worker.department();
        worker.experience();
        worker.salary();
        worker.work();
        if(worker instanceof Leader){
            Leader leader=(Leader)worker;
        }
    }
}
