class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        if(grid[0][0] == 1 || grid[m-1][n-1] == 1)
            return 0;
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(grid[i][j] == 1)
                    dp[i][j] = 0;
                else if(i == 0 && j == 0)
                    dp[i][j] = 1;
                else{
                    int frontTop = (i > 0) ? dp[i-1][j] : 0;
                    int frontLeft = (j > 0) ? dp[i][j-1] : 0;
                    dp[i][j] = frontTop + frontLeft;
                }
            }
        }
        return dp[m-1][n-1];
    }
}