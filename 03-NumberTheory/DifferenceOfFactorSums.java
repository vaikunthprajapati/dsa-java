// Find difference between sum of odd factors and sum of even factors
public class DifferenceOfFactorSums {
    public static void main(String[] args) {
        int number = 120;
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (i % 2 == 0) {
                    evenSum += i;
                } else {
                    oddSum += i;
                }
            }
        }
        int difference = oddSum - evenSum;
        System.out.println("Odd Factor Sum: " + oddSum);
        System.out.println("Even Factor Sum: " + evenSum);
        System.out.println("The Difference is :" + difference);
    }
}

// Check if the difference of factor sums is positive, negative, or zero
class DifferenceOfFactorSums2 {
    public static void main(String[] args) {
        int number = 120;
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (i % 2 == 0) {
                    evenSum += i;
                } else {
                    oddSum += i;
                }
            }
        }
        int difference = oddSum - evenSum;
        System.out.println("The Difference is :" + difference);
        if (difference > 0) {
            System.out.println("Positive");
        } else if (difference == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negative");
        }
    }
}
