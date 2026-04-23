/*  MAX SUBARRAY SUM....................................(I)
public class Array2 {
    public static void maxSubarraySum(int number[]){
       int currsum =0;
       int maxsum = Integer.MIN_VALUE;
       for(int i=0;i< number.length;i++){
        int start = i;
          for(int j=i;j< number.length;j++){
            int end =j;
            currsum=0;                      
              for(int k=start;k<=end;k++){
                  currsum+=number[k];
              }
         
              System.out.println(currsum);
              if(maxsum<currsum){
                maxsum=currsum;
              }
          }
          
       }
           System.out.println("max sum="+ maxsum);
      }


    public static void main(String[] args) {
        int number[]={1,-2,6,-1,3};
        maxSubarraySum(number);
        
    }
}
 */

 /* prefix sum of subarray..............................O(n^2)
public class Array2 {
  public static void prefixsumOfsubarray(int number[]){
  int currsum =0;
  int maxsum = Integer.MIN_VALUE;
  int prefix[ ] = new int [number.length];

  prefix[0] = number[0];
  // calculate prefix array
  for(int i = 1; i< prefix.length; i++){
    prefix[i] = prefix[i-1]+number[i];
  }
  for(int i =0; i< number.length; i++){
    int start = i;
    for(int j=i; j<number.length; j++){
    int end = j;
    currsum= start==0?prefix[end]:prefix[end]-prefix[start-1];
    System.out.println(currsum);
    if(maxsum<currsum){
      maxsum = currsum;
    }
    } 
   }
   System.out.println("max sum = "+ maxsum);

  }

  public static void main(String[] args) {
    int number[] ={1,-2,6,-1,3};
  prefixsumOfsubarray(number);
  }
  
}
 */

 /* Kadane max sub array sum .........................O(n) [optimal sol.]
public class Array2 {
  public static void kadanes(int number[]){
    int ms = Integer.MIN_VALUE;
     int cs = 0;
     for(int i = 0; i< number.length; i++){
      cs = cs+ number[i];
      if (cs<0){
        cs = 0;
      }
      ms= Math.max(cs,ms);
     }
     System.out.println("our max sum is ="+ ms);
  }
  public static void main(String[] args) {
  int number[]= {-2,-3,4,-1,-2,1,5,-3};   
  kadanes(number);
  }
}
 
*/
 /*
 //Rainwater trapped Problem ...........................
public class Array2 {

    public static int TrappedRainwater(int height[]) {
        int n = height.length;

        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }

        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }
        
        int trappedWater = 0;
        for (int i = 0; i <n; i++) {
            int Waterlevel = Math.min(leftmax[i], rightmax[i]);
            trappedWater += Waterlevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(TrappedRainwater(height));
    }
}
*/

/* .........................................
public class Array2 {
  public static int buyAndsellStock(int prices[]){
  int maxprofit = 0;
  int buyprice = Integer.MAX_VALUE;
  
  for(int i= 1; i < prices.length;i++){
    if(buyprice < prices[i]){
      int profit = prices[i]- buyprice;
      maxprofit = Math.max(maxprofit, profit);
    }else{
      buyprice= prices[i];
    }
  }
return maxprofit;

  }
  public static void main(String[] args) {
    int prices[] = {7,1,5,3,6,4};
    System.out.println(buyAndsellStock(prices));
  }

}*/
/*27. Remove Element..........................................................
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.*/
/* Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0; i<nums.length;i++){
            if(val!=nums[i]){
                nums[k]= nums[i];
                k++;
            }
        }
        return k;
    }
} */

/*Array 2 pointer Short colors
class Solution {
    public void sortColors(int[] nums) {
        int low = 0;          // for 0
        int mid = 0;          // for 1
        int high = nums.length - 1;  // for 2

        while (mid <= high) {
            if (nums[mid] == 0) {
                // swap nums[low] and nums[mid]
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } 
            else if (nums[mid] == 1) {
                mid++;
            } 
            else { // nums[mid] == 2
                // swap nums[mid] and nums[high]
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}
*/
/*
3. Product of Array Except Self

Problem:
Return an array where each element is product of all other elements except itself.

Example

Input: [1,2,3,4]
Output: [24,12,8,6]

Java Solution

class ProductArray {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 1;
        for (int i = 0; i < n; i++) {
            result[i] = left;
            left *= nums[i];
        }

        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }

        return result;
    }
}

Time Complexity: O(n)
*/
/* 217 leetcode contain duplicate 
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> set = new HashSet<>();

        for(int num : nums){
          if(set.contains(num)){
            return true;
          }  
          set.add(num);
        }
        return false;
    }
}
*/

/*242 valid anagram

    class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length() ){
            return false;
        }
        int[] count = new int[26];

       for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int c : count){
            if(c != 0) return false;
        }

        return true;
    }
}*/
/*
// grou[p of  anagaram
import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
}

*/
/*
88. Merge Sorted Array
Solved
Easy
Topics
premium lock icon
Companies
Hint
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 
*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // If nums2 still has elements left
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p--;
            p2--;
        }

        
    }
}
//3 sum..............
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for i
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    // Skip duplicates after adding
                    while(left < right && nums[left] == nums[left - 1]) left++;
                    while(left < right && nums[right] == nums[right + 1]) right--;
                }
                else if(sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}


//“Shuffle the Array” (1470). The idea is:..............................

/*Given nums = [x1, x2, ..., xn, y1, y2, ..., yn], return
[x1, y1, x2, y2, ..., xn, yn].

✅ Simple Approach (Using Extra Array)*/
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];       // x_i
            result[2 * i + 1] = nums[i + n]; // y_i
        }
        
        return result;
    }
}
/*🔍 Example

Input:

nums = [2, 5, 1, 3, 4, 7], n = 3

Output:

[2, 3, 5, 4, 1, 7]
💡 Time & Space Complexity
Time: O(n)
Space: O(n) (extra array)
*/
