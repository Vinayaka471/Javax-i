package com.xworkz.demo1;

public class ExperienceDetail {
    String role;
    String project;
    int duration;
    Company company;
    Education[] education;

    public ExperienceDetail(String role, String project, int duration, Company company, Education[] education) {
        this.role = role;
        this.project = project;
        this.duration = duration;
        this.company = company;
        this.education = education;
    }

    public void display() {
        System.out.println("          Experience Detail: Role: " + role + ", Project: " + project + ", Duration: " + duration + " months");
        company.display();
        for (Education edu : education) {
            edu.display();
        }
    }
}
