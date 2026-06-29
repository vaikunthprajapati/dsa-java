// ============================================================
// TOPIC: Polymorphism
// Covers: Compile-time polymorphism (method overloading),
//         runtime polymorphism (method overriding),
//         @Override annotation, super in overriding,
//         polymorphism using arrays.
// ============================================================


//Compil time Polymorphism: Method overloading
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("The Sum is: " + c.add(23, 45));
        System.out.println("The Sum is: " + c.add(23, 45, 79));
        System.out.println("The Sum is: " + c.add(23.7, 45.6));
    }
}


//Runtime Polymorphism: Method overriding
class AnimalOverride {
    void makeSound() {
        System.out.println("Animal Sound");
    }
}

class DogOverride extends AnimalOverride {
    @Override
    void makeSound() {
        System.out.println("Bhowww Bhowww");
        super.makeSound();
    }
}

class CatOverride extends AnimalOverride {
    @Override
    void makeSound() {
        System.out.println("Meoww Meoww");
        super.makeSound();
    }
}

class OverrideMain {
    public static void main(String[] args) {
        AnimalOverride a = new DogOverride();
        a.makeSound();

        AnimalOverride b = new CatOverride();
        b.makeSound();
    }
}


//Polymorphism using Array
class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle2 extends Shape {
    Circle2() {
        System.out.println("This is Circle Constructor");
    }

    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape {
    Square() {
        System.out.println("This is Square Constructor");
    }

    void draw() {
        System.out.println("Drawing Square");
    }
}

class PolymorphismArrayMain {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];

        shapes[0] = new Circle2();
        shapes[1] = new Square();

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
