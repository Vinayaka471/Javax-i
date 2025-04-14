package com.xwork.equal;

public class NopalRunner {
    public static void main(String[] args) {
        Nopal nopal1 = new Nopal("Winter", "India");
        Nopal nopal2 = new Nopal("Winter", "India");
        System.out.println(nopal1.equals(nopal2));
        System.out.println(nopal1);
        System.out.println(nopal2.hashCode());
    }
}