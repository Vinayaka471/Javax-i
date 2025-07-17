package com.xworkz.practice;

public class Student {
    String name;
    static int[] marks={50,80,42,67,95};
    char grade;

    public static String calculateAverage(){
        int sum=0;
        double average=0;
        for(int i=0;i<marks.length;i++){
            sum=sum+marks[i];
        }
        average=sum/5.0;
        System.out.println("Average= "+average+" Sum= "+sum);
        String grade=assignGrad(average);
        return grade;


    }
    public static String assignGrad(double average){
        if(average>90){
            return "A";
        }
        else if(average>=80){

            return "B";

        }
        else if(average>=70){
            return "C";
        }
        else if(average>=60){
            return "D";
        }
        else return "F";
    }

    public static void main(String[] args) {
        String s=calculateAverage();
        System.out.println("Average="+s);
    }
}

//Added Student class with static methods to calculate average and assign grade based on marks