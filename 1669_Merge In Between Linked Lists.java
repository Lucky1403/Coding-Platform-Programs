class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;
        ListNode temp2 = list1;
        for(int i = 1; i < a; i++)
            temp = temp.next;

        for(int i = 1; i <= b; i++)
            temp2 = temp2.next;

        temp.next = list2;
        while(temp.next != null)
            temp = temp.next;

        temp.next = temp2.next;

        return list1;
    }
}