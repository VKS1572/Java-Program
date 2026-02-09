/*LeetCode 28 — Find the Index of the First Occurrence in a String (strStr)
Return the index of the first occurrence of needle in haystack, or -1 if not found.

✅ Simple Java Solution (Built-in Method)

LeetCode accepts using Java’s built-in function:
*/
class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}


Time Complexity: O(n·m) worst case internally
Best for: Interviews that allow library methods.

✅ Manual Two-Pointer Solution (Interview-Friendly)
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;

            while (j < needle.length() && 
                   haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }
}

/*
How it works:

Try every possible starting index in haystack

Compare characters with needle

If all match → return index

Else continue

Time Complexity: O(n × m)
Space Complexity: O(1)*/
