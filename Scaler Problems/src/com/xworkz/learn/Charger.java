package com.xworkz.learn;

import java.util.Scanner;

public class Charger {
    public static void main(String[] args) {
        // I need to give integer N and count and print it's number

        System.out.println("Enter the integers: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit =0;

        while (num > 0) {
//           num=num/10;
            num /= 10;
            digit++;
        }
        System.out.println(digit);
    }
}
