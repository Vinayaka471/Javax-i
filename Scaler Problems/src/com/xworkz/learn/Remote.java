package com.xworkz.learn;

public class Remote {
    public static void main(String[] args) {
//        int age=25;
//        String citizenship="Indian";
//        if(age>=18 & citizenship=="Indian"){
//            System.out.println("The person can vote");
//        }
//        else {
//            System.out.println("The person cannot vote"); // Logical And (&)
//        }


        int age=14;
        String citizenship="Indian";
        if(age>=18 && citizenship=="Indian"){
            System.out.println("The person can vote");
        }
        else{
            System.out.println("The person cannot vote"); // Logical Short Circuit And(&&): Only evaluates the second expression if the first expression yields true.
        }
    }
}
