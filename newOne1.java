import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome409 {

    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        boolean hasOdd = false;

        // Calculate palindrome length
        for (int count : map.values()) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                hasOdd = true;
            }
        }

        // One odd character can be placed in the center
        if (hasOdd) {
            length += 1;
        }

        return length;
    }

    public static void main(String[] args) {
        String s1 = "abccccdd";
        String s2 = "a";
        String s3 = "bb";

        System.out.println(longestPalindrome(s1)); // Output: 7
        System.out.println(longestPalindrome(s2)); // Output: 1
        System.out.println(longestPalindrome(s3)); // Output: 2
    }
}
