// Basic if-if: voting eligibility check
public class ConditionalStatements {
    public static void main(String[] args) {
        int age = 10;
        if (age >= 18) {
            System.out.println("Eligible for Vote");
        }
        if (age < 18) {
            System.out.println("Not Eligible for Vote");
        }
    }
}

// if-else: voting eligibility check
class ConditionalStatements2 {
    public static void main(String[] args) {
        int age = 10;
        if (age >= 18) {
            System.out.println("Eligible for Vote");
        } else {
            System.out.println("Not Eligible for Vote");
        }
    }
}

// else-if ladder: grade based on marks
class ConditionalStatements3 {
    public static void main(String[] args) {
        int marks = 80;
        if (marks >= 90) {
            System.out.println("A+");
        } else if (marks >= 80) {
            System.out.println("A");
        } else if (marks >= 70) {
            System.out.println("B+");
        } else if (marks >= 60) {
            System.out.println("B");
        } else if (marks >= 50) {
            System.out.println("C");
        } else if (marks >= 40) {
            System.out.println("D");
        } else {
            System.out.println("Apne maa baap ka naam roshan kra h");
        }
    }
}

// Separate if blocks (not ladder) — multiple conditions can match
class ConditionalStatements4 {
    public static void main(String[] args) {
        int marks = 80;
        if (marks >= 90) {
            System.out.println("A+");
        }
        if (marks >= 80) {
            System.out.println("A");
        }
        if (marks >= 70) {
            System.out.println("B+");
        }
        if (marks >= 60) {
            System.out.println("B");
        }
        if (marks >= 50) {
            System.out.println("C");
        }
        if (marks >= 40) {
            System.out.println("D");
        } else {
            System.out.println("Apne maa baap ka naam roshan kra h");
        }
    }
}

// Separate if blocks with explicit range checks to mimic ladder behavior
class ConditionalStatements5 {
    public static void main(String[] args) {
        int marks = 80;
        if (marks >= 90) {
            System.out.println("A+");
        }
        if (marks < 90 && marks >= 80) {
            System.out.println("A");
        }
        if (marks < 80 && marks >= 70) {
            System.out.println("B+");
        }
        if (marks < 70 && marks >= 60) {
            System.out.println("B");
        }
        if (marks < 60 && marks >= 50) {
            System.out.println("C");
        }
        if (marks < 50 && marks >= 40) {
            System.out.println("D");
        } else {
            System.out.println("Apne maa baap ka naam roshan kra h");
        }
    }
}

// Check divisibility by 3
class ConditionalStatements6 {
    public static void main(String[] args) {
        int x = 121;
        if (x % 3 == 0) {
            System.out.println("Yes it is Divisible");
        } else {
            System.out.println("No it is not Divisible");
        }
    }
}

// Check if remainder after dividing by 5 is 3 AND remainder after dividing by 3 is 2
class ConditionalStatements7 {
    public static void main(String[] args) {
        int x = 121;
        if (x % 5 == 3 && x % 3 == 2) {
            System.out.println("Yes it is Divisible");
        } else {
            System.out.println("No it is not Divisible");
        }
    }
}

// Check divisibility by 5 or 11
class ConditionalStatements8 {
    public static void main(String[] args) {
        int x = 121;
        if (x % 5 == 0 || x % 11 == 0) {
            System.out.println("Yes it is Divisible");
        } else {
            System.out.println("No it is not Divisible");
        }
    }
}

