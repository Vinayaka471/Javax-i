package com.xworkz.practice;
import java.util.Scanner;

public class Terminator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);



        System.out.println("Enter Your Name: ");
        String name=sc.nextLine();

        System.out.println("Enter Your Age: ");
        int age=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Your Favorite App: ");
        String app=sc.nextLine();

        System.out.println("User Details: ");
        System.out.println("Your name is: "+name);
        System.out.println("====================");
        System.out.println("Your age is: "+age);
        System.out.println("==================");
        System.out.println("Your favorite app is: "+app);

    }
}
