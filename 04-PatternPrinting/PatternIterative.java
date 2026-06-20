public class PatternIterative {

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 1 — Full Rectangle of Stars
    /*
     *  *  *  *  *
     *  *  *  *  *
     *  *  *  *  *
     *  *  *  *  *
     *  *  *  *  *
    */
    public static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 2 — Rectangle: Numbers 1 to N each row
    /*
    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5
    */
    public static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 3 — Rectangle: Numbers N down to 1 each row
    /*
    5 4 3 2 1
    5 4 3 2 1
    5 4 3 2 1
    5 4 3 2 1
    5 4 3 2 1
    */
    public static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= 1; col--) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 4 — Rectangle: Alternating 1s and 0s (odd col = 1, even col = 0)
    /*
     1  0  1  0  1
     1  0  1  0  1
     1  0  1  0  1
     1  0  1  0  1
     1  0  1  0  1
    */
    public static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col % 2 != 0) System.out.print(" 1 ");
                else              System.out.print(" 0 ");
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 5 — Left Triangle: Stars (increasing)
    /*
     *
     *  *
     *  *  *
     *  *  *  *
     *  *  *  *  *
    */
    public static void pattern5(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 6 — Left Triangle: Numbers 1..row (increasing)
    /*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
    */
    public static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 7 — Left Triangle: Alternating 1s and 0s (increasing rows)
    /*
     1
     1  0
     1  0  1
     1  0  1  0
     1  0  1  0  1
    */
    public static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if (col % 2 != 0) System.out.print(" 1 ");
                else              System.out.print(" 0 ");
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 8 — Right Triangle: Stars (decreasing)
    /*
     *  *  *  *  *
     *  *  *  *
     *  *  *
     *  *
     *
    */
    public static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 9 — Right Triangle: Numbers 1..col (decreasing rows)
    /*
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
    */
    public static void pattern9(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 10 — Right Triangle: Numbers N-row+1 down to 1 (decreasing)
    /*
    5 4 3 2 1
    4 3 2 1
    3 2 1
    2 1
    1
    */
    public static void pattern10(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = n - row + 1; col >= 1; col--) {
                System.out.print(col + "  ");
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 11 — Play Button (Diamond left-half): Stars
    /*
     *
     *  *
     *  *  *
     *  *
     *
    */
    public static void pattern11(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int cols = row > n ? 2 * n - row : row;
            for (int col = 1; col <= cols; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 12 — Play Button (Diamond left-half): Numbers 1..col
    /*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
    */
    public static void pattern12(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int cols = row > n ? 2 * n - row : row;
            for (int col = 1; col <= cols; col++) {
                System.out.print(col + "  ");
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 13 — Play Button (Diamond left-half): Numbers col..1 (decreasing)
    /*
    1
    2 1
    3 2 1
    4 3 2 1
    5 4 3 2 1
    4 3 2 1
    3 2 1
    2 1
    1
    */
    public static void pattern13(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int cols = row > n ? 2 * n - row : row;
            for (int col = cols; col >= 1; col--) {
                System.out.print(col + "  ");
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 14 — Play Button (Diamond left-half): Alternating 1s and 0s
    /*
     1
     1  0
     1  0  1
     1  0  1  0
     1  0  1  0  1
     1  0  1  0
     1  0  1
     1  0
     1
    */
    public static void pattern14(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int cols = row > n ? 2 * n - row : row;
            for (int col = 1; col <= cols; col++) {
                if (col % 2 == 0) System.out.print(" 0 ");
                else              System.out.print(" 1 ");
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 15 — Inverted Play Button (hourglass halves): Stars
    /*
     *  *  *  *  *
     *  *  *  *
     *  *  *
     *  *  *  *
     *  *  *  *  *
    */
    public static void pattern15(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int cols = row > n ? row : 2 * n - row;
            for (int col = 1; col <= cols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 16 — Inverted Play Button: Numbers 1..col
    /*
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2 3 4
    1 2 3 4 5
    */
    public static void pattern16(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int cols = row > n ? row : 2 * n - row;
            for (int col = 1; col <= cols; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 17 — Right-aligned Triangle: Stars (spaces on left)
    /*
             *
           * *
         * * *
       * * * *
     * * * * *
    */
    public static void pattern17(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 18 — Right-aligned Triangle: Numbers 1..row
    /*
            1
          1 2
        1 2 3
      1 2 3 4
    1 2 3 4 5
    */
    public static void pattern18(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 19 — Right-aligned Triangle: Numbers row..1 (decreasing)
    /*
            1
          2 1
        3 2 1
      4 3 2 1
    5 4 3 2 1
    */
    public static void pattern19(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 20 — Right-aligned Triangle: Space numbers + decreasing col numbers
    /*
    1 2 3 4 1
    1 2 3 2 1
    1 2 3 2 1
    1 4 3 2 1
    5 4 3 2 1
    */
    public static void pattern20(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(space + " ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 21 — Right-aligned Triangle: 0s for spaces, 1s for stars
    /*
    0 0 0 0 1
    0 0 0 1 1
    0 0 1 1 1
    0 1 1 1 1
    1 1 1 1 1
    */
    public static void pattern21(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print("0 ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("1 ");
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 22 — Right-aligned Triangle: space numbers + col numbers
    /*
    1 2 3 4 1
    1 2 3 1 2
    1 2 1 2 3
    1 1 2 3 4
    1 2 3 4 5
    */
    public static void pattern22(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(space + " ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 23 — Left-aligned inverted triangle with leading spaces
    /*
    * * * * *
      * * * *
        * * *
          * *
            *
    */
    public static void pattern23(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= row - 1; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 24 — Left-aligned inverted: Space/Col number mix
    /*
    1 2 3 4 5
    1 1 2 3 4
    2 1 1 2 3
    3 2 1 1 2
    4 3 2 1 1
    */
    public static void pattern24(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = row - 1; space >= 1; space--) {
                System.out.print(space + " ");
            }
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 25 — Pyramid: Stars centred
    /*
            *
          * * *
        * * * * *
      * * * * * * *
    * * * * * * * * *
    */
    public static void pattern25(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 26 — Inverted Pyramid: Stars centred
    /*
    * * * * * * * * *
      * * * * * * *
        * * * * *
          * * *
            *
    */
    public static void pattern26(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= row - 1; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2 * n - 2 * row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 27 — Diamond: Stars
    /*
            *
          * * *
        * * * * *
      * * * * * * *
    * * * * * * * * *
      * * * * * * *
        * * * * *
          * * *
            *
    */
    public static void pattern27(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int totalSpace = (row <= n) ? n - row     : row - n;
            int totalCol   = (row <= n) ? 2 * row - 1 : 2 * (2 * n - row) - 1;
            for (int space = 1; space <= totalSpace; space++) System.out.print("  ");
            for (int col   = 1; col   <= totalCol;   col++)   System.out.print("* ");
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 28 — Damru (Hourglass): Stars — with repeated centre row
    /*
    * * * * * * * * *
      * * * * * * *
        * * * * *
          * * *
            *
            *
          * * *
        * * * * *
      * * * * * * *
    * * * * * * * * *
    */
    public static void pattern28(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalSpace = (row > n) ? n - (row - n)       : row - 1;
            int totalCol   = (row > n) ? 2 * row - 2 * n - 1 : 2 * n - 2 * row + 1;
            for (int space = 1; space <= totalSpace; space++) System.out.print("  ");
            for (int col   = 1; col   <= totalCol;   col++)   System.out.print("* ");
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 29 — Damru (Hourglass): Stars — single centre row
    /*
    * * * * * * * * *
      * * * * * * *
        * * * * *
          * * *
            *
          * * *
        * * * * *
      * * * * * * *
    * * * * * * * * *
    */
    public static void pattern29(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int totalSpace = (row > n) ? n - (row - n) - 1   : row - 1;
            int totalCol   = (row > n) ? 2 * row - 2 * n + 1 : 2 * n - 2 * row + 1;
            for (int space = 1; space <= totalSpace; space++) System.out.print("  ");
            for (int col   = 1; col   <= totalCol;   col++)   System.out.print("* ");
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 30 — Right-leaning Damru: Stars
    /*
    * * * * *
      * * * *
        * * *
          * *
            *
            *
          * *
        * * *
      * * * *
    * * * * *
    */
    public static void pattern30(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalSpace = (row > n) ? 2 * n - row : row - 1;
            int totalCol   = (row > n) ? row - n      : n - row + 1;
            for (int space = 1; space <= totalSpace; space++) System.out.print("  ");
            for (int col   = 1; col   <= totalCol;   col++)   System.out.print("* ");
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 31 — Left-leaning Damru: Stars
    /*
            *
          * *
        * * *
      * * * *
    * * * * *
      * * * *
        * * *
          * *
            *
    */
    public static void pattern31(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int totalSpace = (row > n) ? row - n      : n - row;
            int totalCol   = (row > n) ? 2 * n - row  : row;
            for (int space = 1; space <= totalSpace; space++) System.out.print("  ");
            for (int col   = 1; col   <= totalCol;   col++)   System.out.print("* ");
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 32 — Hollow Triangle
    /*
        *
       * *
      *   *
     *     *
    *********
    */
    public static void pattern32(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) System.out.print(" ");
            if (row == 1) {
                System.out.print("*");
            } else if (row == n) {
                for (int i = 1; i <= 2 * n - 1; i++) System.out.print("*");
            } else {
                System.out.print("*");
                for (int i = 1; i <= 2 * row - 3; i++) System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 33 — Hollow Diamond
    /*
        *
       * *
      *   *
     *     *
    *       *
     *     *
      *   *
       * *
        *
    */
    public static void pattern33(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int totalSpace = row > n ? row - n : n - row;
            for (int space = 1; space <= totalSpace; space++) System.out.print(" ");
            if (row == 1 || row == 2 * n - 1) {
                System.out.print("*");
            } else {
                System.out.print("*");
                int innerSpace = row > n ? 2 * n - 2 * row + 7 : 2 * row - 3;
                for (int i = 1; i <= innerSpace; i++) System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 34 — Prime number grid (1 = prime, 0 = not prime)
    /*
     0  1  1
     0  1  1
     0  1  1
    */
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) if (num % i == 0) return false;
        return true;
    }

    public static void pattern34(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(isPrime(col) ? " 1 " : " 0 ");
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 35 — Sequential numbers in inverted pyramid
    /*
     1  2  3  4  5  6  7  8  9
        10 11 12 13 14 15 16
           17 18 19 20 21
              22 23 24
                 25
    */
    public static void pattern35(int n) {
        int num = 1;
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= row - 1; space++) System.out.print("   ");
            for (int col = 1; col <= 2 * n - 2 * row + 1; col++) {
                System.out.printf("%3d", num++);
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 36 — Pyramid with primes
    /*
                2
            3   5   7
        11  13  17  19  23
    29  31  37  41  43  47  53
    59  61  67  71  73  79  83  89  97
    */
    public static int nextPrime(int num) {
        num++;
        while (!isPrime(num)) num++;
        return num;
    }

    public static void pattern36(int n) {
        int prime = 2;
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) System.out.print("    ");
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.printf("%03d ", prime);
                prime = nextPrime(prime);
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 37 — Pyramid with 0s on sides and stars alternating inside
    /*
    0000*1111
    000***111
    00*****11
    0*******1
    *********
    */
    public static void pattern37(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) System.out.print("0");
            for (int star  = 1; star  <= 2 * row - 1; star++) System.out.print("*");
            for (int k     = 1; k     <= n - row; k++)         System.out.print("1");
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 38 — Hollow inverted pyramid (stars only on border)
    /*
    * * * * * * * * *
      *           *
        *       *
          *   *
            *
    */
    public static void pattern38(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= row - 1; space++) System.out.print("  ");
            int maxStar = (2 * n - 1) - (2 * row - 2);
            for (int star = 1; star <= maxStar; star++) {
                if (row == 1 || star == 1 || star == maxStar) System.out.print(" *");
                else                                           System.out.print("  ");
            }
            System.out.println();
        }
    }

    // ─────────────────────────────────────────────────────────────────────────────

    public static void main(String[] args) {
        int n = 5;

        System.out.println("=== PATTERN 1: Full Rectangle of Stars ===");
        pattern1(n); System.out.println();

        System.out.println("=== PATTERN 2: Numbers 1..N each row ===");
        pattern2(n); System.out.println();

        System.out.println("=== PATTERN 3: Numbers N..1 each row ===");
        pattern3(n); System.out.println();

        System.out.println("=== PATTERN 4: Alternating 1s and 0s ===");
        pattern4(n); System.out.println();

        System.out.println("=== PATTERN 5: Left Triangle Stars ===");
        pattern5(n); System.out.println();

        System.out.println("=== PATTERN 6: Left Triangle 1..row ===");
        pattern6(n); System.out.println();

        System.out.println("=== PATTERN 7: Left Triangle 1 0 alternating ===");
        pattern7(n); System.out.println();

        System.out.println("=== PATTERN 8: Right Triangle Stars (decreasing) ===");
        pattern8(n); System.out.println();

        System.out.println("=== PATTERN 9: Right Triangle 1..col (decreasing rows) ===");
        pattern9(n); System.out.println();

        System.out.println("=== PATTERN 10: Right Triangle col..1 (decreasing) ===");
        pattern10(n); System.out.println();

        System.out.println("=== PATTERN 11: Play Button Stars ===");
        pattern11(n); System.out.println();

        System.out.println("=== PATTERN 12: Play Button 1..col ===");
        pattern12(n); System.out.println();

        System.out.println("=== PATTERN 13: Play Button col..1 ===");
        pattern13(n); System.out.println();

        System.out.println("=== PATTERN 14: Play Button 1s and 0s ===");
        pattern14(n); System.out.println();

        System.out.println("=== PATTERN 15: Inverted Play Button Stars ===");
        pattern15(n); System.out.println();

        System.out.println("=== PATTERN 16: Inverted Play Button 1..col ===");
        pattern16(n); System.out.println();

        System.out.println("=== PATTERN 17: Right-aligned Triangle Stars ===");
        pattern17(n); System.out.println();

        System.out.println("=== PATTERN 18: Right-aligned Triangle 1..row ===");
        pattern18(n); System.out.println();

        System.out.println("=== PATTERN 19: Right-aligned Triangle row..1 ===");
        pattern19(n); System.out.println();

        System.out.println("=== PATTERN 20: Space numbers + decreasing col ===");
        pattern20(n); System.out.println();

        System.out.println("=== PATTERN 21: 0s for spaces, 1s for stars ===");
        pattern21(n); System.out.println();

        System.out.println("=== PATTERN 22: Space numbers + col numbers ===");
        pattern22(n); System.out.println();

        System.out.println("=== PATTERN 23: Leading-space inverted triangle ===");
        pattern23(n); System.out.println();

        System.out.println("=== PATTERN 24: Space/Col number mix ===");
        pattern24(n); System.out.println();

        System.out.println("=== PATTERN 25: Centred Pyramid Stars ===");
        pattern25(n); System.out.println();

        System.out.println("=== PATTERN 26: Inverted Centred Pyramid Stars ===");
        pattern26(n); System.out.println();

        System.out.println("=== PATTERN 27: Diamond Stars ===");
        pattern27(n); System.out.println();

        System.out.println("=== PATTERN 28: Damru Stars (repeated centre) ===");
        pattern28(n); System.out.println();

        System.out.println("=== PATTERN 29: Damru Stars (single centre) ===");
        pattern29(n); System.out.println();

        System.out.println("=== PATTERN 30: Right-leaning Damru Stars ===");
        pattern30(n); System.out.println();

        System.out.println("=== PATTERN 31: Left-leaning Damru Stars ===");
        pattern31(n); System.out.println();

        System.out.println("=== PATTERN 32: Hollow Triangle ===");
        pattern32(n); System.out.println();

        System.out.println("=== PATTERN 33: Hollow Diamond ===");
        pattern33(n); System.out.println();

        System.out.println("=== PATTERN 34: Prime number grid ===");
        pattern34(n); System.out.println();

        System.out.println("=== PATTERN 35: Sequential numbers inverted pyramid ===");
        pattern35(n); System.out.println();

        System.out.println("=== PATTERN 36: Pyramid with primes ===");
        pattern36(n); System.out.println();

        System.out.println("=== PATTERN 37: 0s-stars-1s pyramid ===");
        pattern37(n); System.out.println();

        System.out.println("=== PATTERN 38: Hollow inverted pyramid ===");
        pattern38(n); System.out.println();
    }
}
