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

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
        {
            return true;
        }   

        ListNode temp = head;
        int length = 1;
        while(temp.next != null)
        {
            length++;
            temp = temp.next;
        }

        int half = length / 2;

        temp = head;

        if(length % 2 == 0)
        {
            for(int i = 1; i < half; i++)
            {
                temp = temp.next;
            }
        }
        else
        {
            for(int i = 1; i <= half; i++)
            {
                temp = temp.next;
            }
        }
        
        ListNode temp2 = temp.next;
        temp.next = null;

        ListNode secondHalf = reverseList(temp2);

        ListNode temp1 = head;
        ListNode tempSecond = secondHalf;

        while(tempSecond != null)
        {
            if(temp1.val != tempSecond.val)
            {
                return false;
            }
            temp1 = temp1.next;
            tempSecond = tempSecond.next;
        }

        return true;
    }
}