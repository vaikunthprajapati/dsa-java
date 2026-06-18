// Find smallest digit of any number using a loop
// Initialize smallest to 9 (max possible digit) and update downward
public class SmallestDigit {
    public static void main(String[] args) {
        int num = 3458762;
        int smallest = 9;

        for (int i = num; i != 0; i /= 10) {
            int lastDigit = i % 10;
            if (lastDigit < smallest) {
                smallest = lastDigit;
            }
        }
        System.out.println("The smallest digit is: " + smallest);
    }
}
