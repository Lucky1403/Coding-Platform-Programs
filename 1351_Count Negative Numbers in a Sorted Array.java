class Solution {
    public int countNegatives(int[][] grid) {
        int answer = 0;
        int rows = grid.length;
       
        int columns = grid[0].length;
        
        for(int i = rows - 1; i>= 0; i--)
        {
            for(int j = columns -1; j>=0; j--)
            {
                if(grid[i][j] < 0)
                {
                    answer++;
                }
                else
                {
                    break;
                }
            }
        }
        return answer;
    }
}