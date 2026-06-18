// Reverse a number using for loop (foundation for palindrome check)
public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 23456;
        int reverse = 0;
        for (int i = number; i != 0; i /= 10) {
            int lastDigit = i % 10;
            reverse = reverse * 10 + lastDigit;
        }
        System.out.println("The Reversed Number is : " + reverse);
    }
}

// Palindrome check: reverse the number and compare with original
class PalindromeNumber2 {
    public static void main(String[] args) {
        int number = 23456;
        int reverse = 0;
        for (int i = number; i != 0; i /= 10) {
            int lastDigit = i % 10;
            reverse = reverse * 10 + lastDigit;
        }
        if (reverse == number) {
            System.out.println(number + " It is a Palindrome Number ");
        } else {
            System.out.println(number + " It is not a Palindrome Number ");
        }
    }
}

// Print all palindrome numbers from 1 to 1000 using while loop for reversal
class PalindromeNumber3 {
    public static void main(String[] args) {
        System.out.println("The Palindrome Numbers are: ");
        for (int i = 1; i <= 1000; i++) {
            int originalNumber = i;
            int reverseNumber = 0;
            int temp = i;

            while (temp != 0) {
                int digit = temp % 10;
                reverseNumber = reverseNumber * 10 + digit;
                temp = temp / 10;
            }
            if (originalNumber == reverseNumber) {
                System.out.print(originalNumber + " ");
            }
        }
    }
}

// Count even palindrome numbers from 1 to 1000
class PalindromeNumber4 {
    public static void main(String[] args) {
        System.out.println("The Palindrome Numbers are: ");
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            int originalNumber = i;
            int reverseNumber = 0;
            int temp = i;

            while (temp != 0) {
                int digit = temp % 10;
                reverseNumber = reverseNumber * 10 + digit;
                temp = temp / 10;
            }
            if (originalNumber == reverseNumber) {
                if (reverseNumber % 2 == 0) {
                    count++;
                }
            }
        }
        System.out.println("Count Even Palindrome Number is : " + count);
    }
}
