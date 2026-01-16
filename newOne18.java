/*
🔍 Problem Idea (Short)
Given an array nums, find the sum of XOR values of all possible subsets (including empty subset whose XOR = 0).
✅ Optimal Approach (Bitwise Observation)
For each bit position:
If any element has that bit set, then half of all subsets will have that bit contributing to XOR.
Total subsets = 2^n
Contribution of a bit = (2^(n-1)) * (1 << bit) if that bit exists in any number.

*/
public class Solution {

    public static int subsetXORSum(int[] nums) {
        int or = 0;
        for (int num : nums) {
            or |= num;
        }
        return or * (1 << (nums.length - 1));
    }

    // For local testing
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        System.out.println(subsetXORSum(nums1)); // Output: 6

        int[] nums2 = {5, 1, 6};
        System.out.println(subsetXORSum(nums2)); // Output: 28
    }
}
