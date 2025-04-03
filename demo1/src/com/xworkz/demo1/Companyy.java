package com.xworkz.demo1;

public class Companyy {
    public String companyyName = "Tech Solutions";
    public String location = "Electronic City";
    public String ceo = "Mr. Rajesh";
    public String salary = "1,20,000";
    private String employeeName = "Vikram";
    private String designation = "Software Engineer";
    int experience = 5;
    boolean isPermanent = true;

    public void CEOInfo() {
        System.out.println("Companyy Name: " + this.companyyName);
        System.out.println("Location: " + this.location);
        System.out.println("CEO: " + this.ceo);
        System.out.println("Salary: " + this.salary);
    }

    private void EmployeeInfo() {
        System.out.println("Employee Name: " + this.employeeName);
        System.out.println("Designation: " + this.designation);
        System.out.println("Experience: " + this.experience);
        System.out.println("Permanent: " + this.isPermanent);
    }

    void EmployeeDetails() {
        System.out.println("Employee Details: ");
        EmployeeInfo();
    }
}
