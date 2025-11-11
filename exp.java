
import java.util.function.Supplier;






/*public class exp{
    public static void  calculateMul(int a, int b){
        int mul =  a*b;
       System.out.println(mul);
    }
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    calculateMul(a,b);
}

}
 */
// factorial using fuction call
/* 
 public class exp{
 
public static void   calculatefact(int a){
     int fact = 1;
     for (int i=1; i<=a;i++ ){
        fact = fact*i;
     }

     System.out.println(fact);
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    calculatefact(a);
    
}

 }*/
 /* 
 public class exp{
 
    public static int calculatefact(int a){
         int f = 1;
         for (int i=1; i<=a;i++ ){
            f = f*i;
         }
     return f;
    }

    public static int bincoff(int n, int r){
       int fact_n=  calculatefact(n);
       int fact_r=  calculatefact(r);
       int mrf_n=  calculatefact(n-r);
       
       int binC = fact_n/(fact_r*mrf_n);
      
       return binC;
    }
    
    public static void main(String[] args) {
      System.out.println(bincoff(5,2));
 }
}
 */
 /*/max array sum... kadanes algo optimal sol.
public class exp{
 public static void kadanes(int number[]){
    int ms= number[0];
    int cs= number[0];
    
    for(int i=0;i<number.length;i++){
        cs=cs+number[i];
        if(cs<0){
            cs=0;
        }
        ms= Math.max(cs, ms);
    }
 System.out.println("our max value is:"+ms);
 }


 public static void main(String[] args) {
  int number[]= {-2,-3,4,-1,-2,1,5,-3};   
  kadanes(number);
  }
}

 */
 /* 
public class exp{
 public static void main(String[] args) { 
int[][] nums = { {1,4,9},{11,4,3},{2,2,3} }; 
int sum = 0; 
 
 
//sum of 2nd row elements 
for(int j=0; j<nums[0].length; j++) { 
sum += nums[1][j]; 
} 
 
 
System.out.println("sum is : " + sum);
}
}
 */
/* transpose
public class exp {

    public static void main(String[] args) {
        int row = 2, column = 3;
        int[][] matrix = {{2, 3, 7}, {5, 6, 7}};

// Display original matrix 
        printMatrix(matrix);

// Transpose the matrix 
        int[][] transpose = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

// print the transposed matrix 
        printMatrix(transpose);
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("The matrix is: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
*/

/*/lambada expression java8
 import java.util.function.BiConsumer;

public class exp {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> add = (a, b) -> {
            System.out.println(a + b);
        };

        add.accept(5, 10); // prints 15
    }
}

*/

/*/ functional interface
@FunctionalInterface
interface Adder {
    void add(int a, int b);
}

public class exp {
    public static void main(String[] args) {
        Adder adder = (a, b) -> System.out.println(a + b);
        adder.add(5, 10); // prints 15
    }
}

*/

public class exp {

    public static void main(String[] args) {
       
        //predicate takes int return boolean
        // Predicate<Integer>isEven = n -> n%2==0;
        // System.out.println(isEven.test(202));

        //consumer takes arg return nothing
        // Consumer<String> print= s-> {
        //     System.out.println(s.toUpperCase());
        // };
        //  print.accept("java");

       //supplier it takes nothing but return a value
       Supplier<Double> randomV= ()-> Math.random();
       System.out.println(randomV.get());
    }
}