package com.xworkz.practice;

public class Tablet {
    public static void main(String[] args) {
        int n=10;
        int a=0;
        int b=1;
        System.out.println("Fibonacci Series: "+a+" "+b+" ");
        for(int i=2;i<n;i++) {
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;


        }


    }
}
