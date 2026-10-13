class Solution {
    public int maxSubArray(int[] nums) {
        int maximumSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            currentSum += nums[i];
            if(currentSum > maximumSum)
                maximumSum = currentSum;
            
            if(currentSum < 0)
                currentSum = 0;
        }
        return maximumSum;
    }
}