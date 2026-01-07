/*
👉 Problem:
Implement pow(x, n) i.e. calculate 
𝑥
𝑛
x
n
.

✅ Optimal Approach: Binary Exponentiation

Time Complexity: O(log n)

Space Complexity: O(1)

Handles negative powers safely

💡 Idea

If n < 0, compute 
(
1
/
𝑥
)
−
𝑛
(1/x)
−n

Repeatedly square x

If n is odd → multiply result by x
*/


class Solution {
    public double myPow(double x, int n) {
        long power = n;      // handle Integer.MIN_VALUE
        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double result = 1.0;

        while (power > 0) {
            if ((power & 1) == 1) {   // if power is odd
                result *= x;
            }
            x *= x;
            power >>= 1;  // power = power / 2
        }

        return result;
    }
}
