/*  basics arraylist 
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        //add elment in list..
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
       
        //get operation ...
        int element =list.get(2);
        System.out.println(element);

        //remove element
        list.remove(2);
        System.out.println(list);

        //set element at index
        list .set(2,10);
        System.out.println(list);

        //contain
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        //size of a arraylist
        System.out.println(list.size());
        //print array
        for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");

        }
         System.out.println();
    }
}
*/
/* 
public class Arraylist {
public static void main(String[] args) {
     ArrayList<Integer>list= new ArrayList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //reverse print
        for(int i = list.size()-1;i>=0;i--){
          System.out.print(list.get(i)+" ");
        }
        System.out.println();
}
    
}
 */

 /* 
//find maximum in arraylist...

public class Arraylist {
public static void main(String[] args) {
     ArrayList<Integer>list= new ArrayList<>();
        
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        //max find
        int max= Integer.MIN_VALUE;
        for(int i = 0;i<list.size();i++){
          if(max<list.get(i)){
            max = list.get(i);
          }
          //max = Math.max(max, list.get(i));
        }
        System.out.println("maximum element ="+max);
}
    
}
*/
/* 
//swap two number
public class Arraylist {
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);
        int idx1=1,idx2=3;
        System.out.println(list);
        swap(list,idx1,idx2);
        System.out.println(list);
    }
}
*/
/*
//sorting an arraylist
import java.util.*;
public class Arraylist {

    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);
        System.out.println(list);
        Collections.sort(list); //by default ascending order
        System.out.println(list);
        //decending order
        Collections.sort(list,Collections.reverseOrder());//comparator fnx logic
        System.out.println(list);

    }
}
    */
    /* 
 //multidimensional arraylist
 import java.util.*;
    public class Arraylist {
    
        public static void main(String[] args) {
            ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
            ArrayList<Integer>list = new ArrayList<>();
            list.add(1);
            list.add(2);
            mainList.add(list);

             ArrayList<Integer>list2 = new ArrayList<>();
            list2.add(3);
            list2.add(4);
            mainList.add(list2);

            for(int i=0;i<mainList.size();i++){
                ArrayList<Integer> currList=mainList.get(i);
                for(int j=0;j<currList.size();j++){
                    System.out.print(currList.get(j)+" ");
                }
                 System.out.println();
            }
           System.out.println(mainList);
        }
        
    }
    */
    /* 
    import java.util.*;
    public class Arraylist {
    
        public static void main(String[] args) {
            ArrayList<ArrayList<Integer>>mainList =new ArrayList<>();
            ArrayList<Integer>list1=new ArrayList<>();
            ArrayList<Integer>list2=new ArrayList<>();
            ArrayList<Integer>list3=new ArrayList<>();
            for(int i=1;i<=5;i++){
                list1.add(i*1);
                list2.add(i*2);
                list3.add(i*3);
            }
            mainList.add(list1);
            mainList.add(list2);
            mainList.add(list3);

            System.out.println(mainList);
            //nestedloop
            for(int i=0;i<mainList.size();i++){
                ArrayList<Integer> currList=mainList.get(i);
                for(int j=0;j<currList.size();j++){
                    System.out.print(currList.get(j)+" ");
                }
                System.out.println();
            }
            System.out.println(mainList);
        }
    }
        */
    
        //Container with most water....imp O(n)
        public class Arraylist {       
    public int maxArea(int[] height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.length - 1; // length is a field, not a method

        while (lp < rp) {
            int ht = Math.min(height[lp], height[rp]); // use [] for array access
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            // updater
            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
          int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        // Create object and call method
        Arraylist sol = new Arraylist();
        int result = sol.maxArea(height);

        // Output the result
        System.out.println("Maximum water area: " + result);
    }
}

        