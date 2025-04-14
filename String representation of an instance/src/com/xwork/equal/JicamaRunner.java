package com.xwork.equal;

public class JicamaRunner {
    public static void main(String[] args) {
        Jicama jicama1 = new Jicama("Winter", "15");
        Jicama jicama2 = new Jicama("Winter", "15");
        System.out.println(jicama1.equals(jicama2));
        System.out.println(jicama1);
        System.out.println(jicama2.hashCode());
    }
}