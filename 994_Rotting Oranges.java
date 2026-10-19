import java.util.*;

class Pair
{
    int x;
    int y;
    Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        int count = 0;
        int freshOranges = 0;
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j] == 2)
                {
                    q.add(new Pair(i, j));
                }
                else if(grid[i][j] == 1)
                    freshOranges++;
            }
        }
        
        if(freshOranges == 0)
            return 0;

        while(q.size() > 0)
        {
            int size = q.size();
            boolean rottedThisMinute = false;
            

            for(int i = 0; i < size; i++)
            {
                Pair front = q.remove();
                int x = front.x;
                int y = front.y;

                if(x > 0 && grid[x-1][y] == 1){
                    q.add(new Pair(x - 1,y));
                    grid[x-1][y] = 2;
                    freshOranges--;
                    rottedThisMinute = true;
                }

                if(x + 1 < grid.length && grid[x+1][y] == 1){
                    q.add(new Pair(x + 1,y));
                    grid[x+1][y] = 2;
                    freshOranges--;
                    rottedThisMinute = true;
                }

                if(y + 1 < grid[0].length && grid[x][y + 1] == 1){
                    q.add(new Pair(x, y + 1));
                    grid[x][y+1] = 2;
                    freshOranges--;
                    rottedThisMinute = true;
                }

                if(y > 0 && grid[x][y - 1] == 1){
                    q.add(new Pair(x, y - 1));
                    grid[x][y-1] = 2;
                    freshOranges--;
                    rottedThisMinute = true;
                }
            }

            if(rottedThisMinute)
                count++;
        }
        return freshOranges == 0 ? count : -1;
    }
}