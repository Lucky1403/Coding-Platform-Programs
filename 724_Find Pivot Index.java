class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int index = -1;

        int prefixSum = 0;
        int suffixSum = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
            totalSum += nums[i];
        }

        for(int i = 0; i < nums.length; i++)
        {
            suffixSum = totalSum - prefixSum - nums[i];

            if(prefixSum == suffixSum)
            {
                index = i;
                return index;
            }

            prefixSum = prefixSum + nums[i];
        }

        return index;
    }
}