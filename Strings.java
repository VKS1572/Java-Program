/*
//Basics of strings.......
public class Strings {
    public static void printLetter(String str){
        for(int i=0;i< str.length();i++){
            System.err.print(str.charAt(i)+" ");
        
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // char arr[]={'a','b','c'};
        // String str ="abcd";
        // String str2 = new String("xyz");

         //String are immutable(not change in java)

        // Scanner sc = new Scanner(System.in);
        // String name;
        // //name=sc.next();//single word
        // name=sc.nextLine(); // multiple line
        // System.out.println(name);

        // String fullName = "tony stark";
        // System.out.println(fullName.length());

        //concatination
        String firstName = "vikas";
         String lastName ="Pradhan";
        String fullName = firstName + " "+ lastName;
        // System.out.println(fullName+" is this");
        printLetter(fullName);
    }
}
*/
/* string is palindrome ? .....TC=O(n)
public class Strings {
   public static boolean isPalindrom(String str){
    // if we ignore non alphanumeric char and case here we use.
   // str = str.toLowerCase().replaceAll("[^a-z0-9]", "");

    int n = str.length();
    for(int i=0; i<n/2;i++){
        if(str.charAt(i) != str.charAt(n-1-i)){
            return false;
        }
    }
    return true;
   }
    public static void main(String[] args) {
       String str ="noon";
      System.out.println( isPalindrom(str));
   }

}
*/

/* a rout containing 4 direction (E,W,N,S,) find the shortest path to reach destination....TC = o(n)
public class Strings {
    public static float getShortpath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            // south
            if(dir == 'S'){
                y--;
            }
            //north
            else if(dir =='N'){
                y++;
            }
            else if(dir == 'W'){
                x--;
            }
            else{
                x++;
            }

        }
        int X2= x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        String path ="NWS";
        System.out.println(getShortpath(path));
    }
}
*/
/* 
//largest string .. given set Time complexity=O(x*n)
public class Strings {

    public static void main(String[] args) {
        String fruits[]={"apple","mango","banana"};
        String largest=fruits[0];

        for(int i =1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest =fruits[i];
            
            }
        }
        System.out.println(largest);
    }
}
*/

/* 
//string builder que.
public class Strings {
    public static String UpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch= Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i< str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
       return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi i am vikas";
    System.out.println(UpperCase(str));
    }
}
*/
public class Strings {

     public static String compress(String str) {
        String newStr ="";
        for(int i=0; i< str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count>1){
                newStr += count.toString();
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
        String str = "aabbcc";
    System.out.println(compress(str));
}
}