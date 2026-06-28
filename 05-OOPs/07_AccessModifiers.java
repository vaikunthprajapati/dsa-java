// ============================================================
// TOPIC: Access Modifiers
// Covers: public access modifier (accessible anywhere),
//         private access modifier (accessible only within class),
//         private constructor with static method pattern.
// ============================================================


//Public Access Modifier (single file)
class PublicExampleSingle {
    public String message;

    public PublicExampleSingle() {
        message = "This is a message";
    }

    public void display() {
        System.out.println("Message is : " + message);
    }

    public static void main(String[] args) {
        PublicExampleSingle obj = new PublicExampleSingle();
        obj.display();
    }
}


//Public Access Modifier (two-class style, shown in one file)
class PublicExample {
    public String message;

    public PublicExample() {
        message = "This is a message";
    }

    public void display() {
        System.out.println("Message is : " + message);
    }
}

class InnerPublicExample {
    public static void main(String[] args) {
        PublicExample obj = new PublicExample();
        obj.display();
    }
}


// Private constructor — used within same class (e.g. utility class)
class MainPrivateConstructor {
    int x;
    int square;

    private MainPrivateConstructor(int x, int square) {
        this.x = x;
        this.square = square;
        System.out.println("This is a private Constructor");
    }

    public int square() {
        int square = x * x;
        return square;
    }

    public static void main(String[] args) {
        MainPrivateConstructor obj = new MainPrivateConstructor(45, 0);
        int square = obj.square();
        System.out.println(square);
    }
}


// Private constructor with static method — prevents direct instantiation from outside
class MathUtils {
    private MathUtils() {
        System.out.println("This is a private Constructor");
    }

    public static int square(int x) {
        int square = x * x;
        return square;
    }
}

class InnerMathUtils {
    public static void main(String[] args) {
        int square = MathUtils.square(45);
        System.out.println(square);
    }
}
