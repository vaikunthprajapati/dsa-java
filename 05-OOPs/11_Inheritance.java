// ============================================================
// TOPIC: Inheritance
// Covers: Single inheritance, multilevel inheritance,
//         super keyword (constructor call, field access, method call).
// ============================================================


//Single inheritance
class Animal {
    protected String name = "Animal";

    public void makeSound() {
        System.out.println("Animal Sound...");
    }
}

class Dog extends Animal {
    public void display() {
        System.out.println("Dog.." + name);
        makeSound();
    }
}

class SingleInheritanceMain {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
        d.makeSound();

        Animal a = new Animal();
        a.makeSound();

        Animal a1 = new Dog();
        a1.makeSound();
    }
}


//Multi-level inheritance
class GrandParent {
    protected String name = "Prajapati Family";

    public void showFamily() {
        System.out.println("GrandParent Family");
    }
}

class Parent1 extends GrandParent {
    public void showParent() {
        System.out.println("This is Parent Family");
    }
}

class Child extends Parent1 {
    public void showChild() {
        System.out.println("Childs Family");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.showChild();
        c.showFamily();
        c.showParent();
    }
}


//Super Keyword: use in constructor calling
class AnimalSuper {
    AnimalSuper(String type) {
        System.out.println("Animal Constructor got called: " + type);
    }
}

class Cat extends AnimalSuper {
    Cat() {
        super("Dog");
        System.out.println("Cat Constructor got called");
    }

    public static void main(String[] args) {
        Cat c = new Cat();
    }
}


//Super Keyword: accessing parent field vs child field
class AnimalWithName {
    String name = "Animal Name";

    public void makeSound() {
        System.out.println("Animal Sound");
    }
}

class CatWithName extends AnimalWithName {
    String name = "Simba";

    public void makeSound() {
        System.out.println("Cat Sounds: Meowww");
        System.out.println("Cat Name is: " + name);
        System.out.println("Animal Name is: " + super.name);
    }

    public static void main(String[] args) {
        CatWithName c = new CatWithName();
        c.makeSound();
    }
}


//Super Keyword: calling parent method explicitly
class AnimalSound {
    public void makeSound() {
        System.out.println("Animal Sound");
    }
}

class CatSound extends AnimalSound {
    public void makeSound() {
        super.makeSound();
        System.out.println("Cat Sounds: Meowww");
    }

    public void callSound() {
        super.makeSound();
    }

    public static void main(String[] args) {
        CatSound c = new CatSound();
        c.makeSound();
        c.callSound();
    }
}
