package com.xworkz.practice;

import java.util.Scanner;

public class Chicken {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        while(sc.hasNext()){
            System.out.println(i++ +" " +sc.nextLine());
        }
    }
}


//hasNext(): hasNext() means "Is there more?"
// In scanner we use hasNext() means "Is there more?"
//🔹 Returns:
//        true → if there is another token.
//
//        false → if the input is exhausted (EOF reached).