package com.xworkz.juice.fiftyfold.currency;

public class Coin {
    public void Change(Currency currency){
        System.out.println("Change running in Currency");
        currency.move();
        currency.fuel();
        currency.speed();
        currency.stop();
        currency.transport();
        if(currency instanceof Dollar){
            System.out.println("Currency instance of Dollar");
            Dollar dollar=(Dollar)currency;
        }
    }
}
