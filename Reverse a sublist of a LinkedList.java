class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class Solution {
    public Node reverseList(Node head) {
        Node current = head;
        Node forward = null;
        Node previous = null;
        while(current != null)
        {
            forward = current.next;
            current.next = previous;
            previous = current;
            current = forward;
        }

        return previous;
    }
    
    Node reverseBetween(int a, int b, Node head) {

        if(head == null || head.next == null || a == b)
        {
            return head;
        }
        Node dummy = new Node(0);
        dummy.next = head;

        Node leftA = dummy;
        for(int i = 1; i < a; i++)
        {
            leftA = leftA.next;
        }
        Node rightA = leftA;

        for(int i = a; i <=b; i++)
        {
            rightA = rightA.next;
        }
        Node rightB = rightA.next;

        rightA.next = null;

        Node leftB = reverseList(leftA.next);

        leftA.next = leftB;
        while(leftB.next != null)
        {
            leftB = leftB.next;
        }
        leftB.next = rightB;

        return dummy.next;
    }
}