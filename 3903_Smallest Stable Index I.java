class Solution {
    public int firstStableIndex(int[] nums, int k) {
        
        int n = nums.length;
        int[] maxArray = new int[n];
        int[] minArray = new int[n];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++)
        {
            if(nums[i] > max)
            {
                max = nums[i];
                maxArray[i] = max;
            }
            maxArray[i] = max;
        }

        for(int i = n - 1; i >= 0; i--)
        {
            if(nums[i] < min)
            {
                min = nums[i];
                minArray[i] = min;
            }
            minArray[i] = min;
        }

        for(int i = 0; i < n; i++)
        {
            if(maxArray[i] - minArray[i] <= k)
            {
                return i; 
            }
        }
        return -1;
    }
}