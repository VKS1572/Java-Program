/* 
public class Recursion {
    //decreasing order print
  public static void printDec(int n){
    if((n==1)){
        System.out.println(n);
        return;
    }
    System.out.print(n + " ");
    printDec(n-1);
  }
// increasing order print
  public static void printInc(int n){
    if(n==1){
        System.out.print(n+" ");
        return;
    }
    printInc(n-1);
    System.out.print(n+" ");
  }

 public static void main(String[] args) {
    int n=10;
    printInc(n);
 }   
}
*/
/* 
// factorial of a no.
public class Recursion {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fnm1;
        return fn;
    }
    public static void main(String[] args) {
        int n= 5;
        System.out.println(fact(n));
    }
}
*/

/* 
//print sum of first n natural no
public class Recursion {
    public static int calSum(int n){
        if(n==1){
            return 1;
        }
        int fnm1 = calSum(n-1);
        int fn = n + fnm1;
        return fn;
    }
    public static void main(String[] args) {
        int n= 5;
        System.out.println(calSum(n));
    }
}
    */

    /* 
    // fibonnacci series
    public class Recursion {
    public static int fib(int n){
        if(n==0 || n ==1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        
        int fn = fnm1+fnm2;
        return fn;
    }
    public static void main(String[] args) {
        int n= 2;
        System.out.println(fib(n));
    }
}
    */
/*array is sorted or not 
    public class Recursion {
       public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
       }
        public static void main(String[] args) {
            int arr[]= {1,2,3,4};
            System.out.println(isSorted(arr, 0));
        }
    }
        */
  /* 
    public class Recursion {
        //find first occurence of an element
        public static int firstOccurence(int arr[], int key, int i){
            if(i == arr.length){
              return -1;
            }
            if(arr[i] == key){
                return i;
            }
            return firstOccurence(arr, key, i+1);
        }    
        // last occurence of a element...
        public static int lastOccurence(int arr[],int key, int i){
             if(i == arr.length){
              return -1;
            }
            int isFound = lastOccurence(arr, key, i+1);
            if(isFound == -1 && arr[i]==key){
                return i;
            }
            return isFound;
        }
         public static void main(String[] args) {
            int arr[]= {8,3,6,9,5,10,2,5,3};
            System.out.println(firstOccurence(arr, 5, 0));
            System.out.println(lastOccurence(arr, 5, 0));
        }
    }
        */
         
//print x^n
        public class Recursion {
            public static int power(int x,int n){
                if(n==0){
                    return 1;
                }
                int Xnm1 = power(x, n-1);
                int Xn =x*Xnm1;
                return Xn;
            }
            public static int optimizedPower(int a,int n){
              if(n==0){
                    return 1;
                }
                int halfPower = optimizedPower(a, n/2);
                int halfPowerSq = halfPower*halfPower;
                //n is odd
                if(n %2 !=0){
                    halfPowerSq = a * halfPowerSq;
                }   
                return halfPowerSq;
            }
            public static void main(String[] args) {
                int a =2;
                int n =5;
                System.out.println(optimizedPower(a, n));
            }
        }