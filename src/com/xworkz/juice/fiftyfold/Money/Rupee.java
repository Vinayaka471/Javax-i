package com.xworkz.juice.fiftyfold.Money;

public class Rupee extends Money{
    public Rupee() {
        super();
        System.out.println("Running non-arg constructor of Dollar");
    }
    @Override
    public void value() {
        System.out.println("Money has monetary value");
    }
    public void exchangeRate() {
        System.out.println("Money has an exchange rate");
    }
    public void symbol() {
        System.out.println("Money has a unique symbol");
    }
    public void usage() {
        System.out.println("Money is used for trade and transactions");
    }
}
