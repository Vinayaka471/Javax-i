class Person {
    String name;
    int age;

    
    Person(String name, int age) {
        this.name = name; 
        this.age = age;
    }


    void display() {
        System.out.println("Person: Name = " + name + ", Age = " + age);
    }
}


class Car {
    String make;
    String model;

  
    Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

   
    void display() {
        System.out.println("Car: Make = " + make + ", Model = " + model);
    }
}

class Student {
    String studentName;
    int studentID;

   
    Student(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

 
    void display() {
        System.out.println("Student: Name = " + studentName + ", ID = " + studentID);
    }
}


class Book {
    String title;
    String author;

   
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

 
    void display() {
        System.out.println("Book: Title = " + title + ", Author = " + author);
    }
}


class Employee {
    String employeeName;
    int employeeID;

   
    Employee(String employeeName, int employeeID) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
    }


    void display() {
        System.out.println("Employee: Name = " + employeeName + ", ID = " + employeeID);
    }
}


