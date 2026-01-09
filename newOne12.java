/*
🔹 Problem
Given an array nums with values 0, 1, 2, sort them in-place.

✅ Optimal Approach (One Pass)


Time: O(n)


Space: O(1)



💡 Logic


low → position for 0


mid → current index


high → position for 2



🧠 Java Code (with main)
public class SortColors {

    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { // nums[mid] == 2
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Test
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);

        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}


🔎 Output
0 0 1 1 2 2


If you want:


🔹 Brute-force version


🔹 Counting sort approach


🔹 Step-by-step dry run


Just tell me 👍
*/

public class SortColors {

    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { // nums[mid] == 2
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Test
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);

        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}
