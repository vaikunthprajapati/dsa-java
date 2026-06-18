// Prime check using factor count: count factors up to number/2, prime has exactly 2
public class PrimeNumber {
    public static void main(String[] args) {
        int number = 23;
        int count = 1;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.print("Prime Number");
        } else {
            System.out.println("Composite Number");
        }
    }
}

// Prime check using boolean flag — loop from 2 to number-1 (naive, slower)
class PrimeNumber2 {
    public static void main(String[] args) {
        int number = 23;
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("It is a Prime Number");
        } else {
            System.out.println("Composite Number");
        }
    }
}

// Prime check optimized: loop only up to number/2 (half the iterations)
class PrimeNumber3 {
    public static void main(String[] args) {
        int number = 23;
        boolean isPrime = true;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("It is a Prime Number");
        } else {
            System.out.println("Composite Number");
        }
    }
}

// Prime check optimized + break on first divisor found (best approach so far)
class PrimeNumber4 {
    public static void main(String[] args) {
        int number = 24;
        boolean isPrime = true;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("It is a Prime Number");
        } else {
            System.out.println("Composite Number");
        }
    }
}

// Practice: difference of even digit sum and odd digit sum — check if result is prime
// number = 3458762, even digits: 8,6,2 → sum=16; odd digits: 3,5,7 → sum=15; diff=1
class PrimeNumber5 {
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
