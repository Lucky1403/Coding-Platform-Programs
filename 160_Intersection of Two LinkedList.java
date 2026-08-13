/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;

        int sizeA = 0;
        int sizeB = 0;

        while(tempA != null)
        {
            tempA = tempA.next;
            sizeA++;
        }
        tempA = headA;

        while(tempB != null)
        {
            tempB = tempB.next;
            sizeB++;
        }
        tempB = headB;

        int difference = 0;
        if(sizeA > sizeB)
        {
            difference = sizeA - sizeB;
            for(int i = 0; i < difference; i++)
            {
                tempA = tempA.next;
            }
        }
        else
        {
            difference = sizeB - sizeA;
            for(int i = 0; i < difference; i++)
            {
                tempB = tempB.next;
            }
        }

        while(tempA != null && tempB != null)
        {
            if(tempA == null || tempB == null)
            {
                return null;
            }

            if(tempA == tempB)
            {
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
            
        }
        return null;
    }
}