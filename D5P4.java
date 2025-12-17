
import java.util.Scanner;

/* Write a program to print the multiplication tableofanumberN,enteredbythe
 user */
public class D5P4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            //int mul = 1;
            for(int i= 1; i<=10;i++){

                System.out.println(num +"*"+ i +"=" + num*i);
            }
        }
       
    }
    
}
