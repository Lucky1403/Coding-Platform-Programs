class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class Solution {
    int getMiddle(Node head) {
        int size = 0;
        Node temp = head;
        while(temp != null)
        {
            temp = temp.next;
            size++;
        }
        
        temp = head;
        int answer = 0;
        for(int i = 1; i <=size/2; i++)
        {
            temp = temp.next;
        }
        
        return temp.data;
        
    }
}