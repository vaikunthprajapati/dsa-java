// Check odd/even without % operator — using division and multiplication trick
public class OddEvenWithoutModulo {
    public static void main(String[] args) {
        int x = 13;
        int y = x / 2;
        if (y * 2 == x) {
            System.out.println("It is Even number");
        } else {
            System.out.println("It is Odd number");
        }
    }
}

// Check odd/even using bitwise AND — no %, /, or * at all
// Last bit of any odd number is always 1; (x & 1) checks that bit directly
class OddEvenWithoutModulo2 {
    public static void main(String[] args) {
        int x = 13;
        if ((x & 1) == 0) {
            System.out.println("It is Even number");
        } else {
            System.out.println("It is Odd number");
        }
    }
}
