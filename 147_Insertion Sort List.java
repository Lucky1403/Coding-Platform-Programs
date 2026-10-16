import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode insertionSortList(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null)
        {
            list.add(temp);
            temp = temp.next;
        }

        int n = list.size();
        for(int i = 1; i < n; i++)
        {
            int key = list.get(i).val;
            int j = i - 1;

            while(j >= 0 && list.get(j).val > key)
            {
                list.get(j + 1).val = list.get(j).val;
                j = j - 1;
            }
            list.get(j + 1).val = key;
        }

        ListNode dummy = new ListNode(-1);
        ListNode dummyTemp = dummy;
        for(int i = 0; i < n; i++)
        {
            dummyTemp.next = list.get(i);
            dummyTemp = dummyTemp.next;
        }

        return dummy.next;
    }
}