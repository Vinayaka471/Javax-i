

    //Simple Interest Calculator Problem.
//        Given the values of principle, rate and interest, compute the simple interest
//
//        Sample input:   P=100
//                        R=5
//                        T=2
//
//        Sample output: 1


package com.xworkz.practice;

import java.util.Scanner;

    public class Calculator {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int P=sc.nextInt();
            int R=sc.nextInt();
            int T=sc.nextInt();

//        we know the formula to calulate the simple interest
//                i.e, SI=P*T*R/100
            int SI=P*R*T/100;
            System.out.println("Simple Interest:"+SI);

        }
    }

