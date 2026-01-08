/*
LeetCode 160. Intersection of Two Linked Lists — Java Solution ✅

🔹 Approach: Two Pointers (Best & Optimal)

Use two pointers pA and pB

Traverse both lists

When a pointer reaches end, switch it to the head of the other list

If lists intersect, pointers will meet at the intersection node

If not, both will reach null

⏱ Time: O(n + m)
💾 Space: O(1)
*/


public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode pA = headA;
        ListNode pB = headB;

        while (pA != pB) {
            pA = (pA == null) ? headB : pA.next;
            pB = (pB == null) ? headA : pB.next;
        }
        return pA; // intersection node or null
    }
}
