package com.xworkz.demo1;

public class Clip {
    enum ClipColor {
        RED, BLUE, GREEN, YELLOW, BLACK
    }
    ClipColor color;

    Clip(ClipColor color) {
        this.color = color;
    }

    void hold() {
        System.out.println("Holding a " + color + " clip.");
    }
}

