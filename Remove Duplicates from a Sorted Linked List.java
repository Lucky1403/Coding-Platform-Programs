
class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
}

class Solution {
    Node removeDuplicates(Node head) {
        Node i = head;
        Node j = head;

        if(head == null || head.next == null)
        {
            return head;
        }
        
        while (j != null) {
            if (i.data == j.data) {
                j = j.next;
            } else if (i.data != j.data) {
                i.next = j;
                i = j;
            }
        }

        i.next = j;
        i = j;

        return head;
    }
}