

public class array {

    public static int MaxValue(int arr[]) {
        int n = arr.length;
        int Max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
           if(arr[i] > Max) {
            Max = arr[i];
           }
        }

        
        return Max;
    }

      public static int MinValue(int arr[]) {
        int n = arr.length;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
           if(arr[i] < min) {
            min = arr[i];
           }
        }

        
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 2, 6, 9, 1, 7, 8};
        System.out.println("maximum value in the array is:" + MinValue(arr));   
    }
}