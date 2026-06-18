// Count only odd factors of a number
public class OddFactorsCount {
    public static void main(String[] args) {
        int number = 120;
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0 && i % 2 != 0) {
                count++;
            }
        }
        System.out.println("Odd factor count is: " + count);
    }
}

// Count odd factors — optimized: loop only to number/2, then check if number itself is odd
class OddFactorsCount2 {
    public static void main(String[] args) {
        int number = 120;
        int count;
        if (number % 2 != 0) {
            count = 1; // number itself is an odd factor
        } else {
            count = 0;
        }
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0 && i % 2 != 0) {
                count++;
            }
        }
        System.out.println("Odd factor count is: " + count);
    }
}
