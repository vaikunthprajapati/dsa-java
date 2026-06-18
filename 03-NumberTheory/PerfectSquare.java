// Perfect square check using Math.sqrt — simplest approach
public class PerfectSquare {
    public static void main(String[] args) {
        int n = 16;
        int root = (int) Math.sqrt(n);
        if (root * root == n) {
            System.out.println("It is a perfect square");
        } else {
            System.out.println("It is not a perfect square");
        }
    }
}

// Perfect square check using odd number sum property (no sqrt, no Math library)
// Sum of first N odd numbers = N^2. Keep subtracting odd numbers until 0 or negative.
class PerfectSquare2 {
    public static void main(String[] args) {
        int x = 81;
        int y = x / 2;
        int z;
        boolean isPerfect = false;
        if (y % 2 == 0) {
            z = y - 1;
        } else {
            z = y;
        }
        int oddSum = 0;
        for (int i = 1; i <= z; i++) {
            if (i % 2 == 1) {
                oddSum += i;
                int s = x - oddSum;
                if (s == 0) {
                    isPerfect = true;
                    break;
                } else {
                    isPerfect = false;
                }
            }
        }
        if (isPerfect) {
            System.out.println("It is a Perfect Square");
        } else {
            System.out.println("It is not a perfect Square");
        }
    }
}
