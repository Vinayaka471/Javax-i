package com.xworkz.practice;

import com.xworkz.practice.Shirt;

public class Pant {
    public Pant(){
        System.out.println("Pant Constructor Called!");
        Shirt shirt=new Shirt();

    }

    public static void main(String[] args){
        Pant pant=new Pant();

    }
}
