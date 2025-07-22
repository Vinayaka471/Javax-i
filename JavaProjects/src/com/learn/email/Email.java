package com.learn.email;
import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity=500;
    private int defaultPasswordLength = 10; // ✅ Initialized
    private String alternateEmail;
    private String companySuffix = "aeycomapany.com";

    // Constructor
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

       

        // Ask for department
        this.department = setDepartment();

        
        // Generate random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("\nYour Password is: " + this.password);
        
        // Combine elements to generate email
        email=firstName.toLowerCase()+ "." + lastName.toLowerCase() + "@" +department +"."+ companySuffix;
        System.out.println("\nYour email is: "+ email);
    }

    // Ask for department
    private String setDepartment() {
        System.out.print("\nNew worker:" + firstName + ". Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter Department Code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();

        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "acct";
        } else {
            return "";
        }
    }

    // ✅ This method is now outside of setDepartment
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    
    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
    	this.mailboxCapacity = capacity;
    }
    
    // Set alternate email
    public void setAlternateEmail(String altEmail) {
    	this.alternateEmail = altEmail;
    }
    
    //Change password
    public void changePassword(String password) {
    	this.password = password;
    }
    
    public int getMailboxCapacity() { return mailboxCapacity; }
    
    public String getAlternateEmail() {return alternateEmail; }
    
    public String getPassword() { return password; }
    
    
    public String showInfo() {
    	return "\nDISPLAY NAME: " + firstName +" " +lastName +
    			"\n\nCOMPANY EMAIL: " +  email +
    			"\n\nMailbox Capacity: " + mailboxCapacity + "mb";
    }
}
