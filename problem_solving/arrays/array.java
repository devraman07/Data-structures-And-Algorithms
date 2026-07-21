import java.util.Arrays;

public class array {

  static int avarage(int arr[]) {
    int n = arr.length;
    int sum = 0;
    int avarage = 0;

    for (int i = 0; i < n; i++) {
      sum = sum + arr[i];
    }

    avarage = sum / n;

    return avarage;

  }

  static int[] multiplyBy10(int arr[]) {
    int newArray[] = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
      int Newelement = arr[i] * 10;
      newArray[i] = Newelement;
    }

    return newArray;
  }

  static void linearSearch(int arr[], int key) {
    boolean found = false;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        System.out.println("Element found at index: " + i);
        found = true;
        break;
      }
    }

    if (!found) {
      System.out.println("Element not found");
    }
  }

  public static int findMax(int arr[]) {
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  static int[] sumofPosMin(int arr[]) {
    int posSum = 0;
    int negSum = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 0) {
        posSum = posSum + arr[i];
      } else if (arr[i] < 0) {
        negSum = negSum + arr[i];
      }
    }

    int ans[] = { posSum, negSum };
    return ans;
  }

  public static int[] countOfzeroAndOne(int arr[]) {
    int countOfZero = 0;
    int countOfOne = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        countOfZero++;
      } else if (arr[i] == 1) {
        countOfOne++;
      }
    }
    int ans[] = { countOfOne, countOfZero };
    return ans;
  }

  static void findFristUnsorted(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > arr[i + 1]) {
        System.out.println("the frist occurance of unsorted element found : " + i);
        break;
      }
    }
  }

  static void Printarr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  static void swapAlternates(int arr[]) {
    for (int i = 0; i + 1 < arr.length; i += 3) {
      arr[i] = arr[i] ^ arr[i + 1];
      arr[i + 1] = arr[i] ^ arr[i + 1];
      arr[i] = arr[i] ^ arr[i + 1];
    }

  }

  static void printAlternateExtremes(int arr[]) {
    Arrays.sort(arr);

    int i = 0, j = arr.length - 1;
    boolean printSmall = true;

    while (i <= j) {
      if (printSmall) {
        System.out.print(arr[i] + " ");
        i++;
      } else {
        System.out.print(arr[j] + " ");
        j--;
      }
      printSmall = !printSmall;
    }
  }

  static void findIntersection(int arr1[], int arr2[]) {
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    int i = 0;
    int j = 0;
    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] == arr2[j]) {
        System.out.print(arr1[i] + " ");
        i++;
        j++;
      } else if (arr1[i] < arr2[j]) {
        i++;
      } else {
        j++;
      }
    }
  }

  static void main(String[] args) {
    // int arr[] = { 0, 1, 3, 0, 4, 2, 1, 8, 0, 1, 4, 1, 0, 5, 1, 0 };
    // System.out.println(avarage(arr));
    // int ans[] = swapAlternates(arr);

    // Printarr(ans);
    // linearSearch(arr, 8);
    // System.out.println(findMax(arr));
    // System.out.println("the sum of positive" + ans[0]);
    // System.out.println("the sum of negetive" + ans[1]);
    // System.out.println("the count of one:" + ans[0]);
    // System.out.println("the count of zero:" + ans[1]);
    // findFristUnsorted(arr);
    // swapAlternates(arr);
    // System.out.println(Arrays.toString(arr));
    // int arr1[] = { 4, 2, 5, 1, 3 };
    // int arr2[] = { 6, 3, 4, 5, 7 };
    // findIntersection(arr1, arr2);

    int arr[] = { 7, 1, 4, 2, 6, 3 };
    printAlternateExtremes(arr);

  }
}