
public class arrayProblemDay3 {
    static void sortByzeroAndOne(int arr[]) {
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = arr[i] ^ arr[j];
                arr[j] = arr[i] ^ arr[j];
                arr[i] = arr[i] ^ arr[j];
            } else if (arr[i] == 0) {
                i++;
            } else if (arr[j] == 1) {
                j--;
            }

        }
    }

    static void sortBy0sand1sand2s(int arr[]) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                arr[low] = arr[low] ^ arr[mid];
                arr[mid] = arr[low] ^ arr[mid];
                arr[low] = arr[low] ^ arr[mid];
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                arr[mid] = arr[mid] ^ arr[high];
                arr[high] = arr[mid] ^ arr[high];
                arr[mid] = arr[mid] ^ arr[high];
                high--;
            }
        }
    }

    static int missingElement(int arr[]) {
        int xorSum = 0;
        int n = arr.length;

        for (int num : arr) {
            xorSum = xorSum ^ num;
        }

        for (int i = 0; i <= n; i++) {
            xorSum = xorSum ^ i;
        }

        return xorSum;
    }

    static int findUnique(int[] arr) {
        int xorSum = 0;

        for (int n : arr) {
            xorSum = xorSum ^ n;
        }
        return xorSum;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 2, 1, 1, 2, 0, 1, 2 };
        sortBy0sand1sand2s(arr);
        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
        }
        // System.out.println(findUnique(arr));

    }
}