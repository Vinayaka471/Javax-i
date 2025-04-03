package com.xworkz.demo1;

public class Hotel {
    public String hotelname="Taj";
    public String branch="Banglore";
    public String manegername="Karthik";
    private int Roomno=18;
    private String personname="Virat";
    private int managerCommision=10000;
    int price=120000;

    public void managerDetail() {
        System.out.println("<<<<<<<<<<<<<Inforamation of manager>>>>>>>>>>>>>>");
        System.out.println("Hotel Name : " + this.hotelname);
        System.out.println("Hotel Branch : " + this.branch);
        System.out.println("Maneger Name : " + this.manegername);
        System.out.println("Manager Commision : " + this.managerCommision);


    }
    void manager() {
        System.out.println("Hotel Name : " + this.hotelname);
        System.out.println("Hotel Branch : " + this.branch);
        System.out.println("Customer name : " + this.personname);
        System.out.println("Reqired Room : " + this.Roomno);
        System.out.println("Price of the hotel room : " + this.price);
        System.out.println("Manager Commision : " + this.managerCommision);
        Customer();
    }
    private void Customer(){
        System.out.println("<<<<<<<<<<<<<Inforamation For Customer>>>>>>>>>>>>>>");
        System.out.println("Name : " + this.personname);
        System.out.println("Room No : " + this.Roomno);
        System.out.println("Paid to Room : "+this.price);

    }

    void Cleaner(){
        System.out.println("<<<<<<<<<<<<<Details for cleaner>>>>>>>>>>>>>>");
        System.out.println("On Duty in : "+this.hotelname);
        System.out.println("Reqired room to clean : "+this.Roomno);
    }
}
