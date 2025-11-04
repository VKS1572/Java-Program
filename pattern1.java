 
public class pattern1 {

    public static void main(String[] args) {
        char ch ='A';
        int n=5;
        for (int i= 1;i<=n; i++) {
          //  for ( int k=1; k <= 5-i+1; k++) {
          for(int j=1;j<=i;j++){
              
          System.out.print(ch);
          ch++;
            }
           System.out.println();
        }
    }
}
