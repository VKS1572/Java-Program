/*/Build a tree....Tc=O(n)
public class BinaryTree1 {
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

    static class BinaryTree {
        private int idx = -1;  // make it instance variable, not static

        public Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }


    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

    }
}
*/

/*/ Preorder, Inorder, Postorder, Level order traversal (TC = O(n))
import java.util.*;
import java.util.LinkedList;

public class BinaryTree1 {
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

    static class BinaryTree {
        private int idx = -1;  // instance variable

        public Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    // preorder traversal
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // inorder traversal
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // postorder traversal
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // level order traversal
    public static void levelorder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println(); // new line after finishing one level
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " "); // print in same line
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("Preorder:");
        preorder(root);
        System.out.println("\n\nInorder:");
        inorder(root);
        System.out.println("\n\nPostorder:");
        postorder(root);
        System.out.println("\n\nLevel Order:");
        levelorder(root);
    }
}
*/

/*/Height of a tree
public class BinaryTree1 {
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
        if(root==null){
            return 0;
        }
        int leftH=height(root.left);
        int rightH= height(root.right);
        return Math.max(leftH, rightH)+1;

    }
    public static void main(String[] args) {
        
        //        1
        //       / \
        //      2   3
        //     / \ / \
        //     4 5 6  7
        
        Node root = new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        root.right.left= new Node(6);
        root.right.right= new Node(7);

        System.out.println(height(root));
    }    
}
*/

/*/count of Nodes  ..Tc=O(n)
public class BinaryTree1 {
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

    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int leftC=count(root.left);
        int rightC= count(root.right);
        return leftC+rightC+1;

    }
    public static void main(String[] args) {
        // 
        //        1
        //       / \
        //      2   3
        //     / \ / \
        //     4 5 6  7
        //  
        Node root = new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        root.right.left= new Node(6);
        root.right.right= new Node(7);

      System.out.println(count(root));
    }    
}

*/

//sum of nodes   .TC=O(N)
public class BinaryTree1 {
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

    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=sum(root.left);
        int rightSum= sum(root.right);
        return leftSum+rightSum+root.data;

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

        System.out.println(sum(root));
    }    
}