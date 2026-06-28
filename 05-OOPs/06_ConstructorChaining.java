// ============================================================
// TOPIC: Constructor Chaining
// Covers: Using this() to call one constructor from another,
//         execution order, chaining with multiple constructors.
// ============================================================


//constructor Chaining
class StudentChaining {
    int roll;
    String name;
    String address;

    StudentChaining() {
        this(1);
        System.out.println("No args constructor got called");
    }

    StudentChaining(int roll) {
        this(2, "Amit");
        this.roll = roll;
        System.out.println("1 parameter constructor got called");
    }

    StudentChaining(int roll, String name) {
        this.roll = roll;
        this.name = name;
        System.out.println("2 parameter constructor got called");
    }

    public void display() {
        System.out.println("Roll number is: " + roll);
        System.out.println("Name  is: " + name);
        System.out.println("Address is: " + address);
    }

    public static void main(String[] args) {
        StudentChaining obj = new StudentChaining();
        obj.display();

        StudentChaining obj1 = new StudentChaining(20);
        obj1.display();
    }
}
