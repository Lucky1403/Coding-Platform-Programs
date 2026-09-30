import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination)
            return true;

        boolean[] visited = new boolean[n];
        visited[source] = true;
        
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            List<Integer> list = new ArrayList<>();
            adj.add(list);
        }

        for(int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        bfs(source, n, adj, visited);
        if(visited[destination] == true)
            return true;
        else
            return false;
    }

    public void bfs(int source, int n, List<List<Integer>> adj, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(source);

        while(q.size() > 0)
        {
            int front = q.poll();
            for(int ele : adj.get(front))
            {
                if(visited[ele] == false)
                {
                    q.add(ele);
                    visited[ele] = true;
                }
            }
        }
    }
}