

/* 
// tiling problem.....
public class Recursion2 {
     public static int numTilings(int n) {
        //base cse
        if(n==0||n==1){
            return 1;
        }
        //vertical
        int fnm1 = numTilings(n-1);

    // horizontal
        int fnm2 = numTilings(n-2);

        int totWays = fnm1+fnm2;
        return totWays;

    }
    public static void main(String[] args) {
        System.out.println(numTilings (3));
    }
}
 */
 /* 
// Remove duplicate in string
public class Recursion2 {
    public static void removeDupl(String str, int idx,StringBuilder newStr,boolean Map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(Map[currChar-'a']== true){
            removeDupl(str, idx+1, newStr, Map);
        }else{
            Map[currChar-'a'] = true;
            removeDupl(str, idx+1, newStr.append(currChar ), Map);
        }
    }
    public static void main(String[] args) {
        String str = "appnacollege";
        removeDupl(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
 */
 /* friends pair problem...
public class Recursion2 {

        public static int countFriendsPairings(int n) {
        // code here
        if(n==1 || n==2){
            return n;
        }
    
        int fnm1 = countFriendsPairings(n-1);
         int fnm2 = countFriendsPairings(n-2);
         int pairWays = (n-1)* fnm2;
         
         int totalways = fnm1 + pairWays;
         return totalways;
    }
        public static void main(String[] args) {
            System.out.println(countFriendsPairings(3));
        }
}
 */
 /* binary string problem..
public class Recursion2 {
    public static void printBinaryString(int n, int lastPlace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        if(lastPlace==0){
            printBinaryString(n-1, 0, str+"0");
            printBinaryString(n-1, 1, str+"1");
        }
        else{
            printBinaryString(n-1, 0, str+"0");
        }
    } 
    public static void main(String[] args) {
        printBinaryString(3, 0, "");
    }
}
 */
// towe of hanoi
public class Recursion2 {

    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

//transfer top n-1 from src to helper using dest as 'helper' 
        towerOfHanoi(n - 1, src, dest, helper);
//transfer nth from src to dest 
        System.out.println("transfer disk " + n + " from " + src + " to " + helper);
//transfer n-1 from helper to dest using src as 'helper' 
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String args[]) {
        int n = 4;
        towerOfHanoi(n, "A", "B", "C");
    }

}
