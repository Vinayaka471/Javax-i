package com.xworkz.demo1;

public class School {
    public String schoolName = "Greenwood High";
    public String location = "Indiranagar";
    public String principal = "Mrs. Kavita";
    public String salary = "50000";
    private String studentName = "Ananya";
    private int grade = 10;
    int marks = 450;
    boolean passed = true;

    public void PrincipalInfo() {
        System.out.println("School Name: " + this.schoolName);
        System.out.println("Location: " + this.location);
        System.out.println("Principal: " + this.principal);
        System.out.println("Salary: " + this.salary);
    }

    private void StudentInfo() {
        System.out.println("Student Name: " + this.studentName);
        System.out.println("Grade: " + this.grade);
        System.out.println("Marks: " + this.marks);
        System.out.println("Passed: " + this.passed);
    }

    void ExamDetails() {
        System.out.println("Exam Details: ");
        StudentInfo();
    }
}

