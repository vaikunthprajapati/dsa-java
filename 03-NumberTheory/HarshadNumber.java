import java.util.Scanner;

// Harshad (Niven) number check: number divisible by sum of its digits
// e.g. 18 → digit sum = 9, 18 % 9 == 0 ✓
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int number = sc.nextInt();

        int temp = number;
        int digitSum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            digitSum += digit;
            temp /= 10;
        }
        if (number % digitSum == 0) {
            System.out.println("Yes you are a Harshad Number");
        } else {
            System.out.println("You are not a Harshad Number");
        }
    }
}

// Practice: print all Harshad palindrome numbers from 1 to 1000
class HarshadNumber2 {
    public static void main(String[] args) {
        for (int number = 1; number <= 1000; number++) {
            int temp = number;
            int digitSum = 0;
            while (temp != 0) {
                int digit = temp % 10;
                digitSum += digit;
                temp /= 10;
            }
            if (number % digitSum == 0) {
                int rev = 0;
                temp = number;
                while (temp != 0) {
                    rev = rev * 10 + temp % 10;
                    temp /= 10;
                }
                if (number == rev) {
                    System.out.print(number + " ");
                }
            }
        }
    }
}

// Practice: print Harshad palindrome prime numbers from 2 to 1000
class HarshadNumber3 {
    public static void main(String[] args) {
        for (int number = 2; number <= 1000; number++) {
            int temp = number;
            int digitSum = 0;
            while (temp != 0) {
                int digit = temp % 10;
                digitSum += digit;
                temp /= 10;
            }
            if (number % digitSum == 0) {
                int rev = 0;
                temp = number;
                while (temp != 0) {
                    rev = rev * 10 + temp % 10;
                    temp /= 10;
                }
                if (number == rev) {
                    boolean isPrime = true;
                    for (int j = 2; j <= number / 2; j++) {
                        if (number % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime == true) {
                        System.out.println(number + " ");
                    }
                }
            }
        }
    }
}
