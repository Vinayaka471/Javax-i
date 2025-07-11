package com.xworkz.practice;

public class Butter {
    public static void main(String[] args) {
        Long towel=56960000l;
        int paper= Math.toIntExact(towel);
        System.out.println(paper);
    }
}


// Math.toIntExact():This line converts the Long value to int, but with a safety check.