class DoubleLinkedList{
    String data;
    DoubleLinkedList previous;
    DoubleLinkedList next;

    DoubleLinkedList(String data)
    {
        this.data = data;
    }
}

class BrowserHistory {
    DoubleLinkedList curr;
    public BrowserHistory(String homepage) {
        curr = new DoubleLinkedList(homepage);
    }
    
    public void visit(String url) {
        DoubleLinkedList newNode = new DoubleLinkedList(url);
        curr.next = newNode;
        newNode.previous = curr;
        curr = newNode;
    }
    
    public String back(int steps) {
        while(steps > 0 && curr.previous != null)
        {
            curr = curr.previous;
            steps--;
        }
        return curr.data;
    }
    
    public String forward(int steps) {
        while(steps > 0 && curr.next != null)
        {
            curr = curr.next;
            steps--;
        }
        return curr.data;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */