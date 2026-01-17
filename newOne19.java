/*
LeetCode 83 – Remove Duplicates from Sorted List (Java Solution)

🧠 Problem Summary

Given the head of a sorted linked list, delete all duplicates so that each element appears only once.
Return the linked list sorted as well.

✅ Approach (Two Pointers in One Pass)

Since the list is already sorted, duplicates will be adjacent.

Start from head

Compare current node with next

If values are equal → skip the next node

Else → move forward

⏱️ Time Complexity: O(n)
📦 Space Complexity: O(1)
*/
public class RemoveDuplicatesFromSortedList {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next; // skip duplicate
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    // Helper method to print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Example: 1 -> 1 -> 2 -> 3 -> 3
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        System.out.println("Original List:");
        printList(head);

        head = deleteDuplicates(head);

        System.out.println("After Removing Duplicates:");
        printList(head);
    }
}
