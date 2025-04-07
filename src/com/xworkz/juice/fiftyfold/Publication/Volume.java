package com.xworkz.juice.fiftyfold.Publication;

public class Volume extends Publication {
    public Volume() {
        super();
        System.out.println("Running non-arg constructor Novel");
    }
    @Override
    public void read() {
        System.out.println("Publication is read");
    }
    @Override
    public void write() {
        System.out.println("Publication is written by an author");
    }
    @Override
    public void publish() {
        System.out.println("Publication is published");
    }
    @Override
    public void genre() {
        System.out.println("Publication has a genre");
    }
    @Override
    public void pages() {
        System.out.println("Publication has pages");
    }
}
