/*
🔹 Problem

Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

Constraint: O(n) time

✅ Optimal Approach (HashSet)

Store all numbers in a HashSet

Start counting only if num - 1 does NOT exist (start of a sequence)

Time: O(n)
Space: O(n)
*/
import java.util.*;

public class LongestConsecutive {

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {
            // start of sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    // Test
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }
}
