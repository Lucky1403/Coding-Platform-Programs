import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> adj) {
        int n = adj.size();
        boolean[] visited = new boolean[n];
        visited[0] = true;
        bfs(0, n, adj, visited);

        for(int i = 0; i < n; i++)
        {
            if(visited[i] == false)
            {
                return false;
            }
        }
        return true;
        
    }

    public void bfs(int i, int n, List<List<Integer>> adj, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(i);

        while(q.size() > 0)
        {
            int front = q.poll();
            for(int j = 0; j < adj.get(front).size(); j++)
            {
                int next = adj.get(front).get(j);
                if(visited[next] == false)
                {
                    visited[next] = true;
                    q.add(next);
                }
            }
        } 
    }
}