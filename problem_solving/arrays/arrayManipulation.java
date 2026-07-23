import java.util.HashMap;

public class arrayManipulation {

    static int[] reverse(int arr[]) {
        int ReversedArray[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ReversedArray[arr.length - 1 - i] = arr[i];
        }
        return ReversedArray;
    }

    static int[] RightshiftByOne(int arr[]) {
        int n = arr.length;
        int shifted[] = new int[n];
        shifted[0] = arr[n - 1];
        for (int i = 0; i < n - 1; i++) {
            shifted[i + 1] = arr[i];

        }

        return shifted;
    }

    static int[]  RightshiftelementByk(int arr[], int k) {
        int n = arr.length;
        int shifted[] = new int[n];
       
         k = k % n;
       
        for(int i = 0; i< n; i++) {
         int Index = (i + k) % n;

         shifted[Index] = arr[i];
         }

        return shifted;
    }

    static void printAlternates(int arr[]) {
        int i = 0; 
        int j = arr.length - 1;

        while (i <= j) {
            if(i == j) {
                System.out.print(arr[i] +  " ");
                return;
            }  else {
                System.out.print(arr[i] + " " );
                i++;
                System.out.print(arr[j] + " ");
                j--;
            }
        }
        System.out.println();
    }

    static int getMode(int arr[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int MaxFreq = -1;
        int MaxfreqKey = -1;

        for(int key : freq.keySet()) {
            int currKey = key;
            int currKeyFreq = freq.get(key);

            if(currKeyFreq > MaxFreq) {
                MaxFreq = currKeyFreq;
                MaxfreqKey = currKey;
            }
        }
        return MaxfreqKey;
    }

    static int[] getMaxAndMin(int arr[] ){
      HashMap<Integer, Integer> freq = new HashMap<>();

      for(int num : arr) {
        freq.put(num, freq.getOrDefault(num, 0) + 1) ;
      }

      int MaxFreq = Integer.MIN_VALUE;
      int HighNum = -1;

      int LowestFreq = Integer.MAX_VALUE;
      int LowestKey = 0;

      for(int key : freq.keySet()) {
        int currKey = key;
        int currFreq = freq.get(key);
        if(currFreq > MaxFreq) {
            MaxFreq = currFreq;
            HighNum = currKey;
        } else if(currFreq < MaxFreq) {
            LowestFreq = currFreq;
            LowestKey = currKey;
        }
      }
      
     int ans[] = {HighNum, LowestKey};

     return ans;
      
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 3, 4, 3, 3, 5, 5, 5, 5, 6, 5, 6, 6, 6, 7, 6, 8, 6 };
         int ans[] = getMaxAndMin(arr);

         System.out.println("The highest freq element is : " + ans[0]);
         System.out.println("The Lowest freq element is : " + ans[1]);

        // printAlternates(arr);
        

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();
    }
}