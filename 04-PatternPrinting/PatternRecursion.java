public class PatternRecursion {

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 1 — Full Rectangle of Stars
    /*
     *  *  *  *  *
     *  *  *  *  *
     *  *  *  *  *
     *  *  *  *  *
     *  *  *  *  *
    */
    static void p1_col(int col, int maxCol) {
        if (col > maxCol) return;
        System.out.print(" * ");
        p1_col(col + 1, maxCol);
    }
    static void p1_row(int row, int maxRow, int maxCol) {
        if (row > maxRow) return;
        p1_col(1, maxCol);
        System.out.println();
        p1_row(row + 1, maxRow, maxCol);
    }
    public static void pattern1(int n) { p1_row(1, n, n); }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 2 — Rectangle: Numbers 1 to N each row
    /*
    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5
    */
    static void p2_col(int col, int maxCol) {
        if (col > maxCol) return;
        System.out.print(col + " ");
        p2_col(col + 1, maxCol);
    }
    static void p2_row(int row, int maxRow, int maxCol) {
        if (row > maxRow) return;
        p2_col(1, maxCol);
        System.out.println();
        p2_row(row + 1, maxRow, maxCol);
    }
    public static void pattern2(int n) { p2_row(1, n, n); }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 3 — Rectangle: Numbers N down to 1 each row
    /*
    5 4 3 2 1
    5 4 3 2 1
    5 4 3 2 1
    5 4 3 2 1
    5 4 3 2 1
    */
    static void p3_col(int col) {
        if (col == 0) return;
        System.out.print(col + " ");
        p3_col(col - 1);
    }
    static void p3_row(int row, int maxRow, int maxCol) {
        if (row > maxRow) return;
        p3_col(maxCol);
        System.out.println();
        p3_row(row + 1, maxRow, maxCol);
    }
    public static void pattern3(int n) { p3_row(1, n, n); }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 4 — Rectangle: Alternating 1s and 0s
    /*
     1  0  1  0  1
     1  0  1  0  1
     1  0  1  0  1
     1  0  1  0  1
     1  0  1  0  1
    */
    static void p4_col(int col, int maxCol) {
        if (col > maxCol) return;
        System.out.print(col % 2 == 0 ? " 0 " : " 1 ");
        p4_col(col + 1, maxCol);
    }
    static void p4_row(int row, int maxRow, int maxCol) {
        if (row > maxRow) return;
        p4_col(1, maxCol);
        System.out.println();
        p4_row(row + 1, maxRow, maxCol);
    }
    public static void pattern4(int n) { p4_row(1, n, n); }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 5 — Left Triangle: Stars (increasing)
    /*
     *
     *  *
     *  *  *
     *  *  *  *
     *  *  *  *  *
    */
    static void p5_col(int col, int maxCol) {
        if (col > maxCol) return;
        System.out.print(" * ");
        p5_col(col + 1, maxCol);
    }
    static void p5_row(int row, int maxRow) {
        if (row > maxRow) return;
        p5_col(1, row);
        System.out.println();
        p5_row(row + 1, maxRow);
    }
    public static void pattern5(int n) { p5_row(1, n); }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 6 — Left Triangle: Numbers 1..row
    /*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
    */
    static void p6_col(int col, int maxCol) {
        if (col > maxCol) return;
        System.out.print(col + " ");
        p6_col(col + 1, maxCol);
    }
    static void p6_row(int row, int maxRow) {
        if (row > maxRow) return;
        p6_col(1, row);
        System.out.println();
        p6_row(row + 1, maxRow);
    }
    public static void pattern6(int n) { p6_row(1, n); }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 7 — Left Triangle: Alternating 1s and 0s
    /*
     1
     1  0
     1  0  1
     1  0  1  0
     1  0  1  0  1
    */
    static void p7_col(int col, int maxCol) {
        if (col > maxCol) return;
        System.out.print(col % 2 == 0 ? " 0 " : " 1 ");
        p7_col(col + 1, maxCol);
    }
    static void p7_row(int row, int maxRow) {
        if (row > maxRow) return;
        p7_col(1, row);
        System.out.println();
        p7_row(row + 1, maxRow);
    }
    public static void pattern7(int n) { p7_row(1, n); }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 8 — Right Triangle: Stars (decreasing)
    /*
     *  *  *  *  *
     *  *  *  *
     *  *  *
     *  *
     *
    */
    static void p8_col(int col, int maxCol) {
        if (col > maxCol) return;
        System.out.print(" * ");
        p8_col(col + 1, maxCol);
    }
    static void p8_row(int row, int maxRow) {
        if (row > maxRow) return;
        p8_col(1, maxRow - row + 1);
        System.out.println();
        p8_row(row + 1, maxRow);
    }
    public static void pattern8(int n) { p8_row(1, n); }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 9 — Right Triangle: Numbers 1..col (decreasing rows)
    /*
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
    */
    static void p9_col(int col, int maxCol) {
        if (col > maxCol) return;
        System.out.print(col + " ");
        p9_col(col + 1, maxCol);
    }
    static void p9_row(int row, int maxRow) {
        if (row > maxRow) return;
        p9_col(1, maxRow - row + 1);
        System.out.println();
        p9_row(row + 1, maxRow);
    }
    public static void pattern9(int n) { p9_row(1, n); }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 10 — Right Triangle: Numbers col..1 (decreasing)
    /*
    5 4 3 2 1
    4 3 2 1
    3 2 1
    2 1
    1
    */
    static void p10_col(int col) {
        if (col == 0) return;
        System.out.print(col + "  ");
        p10_col(col - 1);
    }
    static void p10_row(int row, int maxRow) {
        if (row > maxRow) return;
        p10_col(maxRow - row + 1);
        System.out.println();
        p10_row(row + 1, maxRow);
    }
    public static void pattern10(int n) { p10_row(1, n); }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 11 — Play Button: Stars
    /*
     *
     *  *
     *  *  *
     *  *  *  *
     *  *  *  *  *
     *  *  *  *
     *  *  *
     *  *
     *
    */
    static void p11_col(int col, int maxCol) {
        if (col > maxCol) return;
        System.out.print(" * ");
        p11_col(col + 1, maxCol);
    }
    static void p11_row(int row, int maxRow) {
        if (row == 2 * maxRow) return;
        int cols = row > maxRow ? 2 * maxRow - row : row;
        p11_col(1, cols);
        System.out.println();
        p11_row(row + 1, maxRow);
    }
    public static void pattern11(int n) { p11_row(1, n); }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 12 — Play Button: Numbers 1..col
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
    static void p12_col(int col, int maxCol) {
        if (col > maxCol) return;
        System.out.print(col + "  ");
        p12_col(col + 1, maxCol);
    }
    static void p12_row(int row, int maxRow) {
        if (row == 2 * maxRow) return;
        int cols = row > maxRow ? 2 * maxRow - row : row;
        p12_col(1, cols);
        System.out.println();
        p12_row(row + 1, maxRow);
    }
    public static void pattern12(int n) { p12_row(1, n); }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 13 — Play Button: Numbers col..1 (decreasing)
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
    static void p13_col(int col) {
        if (col == 0) return;
        System.out.print(col + "  ");
        p13_col(col - 1);
    }
    static void p13_row(int row, int maxRow) {
        if (row == 2 * maxRow) return;
        int cols = row > maxRow ? 2 * maxRow - row : row;
        p13_col(cols);
        System.out.println();
        p13_row(row + 1, maxRow);
    }
    public static void pattern13(int n) { p13_row(1, n); }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 14 — Play Button: Alternating 1s and 0s
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
    static void p14_col(int col, int maxCol) {
        if (col > maxCol) return;
        System.out.print(col % 2 == 0 ? " 0 " : " 1 ");
        p14_col(col + 1, maxCol);
    }
    static void p14_row(int row, int maxRow) {
        if (row == 2 * maxRow) return;
        int cols = row > maxRow ? 2 * maxRow - row : row;
        p14_col(1, cols);
        System.out.println();
        p14_row(row + 1, maxRow);
    }
    public static void pattern14(int n) { p14_row(1, n); }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 15 — Inverted Play Button: Stars
    /*
     *  *  *  *  *
     *  *  *  *
     *  *  *
     *  *  *  *
     *  *  *  *  *
    */
    static void p15_col(int col, int maxCol) {
        if (col > maxCol) return;
        System.out.print("* ");
        p15_col(col + 1, maxCol);
    }
    static void p15_row(int row, int n) {
        if (row > 2 * n - 1) return;
        int cols = row > n ? row : 2 * n - row;
        p15_col(1, cols);
        System.out.println();
        p15_row(row + 1, n);
    }
    public static void pattern15(int n) { p15_row(1, n); }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 16 — Right-aligned Triangle: Stars
    /*
             *
           * *
         * * *
       * * * *
     * * * * *
    */
    static void p16_col(int col, int maxCol) {
        if (col > maxCol) return;
        System.out.print(" *");
        p16_col(col + 1, maxCol);
    }
    static void p16_space(int space, int maxSpace) {
        if (space > maxSpace) return;
        System.out.print("  ");
        p16_space(space + 1, maxSpace);
    }
    static void p16_row(int row, int maxRow) {
        if (row > maxRow) return;
        p16_space(1, maxRow - row);
        p16_col(1, row);
        System.out.println();
        p16_row(row + 1, maxRow);
    }
    public static void pattern16(int n) { p16_row(1, n); }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 17 — Right-aligned Triangle: Numbers 1..row
    /*
            1
          1 2
        1 2 3
      1 2 3 4
    1 2 3 4 5
    */
    static void p17_col(int col, int maxCol) {
        if (col > maxCol) return;
        System.out.print(col + " ");
        p17_col(col + 1, maxCol);
    }
    static void p17_space(int space, int maxSpace) {
        if (space > maxSpace) return;
        System.out.print("  ");
        p17_space(space + 1, maxSpace);
    }
    static void p17_row(int row, int maxRow) {
        if (row > maxRow) return;
        p17_space(1, maxRow - row);
        p17_col(1, row);
        System.out.println();
        p17_row(row + 1, maxRow);
    }
    public static void pattern17(int n) { p17_row(1, n); }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 18 — Right-aligned Triangle: Numbers row..1 (decreasing)
    /*
            1
          2 1
        3 2 1
      4 3 2 1
    5 4 3 2 1
    */
    static void p18_col(int col) {
        if (col < 1) return;
        System.out.print(col + " ");
        p18_col(col - 1);
    }
    static void p18_space(int space, int maxSpace) {
        if (space > maxSpace) return;
        System.out.print("  ");
        p18_space(space + 1, maxSpace);
    }
    static void p18_row(int row, int maxRow) {
        if (row > maxRow) return;
        p18_space(1, maxRow - row);
        p18_col(row);
        System.out.println();
        p18_row(row + 1, maxRow);
    }
    public static void pattern18(int n) { p18_row(1, n); }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 19 — Right-aligned Triangle: Space + decreasing col numbers
    /*
    1 2 3 4 1
    1 2 3 2 1
    1 2 3 2 1
    1 4 3 2 1
    5 4 3 2 1
    */
    static void p19_col(int col) {
        if (col == 0) return;
        System.out.print(col + " ");
        p19_col(col - 1);
    }
    static void p19_space(int space, int maxSpace) {
        if (space > maxSpace) return;
        System.out.print(space + " ");
        p19_space(space + 1, maxSpace);
    }
    static void p19_row(int row, int maxRow) {
        if (row > maxRow) return;
        p19_space(1, maxRow - row);
        p19_col(row);
        System.out.println();
        p19_row(row + 1, maxRow);
    }
    public static void pattern19(int n) { p19_row(1, n); }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 20 — Right-aligned Triangle: Decreasing space + decreasing col
    /*
    4 3 2 1 1
    3 2 1 2 1
    2 1 3 2 1
    1 4 3 2 1
    5 4 3 2 1
    */
    static void p20_col(int col) {
        if (col == 0) return;
        System.out.print(col + " ");
        p20_col(col - 1);
    }
    static void p20_space(int space) {
        if (space == 0) return;
        System.out.print(space + " ");
        p20_space(space - 1);
    }
    static void p20_row(int row, int maxRow) {
        if (row > maxRow) return;
        p20_space(maxRow - row);
        p20_col(row);
        System.out.println();
        p20_row(row + 1, maxRow);
    }
    public static void pattern20(int n) { p20_row(1, n); }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 21 — Left-aligned inverted triangle with leading spaces
    /*
    * * * * *
      * * * *
        * * *
          * *
            *
    */
    static void p21_col(int col, int maxCol) {
        if (col > maxCol) return;
        System.out.print(" *");
        p21_col(col + 1, maxCol);
    }
    static void p21_space(int space) {
        if (space == 0) return;
        System.out.print("  ");
        p21_space(space - 1);
    }
    static void p21_row(int row, int maxRow) {
        if (row > maxRow) return;
        p21_space(row - 1);
        p21_col(1, maxRow - row + 1);
        System.out.println();
        p21_row(row + 1, maxRow);
    }
    public static void pattern21(int n) { p21_row(1, n); }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 22 — Leading-space inverted: space/col number mix
    /*
    1 2 3 4 5
    1 1 2 3 4
    2 1 1 2 3
    3 2 1 1 2
    4 3 2 1 1
    */
    static void p22_col(int col, int maxCol) {
        if (col > maxCol) return;
        System.out.print(col + " ");
        p22_col(col + 1, maxCol);
    }
    static void p22_space(int space) {
        if (space == 0) return;
        System.out.print(space + " ");
        p22_space(space - 1);
    }
    static void p22_row(int row, int maxRow) {
        if (row > maxRow) return;
        p22_space(row - 1);
        p22_col(1, maxRow - row + 1);
        System.out.println();
        p22_row(row + 1, maxRow);
    }
    public static void pattern22(int n) { p22_row(1, n); }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 23 — Leading-space inverted: decreasing space + decreasing col
    /*
    5 4 3 2 1
    1 4 3 2 1
    2 1 3 2 1
    3 2 1 2 1
    4 3 2 1 1
    */
    static void p23_col(int col) {
        if (col == 0) return;
        System.out.print(col + " ");
        p23_col(col - 1);
    }
    static void p23_space(int space) {
        if (space == 0) return;
        System.out.print(space + " ");
        p23_space(space - 1);
    }
    static void p23_row(int row, int maxRow) {
        if (row > maxRow) return;
        p23_space(row - 1);
        p23_col(maxRow - row + 1);
        System.out.println();
        p23_row(row + 1, maxRow);
    }
    public static void pattern23(int n) { p23_row(1, n); }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 24 — Centred Pyramid: Stars
    /*
            *
          * * *
        * * * * *
      * * * * * * *
    * * * * * * * * *
    */
    static void p24_col(int col, int maxCol) {
        if (col > maxCol) return;
        System.out.print("* ");
        p24_col(col + 1, maxCol);
    }
    static void p24_space(int space, int maxSpace) {
        if (space > maxSpace) return;
        System.out.print("  ");
        p24_space(space + 1, maxSpace);
    }
    static void p24_row(int row, int maxRow) {
        if (row > maxRow) return;
        p24_space(1, maxRow - row);
        p24_col(1, 2 * row - 1);
        System.out.println();
        p24_row(row + 1, maxRow);
    }
    public static void pattern24(int n) { p24_row(1, n); }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 25 — Inverted Centred Pyramid: Stars
    /*
    * * * * * * * * *
      * * * * * * *
        * * * * *
          * * *
            *
    */
    static void p25_col(int col, int maxCol) {
        if (col > maxCol) return;
        System.out.print("* ");
        p25_col(col + 1, maxCol);
    }
    static void p25_space(int space, int maxSpace) {
        if (space > maxSpace) return;
        System.out.print("  ");
        p25_space(space + 1, maxSpace);
    }
    static void p25_row(int row, int maxRow) {
        if (row > maxRow) return;
        p25_space(1, row - 1);
        p25_col(1, 2 * maxRow - 2 * row + 1);
        System.out.println();
        p25_row(row + 1, maxRow);
    }
    public static void pattern25(int n) { p25_row(1, n); }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 26 — Diamond: Stars
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
    static void p26_col(int col, int maxCol) {
        if (col > maxCol) return;
        System.out.print("* ");
        p26_col(col + 1, maxCol);
    }
    static void p26_space(int space, int maxSpace) {
        if (space > maxSpace) return;
        System.out.print("  ");
        p26_space(space + 1, maxSpace);
    }
    static void p26_row(int row, int maxRow) {
        if (row == 2 * maxRow) return;
        int totalSpace = row > maxRow ? row - maxRow  : maxRow - row;
        int totalCol   = row > maxRow ? 2 * (2 * maxRow - row) - 1 : 2 * row - 1;
        p26_space(1, totalSpace);
        p26_col(1, totalCol);
        System.out.println();
        p26_row(row + 1, maxRow);
    }
    public static void pattern26(int n) { p26_row(1, n); }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 27 — Damru (Hourglass): Stars — with repeated centre row
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
    static void p27_col(int col, int maxCol) {
        if (col > maxCol) return;
        System.out.print("* ");
        p27_col(col + 1, maxCol);
    }
    static void p27_space(int space, int maxSpace) {
        if (space > maxSpace) return;
        System.out.print("  ");
        p27_space(space + 1, maxSpace);
    }
    static void p27_row(int row, int maxRow) {
        if (row > 2 * maxRow) return;
        int totalSpace = (row > maxRow) ? maxRow - (row - maxRow)       : row - 1;
        int totalCol   = (row > maxRow) ? 2 * row - 2 * maxRow - 1      : 2 * maxRow - 2 * row + 1;
        p27_space(1, totalSpace);
        p27_col(1, totalCol);
        System.out.println();
        p27_row(row + 1, maxRow);
    }
    public static void pattern27(int n) { p27_row(1, n); }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 28 — Damru (Hourglass): Stars — single centre row
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
    static void p28_col(int col, int maxCol) {
        if (col > maxCol) return;
        System.out.print("* ");
        p28_col(col + 1, maxCol);
    }
    static void p28_space(int space, int maxSpace) {
        if (space > maxSpace) return;
        System.out.print("  ");
        p28_space(space + 1, maxSpace);
    }
    static void p28_row(int row, int maxRow) {
        if (row > 2 * maxRow - 1) return;
        int totalSpace = (row > maxRow) ? maxRow - (row - maxRow) - 1   : row - 1;
        int totalCol   = (row > maxRow) ? 2 * row - 2 * maxRow + 1       : 2 * maxRow - 2 * row + 1;
        p28_space(1, totalSpace);
        p28_col(1, totalCol);
        System.out.println();
        p28_row(row + 1, maxRow);
    }
    public static void pattern28(int n) { p28_row(1, n); }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 29 — Hollow Triangle
    /*
        *
       * *
      *   *
     *     *
    *********
    */
    static void p29_col(int col) {
        if (col == 0) return;
        System.out.print("*");
        p29_col(col - 1);
    }
    static void p29_space(int space) {
        if (space == 0) return;
        System.out.print(" ");
        p29_space(space - 1);
    }
    static void p29_row(int row, int maxRow) {
        if (row > maxRow) return;
        p29_space(maxRow - row);
        if (row == 1) {
            System.out.print("*");
        } else if (row == maxRow) {
            p29_col(2 * maxRow - 1);
        } else {
            System.out.print("*");
            p29_space(2 * row - 3);
            System.out.print("*");
        }
        System.out.println();
        p29_row(row + 1, maxRow);
    }
    public static void pattern29(int n) { p29_row(1, n); }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 30 — Hollow Diamond
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
    static void p30_col(int col) {
        if (col == 0) return;
        System.out.print("*");
        p30_col(col - 1);
    }
    static void p30_space(int space) {
        if (space == 0) return;
        System.out.print(" ");
        p30_space(space - 1);
    }
    static void p30_row(int row, int maxRow) {
        if (row >= 2 * maxRow) return;
        int totalSpace = row > maxRow ? row - maxRow : maxRow - row;
        p30_space(totalSpace);
        if (row == 1 || row == 2 * maxRow - 1) {
            System.out.print("*");
        } else {
            System.out.print("*");
            int innerSpace = row > maxRow ? 2 * maxRow - 2 * row + 7 : 2 * row - 3;
            p30_space(innerSpace);
            System.out.print("*");
        }
        System.out.println();
        p30_row(row + 1, maxRow);
    }
    public static void pattern30(int n) { p30_row(1, n); }

    // ─────────────────────────────────────────────────────────────────────────────
    // PATTERN 31 — Sequential numbers in inverted pyramid
    /*
     1  2  3  4  5  6  7  8  9
        10 11 12 13 14 15 16
           17 18 19 20 21
              22 23 24
                 25
    */
    static int p31_num = 1;
    static void p31_col(int col, int maxCol) {
        if (col > maxCol) return;
        System.out.printf("%3d", p31_num++);
        p31_col(col + 1, maxCol);
    }
    static void p31_space(int space, int maxSpace) {
        if (space > maxSpace) return;
        System.out.print("   ");
        p31_space(space + 1, maxSpace);
    }
    static void p31_row(int row, int maxRow) {
        if (row > maxRow) return;
        p31_space(1, row - 1);
        p31_col(1, 2 * maxRow - 2 * row + 1);
        System.out.println();
        p31_row(row + 1, maxRow);
    }
    public static void pattern31(int n) { p31_num = 1; p31_row(1, n); }

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

        System.out.println("=== PATTERN 16: Right-aligned Triangle Stars ===");
        pattern16(n); System.out.println();

        System.out.println("=== PATTERN 17: Right-aligned Triangle 1..row ===");
        pattern17(n); System.out.println();

        System.out.println("=== PATTERN 18: Right-aligned Triangle row..1 ===");
        pattern18(n); System.out.println();

        System.out.println("=== PATTERN 19: Space numbers + decreasing col ===");
        pattern19(n); System.out.println();

        System.out.println("=== PATTERN 20: Decreasing space + decreasing col ===");
        pattern20(n); System.out.println();

        System.out.println("=== PATTERN 21: Leading-space inverted triangle Stars ===");
        pattern21(n); System.out.println();

        System.out.println("=== PATTERN 22: Space/Col number mix ===");
        pattern22(n); System.out.println();

        System.out.println("=== PATTERN 23: Decreasing space + decreasing col (inverted) ===");
        pattern23(n); System.out.println();

        System.out.println("=== PATTERN 24: Centred Pyramid Stars ===");
        pattern24(n); System.out.println();

        System.out.println("=== PATTERN 25: Inverted Centred Pyramid Stars ===");
        pattern25(n); System.out.println();

        System.out.println("=== PATTERN 26: Diamond Stars ===");
        pattern26(n); System.out.println();

        System.out.println("=== PATTERN 27: Damru Stars (repeated centre) ===");
        pattern27(n); System.out.println();

        System.out.println("=== PATTERN 28: Damru Stars (single centre) ===");
        pattern28(n); System.out.println();

        System.out.println("=== PATTERN 29: Hollow Triangle ===");
        pattern29(n); System.out.println();

        System.out.println("=== PATTERN 30: Hollow Diamond ===");
        pattern30(n); System.out.println();

        System.out.println("=== PATTERN 31: Sequential numbers inverted pyramid ===");
        pattern31(n); System.out.println();
    }
}
