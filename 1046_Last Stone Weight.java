import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1)
        {
            return stones[0];
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones)
        {
            pq.add(stone);
        }

        while(pq.size() > 1)
        {
            int a = pq.remove();
            int b = pq.remove();
            pq.add(a - b);
        }
        
        return pq.peek();
    }
}