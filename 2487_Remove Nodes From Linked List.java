import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode temp = head;
        Stack<ListNode> st = new Stack<>();
        while (temp != null) {
            if (st.isEmpty()) {
                st.push(temp);
            } else {
                while (!st.isEmpty() && temp.val > st.peek().val) {
                    st.pop();
                }
                st.push(temp);
            }
            temp = temp.next;
        }

        ListNode dummy = null;
        ListNode temp2 = dummy;

        while (st.size() > 0) {
            ListNode newNode = st.pop();
            newNode.next = temp2;
            temp2 = newNode;
        }

        return temp2;
    }
}