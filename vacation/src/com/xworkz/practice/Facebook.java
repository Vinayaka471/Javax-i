package com.xworkz.practice;
import java.util.Scanner;

public class Facebook {
    public static void main(String[] args) {
//        System.out.println("It's done");
//        System.out.println("I am waiting,,,,,,");
        // Printing statement

        System.out.println("Enter Your Number: ");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        if(k % 2==0){               // Modulus(Remainder %)
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The number is Odd");
        }
    }
}   // Checking whether the number is Even or Odd
