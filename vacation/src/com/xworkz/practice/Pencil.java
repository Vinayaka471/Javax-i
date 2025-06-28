package com.xworkz.practice;

// To print the string length  (pencil.Charger.length());

public class Pencil {
    String Charger="Tecno Spark 6 go Charger ERD(Duplicate)";

    public static void main(String[] args) {
        Pencil pencil=new Pencil();
        System.out.println(pencil.Charger.length());
    }
}

//

class Rubber{
    String rubber1="Party";
    String rubber2="Start";

    public void Erase(){
        System.out.println(rubber1+" "+rubber2);
    }

    public static void main(String[] args) {
        Rubber rub=new Rubber();
        rub.Erase();
    }
}

