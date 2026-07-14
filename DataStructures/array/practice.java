public class practice {

    public static int OddCount(int arr[]) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static void Reverse(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] even(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        int[] even = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even[index] = arr[i];
                index++;
            }
        }

        return even;
    }

    public static void PrintMatrixByRow(int matrix[][]) {
        int row = matrix.length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printMatrixColumnWise(int arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;

        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void SumOfRow(int matrix[][]) {
        int n = matrix.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            System.out.println("the sum of row" + " " + i + "  " + "is :" + sum);
        }
        System.out.println();

    }

    public static void SumBycol(int matrix[][]) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int sum = 0;

        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                sum += matrix[i][j];
            }
            System.out.println("the sum of col" + " " + j + "  " + "is :" + sum);
        }
        System.out.println();
    }

    public static void avarage(int matrix[][]) {
        int row = matrix.length;
        int col = matrix[0].length;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum += matrix[i][j];
                count++;
            }

        }
        int avg = sum / count;
        System.out.println("avarage of totl elements in matrix is:" + avg);

    }

    public static void MaxInRow(int matrix[][]) {
        int row = matrix.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }

            }
            System.out.println("The max element in row" + i + "is:" + max);

        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int arr[] = {
        // 1, 2, 3, 4, 6, 5, 7, 8, 9, 12, 14, 13, 16, 15
        // };

        // System.out.println("The number of odd elements in the array is :" +
        // OddCount(arr));
        // Reverse(arr);
        // int [] result = even(arr);

        // for(int i = 0; i < result.length; i++) {
        // System.out.print(result[i] + " ");
        // }
        // System.out.println();

        int matrix[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 },
        };

        // PrintMatrixByRow(matrix);
        // printMatrixColumnWise(matrix);
        // SumOfRow(matrix);
        // SumBycol(matrix);
        // avarage(matrix);
        MaxInRow(matrix);

    }
}
