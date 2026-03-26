
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        City c = new City();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the state code (KA, TN, AP):");
        String stateCode = sc.nextLine();
        System.out.println("The city is: " + c.getCity(stateCode));

    }
}
class City{
    public String getCity(String n){
        String cn ;
        switch(n){
            case "KA": cn = "Bangalore";
            break;
            case "TN": cn = "Chennai";
            break;
            case "AP": cn = "Hyderabad";
            break;
            default: cn = "City not found";
        }
        return cn;
    }
}
