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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0)
        {
            return head;
        }

        ListNode temp = head;
        ListNode tail = head;
        int count = 1;
        while(temp.next != null)
        {
            tail = tail.next;
            temp = temp.next;
            count++;
        }
        
        k = k % count;
        if(k == 0)
        {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        for(int i = 1; i <= k + 1; i++)
        {
            fast = fast.next;
        }

        while(fast != null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        
        ListNode a = slow.next;
        temp = slow.next;
        slow.next = null;

        while(temp != null && temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = head;

        return a;
    }
}