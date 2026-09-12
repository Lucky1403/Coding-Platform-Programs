import java.util.HashMap;

class Node {
    int data;
    Node next;
    Node random;

    Node(int x) {
        data = x;
        next = null;
        random = null;
    }
}

class Solution {
    public Node cloneLinkedList(Node head) {
        Node temp = head;
        Node clonedHead = new Node(temp.data);
        Node cloned = clonedHead;
        
        temp = temp.next;
        while(temp != null)
        {
            Node cloned2 = new Node(temp.data);
            cloned.next = cloned2;
            
            cloned = cloned.next;
            temp = temp.next;
        }
        
        HashMap<Node, Node> map = new HashMap<>();
        
        temp = head;
        cloned = clonedHead;
        while(temp != null)
        {
            map.put(temp, cloned);
            temp = temp.next;
            cloned = cloned.next;
        }
        
        temp = head;
        while(temp != null)
        {
            map.get(temp).random = map.get(temp.random);
            temp = temp.next;
        }
        
        return clonedHead;
    }
}