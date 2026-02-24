/*✅ 1022. Sum of Root To Leaf Binary Numbers (LeetCode)

This problem gives a binary tree where each node contains either 0 or 1.

Every root-to-leaf path represents a binary number.
We need to return the sum of all those binary numbers in decimal form.

🔎 Key Idea

For every path:

Start from root.

At each node:

current = current * 2 + node.val

(This is equivalent to left shift in binary)

When you reach a leaf node, add the current value to the total sum.

🧠 Why This Works

If path is:

1 → 0 → 1

Binary calculation:

((1 * 2 + 0) * 2 + 1)
= (2 * 2 + 1)
= 5

Which is 101₂ = 5.

💻 Java Solution (DFS)*/
class Solution {
    
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }
    
    private int dfs(TreeNode node, int current) {
        if (node == null) {
            return 0;
        }
        
        // Form binary number
        current = current * 2 + node.val;
        
        // If leaf node, return value
        if (node.left == null && node.right == null) {
            return current;
        }
        
        // Recur for left and right
        return dfs(node.left, current) + dfs(node.right, current);
    }
}
/*⏱ Time Complexity

O(N) → Visit each node once.

📦 Space Complexity

O(H) → Recursive stack (H = height of tree)*/
