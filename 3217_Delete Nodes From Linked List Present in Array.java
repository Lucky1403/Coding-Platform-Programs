import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    
    public ListNode modifiedList(int[] nums, ListNode head) {
        if(head == null)
            return null;
        
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums)
            set.add(num);

        ListNode temp = head;
        ListNode dummy = new ListNode(-1);
        ListNode tempDummy = dummy;
        tempDummy.next = temp;

        while(temp != null)
        {
            if(set.contains(temp.val))
            {
                tempDummy.next = temp.next;
            }
            else
            {
                tempDummy.next = temp;
                tempDummy = tempDummy.next;
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}