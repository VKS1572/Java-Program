
import java.util.Queue;

/*/Queue using array
public class Queue1 {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
        arr= new int [n];
        size=n;
        rear=-1;
        }

        public static boolean isEmpty(){
            return rear==-1;
        }

        //add TC= O(1)
        public static void add(int data){
            if(rear==size-1){
                System.out.println("queue is full");
                return;
            }
            rear=rear+1;
            arr[rear]=data;
        }

        //remove TC=O(n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++){
                arr[i]=arr[i+1];
            }
            rear= rear-1;
            return front;
        }

        //peek TC=O(1)
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q= new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
*/

/*/circular queue using array
// Time Complexity: add, remove, peek -> O(1)
public class Queue1 {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add -> O(1)
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            // first element add
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // remove -> O(1)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int result = arr[front];

            // if only one element
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;
        }

        // peek -> O(1)
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Removed: " + q.remove());
        q.add(6);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
*/

/*queue using linked list
public class Queue1 {

    static class Node {
        int data;
        Node next;   // should be Node, not int

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // add
        public static void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int front = head.data;
            // single elem
            if (tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
*/

/* Queue using jcf tc--> O(1) every operation
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;

public class Queue1 {

    public static void main(String[] args) {
       // Queue<Integer> q= new LinkedList<>();
      Queue <Integer> q= new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
 */

 /*/queue using 2 stacks

import java.util.*;
public class Queue1 {
    static class Queue{
        static Stack<Integer> s1= new Stack<>();
        static Stack<Integer> s2= new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        //add --> O(n)
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);

            while(!s2.isEmpty()){
            s1.push(s2.pop());
            }
        
        }

        //remove tc-->O(1)
  public static int remove(){
    if(isEmpty()){
        System.out.println("queue is empty");
        return -1;
    }
    return s1.pop();
  }


  //peek tc-->O(1)
public static int peek(){
     if(isEmpty()){
        System.out.println("queue is empty");
        return -1;
    }
    return s1.peek();
}

}   

public static void main(String[] args) {
        Queue q= new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
      }
    }
    */

  /*/stack using two queue
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;

    public class Queue1 {
        static class Stack{
            static Queue<Integer> q1= new LinkedList<>();
            static Queue<Integer> q2= new LinkedList<>();

            public static boolean isEmpty(){
                return q1.isEmpty() && q2.isEmpty();
            }
            public static void push(int data){
                if(!q1.isEmpty()){
                    q1.add(data);
                }else{
                    q2.add(data);
                }
            }
            public static int pop(){
                if(isEmpty()){
                    System.out.println("empty stack");
                    return -1;
                }
                int top=-1;
                //case1
                if(!q1.isEmpty()){
                    while(!q1.isEmpty()){
                        top=q1.remove();
                        if(q1.isEmpty()){
                            break;
                        }
                        q2.add(top);
                    }
                }else{
                    //case2
                    while(!q2.isEmpty()){
                        top=q2.remove();
                        if(q2.isEmpty()){
                            break;
                        }
                        q1.add(top);
                    }
                }
            return top;
            }
            //peek
            public static int peek(){
                if(isEmpty()){
                    System.out.println("empty stack");
                    return -1;
                }
                int top=-1;
                //case1
                if(!q1.isEmpty()){
                    while(!q1.isEmpty()){
                        top=q1.remove();
                       
                        q2.add(top);
                    }
                }else{
                    //case2
                    while(!q2.isEmpty()){
                        top=q2.remove();
                        q1.add(top);
                    }
                }
            return top;
            
            }
        }
        
        
        public static void main(String[] args) {
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
        
    }
    */

    /* first non repeating letter in a stram of character ||all char in lower case, TC= O(n)
    import java.util.*;
    import java.util.LinkedList;

    public class Queue1 {
    public static void printNonRepeating(String str) { 
        int freq[]=new int [26];  //'a'-'z' 
       Queue<Character>q= new LinkedList<>();
        for(int i=0;i<str.length();i++){  
        char ch=str.charAt(i); 
         q.add(ch);
         freq[ch-'a']++; 
         while(!q.isEmpty() && freq[q.peek()-'a']>1){
             q.remove();
         }
          if(q.isEmpty()){ 
            System.out.println(-1+" ");
         }else{
             System.out.println(q.peek()+" ");
         }
         } 
         System.out.println(); 
        }
        public static void main(String[] args) {
            String str="aabccxb";//op: a,-1,b,b,b,b,x
            printNonRepeating(str);
        }
    }
        */

/* InterLeave  2 halves of a queue (even length) tc= O(n)  

import java.util.*;
import java.util.LinkedList;

public class Queue1 {

    public static void interLeave(Queue<Integer> q) {
        if (q.size() % 2 != 0) {
            System.out.println("Queue must have even number of elements");
            return;
        }

        int size = q.size();
        Queue<Integer> firstHalf = new LinkedList<>();

        // Step 1: Push first half elements into another queue
        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(q.remove());
        }

        // Step 2: Now interleave the two halves
        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove()); // add element from first half
            q.add(q.remove());         // add element from second half
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interLeave(q);

        // print q
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}
*/
//queue reverse tc=O(n)
import java.util.*;
import java.util.LinkedList;
public class Queue1 {
    public static void reverse(Queue<Integer>q){
        Stack<Integer>s =new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
    Queue<Integer>q=new LinkedList<>();     
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        reverse(q);
         // print q
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
}
}