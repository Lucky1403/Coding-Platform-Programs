class Node
{
    int value;
    Node next;
    Node previous;
    
    Node(int value)
    {
        this.value = value;
    }
}
class FrontMiddleBackQueue {
    int size;
    Node temp; // temp will always point at head of the Linked List
    public FrontMiddleBackQueue() {
        size = 0;
    }
    
    public void pushFront(int val) {
        if(size == 0)
        {
            Node newNode = new Node(val);
            temp = newNode;
            newNode.next = null;
            newNode.previous = null;
            size++;
        }
        else
        {
            Node newNode = new Node(val);
            newNode.previous = null;
            newNode.next = temp;
            temp = temp.previous;
            size++;
        }
    }
    
    public void pushMiddle(int val) {
        
    }
    
    public void pushBack(int val) {
        Node temp2 = temp;
        while(temp2.next != null)
        {
            temp2 = temp2.next;
        }

        Node newNode = new Node(val);
        temp2.next = newNode;
        newNode.previous = temp2;
        newNode.next = null;
        size++;
    }
    
    public int popFront() {
        int value = temp.value;
        temp = temp.next;
        size--;
        return value;
    }
    
    public int popMiddle() {
        
    }
    
    public int popBack() {
        Node temp2 = temp;
        
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */