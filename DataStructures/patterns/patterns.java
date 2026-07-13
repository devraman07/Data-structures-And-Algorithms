
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

    public static void HollowTriangle() {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            if (i == 1) {

                System.out.print("*");
            } else if (i == n) {

                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
            } else {

                System.out.print("*");
                for (int m = 1; m <= 2 * i - 3; m++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void SolidDiamond() {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void HollowDiamond() {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.print("*");
            } else {
                System.out.print("*");
                for (int j = 1; j <= 2 * (i - 1) - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.print("*");
            } else {
                System.out.print("*");
                for (int j = 1; j <= 2 * (i - 1) - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Butterfly() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void NumberTriangle() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            int counter = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }

    public static void ContinuousNumberTriangle() {
        int n = 4;
        int counter = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void charTriangle() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void ContinuecharTriangle() {
        int n = 4;
        char ch = 'A';
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void numbersfullTriangle() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            int counter = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }

    public static void NumberPyramidUpDown() {
        int n = 4;
        for (int i = 1; i <= n; i++) {

            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void NumberSolidPyramid() {
        int n = 4;
        for(int i = 1;  i <= n; i++) {
            for(int j= 1; j <= n - i; j++) {
                System.out.print( " "  + " ");
            } 
            for(int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void CharPyramidUpDown() {
    int n = 4;
    for (int i = 1; i <= n; i++) {
        
        for (int s = 1; s <= n - i; s++) {
            System.out.print("  ");
        }
      
        for (int j = 1; j <= i; j++) {
            char ch = (char) ('A' + j - 1);
            System.out.print(ch + " ");
        }
        
        for (int j = i - 1; j >= 1; j--) {
            char ch = (char) ('A' + j - 1);
            System.out.print(ch + " ");
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
        // HollowRightTriangle();
        // HollowTriangle();
        // SolidDiamond();
        // HollowDiamond();
        // Butterfly();
        // NumberTriangle();
        // ContinuousNumberTriangle();
        // charTriangle();
        // ContinuecharTriangle();
        // charTriangleDescending();
    //    NumberPyramidUpDown();
    // NumberSolidPyramid();
    CharPyramidUpDown();
    }
}
