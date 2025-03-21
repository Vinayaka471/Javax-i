package com.xworkz.demo1;

public class Brush {
    enum BrushColor {
        WHITE, BLACK, BROWN
    }
    BrushColor color;

    Brush(BrushColor color) {
        this.color = color;
    }

    void clean() {
        System.out.println("Cleaning with a " + color + " brush.");
    }

    void scrub() {
        System.out.println("Scrubbing with a " + color + " brush.");
    }
}
