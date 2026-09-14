class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode tempA = head;
        ListNode tempB = head.next;
        int value = 0;
        while(tempB.next != null)
        {
            while(tempB.val != 0)
            {
                value += tempB.val;
                tempB = tempB.next;
            }
            ListNode newNode = new ListNode(value);
            tempA.next = newNode;
            newNode.next = tempB; 
            tempA = tempB;
            if(tempB.next != null)
                tempB = tempB.next;
            value = 0;
        }

        ListNode dummy = new ListNode(-1);
        ListNode tempDummy = dummy;
        tempA = head;
        while(tempA != null)
        {
            if(tempA.val != 0)
            {
                tempDummy.next = tempA;
                tempDummy = tempDummy.next;
            }
            tempA = tempA.next;   
        }

        tempDummy = dummy;
        while(tempDummy.next.next != null)
        {
            tempDummy = tempDummy.next;
        }
        
        tempDummy.next = null;

        return dummy.next;
    }
}