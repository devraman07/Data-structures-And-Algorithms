
public class patterns {

    public static void SolidRectangle() {
        int n = 4;
        int m = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(" " + "*");
            }
            System.out.println();
        }
    }

    public static void solidTriangle() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + "*");
            }
            System.out.println();
        }
    }

    public static void ReverseSolidRhumbus() {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print(" " + "*");
            }
            System.out.println();
        }
    }

    public static void InvertedRightTriangle() {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(" " + "*");
            }
            System.out.println();
        }
    }

    public static void SolidPyramid() {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print(" " + "*");
            }
            System.out.println();
        }
    }

    public static void ReverseSolidPyramid() {
        int n = 7;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print(" ");
            }

            int printstar = 2 * n - i - (i - 1);
            for (int k = 1; k <= printstar; k++) {
                System.out.print(" " + "*");
            }
            System.out.println();
        }
    }

    public static void HollowRectangle() {
        int rows = 4;
        int cols = 6;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void HollowRightTriangle() {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                if (j == 1 || j == i || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // SolidRectangle();
        // solidTriangle();
        // ReverseSolidRhumbus();
        // InvertedRightTriangle();
        // SolidPyramid();
        // ReverseSolidPyramid();
        // HollowRectangle();
        HollowRightTriangle();
        ;
    }
}
