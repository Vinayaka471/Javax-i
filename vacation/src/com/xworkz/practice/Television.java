package com.xworkz.practice;

public class Television {
    String name;
    int age;

    public Television(String n,int a) {
        name = n;
        age = a;
    }

    public void display(){
        System.out.println("Name: "+name);
            System.out.println("Age: "+age);

    }

    public static void main(String[] args) {
        Television t1=new Television("Vinayaka",23);
        Television t2=new Television("Ravi",24);
        t1.display();
        t2.display();
    }
}

//Implement Television class with parameterized constructor and object display functionality