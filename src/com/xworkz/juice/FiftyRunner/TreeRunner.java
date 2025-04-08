package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.tree.*;
import com.xworkz.juice.fiftyfold.tree.Tree;

public class TreeRunner {
    public static void main(String[] args) {
        Tree tree = new Plant();
        tree.roots();
        tree.branches();
        tree.leaves();
        tree.oxygen();
        tree.lifespan();

        System.out.println("-----------");

        Plant oak = new Plant();
        oak.roots();
        oak.branches();
        oak.leaves();
        oak.oxygen();
        oak.lifespan();


        System.out.println("----------------");
        Flower flower=new Flower();
        flower.Fruit(tree);
    }
}
