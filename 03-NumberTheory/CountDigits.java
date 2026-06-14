// Count total number of digits in a number
public class CountDigits {
    public static void main(String[] args) {
        int num = 3458762;
        int count = 0;

        for (int i = num; i != 0; i /= 10) {
            count++;
        }
        System.out.println("Count is : " + count);
    }
}

// Count even and odd digits — incorrect version (checks i not the extracted digit)
class CountDigits2 {
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

// Count even and odd digits — correct version (extracts last digit first with i%10)
class CountDigits3 {
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
