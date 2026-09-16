class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null)
            return head;
        if(head.next == null)
            return null;

        int size = 0;
        ListNode temp = head;
        while(temp != null)
        {
            size++;
            temp = temp.next;
        }
        
        ListNode tempB = head;
        for(int i = 1; i < size/2; i++)
        {
            tempB = tempB.next;
        }

        if(tempB.next.next != null)
            tempB.next = tempB.next.next;
        else
            tempB.next = null;
        return head;
    }
}