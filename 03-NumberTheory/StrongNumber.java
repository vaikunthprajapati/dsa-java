// Strong number check: sum of factorials of each digit == number
// e.g. 145 → 1! + 4! + 5! = 1+24+120 = 145 ✓
public class StrongNumber {
    public static void main(String[] args) {
        int original = 145;
        int n = original;
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            n = n / 10;
        }
        if (original == sum) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not a strong number");
        }
    }
}
