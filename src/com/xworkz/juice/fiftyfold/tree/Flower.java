package com.xworkz.juice.fiftyfold.tree;

public class Flower {
    public void Fruit(Tree tree){
        System.out.println("Fruit is running in Flower");
        tree.branches();
        tree.leaves();
        tree.lifespan();
        tree.oxygen();
        tree.roots();
        if(tree instanceof Plant){
            System.out.println("Tree is instanceof Plant");
            Plant plant=(Plant)tree;
        }
    }
}
