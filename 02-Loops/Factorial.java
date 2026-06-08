// Factorial of a number using for loop (5! = 120)
public class Factorial {
    public static void main(String[] args) {
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("product is : " + product);
    }
}
