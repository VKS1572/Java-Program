/*LeetCode 868 – Binary Gap

Problem:
Given a positive integer n, return the longest distance between two consecutive 1s in the binary representation of n. If there are no two consecutive 1s, return 0.

🔹 Approach

Traverse the binary representation of n using bit manipulation.

Keep track of:

lastPos → position of the previous 1

currentPos → current bit index

maxDistance → maximum gap found

For each bit:

If it is 1:

If lastPos != -1, calculate distance

Update maxDistance

Update lastPos

Right shift n after each step.

Time Complexity: O(log n)
Space Complexity: O(1)

✅ Java Solution*/
class Solution {
    public int binaryGap(int n) {
        int lastPos = -1;
        int maxDistance = 0;
        int currentPos = 0;
        
        while (n > 0) {
            if ((n & 1) == 1) {
                if (lastPos != -1) {
                    maxDistance = Math.max(maxDistance, currentPos - lastPos);
                }
                lastPos = currentPos;
            }
            currentPos++;
            n >>= 1;
        }
        
        return maxDistance;
    }
}
/*
🔹 Example

Input:

n = 22

Binary representation:

10110

Positions of 1s → 0, 2, 3
Distances → 2 - 0 = 2, 3 - 2 = 1

Output:

2
  */
