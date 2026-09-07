import java.util.Arrays;

class Solution {
    public int uniquePaths(int m, int n) {
        if (m == 1 || n == 1)
            return 1;
        int[][] dp = new int[m + 1][n + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return paths(m, n, dp);
    }

    public int paths(int m, int n, int[][] dp)
    {
        if(m == 1 || n == 1)
            return 1;
        if(dp[m][n] != -1)
            return dp[m][n];
        return dp[m][n] = paths(m-1,n,dp) + paths(m,n-1,dp);
    }
}