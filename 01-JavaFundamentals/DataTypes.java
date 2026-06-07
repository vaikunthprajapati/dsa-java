// Printing different data types using System.out.println
public class DataTypes {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(7);
        System.out.println("7");
        System.out.println(7.1);
        System.out.println("7.1");
        System.out.println(7.1f);
        System.out.println('A');
        System.out.println("A");
        System.out.println('%');
        System.out.println("%");
        System.out.println(false);
        System.out.println("false");
    }
}

// String concatenation with different primitive types
class DataTypes2 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(7 + "This is a Integer: ");
        System.out.println("This is a Integer: " + 7);
        System.out.println("This is a String: " + "7");
        System.out.println("This is a double: " + 7.1);
        System.out.println("This is a String: " + "7.1");
        System.out.println("This is a float: " + 7.1f);
        System.out.println("This is a char: " + 'A');
        System.out.println("This is a String: " + "A");
        System.out.println("This is a char: " + '%');
        System.out.println("This is a String: " + "%");
        System.out.println("This is a boolean: " + false);
        System.out.println("This is a String: " + "false");
    }
}

// Declaring and printing all primitive data types
class DataTypes3 {
    public static void main(String[] args) {
        byte b = 12;
        System.out.println(b);

        short s = 12;
        System.out.println(s);

        int i = 12;
        System.out.println(i);

        long l = 123456789876545L;
        System.out.println(l);

        float f = 12.4F;
        System.out.println(f);

        double d = 12;
        System.out.println(d);

        char ch = 65;
        System.out.println(ch);

        char ch1 = 'A';
        System.out.println(ch1);

        boolean bo = true;
        System.out.println(bo);
    }
}

// Printing min and max range of each primitive data type
class DataTypes4 {
    public static void main(String[] args) {
        System.out.println("Range of Byte is : " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Range of Short is : " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Range of Integer is : " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Range of Long is : " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("Range of Float is : " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Range of Double is : " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("Range of Character is : " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
    }
}

// Byte overflow demo: casting 128 and 130 into byte (overflow wraps around)
class DataTypes5 {
    public static void main(String[] args) {
        byte b = 127;
        System.out.println(b);

        byte b1 = (byte) 130;
        System.out.println(b1);
    }
}
