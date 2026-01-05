/*
🔹 Problem Summary

Given a linked list, swap every two adjacent nodes and return the head.
You must not change node values, only change links.

Example:
1 → 2 → 3 → 4
➡️ 2 → 1 → 4 → 3

✅ Approach (Iterative – Best for interviews)

Use a dummy node to handle head swap easily

Swap nodes in pairs using pointers

Time: O(n)

Space: O(1)
*/
class Solution {
    public ListNode swapPairs(ListNode head) {
        // Dummy node before head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        // Traverse in pairs
        while (head != null && head.next != null) {
            ListNode first = head;
            ListNode second = head.next;

            // Swapping
            prev.next = second;
            first.next = second.next;
            second.next = first;

            // Move pointers forward
            prev = first;
            head = first.next;
        }

        return dummy.next;
    }
}
