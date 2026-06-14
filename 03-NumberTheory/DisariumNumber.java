// Disarium number check: digit^position (from left, 1-indexed) sum == number
// e.g. 135 → 1^1 + 3^2 + 5^3 = 1+9+125 = 135 ✓
public class DisariumNumber {
    public static void main(String[] args) {
        int number = 153;
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
            noOfDigits--;
            temp = temp / 10;
        }
        if (sum == number) {
            System.out.println("It is a Disarium Number");
        } else {
            System.out.println("It is not a Disarium Number");
        }
    }
}

// Print all Disarium numbers from 1 to 1000
class DisariumNumber2 {
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
                noOfDigits--;
                temp = temp / 10;
            }
            if (sum == number) {
                System.out.print(number + " ");
            }
        }
    }
}
