LeetCode 401 — Binary Watch (Java Solution) — on LeetCode
A binary watch has:


4 LEDs for hours (0–11)


6 LEDs for minutes (0–59)


Given turnedOn, return all possible times where exactly that many LEDs are on.
✅ Approach


Loop through all possible hours (0–11) and minutes (0–59).


Count set bits using Integer.bitCount().


If total set bits == turnedOn, format and add time to result.


Ensure minutes are 2-digit formatted.


✅ Java Solution
import java.util.*;

class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                if (Integer.bitCount(h) + Integer.bitCount(m) == turnedOn) {
                    result.add(h + ":" + (m < 10 ? "0" + m : m));
                }
            }
        }
        
        return result;
    }
}

⏱ Complexity


Time: O(12 × 60) ≈ O(1) (constant search space)


Space: O(k) for result list
