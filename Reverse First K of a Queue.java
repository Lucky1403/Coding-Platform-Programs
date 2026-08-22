import java.util.Queue;
import java.util.Stack;

class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        if(n == 0)
        {
            return q;
        }
        if(k > n)
        {
            return q;
        }

        for(int i = 0; i < k; i++)
        {
            st.push(q.remove());
        }
        
        for(int i = 0; i < k; i++)
        {
            q.add(st.pop());
        }
        
        for(int i = 0; i < n - k; i++)
        {
            q.add(q.remove());
        }
        return q;
    }
}