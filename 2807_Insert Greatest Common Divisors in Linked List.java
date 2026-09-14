class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public int gcd(int a, int b)
    {
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null)
            return null;
        if(head.next == null)
            return head;

        ListNode tempA = head;
        ListNode tempB = tempA.next;

        while(tempB != null)
        {
            int value = gcd(tempA.val, tempB.val);
            ListNode nodeNew = new ListNode(value);
            tempA.next = nodeNew;
            nodeNew.next = tempB;
            
            tempB = tempB.next;
            if(tempA.next.next != null)
                tempA = tempA.next.next;
        }

        return head;
    }
}