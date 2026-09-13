import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;
        ListNode i = list1;
        ListNode j = list2;

        while(i != null && j != null)
        {
            if(i.val <= j.val)
            {
                k.next = i;
                k = i;
                i = i.next;
            }
            else
            {
                k.next = j;
                k = j;
                j = j.next;
            }
        }

        if(i == null)
        {
            k.next = j;
        }
        else
        {
            k.next = i;
        }

        return dummy.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)
            return null;
        ArrayList<ListNode> arr = new ArrayList<>();
        for(ListNode n : lists)
            arr.add(n);
        
        while(arr.size() > 1)
        {
            ListNode a = arr.get(arr.size() - 1);
            arr.remove(arr.size() - 1);
            ListNode b = arr.get(arr.size() - 1);
            arr.remove(arr.size() - 1);
            ListNode c = mergeTwoLists(a,b);
            arr.add(c);
        }
        return arr.get(0);
    }
}