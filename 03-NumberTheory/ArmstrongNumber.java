// Armstrong (Narcissistic) number check: sum of each digit^(total digits) == number
public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 1634;
        int temp = number;
        int noOfDigits = 0;
        int sum = 0;

        while (temp != 0) {
            temp = temp / 10;
            noOfDigits++;
        }
        temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, noOfDigits);
            temp = temp / 10;
        }
        if (sum == number) {
            System.out.println("It is a Armstrong Number");
        } else {
            System.out.println("It is not a Armstrong Number");
        }
    }
}

// Print all Armstrong numbers from 1 to 1000
class ArmstrongNumber2 {
    public static void main(String[] args) {
        for (int number = 1; number <= 1000; number++) {
            int temp = number;
            int noOfDigits = 0;
            int sum = 0;

            while (temp != 0) {
                temp = temp / 10;
                noOfDigits++;
            }
            temp = number;
            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, noOfDigits);
                temp = temp / 10;
            }
            if (sum == number) {
                System.out.print(number + " ");
            }
        }
    }
}

// Armstrong check using dedicated methods: noOfDigits() + armstrong() + check()
class ArmstrongNumber3 {
    public static int noOfDigits(int temp) {
        int noOfDigits = 0;
        while (temp != 0) {
            temp = temp / 10;
            noOfDigits++;
        }
        return noOfDigits;
    }

    public static int armstrong(int num, int count) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, count);
            num = num / 10;
        }
        return sum;
    }

    public static void check(int number) {
        int count = noOfDigits(number);
        int sum = armstrong(number, count);
        if (sum == number) {
            System.out.println("It is a Armstrong Number");
        } else {
            System.out.println("It is not a Armstrong Number");
        }
    }

    public static void main(String[] args) {
        int number = 1634;
        check(number);
    }
}
