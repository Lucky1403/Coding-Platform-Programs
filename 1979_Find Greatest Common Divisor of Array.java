class Solution {
    public int GCD(int a, int b)
    {
        if(a == 0)
        {
            return b;
        }
        return GCD(b % a, a);
    }

    public int findGCD(int[] nums) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > maxValue)
            {
                maxValue = nums[i];
            }

            if(nums[i] < minValue)
            {
                minValue = nums[i];
            }
        }
        return GCD(minValue, maxValue);
    }
}