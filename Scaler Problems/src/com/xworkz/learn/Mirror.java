package com.xworkz.learn;

import java.util.Scanner;

public class Mirror {
    public static void main(String[] args) {
        // print the numbers from 1 to 10 by using for loop

        // for(initialization;condition;update){
    // }
//        int i;
//        for(i=1;i<=10;i++){
//            System.out.println(i);
//        }

        // finding the largest numbers
        System.out.println("Enter the number of integer: ");
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        System.out.println("Enter the numbers: ");

        int maxValue=Integer.MIN_VALUE;  // lowest value like -infinity

    for(int i=1;i<=n;i++) {
        int current = sc.nextInt();

        maxValue = Math.max(current, maxValue);

    }
        System.out.println("Maxvalue :"+maxValue);
    }
    }

