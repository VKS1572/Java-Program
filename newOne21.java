/*
🧠 Problem

Given a 32-bit signed integer x, reverse its digits.
If reversing x causes the value to go outside the 32-bit signed integer range [-2³¹, 2³¹ − 1], return 0.

✅ Approach

Extract digits one by one using % 10

Build the reversed number

Before adding a digit, check for overflow / underflow

Handle negative numbers naturally
*/

class Solution {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Check overflow
            if (rev > Integer.MAX_VALUE / 10 ||
               (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            // Check underflow
            if (rev < Integer.MIN_VALUE / 10 ||
               (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            rev = rev * 10 + digit;
        }

        return rev;
    }
}
