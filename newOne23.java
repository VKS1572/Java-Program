/*
3507. Minimum Pair Removal to Sort Array I
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given an array nums, you can perform the following operation any number of times:

Select the adjacent pair with the minimum sum in nums. If multiple such pairs exist, choose the leftmost one.
Replace the pair with their sum.
Return the minimum number of operations needed to make the array non-decreasing.

An array is said to be non-decreasing if each element is greater than or equal to its previous element (if it exists).

 
------------------------------------------------
Example 1:

Input: nums = [5,2,3,1]

Output: 2
--------------------------------------------------------
✅ Optimal Strategy

Traverse the array from left to right

Count how many times nums[i] > nums[i+1]

Each such inversion needs at least one pair removal

Since one operation removes 2 elements,
each inversion can be fixed by 1 operation

⏱ Complexity

Time: O(n)

Space: O(1)

💻 Java Code (Accepted)
class Solution {
    public int minimumPairRemoval(int[] nums) {
        int operations = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                operations++;
                i++; // skip next element since pair is removed
            }
        }
        
        return operations;
    }
}
*/
import java.util.*;

public class Solution {
    public int minimumPairRemoval(int[] nums) {
        int operations = 0;

        while (!isSorted(nums)) {
            int minSum = Integer.MAX_VALUE;
            int index = -1;

            // Find leftmost pair with minimum sum
            for (int i = 0; i < nums.length - 1; i++) {
                int sum = nums[i] + nums[i + 1];
                if (sum < minSum) {
                    minSum = sum;
                    index = i;
                }
            }

            // Merge the pair at index by replacing with their sum
            List<Integer> newNums = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (i == index) {
                    newNums.add(nums[i] + nums[i + 1]);
                    i++; // skip next element since it's merged
                } else {
                    newNums.add(nums[i]);
                }
            }

            // Convert list back to array
            nums = newNums.stream().mapToInt(i -> i).toArray();
            operations++;
        }

        return operations;
    }

    // Helper to check if array is non-decreasing
    private boolean isSorted(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) return false;
        }
        return true;
    }
}
