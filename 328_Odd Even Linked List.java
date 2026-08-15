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
    public ListNode oddEvenList(ListNode head) {
        ListNode even = new ListNode(-1);
        ListNode odd = new ListNode(-2);
        int count = 1;
        ListNode temp = head;
        ListNode tempOdd = odd;
        ListNode tempEven = even;
        while(temp != null)
        {
            if(count % 2 != 0)
            {
                tempOdd.next = temp;
                tempOdd = tempOdd.next;
            }
            else
            {
                tempEven.next = temp;
                tempEven = tempEven.next;
            }
            count++;
            temp = temp.next;
        }
        tempOdd.next = null;
        tempEven.next = null;

        tempOdd.next = even.next;
        return odd.next;
    }
}