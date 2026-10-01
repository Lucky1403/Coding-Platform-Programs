import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int x;
    int y;
    Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j] == '1' && visited[i][j] == false)
                {
                    count++;
                    dfs(i, j, grid, visited);
                }
            }
        }
        return count;
    }

    public void dfs(int i, int j, char[][] grid, boolean[][] visited)
    {
        visited[i][j] = true;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i, j));

        while(q.size() > 0)
        {
            Pair element = q.poll();
            int front = element.x;
            int back = element.y;
            if(front - 1 >= 0 && grid[front - 1][back] == '1' && visited[front - 1][back] == false)
            {
                q.add(new Pair(front - 1, back));
                visited[front - 1][back] = true;
            }
            if(front + 1 < grid.length && grid[front + 1][back] == '1' && visited[front + 1][back] == false)
            {
                q.add(new Pair(front + 1, back));
                visited[front + 1][back] = true;
            }
            if(back - 1 >= 0 && grid[front][back - 1] == '1' && visited[front][back - 1] == false)
            {
                q.add(new Pair(front, back - 1));
                visited[front][back - 1] = true;
            }
            if(back + 1 < grid[0].length && grid[front][back + 1] == '1' && visited[front][back + 1] == false)
            {
                q.add(new Pair(front, back + 1));
                visited[front][back + 1] = true;
            }
        } 
    }
}