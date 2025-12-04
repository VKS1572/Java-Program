/* tc = O(n^2) avg & wc, in BC O(n) arrray already shorted 
//Bubble Sort..................................................(i)
public class BasicSorting {
    public static void BubbleSort(int array[]){
        int size = array.length;
        for(int i= 0; i< size -1;i++){
            for(int j= 0;j<size-1-i;j++){
                if(array[j]>array[j+1]){
                  int temp = array[j];
                  array[j]= array[j+1];
                  array[j+1] = temp;
                }
            }

        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] ={5,4,1,3,2};
        BubbleSort(arr);
        printArr(arr);
    }
}
 */

 /* Time complexity = O(n^2) all cases 
// Selection Sort..........................................(ii)
public class BasicSorting {
    public static void SelectionSort(int array[]){
        int size = array.length;
        for(int i= 0; i< size-1;i++){
            int minPos = i;
            for(int j= i+1; j<size;j++){
              if(array[minPos] > array[j]){
                minPos= j;
              } 
            }
            int temp = array[minPos];
            array[minPos]=array[i] ;
            array[i] = temp;
        }
     }
    
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] ={5,4,1,3,2};
        SelectionSort(arr);
        printArr(arr);
    }
}
*/
/* tc=O(n^2)
// Insertion sort..........................................(iii)
public class BasicSorting {

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct pos to insert-
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev + 1] = curr;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    
    }
    
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        insertionSort(arr);
        printArr(arr);
    }
}
*/  
/* tc=O(n+range)
/counting sort....................................(iv)

public class BasicSorting{

    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i< arr.length;i++){
            largest= Math.max(largest,arr[i]);
        }
        int count[]= new int [largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for(int i= 0; i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    
    }


    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        countingSort(arr);
        printArr(arr);
    }
}

*/