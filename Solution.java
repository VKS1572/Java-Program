/*question 1 ..........................................

//Write a Java method to compute the average of three numbers..


public class functionQue {
     
    public static void  Avg(int a,int b, int c){

     int avg = (a+b+c)/3;

    
    System.out.println("The Average is :" + avg);
    }

    public static void main(String[] args) {
        Avg(10, 20, 30);
    }
}

// or -----------------------------------------------

import java.util.Scanner;

public class Solution {

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = sc.nextDouble();
        System.out.print("Input the second number: ");
        double y = sc.nextDouble();
        System.out.print("Input the third number: ");
        double z = sc.nextDouble();
        System.out.print("The average value is " + average(x, y, z) + "\n");

    }

    public static double average(double x, double y, double z) {
        return (x + y + z) / 3;
    }
}
*/

/* Question 2........................
Write a method named isEven that accepts an int argument. The method should return true if
the argument is even, or false otherwise. Also write a program to test 
your method.

import java.util.Scanner; 

public class functionQue {

    public static boolean isEven(int number) {
        if(number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.print("Enter an integer: ");
        num = sc.nextInt();
        if (isEven(num)) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}

 */

 /*Question 3.............................................
Write a Java program to check if a number is a palindrome in Java? ( 121 is 
a palindrome, 321 is not) A number is called a palindrome if the number is equal to the reverse
 of a number e.g., 121 is a palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a 
palindrome because the reverse of 321 is 123, which is not equal to 321.
 */
