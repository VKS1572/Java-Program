LeetCode 67 — Add Binary (Java Solution) on LeetCode

You’re given two binary strings a and b. Return their sum as a binary string.

✅ Approach

Traverse both strings from right to left.

Add corresponding bits plus carry.

Append result bit to a StringBuilder.

Update carry each step.

Reverse at the end.

✅ Java Code
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;

            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';

            res.append(sum % 2);
            carry = sum / 2;
        }

        return res.reverse().toString();
    }
}

⏱ Complexity

Time: O(max(n, m))

Space: O(max(n, m)) for result
