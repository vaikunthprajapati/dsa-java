// Print 0 to 10 using recursion (base case: num > 10 → return)
// Also shows equivalent iterative version side by side
public class Recursion {
    // Recursive approach
    public static void print(int num) {
        if (num > 10) { // Base Case
            return;
        }
        System.out.print(num + " ");
        print(num + 1);
    }

    // Iterative approach for comparison
    public static void printNumbers() {
        for (int num = 0; num <= 10; num++) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        printNumbers();
        System.out.println();
        print(0);
    }
}

// Print 1 to 10 forward AND 10 to 1 backward using a single recursive method
// The second print runs AFTER the recursive call returns (unwinding the stack)
class Recursion2 {
    public static void print(int num) {
        if (num > 10) {
            return;
        }
        System.out.print(num + " ");   // prints going IN  (1 2 3 ... 10)
        print(num + 1);
        System.out.print(num + " ");   // prints coming OUT (10 9 ... 1)
    }

    public static void main(String[] args) {
        print(1);
    }
}

// Print numbers using recursion WITHOUT a parameter — uses static variable
class Recursion3 {
    static int num = 1;

    public static void print() {
        if (num > 10) {
            return;
        }
        System.out.print(num + " ");
        num++;
        print();
    }

    public static void main(String[] args) {
        print();
    }
}

// Factorial using recursion — decreasing argument: n * (n-1) * ... * 1
class Recursion4 {
    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
}

// Factorial using recursion — increasing argument: start * (start+1) * ... * num
class Recursion5 {
    public static int factorial(int start, int num) {
        if (start > num) {
            return 1;
        }
        return start * factorial(start + 1, num);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(1, n));
    }
}

// Fibonacci sequence using recursion: fib(n) = fib(n-1) + fib(n-2)
class Recursion6 {
    public static int fibonacci(int number) {
        if (number == 0 || number == 1) {
            return number;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static void main(String[] args) {
        System.out.println("The Fibonacci Sequence is : ");
        for (int i = 0; i <= 8; i++) {
            int result = fibonacci(i);
            System.out.print(result + " ");
        }
    }
}

// Sum of all digits using recursion — approach 1: extract digit into variable
class Recursion7 {
    public static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        }
        int digit = num % 10;
        return digit + sumOfDigits(num / 10);
    }

    public static void main(String[] args) {
        int num = 34567;
        int result = sumOfDigits(num);
        System.out.println("The Sum of Digits :" + result);
    }
}

// Sum of all digits using recursion — approach 2: inline without variable
class Recursion8 {
    public static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 10 + sumOfDigits(num / 10);
    }

    public static void main(String[] args) {
        int num = 34567;
        int result = sumOfDigits(num);
        System.out.println("The Sum of Digits :" + result);
    }
}

// Sum of all digits using recursion — approach 3: store result before return
class Recursion9 {
    public static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        }
        int digit = num % 10;
        int result = digit + sumOfDigits(num / 10);
        return result;
    }

    public static void main(String[] args) {
        int num = 34567;
        int result = sumOfDigits(num);
        System.out.println("The Sum of Digits :" + result);
    }
}

// Sum of EVEN digits only using recursion — if/else approach
class Recursion10 {
    public static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        }
        int digit = num % 10;
        if (digit % 2 == 0) {
            return digit + sumOfDigits(num / 10);
        } else {
            return sumOfDigits(num / 10);
        }
    }

    public static void main(String[] args) {
        int num = 34567;
        int result = sumOfDigits(num);
        System.out.println("The Sum of Even Digits :" + result);
    }
}

// Sum of EVEN digits only using recursion — condensed with ternary operator
class Recursion11 {
    public static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        }
        int digit = num % 10;
        return (digit % 2 == 0) ? digit + sumOfDigits(num / 10) : sumOfDigits(num / 10);
    }

    public static void main(String[] args) {
        int num = 34567;
        int result = sumOfDigits(num);
        System.out.println("The Sum of Even Digits :" + result);
    }
}

// Count total digits using recursion
class Recursion12 {
    public static int countDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + countDigits(num / 10);
    }

    public static void main(String[] args) {
        int num = 34567;
        int result = countDigits(num);
        System.out.println("The Count of Digits :" + result);
    }
}

// Count ODD digits only using recursion
class Recursion13 {
    public static int countDigits(int num) {
        if (num == 0) {
            return 0;
        }
        int digit = num % 10;
        if (digit % 2 != 0) {
            return 1 + countDigits(num / 10);
        }
        return countDigits(num / 10);
    }

    public static void main(String[] args) {
        int num = 34567;
        int result = countDigits(num);
        System.out.println("The Count of Odd Digits :" + result);
    }
}

// Reverse a number using recursion — carries accumulated reverse as second parameter
class Recursion14 {
    public static int reverse(int number, int reverse) {
        if (number == 0) {
            return reverse;
        }
        int lastDigit = number % 10;
        reverse = reverse * 10 + lastDigit;
        return reverse(number / 10, reverse);
    }

    public static void main(String[] args) {
        int number = 4567;
        int reverse = 0;
        int result = reverse(number, reverse);
        System.out.println("The Reversed Number is " + result);
    }
}

