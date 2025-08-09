package com.xworkz.practice;

public class Torch {
    public static void main(String[] args){
        String V="India";
        String H="Karnataka";
        String temp;

        temp=V;
        V=H;
        H=temp;


        System.out.println("V :"+V);
        System.out.println("H :"+H);
    }
}
