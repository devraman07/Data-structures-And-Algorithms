public class practice {

    public static int countConsonants(String str) {
        String vowels = "aeiouAEIOU";
        int count = 0;

        for (char c : str.toCharArray()) {
            // Only count letters, and skip vowels
            if (Character.isLetter(c) && vowels.indexOf(c) == -1) {
                count++;
            }
        }

        return count;
    }

    public static int countUppercase(String str) {
        int count = 0;

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }

        return count;
    }

    public static int countLowercase(String str) {
        int count = 0;

        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                count++;
            }
        }

        return count;
    }

   

    public static void main(String[] args) {
        String str = "Hello worHH";

        System.out.println("The count of consonants in str is :" + countConsonants(str));
        System.out.println("The count of uppercase in str is :" + countUppercase(str));
        System.out.println("The count of lowercase in str is :" + countLowercase(str));
       
    }
}
