// Perfect number check: sum of proper divisors (up to num/2) == num
// e.g. 28 → 1+2+4+7+14 = 28 ✓
public class PerfectNumber {
    public static void main(String[] args) {
        int num = 28;
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.print("The number is perfect");
        } else {
            System.out.println("The number is not perfect");
        }
    }
}

// Print all perfect numbers from 1 to 1000
class PerfectNumber2 {
    public static void main(String[] args) {
        for (int number = 1; number <= 1000; number++) {
            int sum = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            if (number == sum) {
                System.out.print(number + " ");
            }
        }
    }
}

// Perfect number check using dedicated methods: perfect() calculates sum, isPerfect() checks
class PerfectNumber3 {
    public static int perfect(int num, int sum) {
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void isPerfect(int num, int sum) {
        if (sum == num) {
            System.out.print("The number is perfect");
        } else {
            System.out.println("The number is not perfect");
        }
    }

    public static void main(String[] args) {
        int num = 28;
        int sum = 0;
        int result = perfect(num, sum);
        isPerfect(num, result);
    }
}
