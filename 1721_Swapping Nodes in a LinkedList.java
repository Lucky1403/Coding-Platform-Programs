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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        int length = 0;
        while(first != null)
        {
            first = first.next;
            length++;
        }
        first = head;

        int idxReverse = length - k + 1;
        ListNode second = head;
        int temp = 0;

        for(int i = 1; i < k; i++)
        {
            if(first != null)
            {
                first = first.next;
            }
        }
        
        for(int i = 1; i < idxReverse; i++)
        {
            if(second != null)
            {
                second = second.next;
            }
        }

        temp = first.val;
        first.val = second.val;
        second.val = temp;

        return head;
    }
}