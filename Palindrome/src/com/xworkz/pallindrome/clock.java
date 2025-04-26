package com.xworkz.pallindrome;

import java.util.Scanner;

public class clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String:");
        String original = scanner.nextLine();

        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);

        }
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println(original + ":it is a palindrome.");
        } else {
            System.out.println(original + ":it is not a plaindrome.");
        }
        scanner.close();
    }
    }

