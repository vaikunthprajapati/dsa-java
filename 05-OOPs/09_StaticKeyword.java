// ============================================================
// TOPIC: Static Keyword
// Covers: static variables (shared across all objects),
//         static blocks (runs once at class loading),
//         constructor vs static block execution order.
// ============================================================


//Static Keyword — static variable shared across all objects
class MainStaticCount {
    static int count = 0;

    MainStaticCount() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        MainStaticCount m1 = new MainStaticCount();
        //No new object is created
        MainStaticCount m2 = new MainStaticCount();
        MainStaticCount m3 = new MainStaticCount();
        MainStaticCount m4 = new MainStaticCount();
        MainStaticCount m5 = new MainStaticCount();
        //If we remove the Static keyword, then a new object will be created everytime and 1 1 1 1 1 will be the output instead of 1 2 3 4 5
    }
}


//constructor vs static block — execution order demo
class MainConstructorVsStatic {
    MainConstructorVsStatic() {
        System.out.println("Constructor got called");
    }

    static {
        System.out.println("It runs once and runs at very first");
    }

    public static void main(String[] args) {
        MainConstructorVsStatic obj = new MainConstructorVsStatic();
        MainConstructorVsStatic obj1 = new MainConstructorVsStatic();
        MainConstructorVsStatic obj2 = new MainConstructorVsStatic();
        MainConstructorVsStatic obj3 = new MainConstructorVsStatic();
        MainConstructorVsStatic obj4 = new MainConstructorVsStatic();
    }
}
