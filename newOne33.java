/*LeetCode 190 — Reverse Bits (Java Solution)
Problem: Reverse bits of a given 32-bit unsigned integer.

You’re given an integer and need to reverse its binary bits and return the resulting number.

Reference: LeetCode

✅ Approach

Iterate through all 32 bits.

Shift result left by 1 each step.

Add the last bit of n to result.

Right shift n to process next bit.

Time: O(1) (always 32 iterations)
Space: O(1)

✅ Java Solution*/
public class Solution {
    public int reverseBits(int n) {
        int result = 0;
        
        for (int i = 0; i < 32; i++) {
            result <<= 1;          // shift result left
            result |= (n & 1);     // add last bit of n
            n >>>= 1;              // unsigned right shift n
        }
        
        return result;
    }
}
/*
🔍 Key Points

Use >>> (unsigned right shift) instead of >> to avoid sign extension.

(n & 1) extracts the last bit.

Works correctly for both positive and negative integers (treated as unsigned bits).*/
