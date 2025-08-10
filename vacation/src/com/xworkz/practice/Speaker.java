package com.xworkz.practice;

public class Speaker {
    public static void main(String[] args) {
        int a=64;
        int b=13;

        int y=Math.max(a,b);    // Max method
        System.out.println(y);

        double k=15.56;
        double t=0.8;
        double h=Math.min(k,t);   // Min method
        System.out.println(h);

        double u=14.4;
        double s=86.8;
        double c=Math.abs(u);    // abs=> absolute function method (It will display the absolute value of perticular one)
        System.out.println(c);


        float g= 14.1F;
        float l= 226.3F;
        float q= (float) Math.sqrt(l);
        System.out.println(l);

        double w=86.5;
        double r=15.45;
        double x=Math.sqrt(w);      //sqrt(Square root)
        System.out.println(x);

        double m=43;
        double z=31;
        double d=Math.round(m);
        System.out.println(d);

        double rat=3.14;
        double cat=-10;
        double dog=Math.ceil(rat);  //3.14 ceil to 4.0
        System.out.println(dog);


        double cow=3.14;
        double pig=-10;
        double ox=Math.floor(cow);  //3.14 floor to 3.0
        System.out.println(ox);

    }
}
