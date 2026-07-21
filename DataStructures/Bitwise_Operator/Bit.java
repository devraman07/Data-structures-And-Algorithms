

public class Bit {

    public static void EvenOdd(int n) {
        if((n & 1) == 0) {
             System.out.print("even number:" + n );
        } else {
            System.out.print("odd number:  " + n);
        }
        System.out.println();
    }

    public static  void PowerOftwo(int n) {
           if((n & (n- 1)) == 0) {
               System.out.println("power of 2:" + " " + n);
           } else {
            System.out.print("power of 2 nahi" + n);
           }
    }

    public static void  swap(int m , int n) {
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;

        System.out.println("the swaped value of m and n are : " + m +  "," + n);
    }

 public static int findUnique(int arr[] ) {
    int res = 0;

    for(int i = 0; i < arr.length; i++) {
        res ^= arr[i];

    }
    return res;
 }

 public static int countSetBits(int n) {
    int count = 0;

    while(n != 0) {
        if((n & 1) !=0) {
            count++;
        }
         n = n >> 1;
    }

    return count;
 }

 public static int countSetBitsOptimised(int n ) {
    int count = 0;

    while(n != 0) {
        n = n & (n - 1);
        count ++; 
    }
    return count;
 }
 
    public static void main(String[] args) {
        
       int n = 5;
        // int arr[] = {2, 4, 6, 4, 6, 8, 2};
        
        // EvenOdd(n);
        // PowerOftwo(n);
        // swap(m, n);

        // System.out.println("the unique element inside the array is: " + findUnique(arr));
       System.out.println("the count of setBits in " + n + "is:" + countSetBits(n));
        System.out.println("the count of setBits of optimised approach in " + n + "is:" + countSetBitsOptimised(n));
    }
}