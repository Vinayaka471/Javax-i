package com.xworkz.learn;

import java.util.Scanner;

public class Charger {
   public static void main(String[] args) {
      // I need to give integer N and count and print it's number
        System.out.println("Enter the integers: ");
       Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit =1;

       while (num > 0) {
           num=num/10;
           num /= 10;
           digit++;
       }
       System.out.println(digit);
   }
}

//        int i = 1;
//        while (i <= 5) {
//            System.out.println(i);
//            i++;
//        }
//    }
//}                       Printing numbers from 1 to 5 by using while loop.