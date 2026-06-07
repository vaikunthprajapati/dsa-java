// Largest of two numbers using ternary operator
public class TernaryOperator {
    public static void main(String[] args) {
        int x = 9;
        int y = 8;
        int largest = (x > y) ? x : y;
        System.out.println("Largest Element is : " + largest);
    }
}

// Largest of three numbers using nested ternary operator
class TernaryOperator2 {
    public static void main(String[] args) {
        int x = 3;
        int y = 9;
        int z = 70;
        int largest = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
        System.out.println("Largest element is :" + largest);
    }
}
