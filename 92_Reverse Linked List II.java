/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode forward = null;
        ListNode previous = null;
        while(current != null)
        {
            forward = current.next;
            current.next = previous;
            previous = current;
            current = forward;
        }

        return previous;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null || left == right)
        {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode leftA = dummy;
        for(int i = 1; i < left; i++)
        {
            leftA = leftA.next;
        }
        ListNode rightA = leftA;

        for(int i = left; i <=right; i++)
        {
            rightA = rightA.next;
        }
        ListNode rightB = rightA.next;

        rightA.next = null;

        ListNode leftB = reverseList(leftA.next);

        leftA.next = leftB;
        while(leftB.next != null)
        {
            leftB = leftB.next;
        }
        leftB.next = rightB;

        return dummy.next;
    }
}