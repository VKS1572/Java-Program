



/*create node in ll...........
public class LinkedList {
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
    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        ll.head=new Node(1);
        ll.head.next= new Node(2);
    }
}
*/

/*  operations in ll.............. 
public class LinkedList{
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

    //add last...

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head= tail= newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    // add any where middle
    public void add(int idx,int data){
        if(idx==0){
         addFirst(data);
        return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp= temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    //remove first...
    public int removeFirst(){
        if(size==0){
            System.out.println("ll is empty");
         return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val= head.data;
        head=head.next;
        size--;
        return val;
    }
    //remove last in linkedlist.....
    public int removeLast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;//tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;
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

    

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);//outout (head)1->2->3->4(tail)

        // ll.add(2, 9);
        // ll.print();

        // ll.removeFirst();
        // ll.print();

        ll.removeLast();
        ll.print(); 
        }
    }

*/

/*  iterative search................
public class LinkedList {

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


    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;//key found
            }
            temp=temp.next;
            i++;
        }
        //key not found
        return -1;
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
public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(5);
        ll.print();
        ll.addFirst(4);
         ll.print();
        ll.addFirst(3);
         ll.print();
        ll.addFirst(2);
         ll.print();
        ll.addFirst(1);
        ll.print();

        System.out.println(ll.itrSearch(1));
}
}
*/

/*recursive search.....................
public class LinkedList {

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

public int helper(Node head,int key){
    if(head==null){
        return -1;
    }
    if(head.data==key){
        return 0;
    }
    int idx= helper(head.next,key);
    if(idx==-1){
        return -1;
    }
    return idx+1;
}

public int recSearch(int key){
    return helper(head,key);
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
public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(5);
        ll.print();
        ll.addFirst(4);
         ll.print();
        ll.addFirst(3);
         ll.print();
        ll.addFirst(2);
         ll.print();
        ll.addFirst(1);
        ll.print();

        System.out.println(ll.recSearch(3));
}
}
*/

/*reverse in a ll........... tc=O(N)iterative approach
public class LinkedList {

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

     public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;

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
public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(5);
        ll.print();
        ll.addFirst(4);
         ll.print();
        ll.addFirst(3);
         ll.print();
        ll.addFirst(2);
         ll.print();
        ll.addFirst(1);
        ll.print(); 

        ll.reverse();
        ll.print();
    }
}
    */

    /* find and remove nth node from end.....
   public class LinkedList {
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

    public void deleteNthfromEnd(int n){
        //calculate size
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;//remove 1st ele from start or last from end
            return;
        }
        //sz-n
        int i=1;
        int iTofind=sz-n;
        Node prev=head;
        while(i<iTofind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
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
public static void main(String[] args) {
        LinkedList ll = new LinkedList();
       
        ll.addFirst(5);
       
        ll.addFirst(4);
       
        ll.addFirst(3);
     
        ll.addFirst(2);
     
        ll.addFirst(1);
        ll.print(); 

       ll.deleteNthfromEnd(3);
       ll.print();
    }
    
   } 

   */

   public class LinkedList {
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
    
    public Node finMid(Node head){
     Node slow= head;
     Node fast=head;
     while (fast!=null&&fast.next!=null) {
    slow=slow.next;//+1
    fast=fast.next.next;        
     }
     return slow;
    }

    public boolean checkPalindrome(){
        if(head==null||head.next==null){
            return true;
        }
        //step1 find mid
        Node miNode=finMid(head);

        //step2 reverse 2nd half
        Node prev=null;
        Node curr=miNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;//right half head
        Node left=head;

        //step3 check left half and right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;

        }
        return true;
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
public static void main(String[] args) {
        LinkedList ll = new LinkedList();
       
        ll.addFirst(1);
       
        ll.addFirst(2);
       
        // ll.addFirst(3);
     
        ll.addFirst(2);
     
        ll.addFirst(1);
        ll.print(); 

        System.out.println(ll.checkPalindrome());
   }
}