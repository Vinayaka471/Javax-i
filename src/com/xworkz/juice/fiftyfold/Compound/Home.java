package com.xworkz.juice.fiftyfold.Compound;

public class Home extends Compound{
    public Home() {
        super();
        System.out.println("running non-arg cont Home");
        }
        @Override
        public void shelter() {
            System.out.println("Compound provides shelter");
        }
        @Override
        public void structure() {
            System.out.println("Compound has a structure");
        }
        @Override
        public void floors() {
            System.out.println("Compound has floors");
        }
        @Override
        public void foundation() {
            System.out.println("Compound has a foundation");
        }
    }
