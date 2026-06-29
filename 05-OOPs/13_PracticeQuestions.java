// ============================================================
// TOPIC: Practice Questions — OOP Concepts Applied
// Covers: Constructor usage, overloading, copy constructor,
//         calculator class, constructor chaining,
//         getters/setters, private constructor + static methods.
// ============================================================


// In Question 1:
// Create a Book class with:
// • Fields: title, author, price
// • Two constructors:
// • No-arg constructor (set default values)
// • Parameterized constructor Then print book details.

class Book {
    private String title;
    private String author;
    private int price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0;
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class BookMain {
    public static void main(String[] args) {
        Book obj = new Book();
        obj.display();

        Book obj1 = new Book("The Sweetest Oblivion", "Mrs Cindrella", 1999);
        obj1.display();
    }
}


// Question 2:
// Create a Student class that uses constructor overloading to allow
// initialization with:
// • Only name
// • Name and roll number
// • Name, roll number, and grade

class StudentQ2 {
    private String name;
    private int roll;
    private char grade;

    public StudentQ2(String name) {
        this(name, 0);
    }

    public StudentQ2(String name, int roll) {
        this(name, roll, 'N');
    }

    public StudentQ2(String name, int roll, char grade) {
        this.name = name;
        this.roll = roll;
        this.grade = grade;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Grade: " + grade);
    }
}

class StudentQ2Main {
    public static void main(String[] args) {
        StudentQ2 obj = new StudentQ2("Vaikunth");
        obj.display();
        StudentQ2 obj1 = new StudentQ2("Vaikunth", 430);
        obj1.display();
        StudentQ2 obj2 = new StudentQ2("Vaikunth", 430, 'A');
        obj2.display();
    }
}


// Question 3:
// Write a BankAccount class with a copy constructor that
// copies an existing account's balance and account number.

class BankAccountCopy {
    private int balance;
    private int number;

    public BankAccountCopy(int balance, int number) {
        this.balance = balance;
        this.number = number;
    }

    public BankAccountCopy(BankAccountCopy original) {
        this.number = original.number;
        this.balance = original.balance;
    }

    public void display() {
        System.out.println("Account Number: " + number);
        System.out.println("Balance: " + balance);
    }
}

class BankAccountCopyMain {
    public static void main(String[] args) {
        BankAccountCopy obj = new BankAccountCopy(1000, 892342893);
        BankAccountCopy obj1 = new BankAccountCopy(obj);
        obj1.display();
    }
}


// Question 4:
// Create a Calculator class with two integer fields and a
// constructor that initializes them. Add methods to add, subtract,
// multiply and divide the numbers.

class CalculatorQ4 {
    private int a;
    private int b;

    public CalculatorQ4(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int Add() {
        return a + b;
    }

    public int Subtract() {
        return a - b;
    }

    public int Multiply() {
        return a * b;
    }

    public float Divide() {
        if (b == 0) {
            System.out.println("Can't divide by zero");
            return 0;
        } else {
            return (float) a / b;
        }
    }

    public void display(String operation, float result) {
        System.out.println(operation + " is: " + result);
    }
}

class CalculatorQ4Main {
    public static void main(String[] args) {
        CalculatorQ4 obj = new CalculatorQ4(5, 5);
        obj.display("Addition", obj.Add());
        obj.display("Subtraction", obj.Subtract());
        obj.display("Multiplication", obj.Multiply());
        obj.display("Division", obj.Divide());
    }
}


// Question 5:
// Simulate constructor chaining using this() keyword in a class.
// Demonstrate all constructor calls.

class StudentQ5 {
    private String name;
    private int roll;
    private char grade;

    public StudentQ5() {
        this("Unknown");
        System.out.println("No-argument constructor called");
    }

    public StudentQ5(String name) {
        this(name, 0);
        System.out.println("One-parameter constructor called");
    }

    public StudentQ5(String name, int roll) {
        this(name, roll, 'N');
        System.out.println("Two-parameter constructor called");
    }

    public StudentQ5(String name, int roll, char grade) {
        this.name = name;
        this.roll = roll;
        this.grade = grade;
        System.out.println("Three-parameter constructor called");
    }

    public void display() {
        System.out.println("\nStudent Details");
        System.out.println("Name : " + name);
        System.out.println("Roll : " + roll);
        System.out.println("Grade : " + grade);
    }
}

class StudentQ5Main {
    public static void main(String[] args) {
        StudentQ5 obj = new StudentQ5();
        obj.display();
    }
}


// Question 6 :
// Create a class Employee with private fields name and salary,
// and use getters/setters. Make a class with a private constructor
// and static methods. Try accessing a private method from another
// class — what error do you get?

class Employe {
    private String name;
    private int salary;

    public Employe(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary");
        }
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Company {
    private Company() {
        System.out.println("Private Constructor called.");
    }

    public static void showCompany() {
        System.out.println("Welcome to Vanvrindha!");
    }

    public void secretMethod() {
        System.out.println("Secret Method called");
    }
}

class EmployeeMain {
    public static void main(String[] args) {
        Employe emp = new Employe("Vaikunth", 50000);
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
        emp.setSalary(70000);
        System.out.println("Updated Salary: " + emp.getSalary());
        Company.showCompany();
        // ERROR:
        // Company c = new Company();
        // c.secretMethod();
    }
}


// Question 7:
// Make a class with a private constructor and static methods.

class StudentQ7 {
    private static String name;

    private StudentQ7(String name) {
        StudentQ7.name = name;
    }

    public static void displayName() {
        System.out.println("Student name is: " + name);
    }

    // DOUBT-------- // Static factory method ??
    public static StudentQ7 createStudent(String name) {
        return new StudentQ7(name);
    }
}

class StudentQ7Main {
    public static void main(String[] args) {
        //DOUBT-----
        StudentQ7 obj = StudentQ7.createStudent("Vaikunth");
        StudentQ7.displayName();
    }
}
