// ============================================================
// TOPIC: Constructors
// Covers: Default constructor, no-argument constructor,
//         parameterized constructor, 'this' in constructor,
//         calling method from constructor, separate class files.
// ============================================================


//Default Contructor (compiler provides it automatically)
class StudentDefault {
    public int roll;

    public static void main(String[] args) {
        StudentDefault obj = new StudentDefault();
        System.out.println("Roll number is : " + obj.roll);
    }
}


//No argument Contructor (user-defined, no parameters)
class StudentNoArg {
    public int roll;

    public StudentNoArg() {
        roll = 1;
        System.out.println("This contructor is called");
    }

    public static void main(String[] args) {
        StudentNoArg obj = new StudentNoArg();
        System.out.println("Roll number is : " + obj.roll);
    }
}


//parameterized Contructor
class MainParameterized {
    public int length;
    public int width;
    public int height;

    public MainParameterized(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void area() {
        int area = length * width;
        System.out.println("The area is : " + area);
    }

    public void volume() {
        int volume = length * width * height;
        System.out.println("Volume is : " + volume);
    }

    public void perimeter() {
        int perimeter = 2 * (length + width);
        System.out.println("Perimeter is : " + perimeter);
    }

    public static void main(String[] args) {
        MainParameterized obj = new MainParameterized(10, 20, 30);
        obj.area();
        obj.volume();
        obj.perimeter();

        MainParameterized obj1 = new MainParameterized(11, 21, 31);
        obj1.area();
        obj1.volume();
        obj1.perimeter();
    }
}


// Constructor with this keyword for rectangle area
class RectangleConstructor {
    public int length;
    public int width;

    public RectangleConstructor(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int areaRectangle() {
        int area = length * width;
        return area;
    }

    public static void main(String[] args) {
        RectangleConstructor obj = new RectangleConstructor(56, 45);
        int result = obj.areaRectangle();
        System.out.println("Area is : " + result);
    }
}


// Constructor calling a method internally (not a good practice)
class MainConstructorCallsMethod {
    int x;
    String str;
    Integer i1;
    int length;
    int width;

    public MainConstructorCallsMethod(int length, int width) {
        x = 0;
        str = null;
        i1 = null;
        System.out.println("x is : " + x);
        System.out.println("str is : " + str);
        System.out.println("i1 is : " + str);
        this.length = length;
        this.width = width;
        area();
    }

    public void area() {
        int area = length * width;
        System.out.println("Area is : " + area);
    }

    public static void main(String[] args) {
        MainConstructorCallsMethod obj = new MainConstructorCallsMethod(10, 20);
    }
}


// Separate class (Main class) using a constructor (two-file style shown in one file)
class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int areaRectangle() {
        int area = length * width;
        return area;
    }
}

class InnerMain {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(56, 67);
        int result = obj.areaRectangle();
        System.out.println("Area is : " + result);
    }
}
