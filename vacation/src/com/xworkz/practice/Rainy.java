package com.xworkz.practice;
import java.util.Scanner;

public class Rainy {
    public static void main(String[] args) {
//        String weather="Rainy";
//
//        if(weather=="Summer"){
//            System.out.println("It is a Summer");
//        } else if (weather=="Spring") {
//            System.out.println("It is a Spring");
//        }
//        else{
//            System.out.println("It is a Rainy");
//        }

        System.out.println("Enter your number: ");
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();


        if(b>0){
            System.out.println("It is a positive number");
        }
        else if(b<0){
            System.out.println("It is a negative number");
        }
        else{
            System.out.println("It is a zero");
        }

    }
}
