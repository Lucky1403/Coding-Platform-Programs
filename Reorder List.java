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
    
    public void reorderList(Node head) {
    
        Node temp = head;
        int count = 0;

        while(temp != null)
        {
            count++;
            temp = temp.next;
        }

        int half = 0;
        if(count % 2 == 0)
        {
            half = count / 2;
        }
        else
        {
            half = (count + 1)/2;
        }
        Node tempA = head;
        Node tempB = head;
        temp = head;
        for(int i = 1; i < half; i++)
        {
            temp = temp.next;
        }

        tempB = temp.next;
        temp.next = null;

        Node secondHalf = reverseList(tempB); 
        Node tempSecond = secondHalf;

        temp = head;
        while(tempSecond != null)
        {
            tempA = tempA.next;
            temp.next = tempSecond;
            temp = tempSecond;

            tempSecond = tempSecond.next;
            temp.next = tempA;
            temp = tempA;
        }
        return;
    }
}