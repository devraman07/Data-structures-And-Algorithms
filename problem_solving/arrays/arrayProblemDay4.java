import java.util.HashMap;
import java.util.Map;

public class arrayProblemDay4 {

    static int[] TwoSum(int arr[], int targetSum) {
      Map<Integer, Integer> seen = new HashMap<>(); // value -> index

    for (int i = 0; i < arr.length; i++) {
        int complement = targetSum - arr[i];
        if (seen.containsKey(complement)) {
            return new int[] { seen.get(complement), i };
        }
        seen.put(arr[i], i);
    }

    return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
    int arr[] = {2, 1, 5, 3, 8, 7, 9, 6, 10};
    int ans[] = TwoSum(arr, 13);
    System.out.println(ans[0]);
    System.out.println(ans[1]);
    }
}
