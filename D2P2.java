/*In a program, input the side of a square. You have to output the area of 
the square. 
(Hint : area of a square is (side x side))*/
import java.util.*;
public class D2P2 {

public static void main(String[] args) {
    try( Scanner sc = new Scanner(System.in)){
    int side = sc.nextInt();
    int A = side*side;

    System.out.println("The Area of a square is : " + A);
    }

}



}