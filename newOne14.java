/*
🔹 Problem

Given a string s, return true if it can become a palindrome after deleting at most one character.

✅ Optimal Approach (Two Pointers)

Compare characters from both ends

On first mismatch → try skipping left OR right once

Time: O(n)
Space: O(1)

💡 Java Code
*/

public class ValidPalindromeII {

    public static boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) ||
                       isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    // Test
    public static void main(String[] args) {
        System.out.println(validPalindrome("aba"));     // true
        System.out.println(validPalindrome("abca"));    // true
        System.out.println(validPalindrome("abc"));     // false
    }
}
