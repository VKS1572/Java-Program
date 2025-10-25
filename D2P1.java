import java.util.Scanner;

public class D2P1 {   
public static void main(String args[]) {
   try( Scanner sc = new Scanner(System.in)){
    int A = sc.nextInt();
    int B = sc.nextInt(); 
    int C = sc.nextInt();
    
    int Sum = A+B+C;
    int Average =Sum/3;
    System.out.println(Average); 
}

}
    
}