// Sum of remainders when divided by 5 and 11, check if sum divisible by 15
class ConditionalStatements9 {
    public static void main(String[] args) {
        int x = 121;
        int remainder5 = x % 5;
        int remainder11 = x % 11;
        int sum = remainder11 + remainder5;
        if (sum % 15 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

// Same as above but condensed into one line (style)
class ConditionalStatements10 {
    public static void main(String[] args) {
        int x = 121;
        int sum = x % 5 + x % 11;
        if (sum % 15 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

// Most condensed version: entire expression inline in if condition
class ConditionalStatements11 {
    public static void main(String[] args) {
        int x = 121;
        if ((x % 5 + x % 11) % 15 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

// Nested if: if divisible by 3 check quotient divisibility by 5, else check odd/even
class ConditionalStatements12 {
    public static void main(String[] args) {
        int number = 15;
        if (number % 3 == 0) {
            int quotient = number / 3;
            if (quotient % 5 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            if (number % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
}

// Complex nested if: 6-digit number — if divisible by 3, split into 2-digit pairs and check;
// else split into 3-digit halves and check if their sum is even/odd
class ConditionalStatements13 {
    public static void main(String[] args) {
        int number = 345678;
        if (number % 3 == 0) {
            int x1 = number % 100;//78
            number = number / 100;//3456
            int x2 = number % 100;//56
            number = number / 100;//34
            int x3 = number % 100;//34

            int sum = x1 + x2 + x3;
            if (sum % 3 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            int y1 = number % 1000;//678
            number = number / 1000;//345
            int y2 = number % 1000;//345

            int sum1 = y1 + y2;
            if (sum1 % 2 == 0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }
        }
    }
}

// Check if a character is uppercase or lowercase
class ConditionalStatements14 {
    public static void main(String[] args) {
        char ch = 'F';
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("It is a UpperCase");
        } else {
            System.out.println("It is a LowerCase");
        }
    }
}

// Check if character is uppercase, lowercase, or symbol
class ConditionalStatements15 {
    public static void main(String[] args) {
        char ch = 'F';
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("It is a UpperCase");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("It is a LowerCase");
        } else {
            System.out.println("You are symbol");
        }
    }
}

// Check if character is vowel or consonant (handles both cases separately)
class ConditionalStatements16 {
    public static void main(String[] args) {
        char ch = 'F';
        if (ch >= 'A' && ch <= 'Z') {
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("You are symbol");
        }
    }
}

// Check vowel/consonant with combined letter check and all-case vowel list
class ConditionalStatements17 {
    public static void main(String[] args) {
        char ch = 'F';
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("You are symbol");
        }
    }
}

// Leap year check using standard formula
class ConditionalStatements18 {
    public static void main(String[] args) {
        int year = 200;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("It is a Leap year");
        } else {
            System.out.println("It is Not a Leap Year");
        }
    }
}

// Calculator using if-else for +, -, *, / with divide-by-zero guard
class ConditionalStatements19 {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 0;
        char operator = '/';

        if (operator == '+') {
            System.out.println("Sum is : " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("Substraction is : " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("Multiplication is : " + (num1 * num2));
        } else if (operator == '/') {
            if (num2 != 0) {
                System.out.println("Division is : " + (num1 / num2));
            } else {
                System.out.println("Enter num2 not equal to zero ");
            }
        } else {
            System.out.println("Invalid Operator");
        }
    }
}

// Largest among three numbers: approach 1 — direct comparisons
class ConditionalStatements20 {
    public static void main(String[] args) {
        int x = 3;
        int y = 9;
        int z = 7;
        if (x > y && x > z) {
            System.out.println(x + " is largest");
        } else if (y > x && y > z) {
            System.out.println(y + " is largest");
        } else {
            System.out.println(z + " is largest");
        }
    }
}

// Largest among three numbers: approach 2 — using a 'largest' variable
class ConditionalStatements21 {
    public static void main(String[] args) {
        int x = 3;
        int y = 9;
        int z = 7;
        int largest = x;
        if (y > largest) {
            largest = y;
        }
        if (z > largest) {
            largest = z;
        }
        System.out.println("The largest Element is : " + largest);
    }
}

// Largest among three numbers: approach 3 — fully nested if-else
class ConditionalStatements22 {
    public static void main(String[] args) {
        int x = 3;
        int y = 9;
        int z = 7;
        int largest;
        if (x > y) {
            if (x > z) {
                largest = x;
            } else {
                largest = z;
            }
        } else {
            if (y > z) {
                largest = y;
            } else {
                largest = z;
            }
        }
        System.out.println("Largest element is :" + largest);
    }
}

// Perfect square check using Math.sqrt
class ConditionalStatements23 {
    public static void main(String[] args) {
        int n = 16;
        int root = (int) Math.sqrt(n);
        if (root * root == n) {
            System.out.println("It is a perfect square");
        } else {
            System.out.println("It not is a perfect square");
        }
    }
}

// Check odd/even without using % operator (using division trick)
class ConditionalStatements24 {
    public static void main(String[] args) {
        int x = 13;
        int y = x / 2;
        if (y * 2 == x) {
            System.out.println("It is Even number");
        } else {
            System.out.println("It is Odd number");
        }
    }
}

// Check odd/even using bitwise AND — no %, /, or *
class ConditionalStatements25 {
    public static void main(String[] args) {
        int x = 13;
        if ((x & 1) == 0) {
            System.out.println("It is Even number");
        } else {
            System.out.println("It is Odd number");
        }
    }
}

// Find largest digit of a 3-digit number (397) using modulo extraction
class ConditionalStatements26 {
    public static void main(String[] args) {
        int number = 397;
        int modulo1 = number % 10;
        number = number / 10;
        int modulo2 = number % 10;
        number = number / 10;
        int modulo3 = number % 10;

        int largest = modulo1;
        if (modulo2 > largest) {
            largest = modulo2;
        }
        if (modulo3 > largest) {
            largest = modulo3;
        }
        System.out.println("The largest Element is : " + largest);
    }
}

// Classify character: digit, vowel, consonant, or special using Scanner input
import java.util.Scanner;

class ConditionalStatements27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Special character");
        }
    }
}

// Validate triangle using angle sum == 180
class ConditionalStatements28 {
    public static void main(String[] args) {
        int angle1 = 89;
        int angle2 = 89;
        int angle3 = 89;
        if (angle1 + angle2 + angle3 == 180) {
            System.out.println("Valid Triangle ");
        } else {
            System.out.println("Invalid Triangle ");
        }
    }
}

// Classify number as positive/negative and even/odd using nested if
class ConditionalStatements29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0) {
            if (n % 2 == 0) {
                System.out.println("Positive and even");
            } else {
                System.out.println("Positive and odd");
            }
        } else if (n < 0) {
            if (n % 2 == 0) {
                System.out.println("Negative and even");
            } else {
                System.out.println("Negative and odd");
            }
        } else {
            System.out.println("Zero (neither even nor odd)");
        }
    }
}

// Triangle type: equilateral, isosceles, or scalene using && and || logical operators
class ConditionalStatements30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Equilateral");
            } else if (a == b || a == c || b == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Not a triangle");
        }
    }
}

// Triangle type using pure nested if-else (no logical operators)
class ConditionalStatements31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b > c) {
            if (a + c > b) {
                if (b + c > a) {
                    if (a == b) {
                        if (b == c) {
                            System.out.println("Equilateral");
                        } else {
                            System.out.println("Isosceles");
                        }
                    } else {
                        if (a == c) {
                            System.out.println("Isosceles");
                        } else {
                            if (b == c) {
                                System.out.println("Isosceles");
                            } else {
                                System.out.println("Scalene");
                            }
                        }
                    }
                } else {
                    System.out.println("Not a triangle");
                }
            } else {
                System.out.println("Not a triangle");
            }
        } else {
            System.out.println("Not a triangle");
        }
    }
}

