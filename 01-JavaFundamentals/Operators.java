// Demonstrating all Java operators: arithmetic, relational, logical, bitwise, assignment, increment/decrement
public class Operators {
    public static void main(String[] args) {
        // Arithimitic Operators
        int x = 10;
        int y = 3;
        int z = 10;

        System.out.println("Arithimitic opeartors: ");
        System.out.println("Addition is : " + (x + y));
        System.out.println("Substraction is : " + (x - y));
        System.out.println("Multiplication is : " + (x * y));
        System.out.println("Division is : " + (x / y));
        System.out.println("Modulo is : " + (x % y));

        // Relational Operator
        System.out.println("Relational opeartors: ");
        System.out.println(" x==y ?: " + (x == y));
        System.out.println(" x>y ?: " + (x > y));
        System.out.println(" x<y ?: " + (x < y));
        System.out.println(" x>=y ?: " + (x >= y));
        System.out.println(" x<=y ?: " + (x <= y));
        System.out.println(" x>=z ?: " + (x >= z));
        System.out.println(" x<=z ?: " + (x <= z));
        System.out.println(" x!=y ?: " + (x != y));

        // Logical Operator
        System.out.println("Logical opeartors: ");
        boolean a = false;
        boolean b = true;
        boolean c = true;

        System.out.println(" a || b ?: " + (a || b));
        System.out.println(" a && b ?: " + (a && b));
        System.out.println(" b && c ?: " + (b && c));
        System.out.println(" !(b && c) ?: " + !(b && c));
        System.out.println(" !!(b && c) ?: " + !!(b && c));
        System.out.println(" !a ?: " + (!a));
        System.out.println(" !a ?: " + (!!!!!!!!!!a));
        System.out.println(" !a ?: " + (!a));

        // Bitwise Opeartor
        System.out.println("Bitwise opeartors: ");
        int p = 5;
        int q = 3;

        System.out.println(" p | q ?: " + (p | q));
        System.out.println(" p & q ?: " + (p & q));
        System.out.println(" p ^ q ?: " + (p ^ q));
        System.out.println(" ~p ?: " + (~p));
        System.out.println(" ~q ?: " + (~q));

        // Assignment Opeartor
        System.out.println("Assignment opeartors: ");
        int x1 = 10;
        int x2 = 20;
        System.out.println(" x1=x2: " + (x1 = x2));
        System.out.println(" x1+=3: " + (x1 += 3));
        System.out.println(" x1-=3: " + (x1 -= 3));
        System.out.println(" x1*=3: " + (x1 *= 3));
        System.out.println(" x1/=3: " + (x1 /= 3));
        System.out.println(" x1%=3: " + (x1 %= 3));
        System.out.println(" x1%x2: " + (x1 % x2));

        // Increment and Decrement Operator
        int x3 = 7;
        System.out.println("The Value of x3 is: " + x3);
        System.out.println("The Value of x3++ is: " + x3++);
        System.out.println("The Value of x3 is: " + x3);
        System.out.println("The Value of ++x3 is: " + ++x3);
        System.out.println("The Value of x3 is: " + x3);
        System.out.println("The Value of x3-- is: " + x3--);
        System.out.println("The Value of x3 is: " + x3);
        System.out.println("The Value of --x3 is: " + --x3);
        System.out.println("The Value of x3 is: " + x3);
    }
}

// Pre/post increment and decrement behavior in detail
class Operators2 {
    public static void main(String[] args) {
        int x = 7;
        int y = 7;
        int x1 = 7;
        int y1 = 7;

        //Increment
        System.out.println(x++);//7
        System.out.println(x);//8
        x++;
        System.out.println(x);//9

        System.out.println(++y);//8
        System.out.println(y);//8
        ++y;
        System.out.println(y);//9

        //Decrement
        System.out.println(x1--);
        System.out.println(x1);
        System.out.println(x1--);
        System.out.println(x1);
        x1--;
        System.out.println(x1);

        System.out.println(--y1);
        System.out.println(y1);
        System.out.println(--y1);
        --y1;
        System.out.println(y1);
    }
}

// Complex increment/decrement expressions in single statements
class Operators3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println(x++ + x++);
        System.out.println(x-- + ++x);
        System.out.println(--x + ++x);
        System.out.println(x++ + ++x);
        System.out.println(x++ + ++x);
        System.out.println(y++ + --x);
        System.out.println(--y + ++x);
    }
}

// Byte increment using explicit cast: x = (byte)(x + 1)
class Operators4 {
    public static void main(String[] args) {
        byte x = 10;
        //x++;
        //x=x+1;
        //x=(byte)(x+1);
        System.out.println(x = (byte) (x + 1));
    }
}

// Integer division: both operands int, result truncated
class Operators5 {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;
        int z = x / y;
        System.out.println(z);
    }
}
