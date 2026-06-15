// Print all factors of a number (loop up to number)
public class FactorsCount {
    public static void main(String[] args) {
        int number = 120;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

// Print all factors optimized: loop up to number/2, then print number itself
class FactorsCount2 {
    public static void main(String[] args) {
        int number = 120;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print(number + " ");
    }
}

// Count total number of factors
class FactorsCount3 {
    public static void main(String[] args) {
        int number = 120;
        int count = 1;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        System.out.print("Count is " + count);
    }
}

// Difference between sum of odd factors and sum of even factors
class FactorsCount4 {
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
    }
}
