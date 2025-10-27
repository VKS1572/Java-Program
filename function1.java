
/* 
 public class function1 {
    public static int sum(int a, int b){
       return a+b;
    }
    public static int sum(int a, int b,int c){
     return a+b+c;
    }
    public static void  main (String args[]){
    System.out.println(sum(4, 5));
    System.err.print(sum(4, 3, 2));
    }
}
*/

/* sum of two no using function------------------

 public class function1{
 
    public static int sum( int a, int b){
        return a+b;
    }

    public static float sum( float a, float b){

        return a+b;
    }
    
    public static void main(String[] args) {
        System.out.println(sum(5, 6));
        System.out.println(sum(3.4f, 4.5f));
    }

 }
*/ 

/*  prime or not finding--------------------
public class function1 {

    
     public static boolean Isprime(int n){
      boolean Isprime = true;
      for (int i =2;i<=n-1;i++){
      if(n%i==0){
      Isprime=false;
      }
      
      }
      return Isprime;
      
      }
     
      
     
// prime or not------------------
 
     public static boolean Isprime(int n){

        //corner case
        if(n==2){
            return true;
        }
       boolean Isprime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return Isprime;
     }
     public static void primeRange(int n){
        for(int i=2; i<=n;i++){
           if( Isprime(i)){
            System.out.println(i+" ");
        }
     }
    }
    public static void main(String[] args) {
       // System.out.println(Isprime(4));
       primeRange(100);
    }
}

  */


  

/*  binary to decimal...............//

public class function1{

public static void BintoDec(int binNum){
    int myNum = binNum;
    int pow = 0;
    int decNum = 0;
    while(binNum>0){
       int lastdigit = binNum%10;
       decNum = decNum + lastdigit * (int) Math.pow(2, pow);
       pow++;
       binNum = binNum/10;

    }
System.out.println("decimal of"+ myNum +"="+ decNum);
}

public static void main(String args[]){
 BintoDec(101);
}
}
*/          

/* decimal to binary --------------------//
public class function1{

    public static void DectoBin(int decNum){
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;

        while(decNum>0){
           int rem = decNum%2;
           binNum = binNum + rem * (int) Math.pow(10, pow);
           pow++;
           decNum = decNum/2;
    
        }
    System.out.println("binary of"+ myNum +"="+ binNum);
    }
    
    public static void main(String args[]){
    DectoBin(8);
    }
    }
    */
