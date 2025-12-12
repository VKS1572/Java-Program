/*Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and 
an eraser. You have to output the total cost of the items back to the user as their bill. 
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */
import java.util.*;
public class D2P3 {
    public static void main(String[] args) {
        try( Scanner sc = new Scanner(System.in)){
        
            float PL = sc.nextFloat();
            float PN = sc.nextFloat();
            float ER = sc.nextFloat();

            System.out.println("Enter the price of pencil:"+ PL);
            System.out.println("Enter the price of pen:"+ PN);
            System.out.println("Enter the price of eraser:"+ ER);

            float sum = PL+PN+ER;
            System.out.println("total:"+ sum);
            
            double tt = sum * 0.18;
            System.out.println("after including 18% gst"+ tt );

        }
    }
    }
