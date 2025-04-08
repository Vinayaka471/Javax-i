package com.xworkz.juice.fiftyfold.shape;

public class Rectangle {
    public void Triangle(Shape shape){
        System.out.println("Triangle running for Rectangle");
        shape.area();
        shape.color();
        shape.dimension();
        shape.draw();
        shape.perimeter();
        if(shape instanceof Circle){
            System.out.println("Shape is instance of Circke");
            Circle circle=(Circle)shape;


        }
    }
}
