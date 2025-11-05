/*/stack using arraylist.............
import java.util.ArrayList;
public class Stack {
     static ArrayList<Integer>list=new ArrayList<>();
     public static boolean isEmpty(){
        return list.size()==0;
     }
     //push
     public static void push(int data){
        list.add(data);
     }
     //pop
     public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top=list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
        //peek
        public static int peek(){
          if(isEmpty()){
            return -1;
        }
        return list.get(list.size()-1);  
        }
     
     public static void main(String[] args) {
        Stack s=new Stack();
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

/*/stack using linkedlist..........
public class Stack {
 static class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
 }
 static class stack{
    static Node head=null;
    public static boolean isEmpty(){
        return head==null;
    }
    //push
    public static void push(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
            return;

        }
        newNode.next=head;
        head=newNode;
    }
    //pop
    public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;
    }
    //peek
    public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }
 }
 public static void main(String[] args) {
    stack s=new stack();
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
/*/stack java collection framework
import java.util.*;
public class MyStack {
public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
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

/*/push at Bottam in stack
import java.util.*;

public class MyStack {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 4); // 4 को bottom पर डालेंगे

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
*/
/*/reverse a string using stack

import java.util.*;
public class MyStack {
    public static String reverseString(String str){
        Stack <Character> s= new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result= new StringBuilder(" ");
        while(!s.isEmpty()){
            char curr= s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str="abc";
        String result = reverseString(str);
        System.out.println(result);
    }
}
    */
/*/reverse stack....
import java.util.*;
public class MyStack {
     public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void reverseStack(Stack <Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    public static void printStack(Stack <Integer>s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
   Stack <Integer> s= new Stack<>();
   s.push(1);
   s.push(2);
   s.push(3);
   //3,2,1 
   reverseStack(s);
   printStack(s);
   //1,2,3
    }

}
*/
public class MyStack {

    
}