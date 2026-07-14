public class practice {

    // Hollow Rectangle
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

    // solid pyramid
    public static void SolidTriangle() {
        int n = 4;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
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
            for (int j = 1; j <= 2 * n - i - (i - 1); j++) {
                System.out.print(" " + "*");
            }
            System.out.println();
        }
    }

    public static void HollowPyramid() {
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

    public static void NumberTriangle() {
        for(int i= 1;  i <= 4; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //hollow diamond pattern

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

    public static int[][] generatePascalTriangle(int n) {
     int[][] triangle =  new int[n][];
       
     for(int i = 0; i < n; i++) {
        triangle[i] = new int [i + 1];
        triangle[i][0] = 1;
        triangle[i][i] = 1;
        for(int j = 1; j < i; j++) {
            triangle[i][j] = triangle[i-1][j-1] + triangle[i- 1][j];
        }
     }
     
     return triangle;
    }

    public static void Butterfly(int n) {
        for ( int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            } for(int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            } for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
         for ( int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            } for(int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            } for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    } 


    public static void main(String[] args) {
        // HollowRectangle();
        // SolidTriangle();
        // ReverseSolidPyramid();
        // HollowPyramid();
        // NumberTriangle();
        // HollowDiamond();
        //  int[][] result = generatePascalTriangle(5);

        // for (int[] row : result) {
        //     for (int val : row) {
        //         System.out.print(val + " ");
        //     }
        //     System.out.println();
        // }
        Butterfly(4);
    }
}
