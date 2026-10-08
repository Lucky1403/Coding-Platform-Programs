class Solution {
    public int minimumCost(int[] nums, int k) {
        final int MOD = 1_000_000_007;
        long totalRefills = 0;
        long currentK = k; 
        
        for (int x : nums) {
            long diff = (long) x - currentK;
            if (diff > 0) {
                long m = (diff + k - 1) / k;
                currentK += m * k;
                totalRefills += m;
            }
            currentK -= x;
        }

        totalRefills %= MOD; 

        long finalCost = (totalRefills + 1) * totalRefills / 2 % MOD;
        
        return (int) finalCost;
    }
}
