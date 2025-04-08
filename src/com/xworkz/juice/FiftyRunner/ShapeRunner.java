package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.shape.Circle;
import com.xworkz.juice.fiftyfold.shape.Rectangle;
import com.xworkz.juice.fiftyfold.shape.Shape;

public class ShapeRunner {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
        shape.area();
        shape.perimeter();
        shape.color();
        shape.dimension();

        System.out.println("------------------");
        Circle circle=new Circle();
        circle.draw();
        circle.area();
        circle.perimeter();
        circle.color();
        circle.dimension();


        System.out.println("---------------");
        Rectangle rectangle=new Rectangle();
        rectangle.Triangle(shape);
    }
}
