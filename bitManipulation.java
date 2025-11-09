/* 
// check if no is odd or even....
public class bitManipulation {
    public static void oddOreven(int n){
        int Bitmask = 1;
        if((n & Bitmask)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        oddOreven(12);
        oddOreven(7);
    }
}
*/
/* 
//Operations.
public class bitManipulation { 
     
    public static int getIthbit(int n,int i){
        int bitMask = 1<<i;
        if((n& bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setIthbit(int n,int i){
        int bitMask =1<<i;
        return n|bitMask;
    } 


    public static int clearIthbit(int n, int i){
        int bitMask =~(1<<i);
        return n&bitMask;
    }


    public static int updateIthbit(int n, int i, int newBit){
        // if(newBit==0){
        //     return clearIthbit(n, i);
        // }
        // else{
        //     return setIthbit(n, i)
        // }
        n= clearIthbit(n, i);
        int bitMask =newBit<<i;
        return n | bitMask;
    }


    public static int clearlastIthbit(int n, int i){
        int bitMask=(~0)<<i;
        return n & bitMask;
    }


    public static int clearrangeOfbit(int n, int i, int j){
        int a = (~0)<< (j+1);
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n&bitMask;
    }
    public static void main(String[] args) {
        //System.out.println(getIthbit(10, 2));
        //System.out.println(setIthbit(10, 2));
        //System.out.println(clearIthbit(10, 1));
       // System.out.println(updateIthbit(10, 2, 1));
       //System.out.println(clearlastIthbit(15, 2));
       System.out.println(clearrangeOfbit(10, 2, 7)); 
    }
}
*/

/* 
//q2 check if a no is a power of 2 or not
public class bitManipulation {
    public static boolean poweOftwo(int n){
        return (n & (n-1) )==0;
    }
public static void main(String[] args) {
   System.out.println(poweOftwo(10));
}
    
}
*/

/* 
//q3 count set bit in a no 

public class bitManipulation {
    public static int countSetbit(int n){
        int count =0;
        while(n>0){
            if((n&1) !=0){
                count++; // check lsb
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSetbit(15));
    }
}
*/
public class bitManipulation {
 public static int fastExpo(int a, int n){
    int ans=1;
    while(n>0){
        if((n & 1) !=0){
            ans =ans*a;
        }
        a=a*a;
        n=n>>1;
    }
    return ans;
 }
    public static void main(String[] args) {
        System.out.println(fastExpo(5, 3));
    }
}