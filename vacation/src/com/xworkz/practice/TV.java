package com.xworkz.practice;

public class TV {
    public void Display(){
        System.out.println("No argument constructor print in TV class");
    }
}

 class Remote{
    public static void main(String[] args) {
        TV tv=new TV();
        tv.Display();
    }

}