// Divisibility check: by both 2 and 3, only 2, only 3, or neither
class ConditionalStatements32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 2 == 0) {
            if (n % 3 == 0) {
                System.out.println("Divisible by 2 and 3");
            } else {
                System.out.println("Divisible by only 2");
            }
        } else {
            if (n % 3 == 0) {
                System.out.println("Divisible by only 3");
            } else {
                System.out.println("Not divisible by 2 and 3");
            }
        }
    }
}

// Greatest of four numbers using nested if-else
class ConditionalStatements33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int max1, max2, greatest;

        if (a > b) {
            max1 = a;
        } else {
            max1 = b;
        }

        if (c > d) {
            max2 = c;
        } else {
            max2 = d;
        }

        if (max1 > max2) {
            greatest = max1;
        } else {
            greatest = max2;
        }

        System.out.println("Greatest number is: " + greatest);
    }
}

// Leap year check using nested if-else (no logical operators)
class ConditionalStatements34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if (year % 400 == 0) {
            System.out.println("Leap year");
        } else {
            if (year % 100 == 0) {
                System.out.println("Not a leap year");
            } else {
                if (year % 4 == 0) {
                    System.out.println("Leap year");
                } else {
                    System.out.println("Not a leap year");
                }
            }
        }
    }
}

// Perfect square check using odd number sum property (no sqrt)
class ConditionalStatements35 {
    public static void main(String[] args) {
        int x = 81;
        int y = x / 2;
        int z;
        boolean isPerfect = false;
        if (y % 2 == 0) {
            z = y - 1;
        } else {
            z = y;
        }
        int oddSum = 0;
        for (int i = 1; i <= z; i++) {
            if (i % 2 == 1) {
                oddSum += i;

                int s = x - oddSum;
                if (s == 0) {
                    isPerfect = true;
                    break;
                } else {
                    isPerfect = false;
                }
            }
        }
        if (isPerfect) {
            System.out.println("It is a Perfect Square");
        } else {
            System.out.println("It is not a perfect Square");
        }
    }
}
