public class Implicit{
class Person {
    String name;
    int age;



    
    void display() {
        System.out.println("Person: Name = " + name + ", Age = " + age);
    }
}


class Car {
    String make;
    String model;

   

   
    void display() {
        System.out.println("Car: Make = " + make + ", Model = " + model);
    }
}

class Student {
    String studentName;
    int studentID;



   
    void display() {
        System.out.println("Student: Name = " + studentName + ", ID = " + studentID);
    }
}


class Book {
    String title;
    String author;

    
    void display() {
        System.out.println("Book: Title = " + title + ", Author = " + author);
    }
}


class Employee {
    String employeeName;
    int employeeID;

    

    void display() {
        System.out.println("Employee: Name = " + employeeName + ", ID = " + employeeID);
    }
}
}
