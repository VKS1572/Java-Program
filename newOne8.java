
/*
🔹 Problem Summary

Given a linked list, reverse the nodes of the list k at a time and return the modified list.

If the number of nodes is not a multiple of k, leave the remaining nodes as it is.

You cannot change node values, only pointers.

🔹 Approach (Iterative – Optimal)

Idea:

Use a dummy node to simplify edge cases.

For each group of size k:

Check if k nodes exist.

Reverse exactly k nodes.

Connect the reversed group with the previous part.

⏱ Time Complexity: O(n)
📦 Space Complexity: O(1)
*/
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroup = dummy;

        while (true) {
            // Find kth node
            ListNode kth = prevGroup;
            for (int i = 0; i < k && kth != null; i++) {
                kth = kth.next;
            }
            if (kth == null) break;

            ListNode nextGroup = kth.next;

            // Reverse k nodes
            ListNode prev = nextGroup;
            ListNode curr = prevGroup.next;

            while (curr != nextGroup) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            // Connect with previous group
            ListNode temp = prevGroup.next;
            prevGroup.next = kth;
            prevGroup = temp;
        }

        return dummy.next;
    }
}
