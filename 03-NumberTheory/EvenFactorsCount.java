// Count only even factors of a number
// If the number itself is even, start count at 1 (it is its own even factor), else 0
public class EvenFactorsCount {
    public static void main(String[] args) {
        int number = 111;
        int count;
        if (number % 2 == 0) {
            count = 1;
        } else {
            count = 0;
        }

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                if (i % 2 == 0) {
                    count++;
                }
            }
        }
        System.out.print("Count is " + count);
    }
}

// Count even factors — cleaner version using a single loop up to number
class EvenFactorsCount2 {
    public static void main(String[] args) {
        int number = 120;
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0 && i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Even factor count is: " + count);
    }
}
