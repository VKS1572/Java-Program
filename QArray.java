/*Question 5: Given an integer array nums, return all the triplets [nums[i], nums[j], 
nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0. 
Notice that the solution set must not contain duplicate triplets. 
Example 1: 
Input: 
nums = [-1, 0, 1, 2, -1, -4] 
Output: [ [-1, -1, 2] , [-1, 0, 1] ] 
 */
 /*  Brute force approach.......O(n^2)
import java.util.Arrays;
public class QArray {
    public static void ThreeSum(int[] num){
        Arrays.sort(num);//sort the array
        int n = num.length;
        for(int i=0;i<n-2;i++){
            if(i>0 && num[i]==num[i-1])
            continue; // skip Duplicate Value for i
            for(int j=i+1; j<n-1; j++){
                if(j>i+1 && num[j]== num[j-1])
                continue;//skip duplicate value for j
                for(int k= j+1;k<n;k++){
                    if(k>j+1 && num[k]==num[k-1])
                    continue;
                    if(num[i]+num[j]+num[k]==0){
                        System.out.println(num[i]+" "+num[j]+" "+num[k]);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        System.out.println(array.length);
    }
}*/


