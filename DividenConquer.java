/* 
// Merge Sort Tc= O(nlogn), SC= O(n)
public class DividenConquer {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[],int si, int ei){
        if(si>=ei){
            return;
        }
        int mid= si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[], int si, int mid,int ei){
        int temp[] = new int [ei-si+1];
        int i=si; //iterator for left
        int j=mid+1;// iterator for right
        int k=0;//iteratir for trmp
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //left part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //right part
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        //copytemp to original
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8}; 
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
*/
/* 
//quick Sort tc=O(nlogn) in avg,O(n^2) in wc ; sc= O(1)
public class DividenConquer {
      public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void  quickSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        //last element
        int pIdx = partition(arr,si,ei);
        quickSort(arr, si, pIdx-1);//left
        quickSort(arr, pIdx+1, ei);//right
    }

public static int partition(int arr[],int si,int ei){
    int pivot = arr[ei];
    int i = si-1; // to make place for else small the pivot
    for(int j=si;j<ei;j++){
        if(arr[j]<=pivot){
            i++;
            //swap
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i]= temp;
        }
    }
     i++;
            //swap 
            int temp = pivot;
            arr[ei] = arr[i];
            arr[i]= temp;

            return i;
}

    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
*/ 
/*  

public class DividenConquer {
  public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }

    private int search(int[] nums, int target, int si, int ei) {
        if (si > ei) return -1;

        int mid = si + (ei - si) / 2;

        // Found target
        if (nums[mid] == target) return mid;

        // Left half is sorted
        if (nums[si] <= nums[mid]) {
            if (nums[si] <= target && target < nums[mid]) {
                return search(nums, target, si, mid - 1);  // Search left
            } else {
                return search(nums, target, mid + 1, ei);  // Search right
            }
        }
        // Right half is sorted
        else {
            if (nums[mid] < target && target <= nums[ei]) {
                return search(nums, target, mid + 1, ei);  // Search right
            } else {
                return search(nums, target, si, mid - 1);  // Search left
            }
        }
    }
}
// public static void main(String[] args) {
//     int nums[]={4,5,6,7,0,1,2};
//     int target = 0;
//     int tarIdx= search(nums,target);
//  System.out.println(tarIdx);
}
*/
/* or.....
 class Solution {
    public int search(int[] nums, int target) {
        int si = 0, ei = nums.length - 1;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (nums[mid] == target) return mid;

            // Left half is sorted
            if (nums[si] <= nums[mid]) {
                if (nums[si] <= target && target < nums[mid]) {
                    ei = mid - 1;
                } else {
                    si = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (nums[mid] < target && target <= nums[ei]) {
                    si = mid + 1;
                } else {
                    ei = mid - 1;
                }
            }
        }

        return -1;
    }
}

 */