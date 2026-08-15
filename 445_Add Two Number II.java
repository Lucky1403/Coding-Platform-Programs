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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = reverseList(l1);
        ListNode temp2 = reverseList(l2);

        int sum = 0;
        int carry = 0;

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(temp1 != null || temp2 != null || carry > 0)
        {
            int val1 = (temp1 != null) ? temp1.val : 0;
            int val2 = (temp2 != null) ? temp2.val : 0;

            sum = carry + val1 + val2;
           
            carry = sum / 10;
            int value = sum % 10;
        
            temp.next = new ListNode(value);
            temp = temp.next;

            if(temp1 != null)
            {
                temp1 = temp1.next;
            }
            
            if(temp2 != null)
            {
                temp2 = temp2.next;
            }
        }
        return reverseList(dummy.next);
    }
}