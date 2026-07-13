public class twoDarray {

   public static int TotalSum(int arr[][]) {
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            sum += arr[i][j];
        }
    }

    return sum;

}

  public static int TotalProduct(int arr[][]) {
    int sum = 0;
    int ans = 1;

    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            sum = arr[i][j];
            ans = ans* sum;
        }
    }

    return ans;

}

  public static int MaxValue(int arr[][]) {
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if(arr[i][j] > max) {
                max = arr[i][j];
            }
        }
    }

    return max;

}

public static int MinValue(int arr[][]) {
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if(arr[i][j] < min) {
                min = arr[i][j];
            }
        }
    }

    return min;

}
    public static void main(String[] args) {

        int arr[][] = {
            {1, 2, 3,},
            {4, 5, 6},
            {7, 8, 9}
        };
     System.out.println("The sum of the 2d array is : " + " " + TotalSum(arr));
     System.out.println("The Product of the 2d array is : " + " " + TotalProduct(arr));
     System.out.println("The max value of the 2d array is : " + " " + MaxValue(arr));
     System.out.println("The min value of the 2d array is : " + " " + MinValue(arr));
    }
}
