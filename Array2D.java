/* 

import java.util.*;
public class Array2D {

    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.println("founded at cell("+ i+","+ j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String args[]){
        int matrix[][]= new int[3][3];
        int n =matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0; j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i=0;i<n;i++){
            for(int j=0; j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
    }
          search(matrix, 7);
    }

}
*/

/* 
//Spiral matrix.....imp faang time complexity = O(N*M)

public class Array2D {

    public static void printSpiral(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow =matrix.length-1, endCol= matrix[0].length-1;
        

        while(startRow<= endRow && startCol<= endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //botttom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;

        }
        System.out.println();

    }

    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
         printSpiral(matrix);
    }
}
*/
/*
//Diagonal sum.......
public class Array2D {

    public static int diagonalSum(int[][] matrix){
        int sum=0;
        //Brute force approach
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j){
        //             sum += matrix[i][j];
        //         }
        //         else if(i+j == matrix.length-1){
        //             sum += matrix[i][j];
        //         }
                
        //     }
        // }

        for(int i=0;i<matrix.length;i++){
            //PD
            sum += matrix[i][i];
            //SD
            if(i != matrix.length-1-i){
            sum += matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
    
public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(diagonalSum(matrix));
        
}
}
*/

// search in sorted matrix 2D array .....TC= O(N+M)
public class Array2D {
    public static boolean stairCase(int matrix[][],int key){
    //     int row =0, col = matrix[0].length-1;
    //     while(row < matrix.length && col>=0){
    //         if(matrix[row][col]==key){
    //             System.out.println("found key at ("+row+","+col+")");
    //             return true;
    //         }
    //         else if(key < matrix[row][col]){
    //             col--;
    //         }
    //         else{
    //             row++;
    //         }
    //     }
    //     System.out.println("key not found");
    //     return false;

    
    //another method...
       int row = matrix.length-1, col = 0;
     while (row>=0 & col < matrix[0].length){
        if(matrix[row][col]==key){
                 System.out.println("found key at ("+row+","+col+")");
                 return true;
             }
             else if(key < matrix[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("key not found");
        return false;
     }
     
    
public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        stairCase(matrix, 30);
        
}
}