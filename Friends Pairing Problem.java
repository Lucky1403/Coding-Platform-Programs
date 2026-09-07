import java.util.Arrays;

class Solution {
    // -> Normal Recursion
    // public int countFriendsPairings(int n) {
    //     if(n == 1 || n == 2)
    //         return n;
    //     return countFriendsPairings(n-1) + (n-1) * countFriendsPairings(n-2);
    // }
    
    // -> Tabulation
    // public int countFriendsPairings(int n) {
    //     if(n == 1)
    //         return 1;
    //     if(n == 2)
    //         return 2;
    //     int[] dp = new int[n+1];
    //     dp[1] = 1;
    //     dp[2] = 2;
    //     for(int i = 3; i<=n; i++)
    //     {
    //         dp[i] = dp[i-1] + ((i-1) * dp[i-2]);
    //     }
        
    //     return dp[n];
    // }
    
    // -> Memoization
    public int countFriendsPairings(int n) {
        if(n == 1 || n == 2)
            return n;
            
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return count(n, dp);
    }
    
    public int count(int n, int[] dp)
    {
        if(n == 1 || n == 2)
            return n;
        if(dp[n] != -1)
            return dp[n];
        return dp[n] = countFriendsPairings(n-1) + (n-1) * countFriendsPairings(n-2);
    }
}
