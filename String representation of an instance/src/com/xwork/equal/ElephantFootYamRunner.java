package com.xwork.equal;

public class ElephantFootYamRunner {
    public static void main(String[] args) {
        ElephantFootYam elephantfootyam1 = new ElephantFootYam("March", "Soft");
        ElephantFootYam elephantfootyam2 = new ElephantFootYam("March", "Soft");
        System.out.println(elephantfootyam1.equals(elephantfootyam2));
        System.out.println(elephantfootyam1);
        System.out.println(elephantfootyam2.hashCode());
    }
}