package com.xworkz.demo1;

public class Hospital {
    public String hospitalName = "City Hospital";
    public String location = "MG Road";
    public String doctorName = "Dr. Anil";
    public String salary = "70000";
    private String patientName = "Ramesh";
    private int patientAge = 45;
    private String disease = "Fever";
    private boolean isAdmitted = true;

    public void DoctorInfo() {
        System.out.println("Hospital Name: " + this.hospitalName);
        System.out.println("Location: " + this.location);
        System.out.println("Doctor: " + this.doctorName);
        System.out.println("Salary: " + this.salary);
    }

    private void PatientInfo() {
        System.out.println("Patient Name: " + this.patientName);
        System.out.println("Age: " + this.patientAge);
        System.out.println("Disease: " + this.disease);
        System.out.println("Is Admitted: " + this.isAdmitted);
    }

    void AdmissionDetails() {
        System.out.println("Admission Details: ");
        PatientInfo();
    }
}
