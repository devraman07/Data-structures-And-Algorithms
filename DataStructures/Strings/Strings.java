public class Strings {

    public static void PrintAllChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println("The string value is:" + str.charAt(i));
        }
        System.out.println();
    }

    public static void CountVowels(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch);
                count++;
            }

        }
        System.out.println("The total vowel count is " + count);
    }

    public static void Reverse(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "RACECAR";
        // PrintAllChar(str);
        // CountVowels(str);
        // Reverse(str);
        System.out.println(isPalindrome(str));
    }
}