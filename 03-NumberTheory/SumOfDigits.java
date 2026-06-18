// Sum of all digits of a number using a loop
public class SumOfDigits {
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

// Sum of even digits of a number
class SumOfDigits2 {
    public static void main(String[] args) {
        int num = 3458762;
        int sum = 0;

        for (int i = num; i != 0; i /= 10) {
            int lastDigit = i % 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
        }
        System.out.println("Sum of even digits is: " + sum);
    }
}

// Sum of odd digits of a number
class SumOfDigits3 {
    public static void main(String[] args) {
        int num = 3458762;
        int sum = 0;

        for (int i = num; i != 0; i /= 10) {
            int lastDigit = i % 10;
            if (lastDigit % 2 != 0) {
                sum += lastDigit;
            }
        }
        System.out.println("Sum of odd digits is: " + sum);
    }
}

// Difference between even digit sum and odd digit sum — check if result is prime
// number = 3458762: even digits (8,6,2)=16, odd digits (3,5,7)=15, diff=1
class SumOfDigits4 {
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
