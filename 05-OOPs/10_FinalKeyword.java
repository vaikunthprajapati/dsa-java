// ============================================================
// TOPIC: Final Keyword
// Covers: final variable (cannot be reassigned),
//         final method (cannot be overridden),
//         final class (cannot be extended/inherited).
// ============================================================


//Final keyword: in variable
class Circle {
    final double PI = 3.14;
    double radius;

    Circle(double radius) {
        this.radius = radius;
        //PI=10;  // This would cause a compile error
    }

    double area() {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle(4);
        System.out.println("Area is: " + c.area());
    }
}


//Final keyword: in Method — prevents subclass from overriding
class CircleWithFinalMethod {
    final double PI = 3.14;
    double radius;

    final public double area() {
        return PI * radius * radius;
    }
}

class SmallCircle extends CircleWithFinalMethod {
    // Cannot override area() because it is final in the parent class
}

class FinalMethodMain {
    public static void main(String[] args) {
        CircleWithFinalMethod c = new CircleWithFinalMethod();
        c.radius = 5;
        System.out.println("The area of Circle is: " + c.area());
    }
}


//Final keyword: in Class — prevents inheritance entirely
final class ImmutableCircle {
    final double PI = 3.14;
    double radius;

    final public double area() {
        return PI * radius * radius;
    }
}

// class ExtendedCircle extends ImmutableCircle { }  // This would cause a compile error
