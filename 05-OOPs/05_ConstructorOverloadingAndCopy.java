// ============================================================
// TOPIC: Constructor Overloading & Copy Constructor
// Covers: Multiple constructors with different parameter lists,
//         copy constructor to clone an object's state.
// ============================================================


//Contructor Overloading
class StudentOverloaded {
    int roll;
    String name;

    public StudentOverloaded() {
        roll = 0;
        name = "Unknown";
    }

    public StudentOverloaded(String name) {
        roll = 0;
        this.name = name;
    }

    public StudentOverloaded(int roll) {
        this.roll = roll;
        name = "Amit";
    }

    public StudentOverloaded(String name, int roll) {
        this.roll = roll;
        this.name = name;
    }

    public StudentOverloaded(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public void display() {
        System.out.println("Roll is : " + roll);
        System.out.println("Name is : " + name);
    }

    public static void main(String[] args) {
        StudentOverloaded obj = new StudentOverloaded();
        obj.display();
        StudentOverloaded obj1 = new StudentOverloaded("Amit");
        obj1.display();
        StudentOverloaded obj2 = new StudentOverloaded(1);
        obj2.display();
        StudentOverloaded obj3 = new StudentOverloaded("Sejal", 4);
        obj3.display();
        StudentOverloaded obj4 = new StudentOverloaded(5, "Sharansh");
        obj4.display();
    }
}


//Copy Constructor
class StudentCopy {
    int roll;
    String name;

    StudentCopy(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    StudentCopy(String name) {
        this.name = name;
    }

    //Copy Constructor
    StudentCopy(StudentCopy original) {
        this.roll = original.roll;
        this.name = original.name;
    }

    public void display() {
        System.out.println("Roll No is: " + roll + " Name is : " + name);
    }

    public static void main(String[] args) {
        StudentCopy obj = new StudentCopy(1, "Amit");
        obj.display();
        StudentCopy obj1 = new StudentCopy(obj);
        obj1.display();
    }
}
