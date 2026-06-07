// Basic void method with no parameters — declaration, definition, and call
public class Methods {
    public static void print() { // Method declaration
        System.out.println("Hello World"); // Method definition
    }

    public static void main(String[] args) {
        print(); // Method calling
    }
}

// Void method using a local variable inside the method body
class Methods2 {
    public static void print() {
        String subject = "Java";
        System.out.println("Hello World " + subject);
    }

    public static void main(String[] args) {
        print();
    }
}

// Void method with a String parameter — argument passed from main
class Methods3 {
    public static void print(String subject) {
        System.out.println("Hello World " + subject);
    }

    public static void main(String[] args) {
        String subject = "Java";
        print(subject);
        System.out.println("And teacher name is :  Amit ");
    }
}

// Void method with renamed parameter (formal vs actual argument)
class Methods4 {
    public static void print(String subject1) {
        System.out.println("Hello World " + subject1);
    }

    public static void main(String[] args) {
        String subject = "Java";
        print(subject);
    }
}

// Void method with multiple parameters: name and roll number
class Methods5 {
    public static void print(String name, int rollNo) {
        System.out.println("My name is : " + name + "  and roll Number is: " + rollNo);
    }

    public static void main(String[] args) {
        String name = "Amit";
        int rollNo = 1;
        print(name, rollNo);

        String name1 = "Areeb";
        int rollNo1 = 2;
        print(name1, rollNo1);
    }
}

// Method with return type String — concatenates two strings and returns result inline
class Methods6 {
    public static String print(String name, String str) {
        return name + str;
    }

    public static void main(String[] args) {
        String name = "Amit";
        String str = " and i teach Java";
        System.out.println("My name is " + print(name, str));
    }
}

// Same return method — result stored in variable before return
class Methods7 {
    public static String print(String name, String str) {
        String result = name + str;
        return result;
    }

    public static void main(String[] args) {
        String name = "Amit";
        String str = " and i teach Java";
        System.out.println("My name is " + print(name, str));
    }
}

// Same return method — result captured in main variable before printing
class Methods8 {
    public static String print(String name, String str) {
        String result = name + str;
        return result;
    }

    public static void main(String[] args) {
        String name = "Amit";
        String str = " and i teach Java";
        String result = print(name, str);
        System.out.println("My name is " + result);
    }
}

// Square: no method — direct inline calculation
class Methods9 {
    public static void main(String[] args) {
        int x = 5;
        int square = x * x;
        System.out.println("Square is : " + square);
    }
}

// Square: void method with no parameters (hardcoded inside)
class Methods10 {
    public static void square() {
        int x = 5;
        int square = x * x;
        System.out.println("Square is : " + square);
    }

    public static void main(String[] args) {
        square();
    }
}

// Square: void method with int parameter
class Methods11 {
    public static void square(int x) {
        int square = x * x;
        System.out.println("Square is : " + square);
    }

    public static void main(String[] args) {
        square(5);
    }
}

// Square: void method with int parameter, passed via variable
class Methods12 {
    public static void square(int x) {
        int square = x * x;
        System.out.println("Square is : " + square);
    }

    public static void main(String[] args) {
        int x = 5;
        square(x);
    }
}

// Square: method returns int — result printed directly
class Methods13 {
    public static int square(int x) {
        int square = x * x;
        return square;
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println("Square is " + square(x));
    }
}

// Square: method returns int — result captured in variable then printed
class Methods14 {
    public static int square(int x) {
        int square = x * x;
        return square;
    }

    public static void main(String[] args) {
        int x = 5;
        int result = square(x);
        System.out.println("Square is " + result);
    }
}

// Even/odd check split into two methods: evenOddCheck() returns boolean, display() prints
class Methods15 {
    public static boolean evenOddCheck(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void display(boolean result) {
        if (result) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }

    public static void main(String[] args) {
        int num = 5;
        boolean result = evenOddCheck(num);
        display(result);
    }
}

// Practice: 300-600 filter split into methods — getSum(), checkSumIsEven(), display()
class Methods16 {
    public static int getSum() {
        int sum = 0;
        for (int i = 300; i <= 600; i++) {
            if (i % 5 == 3 && i % 8 == 4) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean checkSumIsEven(int sum) {
        if (sum % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void display() {
        int sum = getSum();
        boolean condition = checkSumIsEven(sum);
        if (condition) {
            System.out.println("Sum is Even");
        } else {
            System.out.println("Sum is Odd");
        }
    }

    public static void main(String[] args) {
        display();
    }
}

// Print 1 to 100 using a method with a parameter for starting number
class Methods17 {
    public static void print(int num) {
        for (int i = num; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        print(1);
    }
}
