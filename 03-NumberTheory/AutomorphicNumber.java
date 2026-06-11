// Automorphic number check: square of number ends with the number itself
// e.g. 76 → 76^2 = 5776, ends in 76 ✓
public class AutomorphicNumber {
    public static void main(String[] args) {
        int num = 76;
        int square = num * num;
        int temp = num;
        int digits = 0;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }
        int modulus = (int) Math.pow(10, digits);
        int lastDigits = square % modulus;
        if (lastDigits == num) {
            System.out.println("It is automorphic");
        } else {
            System.out.println("It is not automorphic");
        }
    }
}

// Print all Automorphic numbers from 1 to 1000
class AutomorphicNumber2 {
    public static void main(String[] args) {
        for (int number = 1; number <= 1000; number++) {
            int digits = 0;
            int square = number * number;
            int temp = number;
            while (temp != 0) {
                digits++;
                temp /= 10;
            }
            int modulo = (int) Math.pow(10, digits);
            int remainder = square % modulo;
            if (remainder == number) {
                System.out.print(number + " ");
            }
        }
    }
}
