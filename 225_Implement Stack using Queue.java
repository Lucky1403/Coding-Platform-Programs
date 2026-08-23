import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    Queue<Integer> q;
    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        int n = q.size();
        for(int i = 1; i < n; i++)
        {
            q.add(q.remove());;
        }
        int element = q.remove();
        return element;
    }
    
    public int top() {
        int n = q.size();
        for(int i = 1; i < n; i++)
        {
            q.add(q.remove());
        }
        int element = q.peek();
        q.add(q.remove());
        return element;
    }
    
    public boolean empty() {
        return (q.size() == 0);
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */