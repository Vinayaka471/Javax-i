package com.xworkz.learn;

import java.util.Scanner;
import java.util.*;

public class Xtreme {
    public static void main(String[] args) {

//        Finding the character whether it is a Vowel or Consonant
        System.out.println("Enter The Character: ");
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("The entered character is Vowel");
        } else if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
            System.out.println("The entered character is Vowel");
        }
        else{
            System.out.println("The entered character is Consonant");
        }
    }
}
