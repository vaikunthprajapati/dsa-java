// Print even numbers from 1 to 100 using modulo check
public class EvenNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

// Print even numbers using != 0 check (inverted condition)
class EvenNumbers2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                // skip odd
            } else {
                System.out.print(i + " ");
            }
        }
    }
}

// Print even numbers using == 1 odd check in else
class EvenNumbers3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                // skip odd
            } else {
                System.out.print(i + " ");
            }
        }
    }
}

// Print even numbers using bitwise AND — no % operator
class EvenNumbers4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if ((i & 1) == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

// Print even numbers using division trick — no % or bitwise
class EvenNumbers5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if ((i / 2) * 2 == i) {
                System.out.print(i + " ");
            }
        }
    }
}

// Print even numbers using continue to skip odd numbers
class EvenNumbers6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
