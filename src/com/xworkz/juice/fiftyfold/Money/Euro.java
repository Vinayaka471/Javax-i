package com.xworkz.juice.fiftyfold.Money;

public class Euro {
    public void Paisa(Money money){
        System.out.println("Paisa running in Euro");
        money.exchangeRate();
        money.symbol();
        money.usage();
        money.value();
        if(money instanceof Rupee){
            System.out.println("Money instance of Rupee");
            Rupee rupee=(Rupee)money;
        }
    }
}
