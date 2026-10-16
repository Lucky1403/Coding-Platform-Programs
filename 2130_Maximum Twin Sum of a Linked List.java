class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public int pairSum(ListNode head) {
        ListNode temp = head;
        ListNode dummy = new ListNode(-1);
        ListNode tempDummy = dummy;
        ListNode tempAlt = new ListNode(temp.val);
        tempDummy.next = tempAlt;
        tempDummy = tempDummy.next;
        int size = 1;
        while(temp != null)
        {
            ListNode newNode = new ListNode(temp.val);
            tempDummy.next = newNode;
            tempDummy = tempDummy.next;
            temp = temp.next;
            size++;
            
        }

        ListNode originalNode = dummy.next;
        ListNode reverseHead = reverseList(originalNode);
        ListNode reverseTemp = reverseHead;

        int maxSum = 0;
        temp = head;
        
        for(int i = 0; i < size / 2; i++)
        {
            int currentSum = temp.val + reverseTemp.val;
            maxSum = Math.max(currentSum, maxSum);
            temp = temp.next;
            reverseTemp = reverseTemp.next;
        }

        return maxSum;
    }


    public ListNode reverseList(ListNode head)
    {
        ListNode curr = head;
        ListNode prev = null;
        ListNode fwd = null;
        while(curr != null)
        {
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
}