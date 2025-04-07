package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.Money.Money;
import com.xworkz.juice.fiftyfold.Money.Rupee;

public class CurrRunner {
    public static void main(String[] args) {
        Money currency=new Rupee();
        currency.value();
        currency.exchangeRate();
        currency.symbol();
        currency.usage();

        System.out.println("-----------");
        Rupee dollar = new Rupee();
        dollar.value();
        dollar.exchangeRate();
        dollar.symbol();
        dollar.usage();
    }
}
