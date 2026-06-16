// Find largest digit of a 3-digit number (397) by extracting each digit with modulo
// Output: 9
public class LargestDigit {
    public static void main(String[] args) {
        int number = 397;
        int modulo1 = number % 10;   // 7
        number = number / 10;
        int modulo2 = number % 10;   // 9
        number = number / 10;
        int modulo3 = number % 10;   // 3

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

// Find largest digit of any number using a loop (works for any digit count)
class LargestDigit2 {
    public static void main(String[] args) {
        int num = 3458762;
        int largest = 0;

        for (int i = num; i != 0; i /= 10) {
            int lastDigit = i % 10;
            if (lastDigit > largest) {
                largest = lastDigit;
            }
        }
        System.out.println("The largest digit is: " + largest);
    }
}
