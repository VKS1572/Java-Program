import java.util.Arrays;

public class Solution {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // If all digits were 9
        int[] res = new int[n + 1];
        res[0] = 1;
        return res;
    }

    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result));
    }
}
