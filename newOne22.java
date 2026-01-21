/*
✅ Problem Summary

Minimum depth = shortest path from root to nearest leaf node
(Leaf = node with no left & no right child)

💡 Key Points

If root is null → depth 0

If one child is null, you must go through the other child

Take minimum only when both children exist
*/

class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        // If one child is null, go through the other child
        if (root.left == null) return 1 + minDepth(root.right);
        if (root.right == null) return 1 + minDepth(root.left);

        // If both children exist
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}
