package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.tree.*;
import com.xworkz.juice.fiftyfold.tree.Tree;

public class TreeRunner {
    public static void main(String[] args) {
        Tree tree = new plant();
        tree.roots();
        tree.branches();
        tree.leaves();
        tree.oxygen();
        tree.lifespan();

        System.out.println("-----------");

        plant oak = new plant();
        oak.roots();
        oak.branches();
        oak.leaves();
        oak.oxygen();
        oak.lifespan();
    }
}
