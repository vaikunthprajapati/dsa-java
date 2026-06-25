// ============================================================
// TOPIC: Object Initialization Techniques
// Covers: Initialization via reference (not ideal),
//         initialization via method, use of 'this' keyword.
// ============================================================


//Initilisation through reference : accha tarika nhi h
class StudentDefaultValues {
    int roll;
    Integer marks;
    String name;
    boolean passed;

    public static void main(String[] args) {
        StudentDefaultValues obj = new StudentDefaultValues();

        System.out.println("Roll Number is: " + obj.roll);
        System.out.println(" Name is: " + obj.name);
        System.out.println(" Marks is: " + obj.marks);
        System.out.println(" Passed ?: " + obj.passed);
    }
}


//Initilisation through reference: accha tarika nhi h kueki apko kisne bola instance variable ko intilize karne k liye
class StudentInlineInit {
    public int roll = 67;
    public String name = "Amit";

    public static void main(String[] args) {
        StudentInlineInit s1 = new StudentInlineInit();
        s1.roll = 1;
        s1.name = "Sangita";
        System.out.println("Roll No. is: " + s1.roll + " Name is : " + s1.name);
    }
}


//Initilisation through reference : accha tarika nhi h
class StudentMultipleObjects {
    public int roll;
    public String name;

    public static void main(String[] args) {
        StudentMultipleObjects s1 = new StudentMultipleObjects();
        s1.roll = 1;
        s1.name = "Amit";
        System.out.println("Roll No. is: " + s1.roll + " Name is : " + s1.name);

        StudentMultipleObjects s2 = new StudentMultipleObjects();
        s2.roll = 2;
        s2.name = "Yuvraj";
        System.out.println("Roll No. is: " + s2.roll + " Name is : " + s2.name);

        StudentMultipleObjects s3 = new StudentMultipleObjects();
        s3.roll = 3;
        s3.name = "Radhika";
        System.out.println("Roll No. is: " + s3.roll + " Name is : " + s3.name);

        StudentMultipleObjects s4 = new StudentMultipleObjects();
        s4.roll = 4;
        s4.name = "Tanush";
        System.out.println("Roll No. is: " + s4.roll + " Name is : " + s4.name);
    }
}


//initilisation through method :  kharab tarika
class StudentHardcodedMethod {
    public int roll;
    public String name;

    public void initilise() {
        name = "Amit";
        roll = 1;
    }

    public void display() {
        System.out.println("Name is : " + name + " Roll No. is : " + roll);
    }

    public static void main(String[] args) {
        StudentHardcodedMethod obj = new StudentHardcodedMethod();
        obj.initilise();
        obj.display();
    }
}


//initilisation through method :  kharab tarika
class StudentMethodWithDiffParams {
    public int roll;
    public String name;

    public void initilise(int roll1, String name1) {
        roll = roll1;
        name = name1;
    }

    public void display() {
        System.out.println("Name is : " + name + " Roll No. is : " + roll);
    }

    public static void main(String[] args) {
        StudentMethodWithDiffParams obj = new StudentMethodWithDiffParams();
        obj.initilise(1, "Amit");
        obj.display();

        StudentMethodWithDiffParams obj1 = new StudentMethodWithDiffParams();
        obj1.initilise(2, "Sejal");
        obj1.display();
    }
}


//initilisation through method : accha tarika (using 'this' keyword)
class StudentThisKeyword {
    public int roll;
    public String name;

    public void initilise(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public void display() {
        System.out.println("Name is : " + name + " Roll No. is : " + roll);
    }

    public static void main(String[] args) {
        StudentThisKeyword obj = new StudentThisKeyword();
        obj.initilise(1, "Amit");
        obj.display();

        StudentThisKeyword obj1 = new StudentThisKeyword();
        obj1.initilise(2, "Sejal");
        obj1.display();
    }
}
