
import java.util.Scanner;

/* Write a program to find the factorialof any number entered by the user.
 (Hint : factorialofanumbern=n*(n-1)*(n-2)*(n-3)*……*1andexistsforpositivenumbers
 only. We write factorial as n!
 So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on.
 Note - Please do not confuse factorial with NOT EQUAL TO operator, they are not the same) */
public class D5P3 {

    public static void main(String[] args) {
       
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter a no :");
            int number = sc.nextInt();
            int fact=1;
            for(int k = fact; k <= number ; k++){
            fact*=k;
   
            }
            System.out.println(fact);
        }
        
    }
     
}
