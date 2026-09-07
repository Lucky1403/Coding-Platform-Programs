class Solution {
    //  -> Memoization
    // public int climbStairs(int n) {
    //     if(n==1 || n == 2)
    //         return n;
        
    //     int[] dp = new int[n + 1];
    //     Arrays.fill(dp, -1);
    //     return climb(n, dp);
    // }

    // public int climb(int n, int[] dp)
    // {
    //     if(n==1 || n == 2)
    //         return n;
    //     if(dp[n] != -1)
    //         return dp[n];
    //     return dp[n] = climb(n-1, dp) + climb(n-2, dp);
    // }

    // -> Tabulation
    public int climbStairs(int n)
    {
        if(n == 1 || n == 2)
            return n;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++)
        {
            dp[i] = dp[i-1] + dp[i - 2];
        }
        return dp[n];
    }
}