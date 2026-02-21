/*✅ LeetCode 762 – Prime Number of Set Bits in Binary Representation

Problem summary:
Given two integers left and right, count how many numbers in the range [left, right] have a prime number of set bits (1s) in their binary representation.

💡 Key Idea

For every number in the range:

Count number of 1s in its binary form.

Check if that count is prime.

If prime → increment answer.

Since numbers are ≤ 10^6, max set bits ≤ 20.
So we can pre-store prime values up to 20.

🚀 Optimized Java Solution*/
class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        
        // Prime numbers up to 20 (max possible set bits)
        Set<Integer> primes = Set.of(2, 3, 5, 7, 11, 13, 17, 19);
        
        for (int i = left; i <= right; i++) {
            int setBits = Integer.bitCount(i);  // Built-in fast bit counter
            
            if (primes.contains(setBits)) {
                count++;
            }
        }
        
        return count;
    }
}
/*🔥 Why This is Good

Integer.bitCount(i) → O(1)

Loop runs (right - left + 1) times

Overall complexity → O(N)

Space → O(1) (constant prime set)*/
