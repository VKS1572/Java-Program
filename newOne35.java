/*🔹 696. Count Binary Substrings — Java Solution
Problem Summary:
Given a binary string s, return the number of non-empty substrings that have:


Equal number of 0s and 1s


All 0s and all 1s grouped consecutively


Example:
Input:  "00110011"
Output: 6
Explanation: "0011", "01", "1100", "10", "0011", "01"


💡 Optimal Approach (O(n) Time | O(1) Space)
🔎 Key Idea:
We count consecutive groups of 0s and 1s.
Example:
"00110011"
Groups → [2, 2, 2, 2]

For every adjacent pair of groups:
min(group[i], group[i+1])

Add this to result.

✅ Java Code  */
class Solution {
    public int countBinarySubstrings(String s) {
        int prevGroup = 0;
        int currGroup = 1;
        int result = 0;
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currGroup++;
            } else {
                result += Math.min(prevGroup, currGroup);
                prevGroup = currGroup;
                currGroup = 1;
            }
        }
        
        result += Math.min(prevGroup, currGroup);
        return result;
    }
}

/*
🧠 Why This Works
If we have:
000111

Groups → [3,3]
Valid substrings → min(3,3) = 3
They are:
01
0011
000111

We only compare adjacent groups because valid substrings must contain exactly two consecutive different groups.

⏱ Complexity


Time: O(n)


Space: O(1)
  */


