//1️⃣2️⃣ LeetCode 9 – Palindrome Number (Easy)
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int rev = 0, temp = x;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev == x;
    }
