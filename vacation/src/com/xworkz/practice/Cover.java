package com.xworkz.practice;

public class Cover {
    public static void main(String[] args) {
        String subject="Kannada";

        switch(subject){
            case "science":
                System.out.println("This is Science subject");
                break;
            case "Social":
                System.out.println("This is Social subject");
                break;
            case "Mathematics":
                System.out.println("This is Mathematics subject");
                break;
            case "Economics":
                System.out.println("This is Economics subject");
                break;
            default:
                System.out.println("This is not a subject");
        }
    }
}
