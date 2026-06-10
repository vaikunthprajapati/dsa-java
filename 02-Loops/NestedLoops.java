// Nested for loop: print all (i, j) pairs where i and j both go 0 to 5
public class NestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}

// Nested for loop with inner break on condition: break only exits the inner loop
// When i==2 OR j==3, inner loop breaks — outer loop continues
class NestedLoops2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (i == 2 || j == 3) {
                    break;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
