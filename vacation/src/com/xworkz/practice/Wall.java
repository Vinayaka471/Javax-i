package com.xworkz.practice;


import java.util.Scanner;

public class Wall {
    public static void main(String[] args) {

        double u;
        double v;
        double w;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the U value: ");
        u=sc.nextDouble();
        System.out.println("Enter the V value: ");
        v=sc.nextDouble();

        w=Math.sqrt((u*u)+(v*v));  //formula to find the hypotenuse
        System.out.println("The hypotenuse is: "+w);

        sc.close();
    }

}

