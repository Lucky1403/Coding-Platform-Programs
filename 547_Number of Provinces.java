import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int findCircleNum(int[][] adj) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        int n = adj.length;
        for(int i = 0; i < n; i++)
        {
            if(!set.contains(i))
            {
                bfs(i, adj, set);
                count++;
            }

        }
        return count;
    }

    public void bfs(int i, int[][] adj, HashSet<Integer> set) {
        int n = adj.length;
        Queue<Integer> q = new LinkedList<>();
        set.add(i);
        q.add(i);
        while(q.size() > 0)
        {
            int front = q.remove();
            for(int j = 0; j < n; j++)
            {
                if(adj[front][j] == 1 && !set.contains(j))
                {
                    q.add(j);
                    set.add(j);
                }
            }
        }
    }
}