// Palindrome check using recursion — reuses reverse() method
class Recursion15 {
    public static int reverse(int number, int reverse) {
        if (number == 0) {
            return reverse;
        }
        int lastDigit = number % 10;
        reverse = reverse * 10 + lastDigit;
        return reverse(number / 10, reverse);
    }

    public static boolean isPalindrome(int number) {
        int reversed = reverse(number, 0);
        return number == reversed;
    }

    public static void main(String[] args) {
        int number = 4567;
        if (isPalindrome(number)) {
            System.out.println("It is a palindrome Number");
        } else {
            System.out.println("It is not a palindrome Number");
        }
    }
}

// Perfect number using recursion — sumOfDivisor() accumulates from i=1 to number-1
class Recursion16 {
    public static int sumOfDivisor(int number, int i) {
        if (i == number) {
            return 0;
        }
        if (number % i == 0) {
            return i + sumOfDivisor(number, i + 1);
        } else {
            return sumOfDivisor(number, i + 1);
        }
    }

    public static void main(String[] args) {
        int number = 28;
        int sum = sumOfDivisor(number, 1);
        if (sum == number) {
            System.out.println(number + " is perfect Number");
        } else {
            System.out.println(number + " is not perfect Number");
        }
    }
}

// Perfect number using recursion — alternative: base case at i==num/2 returns num/2
class Recursion17 {
    public static int sumOfDivisors(int num, int i) {
        if (i == num / 2) {
            return num / 2;
        }
        if (num % i == 0) {
            return i + sumOfDivisors(num, i + 1);
        } else {
            return sumOfDivisors(num, i + 1);
        }
    }

    public static void main(String[] args) {
        int number = 28;
        int sum = sumOfDivisors(number, 1);
        if (sum == number) {
            System.out.println("Yes it is Perfect Number");
        } else {
            System.out.println("No it is Not perfect Number");
        }
    }
}

// Strong number using recursion — factorial() + sumOfFactorials() chained
class Recursion18 {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int sumOfFactorials(int num) {
        if (num == 0) {
            return 0;
        }
        int digit = num % 10;
        int digitFactorial = factorial(digit);
        return digitFactorial + sumOfFactorials(num / 10);
    }

    public static void main(String[] args) {
        int number = 145;
        int sum = sumOfFactorials(number);
        if (sum == number) {
            System.out.println(number + " is a Strong Number");
        } else {
            System.out.println(number + " is Not a Strong Number");
        }
    }
}

// Automorphic number using recursion — digit-by-digit comparison of number and square
class Recursion19 {
    public static boolean isAutoMorphic(int number, int square) {
        if (number == 0) {
            return true;
        }
        if (number % 10 != square % 10) {
            return false;
        }
        return isAutoMorphic(number / 10, square / 10);
    }

    public static void main(String[] args) {
        int number = 76;
        int square = number * number;
        boolean isAutoMorphic = isAutoMorphic(number, square);

        if (isAutoMorphic) {
            System.out.println(number + " is Automorphic");
        } else {
            System.out.println(number + " is not Automorphic");
        }
    }
}

// Harshad number using recursion — sumOfDigits() used inside isHarshad()
class Recursion20 {
    public static int sumOfDigits(int number) {
        if (number == 0) {
            return 0;
        }
        return (number % 10) + sumOfDigits(number / 10);
    }

    public static boolean isHarshad(int number) {
        int sum = sumOfDigits(number);
        return number % sum == 0;
    }

    public static void main(String[] args) {
        int number = 76;
        boolean isHarshad = isHarshad(number);
        if (isHarshad) {
            System.out.println(number + " is a Harshad Number");
        } else {
            System.out.println(number + " is not a Harshad Number");
        }
    }
}

// Armstrong number using recursion — uses custom pow() and countDigit() helpers
class Recursion21 {
    public static int countDigit(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + countDigit(num / 10);
    }

    public static int pow(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * pow(base, exp - 1);
    }

    public static int armstrong(int num, int pos) {
        if (num == 0) {
            return 0;
        }
        int digit = num % 10;
        int sum = pow(digit, pos);
        return sum + armstrong(num / 10, pos);
    }

    public static void main(String[] args) {
        int number = 153;
        int length = countDigit(number);
        int sum = armstrong(number, length);
        if (sum == number) {
            System.out.println("It is Armstrong Number ");
        } else {
            System.out.println("It is not a Armstrong Number ");
        }

        int result = pow(4, 7);
        System.out.println(" 4 to the power 7 is : " + result);
    }
}

// Disarium number using recursion — same as Armstrong but position DECREASES left to right
class Recursion22 {
    public static int countDigit(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + countDigit(num / 10);
    }

    public static int pow(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * pow(base, exp - 1);
    }

    public static int dissarium(int num, int pos) {
        if (num == 0) {
            return 0;
        }
        int digit = num % 10;
        int sum = pow(digit, pos);
        return sum + dissarium(num / 10, pos - 1);
    }

    public static void main(String[] args) {
        int number = 89;
        int length = countDigit(number);
        int sum = dissarium(number, length);
        if (sum == number) {
            System.out.println("It is a Disarium Number ");
        } else {
            System.out.println("It is not a Disarium Number ");
        }
    }
}
