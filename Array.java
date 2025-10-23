/* input-output in arrray-----------------------

import java.util.*;
public class Array {

    public static void main(String[] args) {
         int marks[]= new int[100];
        // System.out.println("lengh of array:"+ marks.length);
        
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        
        System.out.println("phy :"+ marks[0]);
        System.out.println("chem :"+ marks[1]);
        System.out.println("math :"+ marks[2]);
        

        float percentage = (marks[0]+marks[1]+marks[2])/3f;
        System.out.println(percentage);
    }
}
 */

 
/*  Passing Array as Reference....................


public class Array {

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }

    }

    public static void main(String[] args) {
        int marks[]= {97, 98, 99};
        update(marks);

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" ");
        }

    }
 }
 */

/* 
 //Liner Search......................... time complexity O(n)

 public class Array {
    public static int Linear_search(int number[],int key){

        for(int i=0; i< number.length;i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
    }
    


    public static void main(String[] args) {
        int number[]= {2,4,6,8,10,12,14,16};
        int key=20;
        
        int index = Linear_search(number, key);
        if(index == -1){
            System.out.println("NOT found");
        }else{
            System.out.println("key at index:"+ index);
        }
    }
 }
 */
    
   /* Que: get largest.......................................

    public class Array {
        
        public static int getLargest(int num[]){
            int largest = Integer.MIN_VALUE; //-INFINITY
            int smallest = Integer.MAX_VALUE;
            for(int i = 0; i<num.length; i++){
               if(largest < num[i]){
                largest = num[i];
               }

               if (smallest > num[i]){
                smallest = num[i];
               }
         }
         System.out.println(" smallest value is:"+ smallest);
         return largest;
        }

        public static void main(String[] args) {
            int num[]= {1,4,6,3,9};
            System.out.println("the largest value is:"+ getLargest(num));
            
        }
    }
    */
    
    /*
    //Binary Search.............................[TC.= O(logn)]
    public class Array {
        public static int BinarySearch(int numbers[],int key){
            int start = 0; int end = numbers.length-1;
            while(start<=end){
                int mid = (start+end)/2;
                //comparision
                if(numbers[mid] == key){
                    return mid;
                }
                if(numbers[mid]<key){
                    start= mid+1;
                }
                else{
                    end= mid-1;
                }
            }
            return -1;

        }

    
        public static void main(String[] args) {
            int numbers[]={2,4,6,8,10,12,14};
            int key=2;
            
            System.out.println("index for the no is:"+ BinarySearch(numbers, key));
        }
    }
        */
        
        /*
        //Q:Reverse of a Array................

        public class Array {

            public static void reverse(int number[]){
                int first=0,last=number.length-1;

                while(first<last){
                    int temp = number[last];
                    number[last] = number[first];
                    number[first] = temp;

                    first++;
                    last--;
                }
            }
        
            public static void main(String[] args) {
                int number[]= {2,4,6,8,10};

                reverse(number);
                for(int i= 0; i<number.length;i++){
                    System.out.print(number[i]+" ");
                }
            }
        }
        */
        /* //Pairs Print.....................................

        public class Array {

            public static void pairsprt(int number[]){

                for(int i=0;i< number.length;i++){
                    int curr= number[i];
                    for(int j= i+1;j<number.length;j++){
                        System.out.print("("+ curr+","+number[j]+") ");
                    }
                    System.out.println();
                }
            }
        
            public static void main(String[] args) {
                int number[]={2,4,6,8,10};

               pairsprt(number);
            }
        }
            */

   //*  sub array................

    public class Array {

        public static void Subarray(int number[]){
          //  int ts=0;
         for(int i=0;i< number.length;i++){
            for(int j=i;j< number.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(number[k]+" ");
                }
            //   ts++;
                System.out.println();
            }
            System.out.println();
         }
        //System.out.println("total subarray ="+ts);
        }
    
        public static void main(String[] args) {
            int number[]={2,4,6,8,10};
            Subarray(number);
        }
    }
        