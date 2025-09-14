package com.xworkz.learn;

public class Chair {
    public static void main(String[] args) {
        int age=40;
        boolean male=false;
        if(male)
            if(age<20){
                System.out.println("Boy");
            }
        else{
                System.out.println("Man");
            }
        else
            if(age<20){
            System.out.println("Girl");
        }
        else{
            System.out.println("Woman");
        }
        }
    }

