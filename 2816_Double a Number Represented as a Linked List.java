class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode doubleIt(ListNode head) {

        if (head.val >= 5) {
            ListNode newHead = new ListNode(0);
            newHead.next = head;
            head = newHead;
        }
        
        ListNode curr = head;
        while (curr != null) {
            int doubledValue = curr.val * 2;

            if (curr.next != null && curr.next.val >= 5) {
                doubledValue += 1;
            }

            curr.val = doubledValue % 10;
            
            curr = curr.next;
        }
        
        return head;
    }
}
