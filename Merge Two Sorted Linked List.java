class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node k = dummy;
        Node i = head1;
        Node j = head2;

        while(i != null && j != null)
        {
            if(i.data <= j.data)
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
}