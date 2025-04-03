package com.xworkz.demo1;

public class Bar {
    public String barName="Wings";
    public String barLocation="Nice Road";
    public String barManeger="Kiran";
    public String salary="30000";
    private String customerName="Kariya";
    private int totalOrder=10;
    private int totalBill=6000;
    private Boolean paidOrNot=true;

    public void ManagerInfo(){
        System.out.println("Bar name : "+this.barName);
        System.out.println("Bar Location : "+this.barLocation);
        System.out.println("Bar Manager : "+this.barManeger);
        System.out.println("Manager Salary : "+this.salary);
    }
    private void CustomerInfo(){
        System.out.println("Bar name : "+this.barName);
        System.out.println("Bar Location : "+this.barLocation);
        System.out.println("Name : "+this.customerName);
        System.out.println("Total Bill : "+this.totalBill);
        System.out.println("Bill is Paid : "+this.paidOrNot);
    }
    void ManageDetails(){
        System.out.println("Bar Manager : "+this.barManeger);
        CustomerInfo();

    }
}
