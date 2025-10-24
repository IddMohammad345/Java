package Interview;

public class PalindromUsingSubstring {
    static boolean isPalindrome(String s) {
        int left = 0;
            int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    // Function to print all palindromic substrings
    static void printPalindromicSubstrings(String str) {
        int n = str.length();
        System.out.println("Palindromic substrings of \"" + str + "\":");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = str.substring(i, j);
                if (isPalindrome(sub)) {
                    System.out.println(sub);
                }
            }
        }
    }

    public static void main(String[] args) {
        String str = "abbacd";
        printPalindromicSubstrings(str);

    }
}

