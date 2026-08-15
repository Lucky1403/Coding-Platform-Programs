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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }

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

        tempEven = even.next;
        tempOdd = odd.next;
        ListNode finalDummy = new ListNode(-3);
        ListNode tempDummy = finalDummy;

        while(tempEven != null  && tempOdd != null)
        {
            tempDummy.next = tempEven;
            tempDummy = tempEven;
        
            tempEven = tempEven.next;

            tempDummy.next = tempOdd;
            tempDummy = tempOdd;
        
            tempOdd = tempOdd.next;;
        }

        return finalDummy.next;
    }
}