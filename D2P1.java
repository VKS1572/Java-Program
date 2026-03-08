/*import java.util.Scanner;

public class D2P1 {   
public static void main(String args[]) {
   try( Scanner sc = new Scanner(System.in)){
    int A = sc.nextInt();
    int B = sc.nextInt(); 
    int C = sc.nextInt();
    
    int Sum = A+B+C;
    int Average =Sum/3;
    System.out.println(Average); 
}

}
    
}*/

The problem Median of Two Sorted Arrays is a famous Hard problem on LeetCode.
The optimal solution uses Binary Search with O(log(min(m,n))) time.

Approach (Binary Search)

We divide both sorted arrays into left half and right half such that:

Left side contains smaller elements

Right side contains larger elements

Left size = Right size (or left has one extra when total is odd)

Conditions for correct partition:

maxLeft1 <= minRight2
maxLeft2 <= minRight1

If conditions satisfied → we found the median.

Java Solution (Optimal)
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if(nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int x = nums1.length;
        int y = nums2.length;

        int low = 0, high = x;

        while(low <= high) {

            int partitionX = (low + high) / 2;
            int partitionY = (x + y + 1) / 2 - partitionX;

            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minRightX = (partitionX == x) ? Integer.MAX_VALUE : nums1[partitionX];

            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minRightY = (partitionY == y) ? Integer.MAX_VALUE : nums2[partitionY];

            if(maxLeftX <= minRightY && maxLeftY <= minRightX) {

                if((x + y) % 2 == 0) {
                    return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0;
                } else {
                    return Math.max(maxLeftX, maxLeftY);
                }

            } else if(maxLeftX > minRightY) {
                high = partitionX - 1;
            } else {
                low = partitionX + 1;
            }
        }

        throw new IllegalArgumentException();
    }
}
Example
nums1 = [1,3]
nums2 = [2]

Merged:

[1,2,3]

Median = 2

Complexity
Type	Complexity
Time	O(log(min(m,n)))
Space	O(1)
