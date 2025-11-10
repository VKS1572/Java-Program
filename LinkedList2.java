/*detect cycle in a linkedlist(flyod cfa)

public class LinkedList2 {
    
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
 
public static boolean isCycle(){
 Node slow= head;
 Node fast= head;

 while(fast!=null && fast.next !=null){
    slow = slow.next;//+1
    fast = fast.next.next;//+2
    if(slow==fast){
        return true;//cycle exist
    }
 }
 return false;//cycle not exist
}

public static void main(String[] args) {
    head= new Node(1);
    head.next= new Node(2);
    head.next.next= new Node(3);
    head.next.next.next=head;
    
    System.out.println(isCycle());
}
}
*/

/*remove a loop/cycle in a ll
public class LinkedList2 {
     
public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
 
    public static boolean isCycle(){
 Node slow= head;
 Node fast= head;

 while(fast!=null && fast.next !=null){
    slow = slow.next;//+1
    fast = fast.next.next;//+2
    if(slow==fast){
        return true;//cycle exist
    }
 }
 return false;//cycle not exist
}


public static void removeCycle(){
    //detect cycle
    Node slow =head;
    Node fast =head;
    boolean cycle=false;
    while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
        if(fast==slow){
            cycle=true;
            break;
        }
    }
    if(cycle=false){
       return ;
    }
    //finding meeting point
    slow=head;
    Node prev=null;//last node
    while(slow!=fast){
        prev=fast;
        slow= slow.next;
        fast=fast.next;
    }
    //remove cycle last ka next null
    prev.next=null;
}

public static void main(String[] args) {
    head= new Node(1);
    Node temp= new Node(2);
    head.next=temp;
    head.next.next= new Node(3);
    head.next.next.next=temp;
    
    System.out.println(isCycle());
    removeCycle();
    System.out.println(isCycle());
}
    
}
*/

/*java collection framework...............
import java.util.LinkedList;

public class LinkedList2 {
         public static void main(String[] args) {
            LinkedList<Integer>ll= new LinkedList<>();
         //add
            ll.addLast(1);
            ll.addLast(2);
            ll.addFirst(0);
            //0->1->2
        System.out.println(ll);
        //remove
           ll.removeLast();
           ll.removeFirst();
           System.out.println(ll);
         }
    
}
     */


/*/merge sort.......tc=O(nlogn)
    public class LinkedList2 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    //add first....
    public void addFirst(int data){
    //crate new Node
    Node newNode = new Node(data);
    size++;
    if(head == null){
        head = tail=newNode;
        return;
    }
    //new node next=head
     newNode.next = head;//link
     //head= newNode
     head= newNode;
    }
    //print ll
    public void print(){
    if(head==null){
        System.out.println("LL is empty");
        return;
    }
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("null");
    
}

    private Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast= fast.next.next;
        }
        return slow;//mid node
    }

    private Node merge(Node head1,Node head2){
        Node mergell= new Node(-1);
        Node temp=mergell;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp= temp.next;
            }
        }
            while(head1!=null){
                temp.next= head1;
                head1=head1.next;
                temp= temp.next;
            }
            while(head2!=null){
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
           
        
      return mergell.next;
        
    }

    public Node MergeSort(Node head){
        if(head==null ||head.next==null){
            return head;
        }
        //find mid
        Node mid=getMid(head);
        //left & right
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft= MergeSort(head);
        Node newRight= MergeSort(rightHead);
        //merge
        return merge(newLeft,newRight);
    }

         public static void main(String args[]){
        LinkedList2 ll = new LinkedList2();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();
        
       ll.head= ll.MergeSort(ll.head);
        ll.print();
        }
        }  
   */   

//zig zag linkedlist.........
   public class LinkedList2 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    //add first....
    public void addFirst(int data){
    //crate new Node
    Node newNode = new Node(data);
    size++;
    if(head == null){
        head = tail=newNode;
        return;
    }
    //new node next=head
     newNode.next = head;//link
     //head= newNode
     head= newNode;
    }
    //print ll
    public void print(){
    if(head==null){
        System.out.println("LL is empty");
        return;
    }
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("null");
    
}

    public void zigzag(){
        //find mid
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast= fast.next.next;
        }
        Node mid= slow;//mid node

        //reverse 2nd half ll
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextL,nextR;
        //alternativr merge or zig zag merge
        while(left!=null && right!=null){
           nextL=left.next;
           left.next=right;
           nextR=right.next;
           right.next=nextL;
           left=nextL;
           right=nextR;
        }
    }

         public static void main(String args[]){
        LinkedList2 ll = new LinkedList2();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
       ll.zigzag();
       ll.print();
        }
 }  