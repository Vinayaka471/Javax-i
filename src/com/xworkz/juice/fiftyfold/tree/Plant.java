package com.xworkz.juice.fiftyfold.tree;

public class Plant extends Tree {
    public Plant() {
        super();
        System.out.println("Running non-arg constructor Oak");
    }
    @Override
    public void roots() {
        System.out.println("Tree has deep roots");
    }
    @Override
    public void branches() {
        System.out.println("Tree has many branches");
    }
    @Override
    public void leaves() {
        System.out.println("Tree has leaves");
    }
    @Override
    public void oxygen() {
        System.out.println("Tree produces oxygen");
    }
    @Override
    public void lifespan() {
        System.out.println("Tree has a long lifespan");
    }
}
