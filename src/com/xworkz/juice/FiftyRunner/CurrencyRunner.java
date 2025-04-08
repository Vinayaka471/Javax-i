package com.xworkz.juice.FiftyRunner;


import com.xworkz.juice.fiftyfold.Money.Euro;
import com.xworkz.juice.fiftyfold.Money.Money;
import com.xworkz.juice.fiftyfold.Money.Rupee;
import com.xworkz.juice.fiftyfold.currency.Coin;

public class CurrencyRunner {
    public static void main(String[] args) {
        Money currency = new Rupee();
        currency.value();
        currency.exchangeRate();
        currency.symbol();

        System.out.println("-----------");

        Rupee dollar = new Rupee();
        dollar.value();
        dollar.exchangeRate();
        dollar.symbol();


        System.out.println("----------------");
        Euro euro=new Euro();
        euro.Paisa(currency);
    }
}
