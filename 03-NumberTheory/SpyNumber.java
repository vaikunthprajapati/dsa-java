// Spy number check: sum of digits == product of digits
// e.g. 123 → sum = 6, product = 6 ✓
public class SpyNumber {
    public static void main(String[] args) {
        int n = 123;
        int lastDigit, temp = n, sum = 0, mul = 1;
        while (temp != 0) {
            lastDigit = temp % 10;
            sum += lastDigit;
            mul *= lastDigit;
            temp /= 10;
        }
        if (sum == mul) {
            System.out.println("Spy number");
        } else {
            System.out.println("Not a Spy number");
        }
    }
}
