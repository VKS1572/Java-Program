
/*
 Writea Javaprogramtoinputweeknumber(1-7)andprintdayofweekname
 using switch case.
*/

import java.util.Scanner;

public class D4P3 {
public static void main(String[] args) {
    try(Scanner sc = new Scanner (System.in)){
    System.out.println("enter the week no :");
        int wn = sc.nextInt();
    switch(wn){
               case 1 -> System.out.println("monday");
               case 2 -> System.out.println("Tuesday");
               case 3 -> System.out.println("wednesday");
               case 4 -> System.out.println("Thursday");
               case 5 -> System.out.println("friday");
               case 6 -> System.out.println("Saturday");
               case 7 -> System.out.println("sunday ");

               default -> System.out.println("Invalid!");

    }
    }
}    
}
