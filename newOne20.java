/*
LeetCode 108 – Convert Sorted Array to Binary Search Tree (Java)

Approach

Use divide & conquer.

Pick the middle element as root (to keep tree height-balanced).

Recursively build left subtree from left half and right subtree from right half.
*/
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    private TreeNode build(int[] nums, int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = build(nums, left, mid - 1);
        root.right = build(nums, mid + 1, right);

        return root;
    }
}
