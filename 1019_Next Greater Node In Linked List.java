import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> nodes = new ArrayList<>();
        while(temp != null)
        {
            nodes.add(temp.val);
            temp = temp.next;
        }

        Collections.reverse(nodes);

        Stack<Integer> st = new Stack<>();
        
        temp = head;
        st.push(0);
        
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < nodes.size(); i++)
        {
            while(!st.isEmpty() && nodes.get(i) >= nodes.get(st.peek()))
                st.pop();

            if(st.isEmpty())
                result.add(0);
            else
                result.add(nodes.get(st.peek()));

            st.push(i);
        }

        int[] res = new int[result.size()];
        for(int i = 0; i < result.size(); i++)
            res[i] = result.get(i);
        return res;
    }
}