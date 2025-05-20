package com.xworkz.practice;

public class Switch {
    public static void main(String[] args){
        int a=5;
        int b=10;
        System.out.println(a++ + ++b);
    }
}

//a++
//This is post-increment.
//
//It uses the current value of a (5) first, then increments a to 6.

//++b
//This is pre-increment.

//It first increments b from 10 to 11, then uses the new value (11).


// a becomes 6
// b becomes 11
