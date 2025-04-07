package com.xworkz.juice.FiftyRunner;


import com.xworkz.juice.fiftyfold.Lender.*;

public class BankRunner {
    public static void main(String[] args) {
        Lender bank = new SBI();
        bank.deposit();
        bank.withdraw();
        bank.loan();
        bank.interest();
        bank.atm();

        System.out.println("---------------");
        SBI hdfcBank=new SBI();
        hdfcBank.deposit();
        hdfcBank.withdraw();
        hdfcBank.loan();
        hdfcBank.interest();
        hdfcBank.atm();

    }
}
