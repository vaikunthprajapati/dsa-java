// LoopPractice — collection of all loop-based practice problems

// Q1: Count total number of digits in a number
public class LoopPractice {
    public static void main(String[] args) {
        int num = 3458762;
        int count = 0;

        for (int i = num; i != 0; i /= 10) {
            count++;
        }
        System.out.println("Count is : " + count);
    }
}

// Q2: Count even and odd digits in a number (wrong extraction — uses i not i%10)
class LoopPractice2 {
    public static void main(String[] args) {
        int num = 3458762;
        int oddCount = 0;
        int evenCount = 0;

        for (int i = num; i != 0; i /= 10) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("The Even Count is " + evenCount);
        System.out.println("The Odd Count is " + oddCount);
    }
}

// Q3: Count even and odd digits correctly (extracts last digit first with i%10)
class LoopPractice3 {
    public static void main(String[] args) {
        int num = 3458762;
        int oddCount = 0;
        int evenCount = 0;

        for (int i = num; i != 0; i /= 10) {
            int lastDigit = i % 10;
            if (lastDigit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("The Even Count is " + evenCount);
        System.out.println("The Odd Count is " + oddCount);
    }
}

// Q4: Sum of all digits of a number
class LoopPractice4 {
    public static void main(String[] args) {
        int num = 3458762;
        int sum = 0;

        for (int i = num; i != 0; i /= 10) {
            int lastDigit = i % 10;
            sum += lastDigit;
        }
        System.out.println("Sum is :" + sum);
    }
}

// Q5: Find numbers from 300 to 600 where (num % 5 == 3) AND (num % 8 == 4)
class LoopPractice5 {
    public static void main(String[] args) {
        for (int i = 300; i <= 600; i++) {
            if (i % 5 == 3 && i % 8 == 4) {
                System.out.print(i + " ");
            }
        }
    }
}

// Q6: Same as Q5 — sum all qualifying numbers and check if even or odd
class LoopPractice6 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 300; i <= 600; i++) {
            if (i % 5 == 3 && i % 8 == 4) {
                sum += i;
            }
        }
        System.out.println("Sum is : " + sum);
        if (sum % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}

// Q7: Same filter (300-600) — count qualifying numbers
class LoopPractice7 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 300; i <= 600; i++) {
            if (i % 5 == 3 && i % 8 == 4) {
                count++;
            }
        }
        System.out.println("The count is : " + count);
    }
}

// Q8: From 100 to 400 — sum numbers with (i%3==1) and separately sum (i%4==2),
// then find their difference and print Positive / Zero / Negative
class LoopPractice8 {
    public static void main(String[] args) {
        int sum1 = 0, sum2 = 0;
        for (int i = 100; i <= 400; i++) {
            if (i % 3 == 1) {
                sum1 += i;
            }
            if (i % 4 == 2) {
                sum2 += i;
            }
        }
        System.out.println("Sum1 is : " + sum1 + " Sum2 is : " + sum2);
        int difference = sum1 - sum2;
        System.out.println("Difference is : " + difference);
        if (difference > 0) {
            System.out.println("Positve");
        } else if (difference == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negative");
        }
    }
}

// Q9: Difference between even digit sum and odd digit sum of a number —
// check if the absolute difference is prime
// number = 3458762: even digits (8,6,2)=16, odd digits (3,5,7)=15, diff=1
class LoopPractice9 {
    public static void main(String[] args) {
        int num = 3458762;
        int evenSum = 0;
        int oddSum = 0;

        for (int i = num; i != 0; i /= 10) {
            int lastDigit = i % 10;
            if (lastDigit % 2 == 0) {
                evenSum += lastDigit;
            } else {
                oddSum += lastDigit;
            }
        }
        int difference = evenSum - oddSum;
        boolean isPrime = true;
        for (int i = 2; i <= difference / 2; i++) {
            if (difference % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(difference + " is a Prime Number");
        } else {
            System.out.println(difference + " is not a Prime Number");
        }
    }
}
