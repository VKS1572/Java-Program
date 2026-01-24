/*
Given a binary tree and an integer targetSum, check whether there exists a root-to-leaf path such that the sum of node values along the path equals targetSum.

Root → Leaf means ending at a leaf node, not anywhere in between.

💡 Approach (DFS – recursion)

Subtract current node value from targetSum

If we reach a leaf node, check if remaining sum is 0

Otherwise, recursively check left and right subtree

⏱️ Complexity

Time: O(n) (visit each node once)

Space: O(h) (recursion stack, h = tree height)
*/
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        // If it's a leaf node
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        // Check left or right subtree
        return hasPathSum(root.left, targetSum - root.val) ||
               hasPathSum(root.right, targetSum - root.val);
    }
}
