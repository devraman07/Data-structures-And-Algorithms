import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class arrayProblemDay4 {

  public static int[] twoSum(int arr[], int target) {
    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[i] + arr[j] == target) {
          int ans[] = { i, j };
          return ans;
        }
      }
    }

    int missed[] = { -1, -1 };
    return missed;
  }

  public List<List<Integer>> threeSome(int[] arr, int target) {
    Set<List<Integer>> result = new HashSet<>();

    int n = arr.length;

    for (int i = 0; i < n - 2; i++) {
      for (int j = i + 1; j < n - 1; j++) {
        for (int k = j + 1; k < n; k++) {
          if (arr[i] + arr[j] + arr[k] == target) {
            List<Integer> temp = new ArrayList<>();
            temp.add(arr[i]);
            temp.add(arr[j]);
            temp.add(arr[k]);
            Collections.sort(temp);
            result.add(temp);
          }
        }
      }
    }

    return new ArrayList<>(result);
  }

  public int RemoveDuplicatesFromSortedArray(int arr[]) {
    int i = 0;
    int j = 1;
    int n = arr.length;

    while (j < n) {
      if (arr[i] == arr[j]) {
        j++;
      } else {
        i++;
        arr[i] = arr[j];
        j++;
      }
    }
    return i + 1;
  }

  public int findFristRepetedElement(int arr[]) {
    HashMap<Integer, Integer> freq = new HashMap<>();

    for (int el : arr) {
      freq.put(el, freq.getOrDefault(el, 0) + 1);
    }

    for (int i : arr) {
      if (freq.get(i) > 1) {
        return i;
      }
    }

    return -1;
  }

  public int findPivotIndex(int arr[]) {
   int n = arr.length;
    int leftSum[] = new int[n];
    int rightSum[] = new int[n];

    leftSum[0] = arr[0];
    for (int i = 1; i < n; i++) {
        leftSum[i] = leftSum[i - 1] + arr[i];
    }

    rightSum[n - 1] = arr[n - 1];
    for (int i = n - 2; i >= 0; i--) {
        rightSum[i] = rightSum[i + 1] + arr[i];
    }

    for (int i = 0; i < n; i++) {
        
        int left = (i == 0) ? 0 : leftSum[i - 1];
        int right = (i == n - 1) ? 0 : rightSum[i + 1];
        if (left == right) {
            return i;
        }
    }

    return -1;
  }

  public static void main(String[] args) {
    // int arr[] = { 2, 1, 5, 3, 8, 7, 9, 6, 10 };
    // int target = 10;

    // int[] twoSumResult = arrayProblemDay4.twoSum(arr, target);
    // System.out.println("Two Sum indices: [" + twoSumResult[0] + ", " +
    // twoSumResult[1] + "]");

    // arrayProblemDay4 obj = new arrayProblemDay4();
    // List<List<Integer>> triplets = obj.threeSome(arr, target);

    // System.out.println("Three Sum triplets:");
    // for (List<Integer> triplet : triplets) {
    // System.out.println(triplet);
    // }

    int arr[] = { -7, 1, 5, 2, -4, 3, 0 };

    arrayProblemDay4 obj = new arrayProblemDay4();
    // int newLength = obj.RemoveDuplicatesFromSortedArray(arr);

    // System.out.println("New length: " + newLength);
    // System.out.print("Array: ");
    // for (int k = 0; k < newLength; k++) {
    // System.out.print(arr[k] + " ");
    // }

    // int result = obj.findFristRepetedElement(arr);

    // System.out.println("First repeated element: " + result);
    int result = obj.findPivotIndex(arr);
    System.out.println("pivot index: " + result);

  }

}
