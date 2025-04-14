package com.xwork.equal;

public class TatsoiRunner {
    public static void main(String[] args) {
        Tatsoi tatsoi1 = new Tatsoi("March", "Green", "Green");
        Tatsoi tatsoi2 = new Tatsoi("March", "Green", "Green");
        System.out.println(tatsoi1.equals(tatsoi2));
        System.out.println(tatsoi1);
        System.out.println(tatsoi2.hashCode());
    }
}