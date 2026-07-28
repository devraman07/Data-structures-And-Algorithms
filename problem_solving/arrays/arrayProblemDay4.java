

public class arrayProblemDay4 {
  

    public static int[] twoSum(int arr[], int target) {
      int n = arr.length;
            
       for(int i = 0; i < n - 1; i++) {
        for(int j = i + 1; j < n; j++) {
          if(arr[i] + arr[j] == target) {
            int ans [] = {i, j};
            return ans;
          }
        }
       }

         int missed [] = {-1, -1};
         return missed;
    }
   

    public static void main(String[] args) {
    int arr[] = {2, 1, 5, 3, 8, 7, 9, 6, 10};
    int ans[] = twoSum(arr, 18);

    System.out.println(ans[0]);
    System.out.println(ans[1]);
    
       
}

}
