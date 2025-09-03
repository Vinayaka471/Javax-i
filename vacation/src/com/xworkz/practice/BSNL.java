package com.xworkz.practice;
import java.util.Scanner;

public class BSNL {
    public static void main(String[] args) {
        // System.out.println("BSNL: Barath Sanchar Nigam Limited");

        System.out.println("Enter the Character: ");
        Scanner sc=new Scanner(System.in);

        char ch= sc.next().charAt(0);
        switch (ch){
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}
