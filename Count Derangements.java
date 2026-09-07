import java.util.Arrays;

class Solution {
    // -> Memoization
    public int derangeCount(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return count(n, dp);
    }
    
    public int count(int n, int[] dp)
    {
        if(n == 1)
            return 0;
        if(n == 2)
            return 1;
        if(dp[n] != -1)
            return n;
        return dp[n] = (n - 1) * (derangeCount(n-1) + derangeCount(n-2));
    }
    
    // -> Tabulation
    // public int derangeCount(int n) {
    //     if(n == 1)
    //         return 0;
    //     if(n == 2)
    //         return 1;
    //     int[] dp = new int[n + 1];
    //     dp[1] = 0;
    //     dp[2] = 1;
    //     for(int i = 3; i <= n; i++)
    //     {
    //         dp[i] = (i - 1) * (dp[i - 1] + dp[i - 2]);
    //     }
    //     return dp[n];
    // }
    
    // -> Recursion
    // public int derangeCount(int n) {
    //     if(n == 1)
    //         return 0;
    //     if(n == 2)
    //         return 1;
    //     return (n - 1) * (derangeCount(n-1) + derangeCount(n-2));
    // }
};