// Reverse a number using a for loop
public class ReverseNumber {
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

// Reverse a number using a while loop
class ReverseNumber2 {
    public static void main(String[] args) {
        int number = 4567;
        int reverse = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        System.out.println("The Reversed Number is : " + reverse);
    }
}
