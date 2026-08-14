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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-2);
        ListNode t1 = dummy1;
        ListNode t2 = dummy2;

        ListNode temp = head;
        while(temp != null)
        {
            if(temp.val < x)
            {
                t1.next = temp;
                t1 = temp;
                temp = temp.next;
            }
            else
            {
                t2.next = temp;
                t2 = temp;
                temp = temp.next;
            }
        }
        t1.next = null;
        t2.next = null;

        t1.next = dummy2.next;

        return dummy1.next;
    }
}