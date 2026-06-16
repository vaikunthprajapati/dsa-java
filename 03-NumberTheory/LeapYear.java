// Leap year check using standard formula: divisible by 4 but not 100, OR divisible by 400
public class LeapYear {
    public static void main(String[] args) {
        int year = 200;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("It is a Leap year");
        } else {
            System.out.println("It is Not a Leap Year");
        }
    }
}

// Leap year check using nested if-else (no logical operators)
class LeapYear2 {
    public static void main(String[] args) {
        int year = 2000;
        if (year % 400 == 0) {
            System.out.println("Leap year");
        } else {
            if (year % 100 == 0) {
                System.out.println("Not a leap year");
            } else {
                if (year % 4 == 0) {
                    System.out.println("Leap year");
                } else {
                    System.out.println("Not a leap year");
                }
            }
        }
    }
}

// Leap year check with Scanner input
import java.util.Scanner;

class LeapYear3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 400 == 0) {
            System.out.println("Leap year");
        } else {
            if (year % 100 == 0) {
                System.out.println("Not a leap year");
            } else {
                if (year % 4 == 0) {
                    System.out.println("Leap year");
                } else {
                    System.out.println("Not a leap year");
                }
            }
        }
    }
}
