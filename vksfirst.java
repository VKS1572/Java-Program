
import java.util.Scanner;

public class vksfirst{
public static void main(String[] args) {
   try(Scanner sc= new Scanner(System.in)){
   System.out.println("enter a no : ");

    int x= sc.nextInt();
    if(x%2==0){
        System.out.println("it is even");
    }
    else{
        System.out.println("it is odd");
    }
}

}
}