package com.xworkz.practice;
import java.util.Scanner;

public class Bottle {
    public static void main(String[] args) {
//        System.out.println("End of the Internship in X-WORKZ June 17th");

//        Find the number is even or odd using Ternary method

        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String ans = num % 2 == 0 ? "Even" : "Odd";  // ? tag repleaces a if-else block
        System.out.println(ans);
    }
}

// Ternary Operator is the condensed form of If else condition