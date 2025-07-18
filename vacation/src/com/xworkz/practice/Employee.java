package com.xworkz.practice;
import java.util.*;

public class Employee {
    String name;
    int id;
    double salary;

    public double calculateBonus(){
        double bonus= salary*0.10;
        return bonus;
    }
    public void displayDetails(double bonus){
        System.out.println("name: "+name);
        System.out.println("id "+id);
        System.out.println("bonus"+bonus);
    }

    public  void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        name=sc.next();
        id=sc.nextInt();
        salary=sc.nextDouble();
        double bonus=calculateBonus();
        displayDetails(bonus);

    }


}

// Employee Salary and Bonus Calculation.