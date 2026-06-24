// ============================================================
// TOPIC: Classes and Objects
// Covers: Class definition, object creation, instance variables,
//         default values of data types, and field initialization.
// ============================================================


// Default values of all data types when declared as instance variables
public class Main {
    int rollNo;
    String name;
    boolean present;
    char ch;
    Character grade;
    Integer marks;
    byte by;
    float f;
    double d;

    public static void main(String[] args) {
        Main obj = new Main(); //object Creation
        System.out.println("Default value of int is: " + obj.rollNo);
        System.out.println("Default value of String is: " + obj.name);
        System.out.println("Default value of boolean is: " + obj.present);
        System.out.println("Default value of char is: " + obj.ch);
        System.out.println("Default value of Character is: " + obj.grade);
        System.out.println("Default value of Integer is: " + obj.marks);
        System.out.println("Default value of byte is: " + obj.by);
        System.out.println("Default value of float is: " + obj.f);
        System.out.println("Default value of double is: " + obj.d);
    }
}


// Assigning values directly to instance variables (inline initialization)
class MainWithValues {
    int rollNo = 9;
    String name = "Amit";
    boolean present = true;
    char ch = 'A';
    Character grade = 'A';
    Integer marks = 897;
    byte by = 8;
    float f = 67.1F;
    double d = 56.8765;

    public static void main(String[] args) {
        MainWithValues obj = new MainWithValues();
        System.out.println("Default value of int is: " + obj.rollNo);
        System.out.println("Default value of String is: " + obj.name);
        System.out.println("Default value of boolean is: " + obj.present);
        System.out.println("Default value of char is: " + obj.ch);
        System.out.println("Default value of Character is: " + obj.grade);
        System.out.println("Default value of Integer is: " + obj.marks);
        System.out.println("Default value of byte is: " + obj.by);
        System.out.println("Default value of float is: " + obj.f);
        System.out.println("Default value of double is: " + obj.d);
    }
}
