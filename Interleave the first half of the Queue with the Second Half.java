import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        Queue<Integer> q2 = new LinkedList<>();
        
        int n = q.size();
        if(n == 2)
        {
            return;
        }
        
        for(int i = 0; i < n/2; i++)
        {
            q2.add(q.remove());
        }
        
        for(int i = 0; i < n/2; i++)
        {
            q.add(q2.remove());
            q.add(q.remove());
        }
    }
}
