/* WriteaJavaprogramtogetanumberfromtheuserandprintwhether it is
 positive or negative
*/

import java.util.Scanner;

public class D4P1 {
    public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
        int number = sc.nextInt();
        if (number >= 0){
            System.out.println("the no is positive");
        }
    else{
        System.out.println("the no is negative");
    }


    }    
    }

    
}