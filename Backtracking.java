/* 
//backtracking in arrays.... tc= O(n)=sc
public class Backtracking {
    public static void changeArr(int arr[], int i, int val){
        //base case
        if(i== arr.length){
            printArr(arr);
            return;
        }
        //recursion
        arr[i]=val;
        changeArr(arr, i+1, val+1);//fnx call step
        arr[i]=arr[i]-2;//backtracking
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]= new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}
 */
 /* 
//find subset

// import java.util.ArrayList;
// import java.util.List;

public class Backtracking {
    public static void findSubset(String str,int i,String ans){
        if(i==str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        //yes 
        findSubset(str, i+1, ans+str.charAt(i));
        //no
        findSubset(str, i+1, ans);
    }
    //   public List<List<Integer>> subsets(int[] nums) {
    //     List<List<Integer>> result = new ArrayList<>();
    //     findSubsets(0, nums, new ArrayList<>(), result);
    //     return result;
    // }

    // private void findSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
    //     if (index == nums.length) {
    //         result.add(new ArrayList<>(current));
    //         return;
    //     }

    //     // Include nums[index]
    //     current.add(nums[index]);
    //     findSubsets(index + 1, nums, current, result);

    //     // Backtrack (remove last added element)
    //     current.remove(current.size() - 1);

    //     // Exclude nums[index]
    //     findSubsets(index + 1, nums, current, result);
    // }
public static void main(String[] args) {
    String str = "abc";
    findSubset(str, 0, "");
    
}
   

}*/
 /* 
//permutation in string
public class Backtracking {
    public static void findPermutation(String str,String ans){
       //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0;i< str.length();i++){
            char curr = str.charAt(i);
            //"abcde"--> "ab"+"de"
            String newStr =str.substring(0,i)+str.substring(i+1);
            findPermutation(newStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
    }
}
 */
/*  n queens problem......
public class Backtracking {

    public static boolean isSafe(char board[][], int row, int col) {
//verticalk up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
//dig leftup
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
//diag right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void nQeens(char board[][], int row) {
//base
        if (row == board.length) {
            printBoard(board);
            return;
        }
//colamn loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQeens(board, row + 1);//function
                board[row][j] = 'x';//backtracking
            }
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println(".......chess board........");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        nQeens(board, 0);
    }
}
*/