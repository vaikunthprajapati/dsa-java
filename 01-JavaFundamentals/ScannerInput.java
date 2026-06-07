import java.util.Scanner;

// Taking input for all primitive types using Scanner
public class ScannerInput {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the byte value: ");
        byte b = obj.nextByte();
        System.out.println("The Byte Value is :" + b);

        System.out.println("Enter the short value: ");
        short s = obj.nextShort();
        System.out.println("The short Value is :" + s);

        System.out.println("Enter the int value: ");
        int i = obj.nextInt();
        System.out.println("The int Value is :" + i);

        System.out.println("Enter the long value: ");
        long l = obj.nextLong();
        System.out.println("The long Value is :" + l);

        System.out.println("Enter the float value: ");
        float f = obj.nextFloat();
        System.out.println("The float Value is :" + f);

        System.out.println("Enter the double value: ");
        double d = obj.nextDouble();
        System.out.println("The double Value is :" + d);
    }
}

// Reading a full line string using nextLine()
class ScannerInput2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = obj.nextLine();
        System.out.println(str);

        obj.close();
    }
}

// Reading a single word string using next() (stops at whitespace)
class ScannerInput3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = obj.next();
        System.out.println(str);

        obj.close();
    }
}

// Reading a single character using next().charAt(0)
class ScannerInput4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Character ");
        char ch = obj.next().charAt(0);
        System.out.println(ch);

        obj.close();
    }
}

// IndexOutOfBoundsException demo: charAt(5) on a 5-char string like "AmitG"
// input: AmitG
// output: IndexOutOfBoundsException: Index 5 out of bounds for length 5
class ScannerInput5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Character ");
        char ch = obj.next().charAt(5);
        System.out.println(ch);

        obj.close();
    }
}
