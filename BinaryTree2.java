/*/Q1.: diameter of a tree(No of nodes int longest path bw two leaves)
//approach 1 time comlexity=O(n^2)
public class BinaryTree2 {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh= height(root.left);
        int rh= height(root.right);
        return Math.max(lh, rh)+1;
    }

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int leftDiam = diameter(root.left);
        int leftht = height(root.left);
        int rightDiam = diameter(root.right);
        int rightht = height(root.right);
        
        int selfDiam = leftht + rightht+1;
        return Math.max(selfDiam,Math.max(leftDiam,rightDiam));
    }

    public static void main(String[] args) {
             //    1
            //   / \
            //  2   3
            // / \ / \
            // 4 5 6  7
        
        Node root = new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        root.right.left= new Node(6);
        root.right.right= new Node(7);

        System.out.println(diameter(root));
    }
}
*/
/*/approach 2 time complexity =O(n)
public class BinaryTree2 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info{
        int diam;
        int ht;
        public Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }
    public static Info diameter(Node root){
        if(root == null){
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);
        int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
        int ht= Math.max(leftInfo.ht,rightInfo.ht)+1;
        return new Info(diam, ht);
    }
    public static void main(String[] args) {
             //    1
            //   / \
            //  2   3
            // / \ / \
            // 4 5 6  7
        
        Node root = new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        root.right.left= new Node(6);
        root.right.right= new Node(7);

        System.out.println(diameter(root).diam);
        System.out.println(diameter(root).ht);
    }
}
    */


/*/Q2.: Subtree of another tree ||  Tc=O(n)
public class BinaryTree2 {
  static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static boolean isIdentical(Node node,Node subroot){
        if(node == null && subroot == null){
            return true;
        }else if(node ==null || subroot == null || node.data!=subroot.data){
            return false;
        }
        if(!isIdentical(node.left,subroot.left)){
            return false;
        }
        if(!isIdentical(node.right, subroot.right)){
            return false;
        }
        return true;
    }

    public static boolean isSubtree(Node root,Node subroot){
        if(root == null){
            return false;
        }
        if(root.data == subroot.data){
            if(isIdentical(root,subroot)){
                return true;
            }
        }
        return isSubtree(root.left, subroot)|| isSubtree(root.right,subroot);
        }

    public static void main(String[] args) {
             //    1
            //   / \
            //  2   3
            // / \ / \
            // 4 5 6  7
        
        Node root = new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        root.right.left= new Node(6);
        root.right.right= new Node(7);

        //   2
        //  / \
        // 4   5
        Node subRoot = new Node (2);
        subRoot.left = new Node(4);
        subRoot.right= new Node(5);

        System.out.println(isSubtree(root, subRoot));
    }
}
 */

//Top view of a tree
import java.util.*;
import java.util.LinkedList;
public class BinaryTree2 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

static class Info{
        Node node;
        int hd;
        public Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }

public static void topView(Node root){
    //level order
    Queue<Info>q =new LinkedList<>();
    HashMap<Integer,Node> map = new HashMap<>();
    int min = 0,max=0;
    q.add(new Info(root, 0));
    q.add(null);
    while(!q.isEmpty()){
        Info curr = q.remove();
        if(curr==null){
               if(q.isEmpty()){
                break;
               }else{
                q.add(null);
               }
        }else{
            if(!map.containsKey(curr.hd)){//first time hd is occur
               map.put(curr.hd, curr.node);
            }
            if(curr.node.left!=null){
                q.add(new Info(curr.node.left,curr.hd-1));
                min = Math.min(min,curr.hd-1);
            }
            if(curr.node.right!=null){
                q.add(new Info(curr.node.right,curr.hd+1));
                max= Math.max(max, curr.hd+1);
            }
        }
    }
    for(int i=min;i<=max;i++){
        System.out.print(map.get(i).data +" ");
    }
    System.out.println();
}
public static void main(String[] args) {
             //    1
            //   / \
            //  2   3
            // / \ / \
            // 4 5 6  7
        
        Node root = new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        root.right.left= new Node(6);
        root.right.right= new Node(7);

       topView(root);
        
    }    
    
}