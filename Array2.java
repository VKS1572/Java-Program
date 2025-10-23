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

/* 
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