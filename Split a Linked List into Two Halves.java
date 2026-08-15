/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public Pair<Node, Node> splitList(Node head) {
        if (head == null || head.next == head) {
            return new Pair<>(head, null);
        }
        
        Node temp = head.next;
        int length = 1;
        while(temp != head)
        {
            length++;
            temp = temp.next;
        }
        
        Node tail = head;
        int half = (length + 1) / 2;
        for(int i = 1; i < length; i++)
        {
            tail = tail.next;
        }
        
        Node mid = head;
        for(int i = 1; i < half; i++)
        {
            mid = mid.next;
        }
        
        Node secondHalfHead = mid.next;
        
        mid.next = head;
        tail.next = secondHalfHead;
        
        return new Pair<>(head, secondHalfHead);
    }
}