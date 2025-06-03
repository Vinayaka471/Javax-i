package com.xworkz.practice;

import java.util.Scanner;

public class Mat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        if(x>0){
            System.out.println("It is positive");
        }
        else if(x<0){
            System.out.println("It is a negative");
        }
    }
}


