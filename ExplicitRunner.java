
public class ExplicitRunner {
    public static void main(String[] args) {

        Person person1 = new Person("John", 30);
        Person person2 = new Person("Alice", 25);
        Person person3 = new Person("Bob", 35);
        Person person4 = new Person("Catherine", 28);
        Person person5 = new Person("David", 40);

       
        Car car1 = new Car("Toyota", "Corolla");
        Car car2 = new Car("Honda", "Civic");
        Car car3 = new Car("Ford", "Mustang");
        Car car4 = new Car("Chevrolet", "Camaro");
        Car car5 = new Car("Tesla", "Model 3");

        Student student1 = new Student("Emily", 101);
        Student student2 = new Student("Michael", 102);
        Student student3 = new Student("Sophia", 103);
        Student student4 = new Student("James", 104);
        Student student5 = new Student("Oliver", 105);

  
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("Moby Dick", "Herman Melville");
        Book book4 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book5 = new Book("Pride and Prejudice", "Jane Austen");

        Employee employee1 = new Employee("Laura", 201);
        Employee employee2 = new Employee("James", 202);
        Employee employee3 = new Employee("Robert", 203);
        Employee employee4 = new Employee("Sarah", 204);
        Employee employee5 = new Employee("Daniel", 205);

        
        person1.display();
        person2.display();
        person3.display();
        person4.display();
        person5.display();

        car1.display();
        car2.display();
        car3.display();
        car4.display();
        car5.display();

        student1.display();
        student2.display();
        student3.display();
        student4.display();
        student5.display();

        book1.display();
        book2.display();
        book3.display();
        book4.display();
        book5.display();

        employee1.display();
        employee2.display();
        employee3.display();
        employee4.display();
        employee5.display();
    }
}