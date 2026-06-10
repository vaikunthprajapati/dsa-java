// Sum of all numbers from 1 to 100
public class SumProblems {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum is: " + sum);
    }
}

// Sum of 1 to 100 using a separate method
class SumProblems2 {
    public static int sumOfNumber(int sum) {
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = 0;
        int result = sumOfNumber(sum);
        System.out.println("The sum is : " + result);
    }
}

// Sum of only even numbers from 1 to 100
class SumProblems3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum is: " + sum);
    }
}

// Find numbers from 300 to 600 where remainder by 5 is 3 AND remainder by 8 is 4
class SumProblems4 {
    public static void main(String[] args) {
        for (int i = 300; i <= 600; i++) {
            if (i % 5 == 3 && i % 8 == 4) {
                System.out.print(i + " ");
            }
        }
    }
}

// Same filter (300-600), sum qualifying numbers and check even/odd
class SumProblems5 {
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
            System.out.println("Even");
        }
    }
}

// Same filter (300-600), count qualifying numbers
class SumProblems6 {
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

// From 100 to 400: sum numbers with remainder 1 when divided by 3 vs remainder 2 when divided by 4,
// then check if their difference is positive, negative, or zero
class SumProblems7 {
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
