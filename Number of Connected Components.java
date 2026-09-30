import java.util.*;

class Solution { 
    int countConnected(int V, ArrayList<ArrayList<Integer>> edges) { 
        int count = 0; 
        HashSet<Integer> set = new HashSet<>(); 

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (ArrayList<Integer> edge : edges) {
            int u = edge.get(0);
            int v = edge.get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }


        for(int i = 0; i < V; i++) { 
            if(!set.contains(i)) { 
                bfs(V, i, adj, set);
                count++; 
            } 
        } 
        return count; 
    } 

    public void bfs(int V, int i, ArrayList<ArrayList<Integer>> adj, HashSet<Integer> set) { 
        Queue<Integer> q = new LinkedList<>(); 
        set.add(i); 
        q.add(i); 

        while(!q.isEmpty()) { 
            int curr = q.poll(); 

            for(int neighbor : adj.get(curr)) { 
                if(!set.contains(neighbor)) { 
                    q.add(neighbor); 
                    set.add(neighbor); 
                } 
            } 
        } 
    } 
}
