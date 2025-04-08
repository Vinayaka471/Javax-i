package com.xworkz.juice.fiftyfold.Lender;

public class Canara {
    public void Loan(Lender lender){
        System.out.println("Loan running in Canara");
        lender.atm();
        lender.loan();
        lender.deposit();
        lender.interest();
        lender.withdraw();
        if(lender instanceof SBI){
            System.out.println("Lender instance of SBI");
            SBI sbi=(SBI) lender;

        }
    }
}
