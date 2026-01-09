/*
Problem (short):
Given an array nums, return the element that appears more than ⌊n/2⌋ times.
You can assume the majority element always exists.

🔹 Optimal Approach: Boyer–Moore Voting Algorithm
💡 Idea

Keep a candidate and a count

If count == 0, pick current number as candidate

If number == candidate → count++, else count--

Final candidate is the majority element

⏱ Time Complexity: O(n)
📦 Space Complexity: O(1)
*/

public class Solution {

    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    // main method for testing
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int result = majorityElement(nums);
        System.out.println("Majority Element: " + result);
    }
}

