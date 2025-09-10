package com.xworkz.learn;
import java.util.Scanner;

public class Tyre {
    public static void main(String[] args) {
        System.out.println("Enter the Numbers: "+"a: "+"b: "+"c ");
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a: ");
        int a=sc.nextInt();

        System.out.println("Enter b: ");
        int b=sc.nextInt();

        System.out.println("Enter c: ");
        int c=sc.nextInt();

        if(a==b && b==c){
            System.out.println("Equilateral triangle");
        }
        else if (a==b || b==c || c==a) {
            System.out.println("It is a Isosceles triangle");

        }
        else{
            System.out.println("It is Scalene triangle");
        }

    }
}
