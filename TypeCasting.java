// Implicit type casting: int division result stored in float (still integer result)
public class TypeCasting {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;
        float z = x / y;
        System.out.println(z);
    }
}

// Implicit casting: one operand is float, result is float
class TypeCasting2 {
    public static void main(String[] args) {
        int x = 100;
        float y = 3;
        float z = x / y;
        System.out.println(z);
    }
}

// Float division precision demo
class TypeCasting3 {
    public static void main(String[] args) {
        float x = 10;
        float y = 3;
        float z = x / y;
        System.out.println(z);
    }
}

// Float divided by double: result promoted to double
class TypeCasting4 {
    public static void main(String[] args) {
        float x = 10;
        double y = 3;
        double z = x / y;
        System.out.println(z);
    }
}

// Float division result stored in double (widening)
class TypeCasting5 {
    public static void main(String[] args) {
        float x = 10;
        float y = 3;
        double z = x / y;
        System.out.println(z);
    }
}

// Implicit casting: char + char expression assigned to int
class TypeCasting6 {
    public static void main(String[] args) {
        int x = 'A' + 'A';
        long l = x;
        System.out.println(l);
    }
}

// Explicit (manual) casting: char addition cast to byte then stored in int
class TypeCasting7 {
    public static void main(String[] args) {
        int x = (byte) ('A' + 'A');
        long l = x;
        System.out.println(l);
    }
}

// Full implicit and explicit type casting chain demo
class TypeCasting8 {
    public static void main(String[] args) {
        // Implicit Type Casting
        byte b = 10;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        System.out.println("byte b=10 : " + b);
        System.out.println("short s=b : " + s);
        System.out.println("int i=s : " + i);
        System.out.println("long l=i : " + l);
        System.out.println("float f=l : " + f);
        System.out.println("double d=f : " + d);

        // Explicit Type Casting
        double d1 = 130.98;
        float f1 = (float) d1;
        long l1 = (long) f1;
        int i1 = (int) l1;
        short s1 = (short) i1;
        byte b1 = (byte) s1;

        System.out.println("double d1=130.98 : " + d1);
        System.out.println("float f1=b : " + f1);
        System.out.println("long l1=s : " + l1);
        System.out.println("int i1=i : " + i1);
        System.out.println("short s1=l : " + s1);
        System.out.println("byte b1=f : " + b1);
    }
}

// Byte overflow: casting 128 to byte and incrementing
class TypeCasting9 {
    public static void main(String[] args) {
        byte b = (byte) 128;
        b++;
        System.out.println(b);
    }
}

// Byte overflow with compound assignment: 126 += 2 stays in range
class TypeCasting10 {
    public static void main(String[] args) {
        byte b = 126;
        b += 2;
        System.out.println(b);
    }
}
